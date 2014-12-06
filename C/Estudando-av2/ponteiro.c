#include <stdio.h>

void teste (int *teste) {
    *teste = 6;
}
main(){
int ola= 2;
    teste(&ola);
printf("%d",ola);

}
