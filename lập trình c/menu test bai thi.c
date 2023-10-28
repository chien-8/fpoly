#include<stdio.h>
#include<string.h>
#include<stdlib.h> 
struct hoVaTen{
	char hoTen[30];
	int msv;
	int diem; 
}; 
void chucnang1(){
	struct hoVaTen ds[2];
	fflush(stdin);
	printf("\nmoi nhap ho ten : ");
	gets(ds[1].hoTen);
	fflush(stdin);
	printf("\nmoi nhap MSSV : ");
	scanf("%d",&ds[1].msv);
	fflush(stdin);
	printf("\nmoi nhap diem : ");
	scanf("%d",&ds[1].diem);
	strupr(ds[1].hoTen);
	printf("\nsinh vien : %s",ds[1].hoTen);
	printf("\nmssv : %d \n diem : %d",ds[1].msv,ds[1].diem);
		
} 

void chucnang2(){
	int n;
	int mang[n];
	do{
		printf("\nmoi nhap so phan tu mang : ");
		scanf("%d",&n); 
	} while(n<5 || n>10);
	int i;
	int bienDiem=0;
	int tong =0; 
	for(i=0;i<n;i++){
		printf("\nmang[%d] = ",i);
		scanf("%d",&mang[i]); 
	}for(i=0;i<n;i++){
		printf("%d ",mang[i]); 
	}for(i=0;i<n;i++){
		if(mang[i]%3==0 && mang[i]%5==0){
			printf("\nphan tu trong mang chia het cho 3 va 5 la : %d",mang[i]);
			bienDiem++; 
		} 
    }for(i=0;i<n;i++){
    	if(mang[i]%5==0){
    		tong+=mang[i];
    		
		}printf("\ntong cac so chia het cho 5 : %d",tong);
	}
	printf("\nco %d so chia het cho 3 va 5 ",bienDiem); 
} 


void chucnang3(){
	int n;
	int mang[n];
	printf("\nmoi nhap so luong hoc sinh :");
	scanf("%d",&n);
	int i; 
	for(i=0;i<n;i++){
		printf("\nmoi nhap diem sinh vien :");
		scanf("%d",&mang[i]); 
	}for(i=0;i<n;i++){
		printf("\ndiem sinh vien la :%d  ",mang[i]); 
	} 
}

void chucnang4(){
	int x;
	
	
	
	
} 

int main(int argc , char *argv[]){
	int x;
	do{
		printf("\n+------------------MENU-------------------+");
		printf("\n      1.THONG TIN CA NHAN                  ");
		printf("\n      2.MANG SO CHIA HET CHO 3 VA 5        ");
		printf("\n      3.THONG TIN SV                       ");
		printf("\n      4.THOAT CHUONG TRINH                 "); 
		printf("\n+-----------------------------------------+");
		int chon;
		printf("\nMOI BAN CHON CHUONG TRINH : ");
		scanf("%d",&chon);
		switch(chon){
			case 1 :
				chucnang1();
				break; 
			case 2 :
			    chucnang2();
			    break; 
			case 3 :
			    chucnang3(); 
			    break;			 
		}if(chon==0){
			printf("\nTHOAT CHUONG TRINH ");
			break; 
		} 	 
	}while(x<4);
	
	
	
	return 0; 
} 













