import java.util.Scanner;

public class Main {

    public char[] numero = {10,20,30};



    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        double tempoAntigo = System.currentTimeMillis();
        String s = scanner.nextLine();

        if (Main.convertTime(System.currentTimeMillis() - tempoAntigo) >= 2) {
            if (s.length() >= 10) {
                System.out.println("A mensagem é"+s);
            }else {
                System.out.println("Sua mensagem é muito curta!");
            }
        }else {
            System.out.println("Ops! Você precisa esperar pelomenos 2 segundos");
            System.out.println("Vamos tentar novamente?");
            tempoAntigo = System.currentTimeMillis();
            s = scanner.nextLine();
            if (Main.convertTime(System.currentTimeMillis() - tempoAntigo) >= 2) {
                System.out.println("Agora sim");

            }else {
                System.out.println("Você falhou 2x! Acabamos o Programa!");
            }
        }

    }

    public static double convertTime(double tempo) {
        return tempo/1000;
    }

}