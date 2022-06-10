
package MissaoSemanaSeis;

import java.util.Scanner;

public class SemanaSeisMissao {

    public static void cls() // Como não temos interface gráfica optei por criar "cls()" 
    {                        // para "limpar" e deixar a execução mais clean. 
            for(int i = 0; i < 25; i++)
            System.out.println("");
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        
        char Menu = 'S';
        float tempCelsius = 0.0f;
        float tempFahrenheit = 0.0f;
        float cotacaoDolar = 0.0f;
        float mDolar = 0.0f;
        float mReal = 0.0f;
        
        while(Menu == 'S' || Menu == 's'){
            cls()
            System.out.println("***********************************************");
            System.out.println("Programa para conversão de temperatura e moeda.");
            System.out.println("***********************************************");
            System.out.println("Você pode realizar as seguintes conversões:");
            System.out.println("");
            System.out.println("1 - Converter temperatura Celsius para Fahrenheit");        
            System.out.println("2 - Converter temperatura Fahrenheit para Celsius");
            System.out.println("3 - Converter moeda Dólar para Real");        
            System.out.println("4 - Converter moeda Real para Dólar");
            System.out.println("5 - Sair");
            System.out.println("");
            System.out.println("Digite a opção escolhida: ");
            int opcaoMenu = sc.nextInt();
            cls();
            
            if(opcaoMenu == 1) {
                System.out.println("**************************************************************");
                System.out.println("Você selecionou converter temperatura Celsius para Fahrenheit");
                System.out.println("**************************************************************");
                System.out.println("Informe a temperatura em Celsius (°C): ");
                tempCelsius = sc.nextFloat();
                tempFahrenheit = (tempCelsius * 9/5) + 32;
                System.out.println("");
                cls();
                System.out.println("******************************************");
                System.out.println("Temperatura " + tempCelsius + " ºC equivale a " + tempFahrenheit + " °F");
                System.out.println("******************************************");
                System.out.println("");             
            } 
            
            else if(opcaoMenu == 2) {                
                System.out.println("**************************************************************");
            System.out.println("Você selecionou converter temperatura Fahrenheit para Celsius");
            System.out.println("**************************************************************");
            System.out.println("Informe a temperatura em Fahreinheit (°F): ");
            tempFahrenheit = sc.nextFloat();
            tempCelsius = (tempFahrenheit - 32) * 5/9;
            System.out.println("");
            cls();
            System.out.println("******************************************");
            System.out.println("Temperatura " + tempFahrenheit + " ºF equivale a " + tempCelsius + " °C");
            System.out.println("******************************************");
            System.out.println("");    
            } 
            
            else if(opcaoMenu == 3) {
                System.out.println("*****************************************");
                System.out.println("Você selecionou converter Dólar para Real");
                System.out.println("*****************************************");
                System.out.println("Informe a cotação atual para 1 Dólar: R$ ");
                cotacaoDolar = sc.nextFloat();
                System.out.println("");
                System.out.println("Informe a quantidade em Dólar que você deseja converter: US$ ");
                mDolar = sc.nextFloat();
                mReal = mDolar * cotacaoDolar;
                System.out.println("");
                cls();
                     System.out.println("***********************************************");
                System.out.println("Cotação atual: US$ 1 equivale a R$ " + cotacaoDolar);
                System.out.println("Valor US$ " + mDolar + " equivale a: R$ " + mReal);
                     System.out.println("***********************************************");
                System.out.println("");
            } 
            
            else if(opcaoMenu == 4) {
            System.out.println("*****************************************");
                System.out.println("Você selecionou converter Real para Dólar");
                System.out.println("*****************************************");
                System.out.println("Informe a cotação atual para 1 dólar: R$ ");
                cotacaoDolar = sc.nextFloat();
                System.out.println("");
                System.out.println("Informe a quantidade em Real que você deseja converter: R$ ");
                mReal = sc.nextFloat();
                mDolar = mReal / cotacaoDolar;
                System.out.println("");
                cls();
                     System.out.println("***********************************************");
                System.out.println("Cotação atual: US$ 1 equivale a R$ " + cotacaoDolar);
                System.out.println("Valor R$ " + mReal + " equivale a: US$ " + mDolar);
                     System.out.println("***********************************************");
                System.out.println("");
            } 
            
            else if(opcaoMenu != 5) {
                    System.out.println("Opção inválida, por favor tente novamente.");
                    System.out.println("");
            }
            
        if(opcaoMenu == 5) {
            Menu = 'N';  
        } 
        else {
            System.out.println("Você deseja realizar outra conversão? (S/N)");
            Menu = sc.next().charAt(0);
            System.out.println("");
        } 
        }
        
        cls();
        System.out.println("Você encerrou o programa. Obrigado!"); 
    }
    }
    

