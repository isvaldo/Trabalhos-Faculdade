#include <stdio.h>
#include <string.h>

int main(int argc, char *argv[])
  {
   char string[80];
   FILE *arquivo;

    if(argc < 2)
      {
        printf("\nErro: Digite o nome do arquivo !!!\n\n");
        exit(1);
      }
       

    if((arquivo = fopen(argv[1],"w")) == NULL)
      {
        printf("Erro ao abrir arquivo!!!\n\n");
        exit(1);
      }

    do
      {
        gets(string);
        strcat(string,"\n");
        fputs(string,arquivo);
      }
    while(*string != '\n');
 
    fclose(arquivo);

    return(0);
  }
