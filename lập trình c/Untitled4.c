#include<stdio.h>
void main(){
	int n;
	printf("moi nhap so luong sinh vien : ");
	scanf("%d",&n);
	int mang[n];
	int i;
	for(i=0;i<n;i++){
		printf("moi nhap diem sinh vien : ");
		scanf("%d",&mang[i]);
	}for(i=0;i<n;i++){
		printf("\ndiem sinh vien  : %d  ",mang[i]);
    }
	
	
	
	
	
	getch();
	}
