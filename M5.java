class Tools{
    String s1="";
    String s2="";
    public String reverse(String s1) {
		
                int len1 = s1.length();
		for(int i=0;i<len1;i++) {
			s2=s2+s1.substring(len1-(i+1),len1-i);
		}
                return s2;
    }
}

public class M5 {
    public static void main(String[] args) {
        Tools t1=new Tools();
        System.out.println(t1.reverse("Goutham"));
    }
}
    


