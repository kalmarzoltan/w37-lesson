import hu.learn.Calc;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class CalcTest {


        @Test
        public void test(){
            Calc calc = new Calc();
            calc.addOne();


            Assert.assertEquals(new Integer(2),calc.getNumber());
        }

        @Test
        public void hamTest(){
            Calc calc = new Calc();
            calc.addOne();


            assertThat(2, is(equalTo(calc.getNumber())));
        }


    }


