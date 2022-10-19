#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define CELL 5

int main() {
    

    int x = 0;
    char size[CELL][CELL];

    printf("  +----------+\n");
    printf("  |0 1 2 3 4 |\n");
    printf("+-+----------+\n");
    
    for (int k = 0; k < CELL; k++) {
        printf("|%d|", x);
        x++;
        for (int j = 0; j < CELL; j++) {
            printf("%c ", size[CELL][CELL]);
        }
        printf("|");
        printf("\n");
    }
    printf("+-+----------+\n");

    return (EXIT_SUCCESS);
}