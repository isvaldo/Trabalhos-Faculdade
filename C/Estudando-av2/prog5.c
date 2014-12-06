#include <stdio.h>
#include <string.h>

main () {
    char nomes[10][50];
    char nome [50];
    scanf("%s",&nome);
    int count  =0;
    while (strcmp(nome,"fim")){
        strcpy(nomes[count],nome);
        count++;
        fflush(stdin);
        scanf(" %s",&nome);
    }
    int i;
    for (i=0;i<10;i++){
        printf("%s\n",nomes[i]);
        }
}
