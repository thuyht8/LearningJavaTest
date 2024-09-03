package BAI_17_TRY_CATCH;

public class Demo {
    public static void main(String[] args) {
        try{
            Thread.sleep(6000);
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Finished");
    }
}
