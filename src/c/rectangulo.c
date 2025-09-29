#include <stdio.h>
int main(){
  double base=0, altura=0;
  do{ printf("Base: "); scanf("%lf", &base);}while(base <= 0);
  do{ printf("Altura: "); scanf("%lf", &altura);}while(altura <= 0);
  printf("Área = %f\n", base*altura);
  return 0;
}
