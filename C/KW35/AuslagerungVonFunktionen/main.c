#include <stdio.h>
#include <stdlib.h>
#include "inputhandler.h"

int main(int argc, char** argv) {
    int a;
    
    printf("Enter a Number between 1-10: ");
    scanf("%d", &a);
    
    readRangedInt(a);
    int correct = readRangedInt(a);
    if(correct == 1){
        printf("The Number is in range!\n");
    }else if(correct == 0){
        printf("the Number is out of Range\n");
    }
    return (EXIT_SUCCESS);
}