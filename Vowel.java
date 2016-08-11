# vowel
public class Vowel {

	
	public static void main(String[] args) {
		Scanner sr=new Scanner(System.in);
		String s=sr.nextLine();
		String s1;
		s1=s.replaceAll("[aeiouAEIOU]","");
		System.out.println(s1);

}
}
