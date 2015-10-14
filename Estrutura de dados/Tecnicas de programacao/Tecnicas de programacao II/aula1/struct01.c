#include <stdio.h>
#include <string.h>
#define T_STRING 50

// monta um registro de um funcionario
struct func {
    char nome[T_STRING];
    int identidade;
    char nascimento[T_STRING];
    };

main() {
    // criar o registro
    struct func f;
    
    // seta os valores
    strcpy(f.nome,"isvaldo");
    f.identidade = 154;
    strcpy(f.nascimento,"05/15/1993");
    // mostra os na tela
    printf("\nNome:%s\n",f.nome);
    printf("identidade:%d\n",f.identidade);
    printf("nascimento:%s\n",f.nascimento);
}
