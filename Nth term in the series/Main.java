#include<stdio.h>

int main()
{
  int n;
  scanf("%d", &n);
  if(n % 2 == 0)
  { 
    int a = 0;
    int b = 2;
    int c = n/2;
    int d = 2 * (c - 3);
    printf("%d", d);
  }
  else
  {
  int a = 0;
  int b = 1;
  int d = n - 1;
  printf("%d", d);
  }
  return 0;
}