#include <iostream>

int main() {

    char player[256];
    char player2[256];

    printf("player 1, Sua vez...");
    scanf("%s",&player);

    printf("player 2, Sua vez...");
    scanf("%s",&player2);

    printf("\nAguarde, estamos calculando o resultado...\n");
    if(strcmp(player,"papel") == 0){
                if(strcmp(player2,"papel") == 0){
                    printf("Empate!");
                }else if(strcmp(player2,"tesoura") == 0){
                    printf("Player 2 ganhou!");
                }else if(strcmp(player2,"pedra") == 0){
                    printf("Player 2 Perdeu!, Player 1 Ganhou!");
                }else{
                    printf("O player 2 jogou uma informacao invalida!");
                }

    }else if(strcmp(player,"tesoura") == 0){
                if(strcmp(player2,"papel") == 0){
                    printf("Player 2 Perdeu!, Player 1 Ganhou!");
                }else if(strcmp(player2,"tesoura") == 0){
                    printf("Empate!");
                }else if(strcmp(player2,"pedra") == 0){
                    printf("Player 2 Ganhou!");
                }else{
                    printf("O player 2 jogou uma informacao invalida!");
                }

    }else if(strcmp(player,"pedra") == 0){
                if(strcmp(player2,"papel") == 0){
                    printf("Player 2 Ganhou!");
                }else if(strcmp(player2,"tesoura") == 0){
                    printf("Player 2 Perdeu!, Player 1 Ganhou!");
                }else if(strcmp(player2,"pedra") == 0){
                    printf("Empate!");
                }else{
                    printf("O player 2 jogou uma informacao invalida!");
                }
    }else{
        printf("Voce jogou uma informacao invalida!");
    }


    return 0;
}
