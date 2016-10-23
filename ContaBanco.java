//package com.github.elizabethcarvalho.AprendendoJava; cmd nao compila qnd ta com package

public class ContaBanco{
	
	String nome;
	double saldo;
	
	void exibeSaldo(){
		System.out.println(this.nome + " seu saldo e R$" + this.saldo +"\r\n");
	}
	
	void saca(double valor){
		if(this.saldo > valor){
			this.saldo -= valor;
			System.out.println("Seu saque foi efetuado com sucesso!");
		}
		else {
			System.out.println("Saldo insuficiente.");
		}
	}
	
	void deposito(double valor){
		this.saldo += valor;
		System.out.println("Seu deposito foi efetuado com sucesso!");

	}
	
	public static void main (String[] args){
		
		ContaBanco cliente1 = new ContaBanco();
		cliente1.nome = "Mark";
		cliente1.saldo = 1500;
		cliente1.exibeSaldo();
		cliente1.saca(350);
		cliente1.exibeSaldo();
		cliente1.deposito(1750);
		cliente1.exibeSaldo();
	
	}
	
}


/*Formas de quebra de linha 
 *System.out.println("foo" + (char)13 + "foo2");  
 *System.out.println("foo" + (char)10 + "foo2");  
 *System.out.println("foo" + '\n' + "foo2");  
 *System.out.println("foo" + '\r' + "foo2");  
 *System.out.println("foo" + System.getProperty("line.separator") + "foo2");
 */