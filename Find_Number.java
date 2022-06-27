import java.util.*;

class Find_Number

  {

     public static void main(String[]args)

       {

        Scanner sc=new Scanner(System.in);
      
        System.out.println("Enter Any Number");
       
        int N=sc.nextInt();

       System.out.println("Enter Number You Want To Find");
       
        int num=sc.nextInt();

        int rem=0; int c=0;
 
while(N!=0)
{

  rem=N%10;

 if(rem==num)
 
      {
        c=1;
     break;
    
     }
 N=N/10;
}


if(c==1)
System.out.println("Number is Found :" +num);

else
System.out.println("Number Not Found :" +num);

    }
}



