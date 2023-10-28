#include<stdio.h>
int main(){
	int a,b;
	printf("nhap so thu nhat : ");
	scanf("%d",&a);
	printf("nhap so thu hai : ");
	scanf("%d",&b);
	int i,j,x,y;
	for(i=1 ; i <= a || i <=  b ; i++){
		if(a%i==0 && b%i==0)
		    x=i;
		    break;
	}
	for(j=a;j<=a*b;j++){
		if(j%a==0 && j%b==0){
			y=j;
			break;
		}
	}
	
	printf("UCLN la : %d ",x);
	printf("\nBCNN la : %d ",y);
	
	return 0;
}
