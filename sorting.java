find max and min number in array.............

 int [] arr={2,43,5,155,543,11};
  int max=arr[0];
  System.out.println(max);
  for(int i=1;i<arr.length;i++){
     if(arr[i]>max){
         max=arr[i];
    }
  }System.out.println("maximum value is : "+ max);

..............bbble sorting............

int temp=0;
 int [] arr ={2,43,54,13,84,12,43};
 		for(int i=0;i<arr.length;i++)
        {
        	for(int j=0;j<arr.length-1;j++)
            {
            if(arr[j]>arr[j+1]){
            	temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                }
             }
         }
             for(int j=0;j<arr.length;j++)
             {

                  System.out.print(arr[j]+" ");
              }
  ........................insertion sorting ................

public class Main {
  public static void main(String[] args) {
    int temp=0;
    int [] arr ={2,43,54,13,84,12};
     int min=0;
      for(int i=0;i<arr.length-1;i++){
        min=i;
       for(int j=i+1;j<arr.length;j++)
       {
        if(arr[j]<arr[min])
          {
            min=j;
          }
       temp=arr[i];
      arr[i]=arr[min];
      arr[min]=temp;
      }
    }
    for(int i=0;i<arr.length;i++)
      {
       System.out.print(arr[i]+" ");
      }
    
   }
}

.....................array without name called anunyms array........

public class Main {
  public static void main(String[] args) {
    
    Main.Sum(new int[]={22,53,15,36});
   
  }
  static void Sum(int[] no)
   {
   int total=0;
   for(int i :no){
    total=total+1;
   }
   System.out.printl(total);
   }
}
