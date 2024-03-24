package test.java;

import main.MainProgrammer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {
    MainProgrammer main = new MainProgrammer();
//    @Test
//    public void w4_test1() {
//        assertEquals("Input không hợp lệ", MainProgrammer.evaluateProgrammer(13, false));
//    }
//    @Test
//    public void w4_test2() {
//        assertEquals("Senior", MainProgrammer.evaluateProgrammer(8, true));
//    }
//    @Test
//    public void w4_test3() {
//        assertEquals("Junior", MainProgrammer.evaluateProgrammer(5, true));
//    }
//    @Test
//    public void w4_test4() {
//        assertEquals("Chưa rõ xếp loại", MainProgrammer.evaluateProgrammer(2, true));
//    }
//    @Test
//    public void w4_test5() {
//        assertEquals("Intern", MainProgrammer.evaluateProgrammer(1, false));
//    }
//    @Test
//    public void w4_test6() {
//        assertEquals("Chưa rõ xếp loại", MainProgrammer.evaluateProgrammer(5, false));
//    }
    @Test
    public void w5_test1() {
        assertEquals("Input không hợp lệ", MainProgrammer.evaluateProgrammer(12, false));
    }
    @Test
    public void w5_test2() {
        assertEquals("Senior", MainProgrammer.evaluateProgrammer(9, true));
    }
    @Test
    public void w5_test3() {
        assertEquals("Junior", MainProgrammer.evaluateProgrammer(5, true));
    }
    @Test
    public void w5_test4() {
        assertEquals("Chưa rõ xếp loại", MainProgrammer.evaluateProgrammer(2, true));
    }
    @Test
    public void w5_test5() {
        assertEquals("Chưa rõ xếp loại", MainProgrammer.evaluateProgrammer(5, false));
    }
    @Test
    public void w5_test6() {
        assertEquals("Intern", MainProgrammer.evaluateProgrammer(1, false));
    }

}
