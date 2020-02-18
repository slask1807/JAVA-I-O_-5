import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

class StudentGPA {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(new File("in.txt"));
        PrintWriter pw = new PrintWriter(new File("out.txt"));

        String[] student;

        while (sc.hasNextLine()) {
            student = sc.nextLine().split("\\s+");
            double sum = 0;
            for (int i = 1; i < student.length; i ++) {
                sum += Integer.parseInt(student[i]);
            }
            if (sum / (student.length - 1) > 7) {
                pw.println(student[0].toUpperCase());
            }
        }

        sc.close();
        pw.close();

    }

}