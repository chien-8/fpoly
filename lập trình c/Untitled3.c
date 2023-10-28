#include<stdio.h>
int main(){
	int n;
	int mang[n];
	do{
	    printf("nhap so phan tu cua mang : ");
    	scanf("%d",&n);
	}while(n<5 || n>10);
	int i;
	int bienDiem=0; 
	int tong=0; 
	for(i=0;i<n;i++){
		printf("mang[%d]=",i);
		scanf("%d",&mang[i]);
	}for(i=0;i<n;i++){
		printf("%d  ",mang[i]);
	}
// dem so phan tu chia het cho 3 va 5
	for(i=0;i<n;i++){
		if(mang[i]%3==0 && mang[i]%5==0){
			printf("\ncac phan tu trong mang chia het cho 3 va 5 la : %d",mang[i]);
			bienDiem++; 
		}	 
	}	
// co ... so chia het cho 3 va 5;
	printf("\nco %d so chia het cho 3 va 5 !!!",bienDiem); 
//tong cac so chia het cho 5 	

	
	
}
