//armostrong number.... 
int no=370;
       int temp=no;
       int rem;
       int len=0;

       while(temp>0){
        rem=temp%10;
        len=len+1;
        temp=temp/10;
       }//System.out.println(len);
       int armo=0;
       int temp2=no; //System.out.println("value"+temp2);
     while(temp2>0){
      	rem=temp2%10;
      	int mul=1;
      	for(int i=1;i<=len;i++){
        	mul=mul*rem;
        	
       }
       temp2=temp2/10;
    	 armo=armo+mul;
    } //System.out.println(armo);
    if(no ==armo){
    System.out.println(armo+" this is armostrong number");
    }
    else{
        System.out.println(armo+" this is not armostrong number");

    }
.....................missing element.................

  System.out.println("finf out missing element");
    int[] arr = {1,2,3,5,6,7,8,9};
    int expected_elm = arr.length + 1;
  int total_elm= expected_elm *( expected_elm + 1) /2;
  //System.out.println("total "+total_elm);
   int sum=0;
 for(int i=0;i<arr.length;i++){
  sum = sum+arr[i];
 		}
 System.out.println("missing elm is "+ (total_elm - sum));