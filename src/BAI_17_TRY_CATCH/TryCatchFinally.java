package BAI_17_TRY_CATCH;

public class TryCatchFinally {
    public static void main(String[] args) {
        try{
            int data = 5/0;
        }catch (ArithmeticException e) {
            System.out.println(e);
        }finally {
            System.out.println("dòng code finally luôn luôn thực thi");
        }

        System.out.println("Finished");
    }
}
