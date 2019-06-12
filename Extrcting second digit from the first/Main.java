#include <stdio.h>
int main() 
{
	int n;
  scanf("%d",&n);
  while (n>=100)
  {
    n/=10;
  }
  int r=n%10;
  printf("%d",r);
	return 0;
}