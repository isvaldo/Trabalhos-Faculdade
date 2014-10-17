#include <stdio.h>

/*Faça um algoritmo que leia uma sequência de 20 números inteiros
* e mostre a soma, média, o maior número e o menor número da sequência.
*/

main (){
int soma=0,maior=0,menor=0,numero,i=0;
float media;
puts("informe 20 uma sequencia de 20 numeros:");
for (;i<20;i++){
    scanf("%d",&numero);
    maior = numero>maior?numero:maior;
    menor = menor==0?numero:menor;
    menor = numero<menor?numero:menor;
    soma += numero;
}
media = (float) soma/20;
printf("\n Maior: %d\n Menor: %d\n Soma: %d\n Media: 4%.2f",maior,menor,soma,media);
}
