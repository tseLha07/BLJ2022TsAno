
#include <stdio.h>
#include <stdlib.h>

#define SIZE 5

int main() {

    int x, y;
    char arr[SIZE][SIZE] = {
        {'#', '#', '.', '.', '.'},
        {'.', '.', '#', '.', '.'},
        {'#', '#', '#', '.', '.'},
        {'#', '.', '.', '#', '#'},
        {'.', '.', '#', '.', '#'}
        
    };

    while (1) {
        system("cls");
        printf("  +----------+\n");
        printf("  |0 1 2 3 4 |\n");
        printf("+-+----------+\n");

        for (int i = 0; i < SIZE; i++) {
            printf("|%d|", i);
            for (int j = 0; j < SIZE; j++) {
                printf("%c ", arr[i][j]);
            }
            printf("|");
            printf("\n");
        }
        printf("+-+----------+\n\n");

        printf("\nInput: ");
        scanf("%d %d", &x, &y);

        if (arr[x][y] == '#') {

            arr[x][y] = '.';

        } else {

            arr[x][y] = '#';

        }
        if (arr[x + 1][y] == '#') {

            arr[x + 1][y] = '.';

        } else {

            arr[x + 1][y] = '#';

        }
        if (arr[x - 1][y] == '#') {

            arr[x - 1][y] = '.';

        } else {

            arr[x - 1][y] = '#';

        }
        if (arr[x][y + 1] == '#') {

            arr[x][y + 1] = '.';

        } else {

            arr[x][y + 1] = '#';

        }
        if (arr[x][y - 1] == '#') {

            arr[x][y - 1] = '.';

        } else {

            arr[x][y - 1] = '#';

        }
    }

    return 0;
}