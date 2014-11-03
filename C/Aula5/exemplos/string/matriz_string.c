#include <stdio.h>

main() {
    char nome[5][10] = {"Luiz", "Paulo", "Maria", "Luiza", "Felipe"};
    int i;


    for (i = 0; i < 5; i++) {
        printf("%s\n", nome[i]);
    }
}
