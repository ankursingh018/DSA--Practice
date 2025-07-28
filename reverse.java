import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str= sc.next();
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		String reverse= sb.toString();
		System.out.println(reverse);
	}
}
