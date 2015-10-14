#include <stdio.h>


int main(int argc,char *argv[]){

    int *vet,i;

    int qt=10;

    int new_tamanho= 11;

    vet =  (int*) malloc(qt* sizeof(int));


     puts("armazenando valores");
    for (i=0;i<qt;i++){
        vet[i]=i;

    }

       puts("imprimindo valores");
    for (i=0;i<qt;i++){
        printf("%d\n",vet[i]);

    }



    vet = (int*)realloc(vet,new_tamanho * sizeof(int));





    puts("imprimindo valores");
     for (i=0;i<new_tamanho;i++){
        printf("%d\n",vet[i]);

    }
}
