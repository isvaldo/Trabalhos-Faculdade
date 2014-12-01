#include <stdio.h>
int const T_VETOR = 100;

int existe(int vetor[T_VETOR],int numero){
    int i;
    for (i=0;i<T_VETOR;i++){
        if (vetor[i] == numero){
            puts("Esse numero existe");
            return 0;
        }
    }
    puts("esse numero nao existe");
    return 0;
}

main() {
    int vetor[T_VETOR],i,n;
    puts("informe o primeiro numero");
    for(i=0;i<T_VETOR;i++){
        scanf("%d",&vetor[i]);
        puts("Informe um outro numero");
    }
    puts("pesquise um numero");
    scanf("%d",&n);
    while(n != -1) {
        printf("%c",existe(vetor,n));
        scanf("%d",&n);
    }
    puts("fim do programa");


}
