import com.annotations.Annotations;
import org.testng.annotations.Test;


public class TC_02 extends Annotations {
        @Test(groups = {"Regression"},
                dataProviderClass =com.annotations.TestDataProviders.class,
                dataProvider = "QAlogin")
        public void myTest(String Username,String Password){

            System.out.println(Username+"===="+Password);
        }

    }

