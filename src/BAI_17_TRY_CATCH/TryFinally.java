package BAI_17_TRY_CATCH;

public class TryFinally {

    public static void main(String[] args) {
        try{
            int data = 5/0;
        }finally {
            System.out.println("khối lệnh finally luôn được thực thi");//code trong khối này luôn luôn chạy dù đúng hay sai
        }

        System.out.println("Finished");//dòng try phải đúng thì mới chạy tới dòng này
    }
}
