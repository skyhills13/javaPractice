
public class TimePractice {
	public static void main(String[] args) {
		System.out.println("start");
		long temp = System.currentTimeMillis();
		try {
			new Thread().sleep(500);
			long result = temp - System.currentTimeMillis(); 
			
			System.out.println(result);
			System.out.println("end");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
