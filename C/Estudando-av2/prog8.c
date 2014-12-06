#include <stdio.h>
#include <string.h>

#define T_NOME 20
#define T_NOTA 3
#define T_VETOR 50

void Lealunos(char nomes[][T_NOME],int notas[][T_NOTA]) {
    char nome[T_NOME];
    int count=0,nota,i;
    printf("Informe Nome do aluno: ");
    scanf(" %s",&nome);
    while(strcmp(nome,"fim") !=0) {
        strcpy(nomes[count],nome);
        for (i=0;i<T_NOTA;i++){
            printf("Informe sua %d nota:",i+1);
            scanf("%d",&notas[count][i]);
        }
        count++;
        fflush(stdin);
        printf("\nInforme Nome do aluno: ");
        scanf(" %s",&nome);
    }
}

void Calcmedias(int notas[][T_NOTA],float medias[T_VETOR]) {
    int soma,i,j;
    for(i=0;i<T_VETOR;i++){
        soma = 0;
        for(j=0;j<T_NOTA;j++){
             soma += notas[i][j];
        }
    medias[i] = (float) soma/T_NOTA;
    }

}


void Mostramelhor(char nomes[][T_NOME],int notas[][T_NOTA], float medias[T_VETOR]){
Calcmedias(notas,medias);
int i;

for (i=0;i<3;i++){
    printf("%.2f\n",medias[i]);
}

}


main () {
char nomes[T_VETOR][T_NOME];
int notas[T_VETOR][T_NOTA];
float medias[T_VETOR];

Lealunos(nomes,notas);
Mostramelhor(nomes,notas,medias);


}
