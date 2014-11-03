#include <stdio.h>
#include <string.h>

main() {

     char nome1[] = "Luiz";
     char nome2[5];
     char nome3[] = "Maia";

     printf("%d\n", strlen(nome1));
     strcpy(nome2, nome1);
     printf("%s\n", nome2);
     printf("%d\n", strcmp(nome1, nome2));
     printf("%d\n", strcmp(nome1, nome3));
     printf("%s\n", strcat(nome1, nome3));
}
