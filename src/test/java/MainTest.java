package test.java;

import main.MainProgrammer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {
    MainProgrammer main = new MainProgrammer();
    @Test
    public void test1() {
        assertEquals("Input không hợp lệ", MainProgrammer.evaluateProgrammer(13, false));
    }
    @Test
    public void test2() {
        assertEquals("Senior", MainProgrammer.evaluateProgrammer(8, true));
    }
    @Test
    public void test3() {
        assertEquals("Junior", MainProgrammer.evaluateProgrammer(5, true));
    }
    @Test
    public void test4() {
        assertEquals("Chưa rõ xếp loại", MainProgrammer.evaluateProgrammer(2, true));
    }
    @Test
    public void test5() {
        assertEquals("Intern", MainProgrammer.evaluateProgrammer(1, false));
    }
    @Test
    public void test6() {
        assertEquals("Chưa rõ xếp loại", MainProgrammer.evaluateProgrammer(5, false));
    }
}
