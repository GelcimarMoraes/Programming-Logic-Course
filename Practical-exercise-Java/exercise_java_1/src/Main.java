public class Main {

    public char[] numero = {10,20,30};

    public Main() {
        int soma = 0;
        for(int i = 0; i < numero.length; i++) {
            soma+=numero[i];
        }
        System.out.println(soma);
    }


    public static void main(String args[]) {
        new Main();

    }

}