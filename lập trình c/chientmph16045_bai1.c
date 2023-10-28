#include<stdio.h> 
void main(){
	int x ;
	printf(" Chuong trinh  :\n ");
	printf("\n1.BANG CUU CHUONG 3");
	printf("\n2.XEP LOAI SV");
	printf("\nmoi ban chon chuong trinh : ");
	scanf("%d",&x);
	switch (x){
		case 1 :
			printf("\nban vua chon bang cuu chuong so 3 ");
			int a;
			for(a=1;a<=10;a++){
				printf(" %d X %d = %d\n",3,a,3*a);
			}break;
		case 2 : 
			printf("\nban vua chon xep loai sinh vien");
			float i;
			printf("\nmoi ban nhap diem : ");
			scanf("%f",&i);
			if(a<=10 && a>=5){
				printf("\ndat");
			}else if(a<5 && a>=0){
				printf("\nkhong dat");
			}else{
				printf("\ndiem khong hop le");
			}
			break;
			
	}
	
	
	
	
	
	
	
	
	getch();
}
