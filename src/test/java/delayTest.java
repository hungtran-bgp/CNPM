import org.junit.Test;
import static org.junit.Assert.*;
public class delayTest {
    @Test
    public void PHTD_Input_1() {
        queueDelay test = new queueDelay();
        int out = test.dQueue(400007, 2509, 113);
        assertEquals(1, out);
    }

    @Test
    public void PHTD_Input_2() {
        queueDelay test = new queueDelay();
        int out = test.dQueue(900007, 2509, 113);
        assertEquals(-1, out);
    }

    @Test
    public void PHTD_Input_3() {
        queueDelay test = new queueDelay();
        int out = test.dQueue(400006, -1003, 113);
        assertEquals(-1, out);
    }

    @Test
    public void PHTD_Input_4() {
        queueDelay test = new queueDelay();
        int out = test.dQueue(400006, 2509, -203);
        assertEquals(-1, out);
    }
    @Test
    public void PHTD_Output_1() {
        queueDelay test = new queueDelay();
        int out = test.dQueue(654340, 4491, 16);
        assertEquals(0, out);
    }
    @Test
    public void PHTD_Output_2() {
        queueDelay test = new queueDelay();
        int out = test.dQueue(400568, 2153, 106);
        assertEquals(1, out);
    }
    @Test
    public void PHTD_Output_3() {
        queueDelay test = new queueDelay();
        int out = test.dQueue(750006, 3500,195);
        assertEquals(2, out);
    }
    @Test
    public void PHTD_Output_4() {
        queueDelay test = new queueDelay();
        int out = test.dQueue(78000, 960, 156);
        assertEquals(3, out);
    }

    @Test
    public void Bien_Input_1(){
        queueDelay test = new queueDelay();
        int out = test.dQueue(400000, 2500, 100);
        assertEquals(1, out);
    }
    @Test
    public void Bien_Input_2(){
        queueDelay test = new queueDelay();
        int out = test.dQueue(400000, 2500, 200);
        assertEquals(3, out);
    }
    @Test
    public void Bien_Input_3(){
        queueDelay test = new queueDelay();
        int out = test.dQueue(400000, 2500, 0);
        assertEquals(0, out);
    }
    @Test
    public void Bien_Input_4(){
        queueDelay test = new queueDelay();
        int out = test.dQueue(400000, 5000, 100);
        assertEquals(3, out);
    }    @Test
    public void Bien_Input_5(){
        queueDelay test = new queueDelay();
        int out = test.dQueue(400000, 0, 100);
        assertEquals(0, out);
    }
    @Test
    public void Bien_Input_6(){
        queueDelay test = new queueDelay();
        int out = test.dQueue(800000, 2500, 100);
        assertEquals(1, out);
    }
    @Test
    public void Bien_Input_7(){
        queueDelay test = new queueDelay();
        int out = test.dQueue(0, 2500, 100);
        assertEquals(-1, out);
    }

    @Test
    public void Bien_Delay_1(){
        queueDelay test = new queueDelay();
        int out = test.dQueue(500000, 2500, 30);
        assertEquals(0, out);
    }
    @Test
    public void Bien_Delay_2(){
        queueDelay test = new queueDelay();
        int out = test.dQueue(100000, 4000, 20);
        assertEquals(2, out);
    }
    @Test
    public void Bien_Delay_3(){
        queueDelay test = new queueDelay();
        int out = test.dQueue(600000,3000, 200);
        assertEquals(3, out);
    }
    @Test
    public void Bien_Delay_4(){
        queueDelay test = new queueDelay();
        int out = test.dQueue(400000, 1000, 0);
        assertEquals(0, out);
    }
    @Test
    public void Bien_Delay_5(){
        queueDelay test = new queueDelay();
        int out = test.dQueue(1, 5000, 200);
        assertEquals(3, out);
    }
    @Test
    public void Bien_Delay_6(){
        queueDelay test = new queueDelay();
        int out = test.dQueue(2, 5000, 200);
        assertEquals(3, out);
    }


}
