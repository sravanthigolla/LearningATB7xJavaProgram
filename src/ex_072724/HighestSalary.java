package ex_072724;

public class HighestSalary {
    public static void main(String[] args) {
        int[] salaries = {7, 10, 4, 13, 25, 18, 9, 8, 17};

        int len = salaries.length;
        System.out.println("length: " + len);
        int temp=salaries[0];

        for (int i = 0; i < len; i++) {

                if(salaries[i] > temp) {
                    temp = salaries[i];


                }
            }


        System.out.println("highest salary "+temp);



    }
}
