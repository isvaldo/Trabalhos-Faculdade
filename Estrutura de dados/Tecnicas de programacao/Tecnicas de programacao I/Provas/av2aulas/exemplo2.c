#include <stdio.h>
#include <limits.h>

void existe(int vet[2][3],int valor) {
    int i,j;

    for(i=0;i<2;i++){
        for(j=0;j<3;j++){
        if (vet[i][j]==valor){
        puts("existe");
        }
        }
        }
}

main () {
    int vetor[2][3] = { {1,2,3},{4,5,6}};
    int i,j;

        existe(vetor,6);



}
