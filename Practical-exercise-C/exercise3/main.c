#include <stdio.h>

int main() {
    int hora_cinema = 20;
    int hora_atual = 20;

    if(hora_atual > hora_cinema + 30){
        printf("Passou do tempo limite! Não pode entrar!");
    }else if(hora_atual < hora_cinema - 30){
        printf("A Porta do cinema está fechada");
    }else{
        printf("O horario está certo! Pode entrar!");
    }

    return 0;
}
