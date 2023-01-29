
public class susobhan {
	public static void main(String args[]) {
		String s = "susobhan";
		int n = s.length();
		char last = s.charAt(n-1);
		String finallast = (String.valueOf(last)).toUpperCase();
		
		char first = s.charAt(0);
		String finalfirst = (String.valueOf(first)).toUpperCase();
		
		String middle="";
		
		
		for(int i =1;i<n-2;i++) {
			
			String resulteven= "";
			String resultodd= "";
			
			
			
			if(i%2==0) {
				String finaleven= String.valueOf(s.charAt(i)).toUpperCase();
				
				resulteven=resulteven+finaleven;
				
			}
			
			
			else if(i%2!=0) {
				String finlodd= String.valueOf(s.charAt(i)).toLowerCase();
				resultodd+=finlodd;
				
			}
			
			
			middle+=resulteven+resultodd;
		}
		
		String result=finalfirst+middle+finallast;
		
		System.out.print(result);
		
		
		
	
}

}
