import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the highest marks obtained in the class:");
        double highestMarks = sc.nextDouble();

        // Input for student's marks
        System.out.println("Enter the student's marks:");
        double studentMarks = sc.nextDouble();

        String grade = calculateGrade(highestMarks, studentMarks);

        System.out.println("Grade: " + grade);

        sc.close();
    }

    public static String calculateGrade(double highestMarks, double studentMarks) {
        double percentage = (studentMarks / highestMarks) * 100;

        if (percentage < 35) {
            return "F";
        } else if (percentage >= 35 && percentage <= 50) {
            return "C";
        } else if (percentage > 50) {
            if (percentage >= 90) {
                return "A⁺";
            } else if (percentage >= 80) {
                return "A";
            } else if (percentage >= 70) {
                return "B⁺";
            } else if (percentage >= 60) {
                return "B";
            } else if (percentage >= 50) {
                return "C⁺";
            } else if (percentage >= 40) {
                return "C";
            } else {
                return "D";
            }
        } else {
            return "E";
        }
    }
}
