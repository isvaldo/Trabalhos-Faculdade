#include <stdio.h>
main () {
    const int tamanhoVet = 5;
    int i,sec1 [tamanhoVet],numero,count=0;

    puts("entre com um numero: ");
    for (i=0;i<tamanhoVet;i++){
        scanf("%d",&sec1[i]);
        puts("Entre com outro numero:");
    }

   puts("procure um numero:");
    scanf("%d",&numero);

    while(numero != -1){

    for(i=0;i<tamanhoVet;i++){
        if (sec1[i]== numero){
            count =1;
            }
    }
    if(count == 1){
    puts("existe");

    }else{
    puts("nao existe");
    }
        puts("procure um numero:");
        scanf("%d",&numero);
    }

}
