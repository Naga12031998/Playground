#include<stdio.h>
int main()
{
  int n;
  scanf("%d", &n);
  int c = n / 100;
  int d = n % 10;
  printf("%d" , c+d);
  return 0;
}