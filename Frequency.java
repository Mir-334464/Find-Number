import java.util.*;

class Frequency

  {

     public static void main(String[]args)

       {

        Scanner sc=new Scanner(System.in);
      
        System.out.println("Enter Any Number");
       
        int N=sc.nextInt();

       System.out.println("Enter Number You Want To Find & Count");
       
        int num=sc.nextInt();

        int rem=0; int Count=0;
 
while(N!=0)
{

  rem=N%10;

 if(rem==num)
 Count++;

N=N/10;

}


if(Count>0)
  {
System.out.println("Number Found :" +Count+"Times");
}
else
System.out.println("Number Not Found :" +num);

    }
}



