#include <stdio.h>

int main() {

    char nome[256];
    int idade;

    printf("Ola! Qual o seu nome?\n");
    scanf("%s",&nome);

    printf("\nQual sua idade?\n");
    scanf("%d",&idade);

    printf("Nome: %s\nIdade: %d\n",nome,idade);

    printf("\nAquarde enquanto lemos seus dados...");

    printf("A primeira letra do seu nome e: %c",nome[0]);

    if(idade >= 18){
        printf("\nVoce e adulto!");
    }else if(idade >= 12){
        printf("\nVoce e adolescente!");
    }else{
        printf("\nVoce e crianca!");
    }

    return 0;
}
