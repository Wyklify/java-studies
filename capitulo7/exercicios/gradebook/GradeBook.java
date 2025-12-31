package exercicios.gradebook;

public class GradeBook {

    private String courseName;
    private int[] grades;


    public GradeBook(String courseName, int[] grades) {
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

        System.out.printf("\nClass average is %.2f%n", getAverage());

        System.out.printf("Lowest grade is %d%nHighest grade is %d%n%n", getMinimum(), getMaximum());

        outputBarChart();
        
    }


    public  void outputGrades() {
       
        System.out.printf("The grade are: %n%n");

        for (int i = 0; i < grades.length; i++) {
            System.out.printf("Student %2d: %3d%n", i + 1, grades[i]);
        }
    }


    public void outputBarChart() {
       
        System.out.println("Grade distribution: ");

        int[] frequency = new int[11];

        for (int grade : grades) {
            
            ++frequency[grade/10];
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


    public double  getAverage() {
        
        int total = 0;

        for (int grade : grades) {
            
            total += grade;
        }

        return (double) total / grades.length;
    }


    public  int getMaximum() {
        
        int highGrade = grades[0];

        for (int grade : grades) {
            
            if (grade > highGrade) {
                highGrade = grade;
            }
        }

        return highGrade;
    }


    public int getMinimum() {
        
        int lowGrade = grades[0];

        for (int grade : grades) {
            
            if (grade < lowGrade) {
                
                lowGrade = grade;
            }
        }

        return lowGrade;
    }

    
    
}
