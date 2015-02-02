#include <stdio.h>
#include <string.h>
const char file_name[20] = "registro.c";
int main (int argc, char *argv[]) {
    FILE *file;
    file = fopen(file_name,"r");
    if (file != NULL) {
        int byte,line=1,count=1;
        byte = fgetc(file);
        printf(" %d ",line++);
        while (byte != EOF) {
                if (count != 80) {
                    count++;
                }else{
                    puts("\nERRO: maximo de linhas atingido");
                    return 0;
                }
                if (byte == '\n'){
                    count = 1;
                    putchar(byte);
                    printf(" %d" ,line++);
                }else {
                    putchar(byte);
                }
                byte = fgetc(file);
        }
    }

}
