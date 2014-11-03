#include <stdio.h>

main() {

    char nome[] = "Luiz";
    int i = 0;

    printf("%s\n", nome);
    while (nome[i] != '\0') {
        printf("%c", nome[i]);
        i++;
    }
    printf("\n%c", nome[i]);
}
