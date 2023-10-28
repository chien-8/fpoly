#include<stdio.h>
#include<math.h>
void main (){
	int x; 
	printf("xin moi nhap so kWh da dung :");
	scanf("%d",&x);
	if(x >=401){
	int tienDien = x*2927;	
	    printf("so tien phai tra la : %d(dong/kWh)",tienDien);
	}else if(x<400 && x >= 301){ 
	int tienDien = x*2834;
		printf("so tien phai tra la : %d(dong/kWh)",tienDien);
	}else if(x<=300 && x>=201){
	int tienDien = x*2536;
		printf("so tien phai tra la : %d(dong/kWh)",tienDien);
	}else if(x<=200 && x>=101){
	int tienDien = x*2014;
		printf("so tien phai tra la : %d(dong/kWh)",tienDien);
	}else if(x<=100 && x>=51){
	int tienDien = x*1734;
		printf("so tien phai tra la : %d(dong/kWh)",tienDien);
	}else if(x<=50 && x>=0){
	int tienDien = x*1678;
		printf("so tien phai tra la : %d(dong/kWh)",tienDien);
	}else{
		printf("so kWh vua nhap khong hop le");
	}
	
	getch();
}
