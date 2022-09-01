#include <stdio.h>

//Declaration
int isLeapYear(int year);
int daysInMonth(int month, int year);
void printDateInfo(int month, int year);

int main() {
    int month;
    int year;
    
    printf("Enter month: ");
    scanf("%d", &month);
    printf("Enter year: ");
    scanf("%d", &year);
    
    printDateInfo(month, year);
    
    return 0;
}

int isLeapYear(int year){

if(year % 400 == 0){
        return(1);
    }
else if (year % 4 == 0 && year % 100 != 0){
        return(1);
    }
else
{
    return(0);
}
}
    
int daysInMonth(int month, int year){
    // for febuary
    if(month == 2 && isLeapYear(year)==0){
        return(28);
        }
    else if(month == 2 && isLeapYear(year)==1){
    return(29);
}
    //for 31
    else if(month == 1 || month == 8 || month == 3 || month == 5 || month == 7 || month == 10 || month == 12){
        return(31);
    }
    //for 30 
else{
    return(30);
}


    
    
    
    

void printDateInfo(int month, int year){
    int days = daysInMonth(month, year);
    
    printf("Der Monat %d hat im Jahr %d %d Tage. \n", month, year, days);
    
    printf("Das Jahr %d ist ", year);
    if(!isLeapYear(year)){
        printf("kein ");
    }else{
        printf("ein ");
    }
    printf("Schaltjahr. \n");
}