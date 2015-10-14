#include <stdio.h>
#include <string.h>
#define T_STRING 50

typedef struct Pessoa{
    char nome[T_STRING];
    char sobre[T_STRING];
};

int getNames(struct Pessoa *pessoa) {
/**
* @param recebe Struct Pessoa
* Pergunta ao usuario nome e sobre nome, remove '\n'
* e preenche uma struct
*/  char buffer[T_STRING];

    printf("\n Nome: ");
    fgets(buffer,T_STRING,stdin);
    if (buffer[0] == '.')
        return 0;
    strcpy(pessoa->nome,buffer);

    printf("\n Sobre: ");
    fgets(buffer,T_STRING,stdin);
    if (buffer[0] == '.')
        return 0;
    strcpy(pessoa->sobre,buffer);

    pessoa->nome[strlen(pessoa->nome) - 1] = '\0';
    pessoa->sobre[strlen(pessoa->sobre) - 1] = '\0';
    return 1;
}

int main() {
    /**
    * Abre um arquivo em binario
    */
    FILE *file;
    const char file_name[] =  "db.dat";
    file = fopen(file_name,"wb");

    /**
    *Criar um ponteiro de pessoas!!!
    * Assim podemos fazer uma array dinamica de pessoas usando malloc e realloc
    */
    struct Pessoa *array_pessoa;
    array_pessoa = (struct Pessoa *) malloc(sizeof(struct Pessoa));
    int qt = 0;

    printf("\n\n Registro de Nomes, Nome,Sobre nome");
    while (1) {
        struct Pessoa pessoa;
        if (getNames(&pessoa)){
            array_pessoa[qt] = pessoa;
            qt++;

        }else{
            puts("Fim de do programa");
            break;
        }
        // aloca + espaço na memoria
        array_pessoa = (struct Pessoa *) realloc(array_pessoa,sizeof(struct Pessoa)*(qt+1));

    }
    /**
    *Escrevendo Nomes no arquivo.
    */
    fwrite(array_pessoa,sizeof(struct Pessoa),qt,file);
    fflush(file);
    fclose(file);

    /**
    *Abre o arquivo com permissão de leitura
    */
    file = fopen(file_name,"rb");
    struct Pessoa *p;

    /**
    *Faz a leitura do arquivo
    */

    fread(p,sizeof(struct Pessoa),qt,file);

    /**
    * Mostra nomes invertidos
    */
    printf("\n\n           Mostrando Sobre nome, Nome do arquivo        \n\n");
    int i;
    for (i=0;i<qt;i++){
        printf("%s,%s\n",p[i].sobre,p[i].nome);

    }



}
