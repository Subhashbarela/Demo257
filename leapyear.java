public class Main {
  public static void main(String[] args) {
  int year = 2016;
  if((year%400 == 0){
    System.out.println(year +" leap year");
     }
     else if(year%4 == 0)
     {
        if(year%100 != 0)
           {
             System.out.printl(year +" leap year");
            }
       else{
            System.out.prinln(year +"not leap year");
          }
       }
 else{
       System.out.println(year +" not leap year");
      }
   }
  }
...................................
int year = 2016;
if((year%400 == 0)||(year%4 == 0 && year%100 != 0)
{
System.out.println("leap year");
}
else
{
System.out.println("not leap year");
}
