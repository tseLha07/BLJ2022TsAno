#include <stdio.h>

int readRangedInt(int a){
    
    int min = 0;
    int max = 10;
    
    if(a >= min && a <= max){
        return(1);
    }else{
        return(0);
    }
}



