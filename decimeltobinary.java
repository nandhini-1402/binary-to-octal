import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int bnum=s.nextInt();
		int dec=0,power=0;
		while(bnum>0){
		    int lastd=bnum%10;
		    dec=dec+(int)(lastd*Math.pow(2,power));
		    bnum/=10;
		    power++;
		}
		String octal="";
		while(dec>0){
		    int rem=dec%8;
		    octal=rem+octal;
		    dec/=8;
		}
		System.out.print(octal);
		
	}
}
