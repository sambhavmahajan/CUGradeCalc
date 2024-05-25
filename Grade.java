import java.util.*;
public class Grade {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the mean (average) marks for the subject:");
        double mean = scanner.nextDouble();
        System.out.println("Enter the variance of marks for the subject:");
        double variance = scanner.nextDouble();
        double stdDeviation = Math.sqrt(variance);

        System.out.println("Enter the highest marks obtained in the class:");
        double highestMarks = scanner.nextDouble();

        System.out.println("Enter the student's marks:");
        double studentMarks = scanner.nextDouble();

        double zScore = (studentMarks - mean) / stdDeviation;
        String grade;
        if (studentMarks < 0.35 * highestMarks) {
            grade = "F";
        } else if (studentMarks > 0.50 * highestMarks) {
            grade = calculateGrade(zScore);
        } else {
            grade = calculateGrade(zScore);
        }

        System.out.println("Grade: " + grade);

        scanner.close();
    }

    public static String calculateGrade(double zScore) {
        if (zScore >= 1.282) {
            return "A⁺";
        } else if (zScore >= 0.841) {
            return "A";
        } else if (zScore >= 0.675) {
            return "B⁺";
        } else if (zScore >= 0.524) {
            return "B";
        } else if (zScore >= 0.385) {
            return "C⁺";
        } else if (zScore >= 0.253) {
            return "C";
        } else if (zScore >= 0.126) {
            return "D";
        } else {
            return "E";
        }
    }
}
