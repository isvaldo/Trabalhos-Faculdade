#include <stdio.h>
#include <string.h>
#define T_STRING 50

// monta um registro de um funcionario
struct func {
    char nome[T_STRING];
    int identidade;
    char nascimento[T_STRING];
    float salario;
    };

// char
void input_char(char *var, char msg[]){
    printf(msg);
    fflush(stdin);
    fgets(var,T_STRING,stdin);
}
// int
void input_int(int *var, char msg[]){
    printf("%s",msg);
    fflush(stdin);
    scanf("%d",var);
}
// float
void input_float(float *var,char msg[]){
    printf("%s",msg);
    fflush(stdin);
    scanf("%f",var);
}

main() {
    struct func f;
    f.salario = 10.0;
    input_char(&f.nome,"Qual seu nome: ");
    input_int(&f.identidade,"Qual sua identidade: ");
    input_char(&f.nascimento,"Qual sua data de nascimento: ");
    input_float(&f.salario,"Qual seu salario: ");

    printf("Nome:%s",f.nome);
    printf("identidade:%d\n",f.identidade);
    printf("nascimento:%s",f.nascimento);
    printf("salario:%.2f\n",f.salario);
}
