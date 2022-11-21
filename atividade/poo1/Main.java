package atividade.poo1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		ListaPessoas l = new ListaPessoas();
		
		GregorianCalendar calendario = new GregorianCalendar(1986,Calendar.DECEMBER,19);
		Date aniversario = calendario.getTime();
		
		//adicionar novas pessoas
		
		System.out.println("Adicionar pessoa");
		
		
		Pessoa p = new Pessoa("João", "joaodasilva@gmail.com", aniversario);
		
		System.out.println(l.add(p));
		l.add(p);
		
		calendario = new GregorianCalendar(1988,Calendar.JANUARY,8);
		aniversario = calendario.getTime();
		
		p = new Pessoa("Bob", "bobesponja@hotmail.com", aniversario);
		l.add(p);
		
		p = new Pessoa("Mauro", "maurohenrique@gmail.com", aniversario);
		l.add(p);
		
		p = new Pessoa("Juca", "juquinha@gmail.com", aniversario);
		l.add(p);
				
		System.out.println();
		
		//gera idade
		System.out.println("---Idade da última pessoa adicionada---");
		System.out.println(p.calcularIdade());
		System.out.println();
		
		//pesquisa por idade
		System.out.println("---Lista Pessoas com 20 anos---");
		System.out.println(l.pesquisaIdade(20));
		System.out.println();
		
		//pesquisa por mes de aniversario
		System.out.println("---Lista Aniversario em Dezembro---");
		System.out.println(l.pesquisaMes(12));
		System.out.println();
		
		//Lista com pessoas
		System.out.println("---Lista Antes---");
		System.out.println(l.getLista());
		System.out.println();
		
		//remover pelo nome
		l.removeNome("Bob");
		System.out.println("---Lista Depois---");
		System.out.println(l.getLista());
		System.out.println();
		
		//editar pessoa
		calendario = new GregorianCalendar(1984,Calendar.MAY,5);
		aniversario = calendario.getTime();
		l.alteraPessoa(1, "Tião", aniversario, "tiao@gmail.com");
		
		//buscar dominios
		System.out.println(l.dominios());
		
		List<Pessoa> lista = l.getLista();
		System.out.println();
		
		for (Pessoa item : lista) {
			System.out.println(item.toString());
		}
		
	}

	
}
