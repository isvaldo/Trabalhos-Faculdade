#include <stdio.h>
#include <string.h>
// vetor é um ponteiro.
void ler(char vetorString[5][255]){
    char character[255];
    int i;
    for(i=0;i<5;i++) {
            scanf(" %s",&character);
            strcpy(vetorString[i],character);
            fflush(stdin);
        }
}




main () {
    char nomes[5][255];
    ler(nomes);
    puts("Hora da verdade");
    int i;
     for(i=0;i<5;i++) {
           printf("%s\n",nomes[i]);
        }


}
