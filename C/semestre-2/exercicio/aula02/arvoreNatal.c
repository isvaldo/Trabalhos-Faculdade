#include <stdio.h>
/**************************************
 Arvore de natal
 by Isvaldo
**************************************/

void spaces(int qt) {
    // variavel inteira com possibilidade de entrar nos registradores
    unsigned register int i;
    for (i=0;i<qt;i++){
        printf(" ");
    }
}

void insert(char *c,int qt) {
    unsigned register int i;
    for (i=0;i<qt;i++){
        printf("%s",c);
    }
    printf("\n");
}



void fspaces(FILE *file,int qt) {
    // variavel inteira com possibilidade de entrar nos registradores
    unsigned register int i;
    for (i=0;i<qt;i++){
        fprintf(file," ");
    }
}

void finsert(FILE *file,char *c,int qt) {
    unsigned register int i;
    for (i=0;i<qt;i++){
        fprintf(file,"%s",c);
    }
    fprintf(file,"\n");
}
void builder (int space, char *c) {
     if (space>39) {
        printf("Erro: valor maximo 40\n\n\n");
        return "";
    }
    int s = space;
    int i = 0;
    while (i < space*2) {
        spaces(s);
        insert(c,i);
        i++;
        if (i%2 == 0)
            s--;
    }
    for (i=0;i<(space/3);i++){
         spaces(space);
         insert(c,(space/2 - space/3));
    }
}


void builder_file(FILE *file,int space, char *c){
    if (space>39) {
        printf("Erro: valor maximo 40\n\n\n");
        return "";
    }
    if (file != NULL) {
        int s = space;
        int i = 0;
        while (i < space*2) {
            fspaces(file,s);
            finsert(file,c,i);
            i++;
            if (i%2 == 0)
                s--;
    }
    for (i=0;i<(space/3);i++){
         fspaces(file,space);
         finsert(file,c,(space/2 - space/3));
    }
    }
    fclose(file);
}

void main() {
    // max 40
    builder(25,".");
    FILE *file;
    file = fopen("teste.txt","a+");
    builder_file(file,25,".");
}
