#include <stdio.h>
#include <string.h>

#define T_CHAR 255
#define T_VET 3


void ler(char vet[][T_CHAR]){
    char str[T_CHAR];
    int i;
    for(i=0;i<T_VET;i++) {
            scanf(" %s",&str);
            strcpy(vet[i],str);
            fflush(stdin);
        }
}


void inverter(char vet[T_VET][T_CHAR]){

}

main() {
    char nomes[T_VET][T_CHAR];
    ler(nomes);
}
