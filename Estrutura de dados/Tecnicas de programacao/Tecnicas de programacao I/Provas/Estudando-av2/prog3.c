#include <stdio.h>
#include <limits.h>


float media (int notas[6][3],char alunos[6],char aluno) {
    int soma=0,i,j;
    for (i=0;i<6;i++){
        if (aluno == alunos[i]){
            for(j=0;j<3;j++){
                soma += notas[i][j];
            }
        }

    }
    return (float) soma/3;
}

main () {
    char alunos[6] = {'a','b','c','d','e','f'},melhorAluno;
    int notas[6][3] = {{5,7,4},{5,6,7},{3,5,2},{4,5,6},{8,9,7},{2,6,4}},i;
    float medias[6],maior,mediaturma=0;
    for (i=0;i<6;i++){
        medias[i] = media(notas,alunos,alunos[i]);
        mediaturma += medias[i];
        printf("aluno '%c'  tem media = %.2f\n",alunos[i],medias[i]);
    }
    mediaturma = mediaturma/6;
    maior = medias[0];

      for (i=0;i<6;i++){
        if (medias[i]>maior){
            maior = medias[i];
            melhorAluno = alunos[i];
        }
    }
    printf ("Media da turma foi %.2f\n",mediaturma);
    printf("Maior nota foi do aluno '%c' media = %.2f \n",melhorAluno,maior);







}
