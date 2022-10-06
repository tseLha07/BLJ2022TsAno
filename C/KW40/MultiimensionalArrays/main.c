#include <stdio.h>
#include <stdlib.h>

#define ROWS 4
#define COLS 5

int main() {
    int i;
    int j;
    int num;
    char ans;
    int extra = 2;
    int array[ROWS][COLS] = {{0}};

    printf(" --------------------------------\n");
    printf("| Assigning values to the Arrays |\n");
    printf(" --------------------------------\n");
    printf("\n");
    printf("3 Rows, 3 Columns available\n");
    printf("\n");

    for (int i = 0; i < ROWS; i++) {
        for (int j = 0; j < COLS; j++) {
            printf("array[%d][%d]=", i, j);
            scanf("%d", &array[i][j]);
            fflush(stdin);
        }
    }

    printf("\n");

    do {
        printf("\nOptions: ");
        printf("\na = assign new value       d = delete a value     e = exit        s = show the current placements\n");
        printf("What would you like to do?:  ");
        fflush(stdin);
        scanf("%c", &ans);
        printf("\n");

        if (ans == 'a') {
            printf("Enter the location of the cell you want to update\n");
            printf("(first the number of row, space and then the column. The index numbers starts with 0):  ");
            scanf("%d %d", &i, &j);
            printf("\n");
            printf("Enter the value: ");
            scanf("%d", &num);
            array[i][j] = num;

        } else if (ans == 'd') {
            printf("\nEnter the location of the cell you want to delete\n");
            printf("(The index numbers starts with 0. First the index number of row, space and then the column. The index numbers starts with 0):  ");
            scanf("%d %d", &i, &j);
            array[i][j] = 0;

        } else if (ans == 'e') {
            break;
        } else if (ans == 's') {
            for (int i = 0; i < ROWS; i++) {
                for (int j = 0; j < COLS; j++) {
                    printf("%d ", array[i][j]);
                }
                printf("\n");
            }
        }
    } while (extra == 2);

    return 0;
}

