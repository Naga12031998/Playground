#include<stdio.h>
int main()
{
  int l = 6;
  int b = 9;
  int perimeter = 2 * ( l + b);
  int area = l * b;
  printf("The perimeter of the rectangle is: %d cm\n", perimeter);
  printf("The area of the rectangle is: %d sq cm", area);
  return 0;
}