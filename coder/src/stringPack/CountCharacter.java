package stringPack;

public class CountCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  String s1="hello i am john";
	  
	  int count=0;
	  for(int i=0;i<s1.length();i++) {
		  
		  if(s1.charAt(i)!='') 
			  count++;
	  }
	  
	  System.out.println("total number of Character in String:"+count);
	  

	}

}
