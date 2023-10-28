#include<stdio.h>
int main(){
	int x;
	printf(" xin moi nhap x:");
	scanf("%d",&x);
	if(x ==  x ){
		printf("\n %d la so nguyen",x);	
	}else{
		printf("\n %d khong phai la so nguyen",x);
	} 
	int i=0;
	int count=0;
	for(i=2;i<x;i++){
		if (x%i==0){
			count++;
		}
	}
    if(count==0){
      printf("\n %d la so nguyen to ",x);
	        }	
	        else{
		printf("\n %d khong phai la so nguyen to",x);
	}
	
	while(i*i <= x){
		if(i*i==x){
			printf("\n %d la so chinh phuong",x);
			return 0;
		}
		++i;
	}
	printf("\n %d khong phai la so chinh phuong!",x);
	
	
	
	return 0;
} 

