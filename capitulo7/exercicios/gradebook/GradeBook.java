package exercicios.gradebook;

public class GradeBook {

    private String courseName;
    private int[][] grades;

    public GradeBook(String courseName, int[][] grades) {
        this.courseName = courseName;
        this.grades = grades;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void processGrade() {

        outputGrades();

        //System.out.printf("\nClass average is %.2f%n", getAverage());

        System.out.printf("Lowest grade is %d%nHighest grade is %d%n%n", getMinimum(), getMaximum());

        outputBarChart();

    }

    public void outputGrades() {

        System.out.printf("The grade are: %n%n");
        System.out.print("             ");

        for (int i = 0; i < grades[0].length; i++) {
            System.out.printf("Test %d  ", i + 1);
        }

        System.out.println("Average");

        for (int i = 0; i < grades.length; i++) {
            System.out.printf("Student %2d", i + 1);

            for (int test : grades[i]) {
                System.out.printf("%8d",test);
            }

            double average = getAverage(grades[i]);
            System.out.printf("%9.2f%n", average);
        }
    }

    public void outputBarChart() {

        System.out.println("Grade distribution: ");

        int[] frequency = new int[11];

        for (int[] studentGrades : grades) {

            for (int grade : studentGrades) {

                ++frequency[grade / 10];
            }

        }

        for (int i = 0; i < frequency.length; i++) {

            if (i == 10) {

                System.out.printf("%5d: ", 100);
            } else {
                System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);
            }

            for (int j = 0; j < frequency[i]; j++) {

                System.out.print("*");
            }

            System.out.println();
        }
    }

    public double getAverage(int[] setOfGrades) {

        int total = 0;

        for (int grade : setOfGrades) {
            total += grade;
        }

        return (double) total / setOfGrades.length;
    }

    public int getMaximum() {

        int highGrade = grades[0][0];

        for (int[] studentGrades : grades) {

            for (int grade : studentGrades) {

                if (grade > highGrade) {
                    highGrade = grade;
                }
            }
        }

        return highGrade;
    }

    public int getMinimum() {

        int lowGrade = grades[0][0];

        for (int[] studentGrades : grades) {

            for (int grade : studentGrades) {

                if (grade < lowGrade) {

                    lowGrade = grade;
                }
            }

        }

        return lowGrade;
    }

}
