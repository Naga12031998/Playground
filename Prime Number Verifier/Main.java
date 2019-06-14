// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  int flag = 0,n;
  scanf("%d", &n);
 for(int i = 2 ;i <= n/2 ; i++)
 {
   if(n % i == 0)
   {
     flag = 1;
   break;
   }
 }
  if(n == 0)
  {
    printf("neither", n);
  }
  else
  {
    if(flag == 0)
    {
      printf("prime", n);
    }
    else
    {
      printf("composite" ,n);
    }
  }
     return 0;
}