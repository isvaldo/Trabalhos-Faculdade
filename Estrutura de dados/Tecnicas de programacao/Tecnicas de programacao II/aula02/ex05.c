#include <stdio.h>

void vogal(int *count,char c) {
    switch(c){
    case 'a':
    case 'e':
    case 'i':
    case 'o':
    case 'u':
    case 'A':
    case 'E':
    case 'I':
    case 'O':
    case 'U':
    (*count)++;
    break;
    default:break;
    }
}

int main (int argc,char *argv[]){
    FILE *file;
    file = fopen("registro.c","r");
    int count =0;
    if (file != NULL) {
        int byte = fgetc(file);
        while(byte != EOF){
            vogal(&count,(char) byte);
            byte = fgetc(file);
        }
    }
    printf("%d",count);
}
