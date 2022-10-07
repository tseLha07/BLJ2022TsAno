/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.c
 * Author: karma
 *
 * Created on 8 September 2022, 13:57
 */

#include <stdio.h>
#include <stdlib.h>

#define NUM_MARKS 5
/*
 * 
 */
int main(int argc, char** argv) {
    
    int i;
    float marks[NUM_MARKS], sum = 0.0, avg;
    
    printf(" ----------------------------\n");
    printf("|                            |\n");
    printf("|   Average Mark Generator   |\n");
    printf("|                            |\n");
    printf(" ----------------------------\n");
    printf(" \n");
    printf("Enter Mark Value between 1-6\n");
    printf(" \n");
    
    for (i = 0; i < 5; ++i) {
        printf("%d. Mark: ", i + 1);
        scanf("%f", &marks[i]);
        sum = sum + marks[i];
        
        if(marks[i] < 1 || marks[i] > 6){
        printf("Dumbass! I told you not to\n");
        return 0;
        }
    }
    avg = sum / 5;
    printf("Average = %.2f\n", avg);
    return 0;
}

