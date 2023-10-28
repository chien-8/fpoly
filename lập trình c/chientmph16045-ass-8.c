#include<stdio.h>
#include<string.h> 
struct sinhvien{
	char hoTen[30];
	float a;
};
void main(){
	int i;
	struct sinhvien SV[2];
	for(i=0;i<2;i++){
	printf("xin moi nhap ten sinh vien : ");
	gets(SV[i].hoTen);
	printf("xin moi nhap diem cua sinh vien : ");
	scanf("%f",&SV[i].a);
	getchar();
    }
    for(i=0;i<2;i++){
    	for(i=0;i<2;i++){
	        strupr(SV[i].hoTen);
	        printf("\n\n");
        	printf("ho ten SV : %s \ndiem : %2.f\n",SV[i].hoTen,SV[i].a);
	        if(SV[i].a>=9 && SV[i].a <=10){
		        printf("Hoc luc xuat sac\n");
	        } else if(SV[i].a>=8 && SV[i].a<9){
	        	printf("Hoc luc gioi\n");
        	}else if(SV[i].a>=6.5 && SV[i].a<8){
        		printf("Hoc luc kha\n ");
	        }else if(SV[i].a>=5 && SV[i].a<6.5){
	        	printf("Hoc luc trung binh\n");
         	}else if(SV[i].a<5){
         		printf("Hoc luc yeu\n");
         	}else{
	        	printf("Diem nhap khong hop le\n");
	        }
	        printf("\n");
	    }
}
	
	getch(); 
} 
