package br.univel;

import java.io.Serializable;

public class Item implements Serializable {

	private int limit;

	private int value;

	public Item(int value, int limit) {
		this.value = value;
		this.limit = limit;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		String result = getClass().getSimpleName() + " ";
		result += "limit: " + limit;
		result += ", value: " + value;
		return result;
	}
}