#include <stdio.h>
#include <stdlib.h>

typedef struct Book {
    char title[20];
    char author[20];
    int published;
} TBook;

void printBook(TBook book){
    printf("*******************\n");
    printf("Title: %s \n", book.title);
    printf("Author: %s \n", book.author);
    printf("Published: %d \n", book.published);
}

int main() {
    
    char title[20] = "Die Elfen";
    char author[20] = "Bernard Hennen";
    int published = 2004;
    
    TBook book = {0};
    printBook(book); 
    
    return 0;
}