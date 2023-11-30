package com.durotham.utilidades;

public class Utils {

    /*
    int, double, char, String, float
    */
    private int idade = 33;
    public double peso = 70.5;
    public float peso2 = 70.5f;
    public String nome = "Gelcimar";

    public Utils(double peso, String nome) {
        this.nome = nome;
        this.peso = peso;
        //System.out.println(this.nome);
        //System.out.println(nome);
    }

    public void printHelloWorld() {
        idade = 30;
        printOutraCoisa();
    }

    public int pegaIdade() {
        return idade;
    }
    public void printOutraCoisa() {
        System.out.println("Outra coisa");
    }
}
