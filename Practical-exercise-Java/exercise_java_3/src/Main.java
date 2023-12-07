import java.util.Scanner;

public class Main {

    public char[] numero = {10,20,30};

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int pontos = 0;
        System.out.println("Bem vindo! Pressione S para entrar.");
        String string = scanner.nextLine();
        if(string.equals("s")) {
            System.out.println("Qual a capital do Brasil?");
            string = scanner.nextLine();
            if (string.equals("Brasilia")) {
                pontos++;
                System.out.println("Você pontuou!");
                System.out.println("Você deseja continuar? (s) ou desistir? (d)");
                string = scanner.nextLine();
                if(string.equals("s")) {
                    //Proxima pergunta
                    System.out.println("Em qual continente fica o Brasil?");
                    string = scanner.nextLine();
                    if(string.equals("America do sul")) {
                        pontos++;
                        System.out.println("Você pontuou!");
                        System.out.println("Você deseja continuar? (s) ou desistir? (d)");
                        string = scanner.nextLine();
                        if(string.equals("s")) {
                            System.out.println("Oual o ano que o brasil foi descoberto?");
                            string = scanner.nextLine();
                            if (string.equals("22 de abril de 1500")) {
                                pontos++;
                                System.out.println("Você pontuou!");
                                System.out.println("Sua pontuação final foi de: "+pontos);

                            }else {
                                System.out.println("Game Over! Sua pontuação foi: "+pontos);
                            }
                        }else {
                            System.out.println("Game Over! Sua pontuação foi: "+pontos);
                        }
                    }else {
                        System.out.println("Game Over! Sua pontuação foi: "+pontos);
                    }
                }else {
                    System.out.println("Game Over! Sua pontuação foi: "+pontos);
                }
            }else {
                System.out.println("Game Over! Sua pontuação de: "+pontos);
            }
        }else {
            System.out.println("Acabou o jogo... Você pontuou 0.");
        }
    }


}