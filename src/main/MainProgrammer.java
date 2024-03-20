package main;

public class MainProgrammer {
    public static String evaluateProgrammer(int yearsExperience, boolean hasDegree) {
        if (yearsExperience < 0 || yearsExperience > 10) {
            return "Input không hợp lệ";
        }
        if (yearsExperience >= 7 && hasDegree) {
            return "Senior";
        } else if (yearsExperience >= 3 && hasDegree) {
            return "Junior";
        } else if (yearsExperience <= 1) {
            return "Intern";
        } else {
            return "Chưa rõ xếp loại";
        }
    }

    public static void main(String[] args) {
        System.out.println(evaluateProgrammer(10, true));
    }
}
