package access1;

public class StringMethods {
	
			static String str1 = "my name is ramya";
			static char ch1 = str1.charAt(0);
		    static String str2 = "hey hi hello";
		    static int var1 = str1.compareTo(str2);
		    static int var2=str1.length();
		    static String var3=str1.concat(str2);
		    static int var4 = str1.compareToIgnoreCase(str2);
		    static boolean var5 = str1.endsWith("String");
		    
public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Character at 0 index is: "+ch1);
		System.out.println("compare method :"+var1);
		System.out.println("length of strng1:"+var2);
		System.out.println("concatination:"+var3);
		System.out.println("str1 equals to str2:"+str1.equals(str2));
		System.out.println("str1 and str2 comparison: "+var4);
		System.out.println("ends with:"+var5);
		System.out.println(str1.replace('o', 'p'));
		System.out.println("String after trim: "+str2.trim());
		System.out.println(str2.startsWith("This"));  
	}

}
