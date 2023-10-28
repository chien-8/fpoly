#include<stdio.h>
#include<string.h>
struct tenBoMe{
	char hoTen[30];
	int tuoi;
};
int main(){
	struct tenBoMe dS[2];
	printf("moi nhap ho ten bo : ");
	gets(dS[1].hoTen);
	printf("moi nhap ho ten me : ");
	gets(dS[2].hoTen);
	printf("xin moi nhap tuoi bo : ");
	scanf("%d",&dS[1].tuoi);
	printf("xin moi nhap tuoi me : ");
	scanf("%d",&dS[2].tuoi);
	strupr(dS[1].hoTen);
	strupr(dS[2].hoTen);
	printf("ho va ten bo vua nhap la : %s\n tuoi : %d\n",dS[1].hoTen,dS[1].tuoi);
	printf("ho va ten me vua nhap la : %s\n tuoi : %d",dS[2].hoTen,dS[2].tuoi);

	
	
	
	
	return 0;
	}
