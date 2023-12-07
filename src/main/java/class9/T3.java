package class9;

public class T3 {
    public static void main(String[] args) {
        //create a 2d array (shorter way) in which first array will consist of 4 names and
        // second array will contain grades. then your program should print name of the students
        // that has  A and B grades
        String[][] students = {
                {"Alice", "Bob", "Charlie", "David"},
                {"A", "B", "A", "D"},
        };

        // Print names of students with A and B grades
        System.out.println("Students with A and B grades:");
        for (int i = 0; i < 4; i++) {
            if(students[1][i].equals("A") || students[1][i].equals("B"))

                System.out.println(students[0][i]+" "+students[1][i]);
            }
        }
    }

