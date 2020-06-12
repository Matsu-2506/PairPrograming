import java.util.Scanner;
import java.text.DecimalFormat;

public class IntToEng {
    // メインメソッド
   
    private static final String[] tensNames = {
    	    "",
    	    " ten",
    	    " twenty",
    	    " thirty",
    	    " forty",
    	    " fifty",
    	    " sixty",
    	    " seventy",
    	    " eighty",
    	    " ninety"
    };
    private static final String[] numNames = {
    	    "",
    	    " one",
    	    " two",
    	    " three",
    	    " four",
    	    " five",
    	    " six",
    	    " seven",
    	    " eight",
    	    " nine",
    	    " ten",
    	    " eleven",
    	    " twelve",
    	    " thirteen",
    	    " fourteen",
    	    " fifteen",Ï
    	    " sixteen",
    	    " seventeen",
    	    " eighteen",
    	    " nineteen"
    };
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        //System.out.println(translateEng(input));
    }

    // 数値を英訳する変換するメソッド
    /*static String translateEng(int n) {
        return "";
    }
    */
}		




