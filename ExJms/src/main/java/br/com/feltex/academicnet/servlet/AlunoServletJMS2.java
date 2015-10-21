package br.com.feltex.academicnet.servlet;
 
import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.jms.JMSException;
import javax.jms.ObjectMessage;
import javax.jms.Queue;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.feltex.academicnet.entidade.Aluno;
 
@WebServlet("/AlunoServletJMS2")
public class AlunoServletJMS2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	@Resource(mappedName = "java:/queue/alunoQueue")
	private Queue fila;
 
	@Inject
	@JMSConnectionFactory("java:/ConnectionFactory")
	private JMSContext context;
 
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
 
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println(getClass() + "Inicio........");
		Aluno aluno = new Aluno();
		aluno.setMatricula(2221L);
		aluno.setNome("Maria da Silva");
		enviarObjetoForma2(aluno);
		System.out.println(getClass() + "Fim........");
 
		PrintWriter out = response.getWriter();
		out.print("<H1>Objeto enviado com sucesso! JMS 2.0</H1>");
	}
 
	/**
	 * Envia um objeto complexo para a fila JMS
	 * 
	 * 
	 */
	public void enviarObjetoForma2(Aluno aluno) {
		try {
			ObjectMessage objMessage = context.createObjectMessage();
			objMessage.setObject(aluno);
			context.createProducer().send(fila, objMessage);
 
		} catch (JMSException ex) {
			ex.printStackTrace();
		}
	}
}