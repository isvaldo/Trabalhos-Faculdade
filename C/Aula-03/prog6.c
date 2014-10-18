#include <stdio.h>
#define TRUE 1
#define FALSE 0
/*
* Faça um algoritmo que leia um intervalo inferior e superior,
* e mostre os números primos existentes no intervalo. Por exemplo,
* o algoritmo recebe 5 e 10, e mostra como saída 5 e 7. Além disso,
* o algoritmo deve mostrar a quantidade de números primos encontrados no intervalo.
*/
int ePrimo(int numero) {
    int i=0;

    for (;i<numero;i++){
        if (numero%i==0){
            if ( i !=1 || i!=2 && numero==2 ) {
                return FALSE;
            }
        }

    }
    return numero;

}

main(){
    int first,last,i,count;

    puts("Informe inicio do intervalo");
    scanf("%d",&first);
    puts("Informe fim do intervalo");
    scanf("%d",&last);

    for (i=first;i<last+1;i++){
        if (ePrimo(i)){
            printf("%d",ePrimo(i));
            count++;
        }
    }


}
