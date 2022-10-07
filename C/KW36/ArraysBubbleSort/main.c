#include <stdio.h>
#include <stdlib.h>


int main(int argc, char** argv) {
    
    int nums[] = {-4, 9, 6, 2, -8, 96};
    int temp;
    
    for(int b = 0; b < 6; b++){
    for(int x = 0; x < 6 - b; x++){
        if(nums[x] >  nums[x + 1]){
            temp = nums[x];
            nums[x] = nums[x+1];
            nums[x+1] = temp;
        }
    }
    }
    for(int a = 0; a < 6; a++){
        printf("%d ", nums[a]);
    }
    
    int max = 6;
    int min = 0;
    int mid = (max + min) / 2;
    int y;
    
    printf("\nNumber?: ");
    scanf("%d", &y);
    
    while(min < max){
        if(nums[mid] < y){
            min = mid;
        }else if(nums[mid] == y){
            printf("Location found! The index is: %d\n", mid);
            break;
        }else{
            max = mid;
        }
        mid = (max + min) / 2;
    }
   return 0;
}