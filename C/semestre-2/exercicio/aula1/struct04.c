#include <stdio.h>
#include <stdlib.h>
#define T_STRING 50
typedef struct Aluno{
    char nome[T_STRING];
    int nota[3];
    float media;
    };
typedef struct Turma {
    struct Aluno *aluno;
    float media;
};
// facilitando entrada de char
void input_char(char *var, char msg[]){
    printf(msg);
    fflush(stdin);
    fgets(var,T_STRING,stdin);
}
// facilitando a entrada de int
void input_int(int *var, char msg[]){
    printf("%s",msg);
    fflush(stdin);
    scanf("%d",var);
}

void melhorAluno (struct Turma turma,int qt) {
    int i;
    //@todo calcular qt usando sizeof
    float maior=turma.aluno[0].media;
    struct Aluno aluno;
    aluno = turma.aluno[0];
    for (i=0;i<qt;i++){
        if (turma.aluno[i].media>maior)
            aluno = turma.aluno[i];
    }
    printf("Melhor aluno: %scom media: %.2f\n\n",aluno.nome,aluno.media);
}
int main(int argc, char **argv) {
    unsigned int qt,i,j;
    float media_turma;
    input_int(&qt,"Alunos na turma: ");
    printf("\n");
    // criar uma turma
    struct Turma turma;
    // Alocando espaÃ§o dinamicamente
    turma.aluno = malloc(qt*sizeof(struct Aluno));
    // para cada aluno Ã© coletada todas as informaÃ§Ãµes
    for (i=0;i<qt;i++){
        printf("\n_________________________________________\n");
        struct Aluno aluno;
        float media_aluno=0;
        input_char(&aluno.nome,"Nome do aluno: ");
        for (j=0;j<3;j++) {
            input_int(&aluno.nota[j],"Nota: ");
            media_aluno += aluno.nota[j];
        }
        printf("\n");
        // armazenando valores de aluno
        aluno.media = (float) media_aluno/3;
        media_turma += aluno.media;
        turma.aluno[i]= aluno;
    }
    // salvando mÃ©dia de todos alunos
    turma.media  = (float) media_turma/qt;
    printf("\n_________________________________________\n");
    for (i=0;i<qt;i++) {
        printf("\n");
        printf("Aluno %d\n",i+1);
        printf("Nome: %s",turma.aluno[i].nome);
        printf("Media do aluno: %.2f\n",turma.aluno[i].media);
    }
    printf("\n_________________________________________\n");
    printf("Media da Turma: %.2f\n",turma.media);
    melhorAluno(turma,qt);
    // libera memoria !!
    free(turma.aluno);
}
