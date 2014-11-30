#include <stdio.h>
#include <limits.h>


main () {
    int vetor[5][3];
    int i,j;
    // monta o vetor
   for (j=0;j<5;j++){
        for (i=0;i<3;i++){
            vetor[j][i] = 8;
        }
    }
 // mostra o vetor
    for (j=0;j<5;j++){
        for (i=0;i<3;i++){
         printf("%3d",vetor[j][i]);
        }
        puts("\n");

    }

}
