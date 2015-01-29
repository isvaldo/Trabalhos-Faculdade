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
void input_char(char *var, char msg[]){
    printf(msg);
    fflush(stdin);
    fgets(var,T_STRING,stdin);
}
// pega as entradas inteiras
void input_int(int *var, char msg[]){
    printf("%s",msg);
    scanf("%d",&var);
}

main() {
    struct func f;
    strcpy(f.nome,"isvaldo");
    input_char(&f.nome,"Qual seu nome: ");
    input_int(&f.identidade,"qual sua identidade: ");
    input_char(&f.nascimento,"Qual seu  nascimento: ");

    printf("Nome:%s",f.nome);
    printf("identidade:%d\n",f.identidade);
    printf("nascimento:%s\n",f.nascimento);
}
