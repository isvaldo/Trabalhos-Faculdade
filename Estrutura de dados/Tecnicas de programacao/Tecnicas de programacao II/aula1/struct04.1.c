#include <stdio.h>
#define N_ALUNOS 6
#define N_NOTAS 3
#define T_STRING 50

typedef struct {
    char nome[T_STRING];
    int notas[N_NOTAS];
    float media;
} tp_regAlunos;

/*DICA: USE NOMES SIMPLES E QUE RELACIONADOS*/
void mostrar_Melhor(tp_regAlunos aluno[]){
    unsigned int i;
    tp_regAlunos MelhorAluno;
    MelhorAluno = aluno[0];
    for(i = 0; i < N_ALUNOS; i++){
        if(aluno[i].media>MelhorAluno.media)
         MelhorAluno = aluno[i];
    }
    printf("\n_____________________________________\n");
    printf("Melhor Aluno: %s\nMedia: %.2f",MelhorAluno.nome,MelhorAluno.media);
    }

/*DICA: USE NOME DA STRUCT, a[] não significa nada!*/
/*DICA: PENSE 7 Vezes antes de criar uma variavel e 1000 antes de escreve-la (isvaldo)*/
void mostrar_regAlunos(tp_regAlunos aluno[]){
    //valores positivos inteiros
    unsigned int i,j;
    for(i = 0; i<N_ALUNOS; i++){
        printf("\n_____________________________________\n");
        printf("Aluno: %s\n", aluno[i].nome);
        printf("Notas: [");
        for(j = 0; j < N_NOTAS; j++){
            aluno[i].media += (float) aluno[i].notas[j];
            printf((j+1 == N_NOTAS)?"%d":"%d,",aluno[i].notas[j]);
        }
        printf("]\n");
        aluno[i].media = (float) aluno[i].media / N_NOTAS;
        printf("Media: %.2f",aluno[i].media);
    }
    /*Aproveitamos o embalo e chamamos a outra função aqui mesmo*/
     mostrar_Melhor(aluno);
    //Não usa &, pois já está na forma de ponteiro
}

main(){
    tp_regAlunos aluno[N_ALUNOS] = {{"Luiz",{5,7,4}},
                          {"Paulo",{5,6,7}},
                          {"Maria",{8,5,2}},
                          {"Luiza",{4,5,6}},
                          {"Felipe",{8,9,6}},
                          {"Fabiana",{7,6,4}}};
    // GO !!!!
    mostrar_regAlunos(&aluno);
}
