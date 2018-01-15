public class Fib {

public static int Fibonacci(int num){
    if (num < 2) {
      return 1;
    }
else {return Fibonacci(num-1) + Fibonacci(num-2);}


}

public static void main(String[] args){
  int sum = 0;
  int num = 0;
  while (Fibonacci(num) < 4000000){
    if (Fibonacci(num) % 2 == 0){
      sum+=Fibonacci(num);
    }
    num+=1;

  }
System.out.println(sum);

}



}
