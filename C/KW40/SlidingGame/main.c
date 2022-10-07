#include <stdio.h>
#include "utils.h"

#define FIELD_SIZE 4

int posx = 0;
int posy = 0;
int y = 0;
int x = 0;

int main(void) {
    int field[FIELD_SIZE][FIELD_SIZE] = {
        { 0, 15, 1, 13},
        { 8, 5, 2, 3},
        {14, 7, 4, 9},
        {10, 11, 6, 12},
    };
    int input = 0;

    do {
        printField(FIELD_SIZE, field);
        scanf("%d", &input);

        switch (input) {
            case 1:
                if (y < FIELD_SIZE) {
                    swapValues(&field[posx][posy], &field[posx][posy + 1]);
                    posy += 1;
                }
                break;
            case 2:
                if (x < FIELD_SIZE) {
                    swapValues(&field[posx][posy], &field[posx + 1][posy]);
                    posx += 1;
                }
                break;
            case 3:
                if (x > 0) {
                    swapValues(&field[posx][posy], &field[posx - 1][posy]);
                    posx -= 1;
                }
                break;
            case 4:
                if (y > 0) {
                    swapValues(&field[posx][posy], &field[posx][posy - 1]);
                    posy -= 1;
                }
                break;
        }

    } while (input != 0);
    return 0;
}
