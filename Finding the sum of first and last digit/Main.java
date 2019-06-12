#include <stdio.h>
int main() 
{
int n;
  scanf("%d",&n);
  int ld=n%10;
  while (n>=10)
  {
    n/=10;
  }
  int fd=n%10;
   int sum=ld+fd;
  printf("%d",sum);
	return 0;
}