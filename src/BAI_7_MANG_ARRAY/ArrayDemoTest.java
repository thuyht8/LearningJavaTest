package BAI_7_MANG_ARRAY;

public class ArrayDemoTest {
    public static void main(String[] args) {
        int number[] = new int[10];

        for (int i = 0; i < number.length; i++){
            number[i] = i;
        }
        number[5] = 5000;

        for (int n : number){
            System.out.println(n);
        }

        String emai[] = {"1@gmail.com", "@gmail.com", "2@gmail.com"};

        System.out.println(emai[2]);

    }
}
