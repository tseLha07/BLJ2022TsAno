#include <stdio.h>
#include <stdlib.h>
#include<unistd.h>

#define BACKGROUND 13

int main(int argc, char** argv) {

    int min = 0;
    int background[BACKGROUND][BACKGROUND] = {
        { 0, 0, 0, 0, 0, 0, 12, 0, 0, 0, 0, 0, 0},
        { 0, 0, 0, 11, 0, 0, 0, 0, 0, 1, 0, 0, 0},
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        { 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0},
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        { 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3},
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        { 0, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0},
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        { 0, 0, 0, 7, 0, 0, 0, 0, 0, 5, 0, 0, 0},
        { 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0},
    };

    while (1) {
        for (int i = 0; i < 60; i++) {
            sleep(1);
            system("cls");
            printf("time: %d:%d\n", min, i);

            for (int i = 0; i < 13; i++) {
                for (int x = 0; x < 13; x++) {
                    if (background[i][x] != 0) {
                        printf("%2d", background[i][x]);
                    } else {
                        printf("  ");
                    }
                }
                printf("\n");
            }
        }
        min++;
    }

    return (EXIT_SUCCESS);
}

