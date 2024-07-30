package ex_072724;

public class SecondHighest_asc {
    public static void main(String[] args) {
        int[] salaries = {7, 10, 4, 13, 25, 18, 9, 8, 17};

        int len = salaries.length;
        System.out.println("length: " + len);
        int temp;
//descending order
        for (int i = 0; i <= len; i++) {
            for(int j = i+1; j < len; j++) {
                if(salaries[i] > salaries[j]) {
                    temp = salaries[i];
                    salaries[i] = salaries[j];
                    salaries[j] = temp;

                }
            }
        }

        System.out.println("second highest salary "+salaries[len-2]);



    }
}
