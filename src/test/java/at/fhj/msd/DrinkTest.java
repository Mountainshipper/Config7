package at.fhj.msd;

import junit.framework.TestCase;
import org.junit.jupiter.api.BeforeEach;

public class DrinkTest extends TestCase {

   

        private DrinkQueue calc;
        @BeforeEach
        public void setup(){
            calc = new DrinkQueue(5);
        }

}