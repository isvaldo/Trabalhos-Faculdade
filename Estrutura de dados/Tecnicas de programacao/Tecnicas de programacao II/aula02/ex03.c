#include <stdio.h>
#include <string.h>

void copy_hard(FILE *file1,FILE *file2,FILE *file3){
    if (file1 != NULL && file2 !=NULL && file3 != NULL) {
        puts("\ncopiando File2");
        int byte = fgetc(file2);
        while (byte != EOF) {
            fputc(byte,file1);
            byte = fgetc(file2);
        }

        puts("copiando File3");
        byte = fgetc(file3);
        while (byte != EOF) {
            fputc(byte,file1);
            byte = fgetc(file3);
        }
        puts("Fim");
    }
}

void copy(char *name1,char *name2,char *name3) {
    FILE *f1 = fopen(name1,"a+");
    FILE *f2 = fopen(name2,"r");
    FILE *f3 = fopen(name3,"r");
    copy_hard(f1,f2,f3);
    fclose(f1);
    fclose(f2);
    fclose(f3);

}

int main (int argc, char *argv[]) {
    // 4 pois 0 e o nome do arquivo
    if (argc != 4){
        puts("Erro: Erro de parametro");
        puts("Exemplo de uso, copy.exe resultado.txt listaA.txt listaB.txt");
        return 0;
    }
    copy(argv[1],argv[2],argv[3]);
}
