#include <stdio.h>
#include <string.h>
#define T_STRING 50

 /*************************************************************
 * Algoritmo de busca
 * Todos os caracteres são varridos ate a primeira ocorrencia
 * apos a primeira ocorrencia é checado se os proximos caracteres
 * são iguais até o tamanho total da keyword, caso positivo o
 * contador é incrementado e o processo se repete para os proximos
 * caracteres do arquivo
 **************************************************************/
int pesquisa(char *file_name,char *keyword){
    FILE *file;
    file = fopen(file_name,"r");
    // quantidade de caracteres
    int count = 0;
    int keyword_len = strlen(keyword);
    if (file != NULL) {
        int byte = fgetc(file);
        while (byte != EOF) {
                if (byte == (int) keyword[0])   {
                    // pesquisas unitarias funcionam assim
                    if (keyword_len == 1) {
                        count++;
                        byte = fgetc(file);
                        continue;
                    }
                    // pesquisas em strings
                    int i=0;
                    while(byte == (int) keyword[i]){
                        i++;
                        if (i == keyword_len) {
                                count++;
                                break;
                        }
                        byte = fgetc(file);
                    }
                    continue;
                }
            byte = fgetc(file);

        }
    }
    fclose(file);
    return count;
}


int main(int argc,char *argv[]) {
    const char file_name[] = "registro.c";
    char word[T_STRING];

    /**
    * Obs, o arquivo avaliado é esse mesmo, logo deve ser considerado a string usada na chamada da
    * função, vamos considerar como +(s) = 2
    *Testes
    * ana+ana+ana =  1+1+1+(s) = 5
    * pof + pof +pof + pof  + (s) = 6
    * &&$ + &&$ + (s) = 4
    * a*a*a*a*a* + (s)  =  7
    */
    printf("\n        Teste 1 \n\n");
    printf("Total ana: %d \n",pesquisa(file_name,"ana"));
    printf("Total pof: %d \n",pesquisa(file_name,"pof"));
    printf("Total &&$: %d \n",pesquisa(file_name,"&&$"));
    printf("Total a*: %d \n",pesquisa(file_name,"a*"));

    //  teste com vogais
    printf("\n\n\n     Teste 2 Vogais   \n\n\n");
    printf("Total a: %d \n",pesquisa(file_name,"a"));
    printf("Total e: %d \n",pesquisa(file_name,"e"));
    printf("Total i: %d \n",pesquisa(file_name,"i"));
    printf("Total o: %d \n",pesquisa(file_name,"o"));
    printf("Total u: %d \n",pesquisa(file_name,"u"));

    // teste com usuario
    printf("\nDigite uma busca: ");
    fgets(word,T_STRING,stdin);
    // MEGA pog apoiado pela comunidade para usar fgets xD
    word[strlen(word)-1] = '\0';
    printf("\n\nSUA PESQUISA '%s'=: %d \n",word,pesquisa(file_name,word));

}
