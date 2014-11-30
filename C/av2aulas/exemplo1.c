#include <stdio.h>
#include <limits.h>


main () {
    int vetor[5][3];
    int i,j;

    vetor[0][0] = 1;
    vetor[1][0] = 1;
    vetor[2][0] = 1;
    vetor[3][0] = 1;
    vetor[4][0] = 1;


    vetor[0][1] = 1;
    vetor[1][1] = 1;
    vetor[2][1] = 1;
    vetor[3][1] = 1;
    vetor[4][1] = 1;

    vetor[0][2] = 1;
    vetor[1][2] = 1;
    vetor[2][2] = 1;
    vetor[3][2] = 1;
    vetor[4][2] = 1;

    for (j=0;j<3;j++){
        for (i=0;i<5;i++){
         printf("%1d",vetor[j][i]);
        }
        puts("\n");

    }

}
