#include <stdio.h>

int main() {

    char nome[256];
    char sobrenome[257];
    int ano_nascimento;
    int idade;

    printf("qual seu nome?\n");
    scanf("%s",nome);

    printf("\nMuito bom %s...qual sua idade?\n",nome);
    scanf("%d",&idade);

    printf("\nOh, muito legal! O %s tem %d anos... qual o seu sobrenome?\n",nome,idade,sobrenome);
    scanf("%s",sobrenome);

    printf("\nPerfeito %s %s... E qual sua data de nacimento?\n",nome,sobrenome,ano_nascimento);
    scanf("%d",&ano_nascimento);

    printf("\nMuito legal! O %s %s tem %d e nasceu em %d\n",nome,sobrenome,idade,ano_nascimento);

    return 0;
}

