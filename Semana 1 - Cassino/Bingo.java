package CassinoLasVegas;

import java.util.ArrayList;

public class Bingo {
   
    private ArrayList<Integer> bingojogo = new ArrayList<>();
    private int bingonumero;
    private int numeromenor = Integer.MAX_VALUE;
    private int numeromaior = Integer.MIN_VALUE;
            
    public void setAddNumeroBingo(Integer bingonumero){
        bingojogo.add(bingonumero); 
        
        if (bingonumero > numeromaior){
            numeromaior = bingonumero;
        }
        if (bingonumero < numeromenor) {
            numeromenor = bingonumero;
        }
    }
    
    public ArrayList<Integer> getBingoJogo(){
        return bingojogo;
    }
    
    public int getQtdNumeros() {           
        return bingojogo.size();
    }
    
    public int getNumeroMaior() {           
        return numeromaior;
    }
     
    public int getNumeroMenor() {
        return numeromenor;
    }
    
}