
public class MathPractice {
	
	final static float RADIUS = 100.0f;
	final static float CIRCLE_ANGLE = 360.0f; 
	
	final static float FOLDER_POSITION_X = 100.0f;
	final static float FOLDER_POSITION_Y = 100.0f;
	
	public static void main(String[] args) {
		int size = 4; 
		
		float individualAngle = CIRCLE_ANGLE / size;
		
		for( int i = 1 ; i <= size ; ++i ) {
			float xPosition = (float) (RADIUS * Math.cos(Math.toRadians( i * individualAngle)));
			float yPosition = (float) (RADIUS * Math.sin(Math.toRadians( i * individualAngle)));
			
			System.out.println("xPosition : " + xPosition);
			System.out.print("yPosition : " + yPosition);
			System.out.println("\n\n");
		}
		System.out.println(RADIUS * Math.cos(Math.toRadians(90)));
		System.out.println(Math.cos(Math.toRadians(180)));
	}
}
