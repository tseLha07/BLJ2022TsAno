#include <stdio.h>
#include <stdlib.h>

char makeUppercase(char *p_c);

int main() {
    char c1;
    char c2 = '!';
    
    while(1){
    printf("lowercase Alphabet:");
    scanf("%c", &c1);
    fflush(stdin);
    
    makeUppercase(&c1);
    makeUppercase(&c2);
    
    printf("%c%c\n", c1, c2);
    }
    
    return (EXIT_SUCCESS);
}

char makeUppercase (char *p_c){
    
    if (*p_c >= 'a' && *p_c <= 'z'){
        *p_c -= 'b'-'B';
    } return *p_c;
    
}