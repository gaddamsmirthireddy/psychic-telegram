#include<stdio.h>
void main()
{
	int x,*x1;
	char y,*y1;
	float z,*z1;
	printf("enter integer,character,float values \n");
	scanf("%d %c %f ",&x,&y,&z);
	x1=&x;
	y1=&y;
	z1=&z;
	printf("Address of x=%u\n",x1);
	printf("Address of y=%u\n",y1);
	printf("Address of z=%u\n",z1);
	x1++;
	y1++;
	z1++;
	printf("\nafter increment in pointers\n ");
	printf("\n Now address of x=%u\n",x1);
	printf("\n Now address of y=%u\n",y1);
	printf("\n Now address of z=%u\n",z1);
	
}
