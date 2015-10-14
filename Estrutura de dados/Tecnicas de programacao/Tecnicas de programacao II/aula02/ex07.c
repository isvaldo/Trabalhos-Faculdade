#include <stdio.h>
#include <string.h>
#define T_STRING 50



void saveName(FILE *file,char *name) {
    if (file != NULL) {
        fprintf(file,"%s\n",name);
        fflush(file);
    }else{
        puts("ERRO: Não foi possivel salvar o nome");
    }
}

int valida_nome(char *nome){
    /***
    0-> Nome Certo
    1-> Nome pequeno
    2-> nome sem ou com espaços amais
    ***/
    int nome_len =  strlen(nome);
    int i,count=0;
    // nome pequeno
    if (nome_len < 3) return 1;

    for (i=0;i<nome_len;i++){
            if (nome[i] ==' ') {
                count++;
            }
    }
    // espaço extra
    if (count != 1 ) return 2;
    // tudo certo
    return 0;

}

int main(int argc,char *argv[]) {
    FILE *file;
    file = fopen("nomes.txt","a+");
    char word[T_STRING];
    printf("\n          Registrador de nomes\n\n");

    while(1){
        printf("Informe seu nome e sobre nome: ");
        fgets(word,T_STRING,stdin);
        if (word[0] == '.')break; // modo "ninja"
        word[strlen(word)-1] = '\0';
        int r = valida_nome(word);
        if ( r == 0){
        saveName(file,word);
        }else {
            printf("%s", (valida_nome(word) == 2)?"\nDigite 'NOME SOBRE NOME' Corretamente\n":"\nNome Pequeno de mais certo ?");
        }
        printf("\n");
    }
    fclose(file);
    printf("\n\n        Todos dados foram salvos !!\n\n\n\n");



}
