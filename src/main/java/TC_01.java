import com.annotations.Annotations;
import org.testng.annotations.Test;

public class TC_01 extends Annotations {
    @Test(
            testName = "Login User",
            description = "test to check if user is able to login or not",
            groups = {"Smoke","Regression","Santiy"})
    public void myTest(){

        System.out.println("Test with TestNG");
    }

}
