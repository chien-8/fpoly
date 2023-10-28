#include<stdio.h>
void main(){
	int n;
	printf("nhap n = "); scanf("%d",&n);
	int mang[n]; 
	int i;
	for(i = 0 ; i < n; i++){
		printf("mang [%d] =  ",i);  scanf("%d",&mang[i]);
		
	} 
	for(i = 0; i < n ; i++){
		printf("%d   ",mang[i]);
	}
	int sum =0;
	for(i=0;i<n;i++){
		if(mang[i]%2!=0){
			sum+=mang[i];
		}
		printf("\n trung binh cac so nguyen le la : %d",sum);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	getch();
}
