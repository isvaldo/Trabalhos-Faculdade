#include <stdio.h>

int normal_size () {
    FILE *file;
    file = fopen("registro.c","r");

    if (file != NULL) {
        int byte = fgetc(file);
        int container=0;
        while (byte != EOF) {
            container += sizeof(byte);
            byte = fgetc(file);
        }
        return container;
    }else{
        puts("ERRO: Erro ao abrir arquivo");
    }
    fclose(file);
}

int binary_size () {
    FILE *file;
    file = fopen("registro.c","rb");
    fseek(file, 0L, SEEK_END);
    int size = ftell(file);
    fclose(file);
    return size;
}

void main(int argc,char *argv[]) {
    printf("Normal: %d\nBinary: %d\n",normal_size(),binary_size());
}
