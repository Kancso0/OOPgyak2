
public class PIszamitas {
	public static void main(String[] args){
		double pi= calculatePi(1000);
		System.out.println(pi);
		
	}
	public static double calculatePi(int limit){
		double pi=0;
		double divider=1;
		for(int i = 0;i<limit;i++){
			double valami=1/divider;
			if((i%2)==0){
				pi+=valami;
			}
			else {
				pi-=valami;
			}
			divider+=2;
			
		}
			return pi*4;
		
	}
	
}