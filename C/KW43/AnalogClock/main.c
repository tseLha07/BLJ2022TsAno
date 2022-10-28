#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

#define BACKGROUND 13
    void CLOCK();
    int background[BACKGROUND][BACKGROUND] = {{0}};

int main() {

    int x, y;
    CLOCK();
    
    for (int i = 0; i < 59; i++) {
        sleep(1);
        printf("time: %d", i);
    }
    
        for (int i = 0; i < 13; i++) {
        for (int x = 0; x < 13; x++) {
            if (background[i][x] != 0){
                printf("%2d", background[i][x]);
            }else {
                printf("  ");
            }
        }printf("\n");
    }
    
        return (EXIT_SUCCESS);
}

void CLOCK(){
    
    background[0][6] = {{12}};
    background[1][3] = {{11}};
    background[1][9] = {{1}};
    background[3][1] = {{10}};
    background[3][11] = {{2}};
    background[6][0] = {{9}};
    background[6][12] = {{3}};
    background[9][1] = {{8}};
    background[9][11] = {{4}};
    background[11][3] = {{7}};
    background[11][9] = {{5}};
    background[12][6] = {{6}};

}