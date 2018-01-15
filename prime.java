import java.util.*;
public class prime{
  public static boolean Primes(int num){
    List factors = new ArrayList();

    for(int i = 1, j = (int)(Math.sqrt(num)) + 1;i<j;i+=1)
    {
      if ((num%i) == 0)
      {factors.add(i);}

    }
    //System.out.println(factors);
    int x = factors.size();
    if (x < 2)
    {return true;}
    else{return false;}

  }

public static void main(String[] args)
{
  int number= 0;
  int num = 2;
  int limit = Integer.parseInt(args[0]);

//while (num < 200){
//  if (Primes(num) == true)
//  {sum+=num;}
//  num+=1;



//System.out.println(Primes(12));

while (number < limit){
  if ((Primes(num)) == true) {
    number+=1;
  }
  System.out.println(num);
  num+=1;
}
System.out.println(num);
}




}
