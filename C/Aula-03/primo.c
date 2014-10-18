#include <stdio.h>
#define TRUE 1
#define FALSE 0

main() {



     int i;
     if (numero %2 == 0  && numero != 2) {
        return FALSE;
    }
    for (i=2;i<numero-1;i++){
            i++;
           if (numero % i == 0){
                return FALSE;
            }
    }
    return numero;

}
