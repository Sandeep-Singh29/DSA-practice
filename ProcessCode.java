import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.Random;
public class ProcessCode {
    public static final int FIVE_SECONDS = 60000;
    public static final int MAX_Y = 400;
    public static final int MAX_X = 400;
    public static void main(String... args) throws Exception {
    	int x=5;
    	int y = x++;
    	int z= ++x;
//    	System.out.println(x+y+z);
        boolean repeat = true;
        Robot robot = new Robot(); 
        Random random = new Random();
        int i=1;
        while(repeat) {
            robot.mouseMove(random.nextInt(MAX_X), random.nextInt(MAX_Y));
            Thread.sleep(FIVE_SECONDS);
        	System.out.println(i++);
        }
    }
}









