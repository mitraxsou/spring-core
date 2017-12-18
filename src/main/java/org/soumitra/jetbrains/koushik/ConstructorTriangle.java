package org.soumitra.jetbrains.koushik;

public class ConstructorTriangle {
	private int height;
	private String type;
	public int getHeight() {
		return height;
	}
	public String getType() {
		return type;
	}
	
	//writing construtors
	
	
	public ConstructorTriangle(String type) {
		this.type=type;
	}
	public ConstructorTriangle(int height) {
		this.height=height;
	}
	
	public ConstructorTriangle(String type,int height) {
		this.height=height;
		this.type=type;
	}
}
