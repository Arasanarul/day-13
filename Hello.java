import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String b=sc.next();
		if(b.length()%2!=0)
		    System.out.print(b.substring(0,b.length()/2)+"*"+b.substring(b.length()/2+1));
		else
		    System.out.print(b.substring(0,b.length()/2-1)+"**"+b.substring(b.length()/2+1));
	}
}
