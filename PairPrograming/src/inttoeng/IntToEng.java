package inttoeng;

import java.util.Scanner;
import java.text.DecimalFormat;

public class IntToEng {
    // メインメソッド
	public String print1 (int a) {
		String no = "";
		switch (a) {
			case 0: no = "zero"; break;
			case 1: no = "one"; break;
			case 2: no = "two"; break;
			case 3: no = "three"; break;
			case 4: no = "four"; break;
			case 5: no = "five"; break;
			case 6: no = "six"; break;
			case 7: no = "seven"; break;
			case 8: no = "eight"; break;
			case 9: no = "nine"; break;
		}
		return no;
	}
	public String printTeen (int a) {
		String no = "";
		switch (a%10) {
		case 0: no = "ten"; break;
		case 1: no = "eleven"; break;
		case 2: no = "twelve"; break;
		case 3: no = "thirteen"; break;
		case 4: no = "fourteen"; break;
		case 5: no = "fifteen"; break;
		case 6: no = "sixteen"; break;
		case 7: no = "seventeen"; break;
		case 8: no = "eighteen"; break;
		case 9: no = "nineteen"; break;
		}
		return no;
	}
	
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        IntToEng ite = new IntToEng();
        if(0<input && input<10) {
        	System.out.print(ite.printTeen(input));
        }
        //System.out.println(translateEng(input));
    }

    
    static String translateEng(int n) {
    	
    	
        return "";
    }
    
}		




