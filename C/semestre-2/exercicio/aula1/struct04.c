#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#define T_STRING 50
// monta um registro de um aluno
 struct Aluno{
    char nome[T_STRING];
    int nota[3];
    float media;
    };
struct Turma {
    struct Aluno **aluno;
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

main() {
    int qt,i,j;
    input_int(&qt,"Alunos na turma: ");
    struct Turma turma;
    turma.aluno = (struct Aluno *) malloc( qt*sizeof(struct Aluno *));
    for (i=0;i<qt;i++){
        struct Aluno aluno;
        input_char(&aluno.nome,"Nome do aluno: ");
        for (j=0;j<3;j++) {
            input_int(&aluno.nota[j],"Nota: ");
        }
    turma.aluno[i] = &aluno;
    }
    printf("%s",turma.aluno[0]->nome);
    printf("%s",turma.aluno[1]->nome);
}
