
public class Faktorialis {
	
	
	public static void main(String[] args){
		
		Faktorizal(10);
		System.out.println();
	
	}
	public static  int Faktorizal(int limit){
		int faktor=1;
		
		for(int i=1;i<=limit;i++){
			faktor=faktor*i;
		}
		System.out.println(faktor);
		return faktor; 
	}
	
}
