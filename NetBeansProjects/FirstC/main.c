/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * File:   main.c
 * Author: User
 *
 * Created on August 29, 2018, 7:21 PM
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>
void compare();
/*
 *
 */
int main() {
    compare();
}

void compare(){
    float x,y;
    printf("Insert First number ");
    scanf("%f",&x);
    printf("Insert Second number ");
    scanf("%f",&y);
    
    if(x>y){
        printf("First number is greater than the second");
    }
    else if(x<y){
        printf("Second number is greater than the first");
    }
    else{
        printf("these two number is equal");
    }
}
void primeNum(){
    int a;
    printf("input integer to check that is prime number or not :");
    scanf("%d",&a);
    for(int i=1;i<a;i++){
        if((a/i)!=0){
            printf("this num is not prime");break;}
        else if((a/i)==0){
            printf("this num is prime");break;}
        else if(a == 0||a == 1)
            printf("invalid input");
    }
}
void Cant(){
    char c;
    int i,a,b;
    printf("Enter Character(A,B,C) :");
    scanf("%c",&c);
    switch(c){
        case 'A': printf("Enter Number : ");
                scanf("%d",&i);
                printf("you input %d",i);
                break;
        case 'B': printf("Enter Number : ");
                scanf("%d",&i);
                printf("Enter Number : ");
                scanf("%d",&a);
                printf("you input %d,%d",i,a);
        case 'C': printf("Enter Number : ");
                scanf("%d",&i);
                printf("Enter Number : ");
                scanf("%d",&a);
                printf("Enter Number : ");
                scanf("%d",&b);
                printf("you input %d,%d,%d",i,a,b);
    }

}
void BMI(){
    float w,h;
    printf("This program gonna calculate BMI\nEnter ur mass in kg: ");
    scanf("%f",&w);
    printf("Enter ur height in cm: ");
    scanf("%f",&h);
    w= w/(h*h);
    if(w>=40.0){
        printf("very fat");
    }
    else if(w<40.0){
        printf("fat");
    }
    else if(w<25.0){
        printf("normal");
    }

    else if(w<20.0){
        printf("thin");
    }
    else if(w<17.0){
        printf("very thin");
    }

}
void hotel(){
    char c;
    int i;
    printf("Enter room choice: ");
    scanf("%c",&c);
    switch (c){
        case 'D':
        case 'd':
            printf("Enter nights to stay:");
            scanf("%d",&i);
            if(i<=0){
                printf("INVALID NIGHT");
            }
            else if(i<=2){
                printf("Payment is %d baht",i*3500);
            }
            else{
                printf("Payment is %d baht",i*3000);
            }
            break;
        case 'G':
        case 'g':
            printf("Enter nights to stay:");
            scanf("%d",&i);
            if(i<=0){
                printf("INVALID NIGHT");
            }
            else{
                printf("Payment is %d baht",i*4000);
            }
            break;
        default:
            printf("INVALID CHOICE");
    }
}


