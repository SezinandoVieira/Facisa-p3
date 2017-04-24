package br.cesed.facisa.si.p3.pilha;

public class Pilha {

	private Object  [] pilhaInterna;
	
	private int pos;

	/**
	 * Constructor from class Pilha.java
	 */
	public Pilha(int tamanho) {
		
		this.pilhaInterna = new Object [tamanho];
		
	}
	
	/**
	 * Responsible method for remove the top element
	 * 
	 */
	public Object pop(){
		pilhaInterna[--pos] = null;
		return  this.top();
	}
	
	/**
	 * 
	 * Responsible method to insert one element in the top
	 * 
	 */
	
	public void push(Object obj){
		if (obj != null){
			pilhaInterna[pos++]=obj;
		}		
	}
	/**
	 * 
	 * Responsible method to consult the top element
	 */
	public Object top(){
		return pilhaInterna[pos-1];
	}
	
	
}
