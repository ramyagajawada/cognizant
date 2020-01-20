package emp;

public class CompareStrings {
		 static String a = "ramya";
		    static String b = "harshini";
		    public static boolean compare(String a, String b){
		        if(a==null || b==null){
		            return false;
		        }
		        if(a.length()!=b.length())
		            return false;
		        for (int i = 0; i <a.length() ; i++) {
		            if(a.charAt(i)!=b.charAt(i))
		                return false;
		        }
		        return true;
		    }
		    public static void main(String args[]) {
		    System.out.println(compare(a, b));
		     a = "ham";
		     b = "ham";
		    System.out.println(compare(a, b));
		    }
		}


