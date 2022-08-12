package CassinoLasVegas;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        int numerosorteio;

        Bingo sorteio = new Bingo();

        boolean continuar = true;

        while (continuar) {
            numerosorteio = Integer.parseInt(JOptionPane.showInputDialog("Informe o número sorteado ou -1 para finalizar"));

            if (numerosorteio == -1) {
                continuar = false;
                System.out.println("Você finalizou!");
            } else {
                sorteio.setAddNumeroBingo(numerosorteio);
            }
        }
        System.out.println("Números sorteados: " + sorteio.getBingoJogo());
        System.out.println("Menor número: " + sorteio.getNumeroMenor() + " | " + "Maior número: " + sorteio.getNumeroMaior() + " | " + "Total de números: " + sorteio.getQtdNumeros());        
    }
}