import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();//input always a odd number
      for(int i=0;i<a;i++){
        
      for(int j=0;j<a;j++){
      if(i==a/2||j==a/2||j==0&&i<=a/2||i==0&&j>a/2||i==a-1&&j<=a/2||i>a/2&&j==a-1){
      System.out.print("* ");}
      else
      System.out.print("  ");
      }
      System.out.println();
      }
  }
}
