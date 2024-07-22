import java.util.Scanner;

class Grade
  {
public String grade(int avgp)
    {
    switch (avgp / 10)
      {
        case 10:
            return "A+";
        case 9:
            return "A+";
        case 8:
            return "A";
        case 7:
            return "B+";
        case 6:
            return "B";
        case 5:
            return "c+";
        default:
            return "F";
        }
    }
}

public class GradeCalculator
  {
    public static void main(String[] args)
    {
        Grade g = new Grade();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the count of subjects:");
        int csubs = sc.nextInt();
        int marks = 0;
        for (int i = 0; i < csubs; i++) 
        {
            System.out.println("Enter the marks gained in subject " + (i + 1));
            int smarks = sc.nextInt();
            marks += smarks;
        }
        int avgp = marks / csubs;
        String grade = g.grade(avgp);
        System.out.println("Total marks gained: " + marks);
        System.out.println("Percentage gained: " + avgp + "%");
        System.out.println("Grade gained: " + grade);
        sc.close();
    }
}
