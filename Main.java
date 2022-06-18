
package SEMANASETE;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       
        System.out.println("Salário atual dos funcionarios:");
        Empregado Fernando = new Empregado("Fernando", "Loureiro", 6500);
        System.out.println("Salário anual de " + Fernando.getPrimeiroNome() + " " + Fernando.getSobrenome() + ": R$ " + String.format("%.2f",Fernando.getSalarioAnual()));
      
        Empregado Laura = new Empregado("Laura", "Barbosa", 11200);
        System.out.println("Salario anual de " + Laura.getPrimeiroNome() + " " + Laura.getSobrenome() + ": R$ " + String.format("%.2f",Laura.getSalarioAnual()));
        
        System.out.println();
        
        Fernando.CalcAumento();
        Laura.CalcAumento();
        
        System.out.println();
        System.out.println("Salário dos funcionarios atualizado com aumento de 10%:");
        System.out.println("Salario anual de " + Fernando.getPrimeiroNome() + " " + Fernando.getSobrenome() + " com aumento: R$ " + String.format("%.2f",Fernando.getSalarioAnual()));
        System.out.println("Salario anual de " + Laura.getPrimeiroNome() + " " + Laura.getSobrenome() + " com aumento: R$ " + String.format("%.2f",Laura.getSalarioAnual()));
        
    }
    
    }
    

