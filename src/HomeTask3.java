import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

public class HomeTask3 {

    private static final Logger log = LogManager.getLogger();

    public static void main(String[] args) throws IOException {
        log.info("the program started");
        Calculator calculator = new Calculator();
        System.out.println(calculator.executor());
    }

}
