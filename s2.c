
int min(int i, char* j) 
{
  int x;
  if (i < j) return i; else return j;
}
  
  
void main(void)
{
  int i;
  int j;
  char z='2';
  char* x="wow";
  char *y="you";
  j=6;
  i=j+4;
  i=4+6;
  j=min(j, "test");
}