#include <stdio.h>
#include <string.h>
#define T_STRING 50

// monta um registro de um funcionario
struct func {
    char nome[T_STRING];
    int identidade;
    char nascimento[T_STRING];
    };
// pega as entradas de caracteres

main() {
    struct func f;
    strcpy(f.nome,"isvaldo");
    f.identidade = 154;
    strcpy(f.nascimento,"05/15/1993");

    printf("\nNome:%s\n",f.nome);
    printf("identidade:%d\n",f.identidade);
    printf("nascimento:%s\n",f.nascimento);
}
