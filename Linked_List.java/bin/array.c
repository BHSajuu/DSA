#include <stdio.h>
void main(){
    int a[5],*p;
    p=a;
    printf("Ener the elements of array : ");
    for(int i=0;i<5;i++)
     scanf("%d",&a[i]); 
    for(int i=0;i<5;i++)
     printf("the address of %d is %d \n",*(p+i),p+i);   
}