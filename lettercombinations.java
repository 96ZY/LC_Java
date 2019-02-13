//The code below contains no "printf".
class Solution {
    public List<String> letterCombinations(String digits) {
        List<String>list=new ArrayList<>();
        String []s=new String[digits.length()];
        if(s.length==0){
            return list;
        }
        for(int i=0;i<digits.length();i++){
            switch (digits.charAt(i)){
                case '2':s[i]="abc";break;
                case '3':s[i]="def";break;
                case '4':s[i]="ghi";break;
                case '5':s[i]="jkl";break;
                case '6':s[i]="mno";break;
                case '7':s[i]="pqrs";break;
                case '8':s[i]="tuv";break;
                case '9':s[i]="wxyz";break;
            }
        }
        list=getStringWithFor(s,0,list,"");
        return list;
    }

    private static List<String> getStringWithFor(String []s,int i,List<String> list,String stemp) {

            if(i<s.length-1){
                for(int j=0;j<s[i].length();j++){
                    list=getStringWithFor(s,i+1,list,stemp+s[i].charAt(j));
                }
                i++;
            } else {
                for(int j=0;j<s[i].length();j++){
                    list.add(stemp+s[i].charAt(j));
                }
            }

            return list;
    }
}
//To test how recursion works, I insert some "printf"s to display how the code runs.
/*import java.util.*;

class Solutionoflettercombination {
	public List<String> letterCombinations(String digits) {
		System.out.println("String digits="+digits);
		List<String> list = new ArrayList<>();
		String[] s = new String[digits.length()];
		System.out.println("s.length="+s.length);
		int M = digits.length();
		if (s.length == 0) {
			return list;
		}
		for (int i = 0; i < digits.length(); i++) {
			switch (digits.charAt(i)) {
			case '2':
				s[i] = "abc";
				break;
			case '3':
				s[i] = "def";
				break;
			case '4':
				s[i] = "ghi";
				break;
			case '5':
				s[i] = "jkl";
				break;
			case '6':
				s[i] = "mno";
				break;
			case '7':
				s[i] = "pqrs";
				break;
			case '8':
				s[i] = "tuv";
				break;
			case '9':
				s[i] = "wxyz";
				break;
			}
		}
		System.out.println("s[]="+s);
		list = getStringWithFor(s, 0, list, "");
		return list;
	}

	private static List<String> getStringWithFor(String[] s, int i, List<String> list, String stemp) {
		System.out.println();
		System.out.println(
				"First step in getStringWithFor, " + "s=" + s + " i=" + i + " list=" + list + " stemp=" + stemp + ".");
		System.out.println("s.length()="+s.length);
		if (i < s.length - 1) {
			System.out.println("i=" + i + "<s.length-1=" + (s.length - 1));
			for (int j = 0; j < s[i].length(); j++) {
				System.out.println("j1=" + j + "<s[" + i + "].length()=" + s[i].length());
				System.out.println("right now stemp="+"("+stemp+")");
				list = getStringWithFor(s, i + 1, list, stemp + s[i].charAt(j));
				System.out.println("done: stemp+s["+i+"].charAt("+j+")="+s[i].charAt(j));
			}

			i++;
			System.out.println("after for, i=" + i);
		} else {
			System.out.println("i=" + i + ">=s.length-1=" + (s.length - 1));
			for (int j = 0; j < s[i].length(); j++) {
				System.out.println("j=" + j + "<s[" + i + "].length()="+s[i].length());
				list.add(stemp + s[i].charAt(j));
				System.out.println("list.add(" + "stemp" + "(" + stemp + ")" + "+s[" + i + "].charAt(" + j + ")("
						+ s[i].charAt(j) + ")");
			}
		}
		System.out.println("list=" + list);
		return list;
	}

}

public class lettercombinations extends Solutionoflettercombination {
	public static void main(String[] args) {
		lettercombinations l = new lettercombinations();
		String digits = "23";
		l.letterCombinations(digits);
	}
}
*/
