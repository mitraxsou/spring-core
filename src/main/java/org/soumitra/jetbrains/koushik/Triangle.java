package org.soumitra.jetbrains.koushik;

public class Triangle {
	private String type;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public void drawTriangle() {
		System.out.println("Triangle created: "+getType());
	}
}
