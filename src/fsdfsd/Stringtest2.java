package fsdfsd;
import java.util.*;

public class Stringtest2 {
	public static void main(String[] args){
		String str;
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("���ڿ��� �Է�  :  ");
			str = sc.next();
			if(str.equals("quit")==true) {
				System.out.println("�����մϴ�"); break;
			}
			if(str.matches("^www\\.(.+)")){
				System.out.println(str + " �� 'www'�� �����մϴ�");				
			}
			else{
				System.out.println(str + " �� 'www'�� �������� �ʽ��ϴ�");
			}
		}
	}
}
