package BAI_17_TRY_CATCH;

public class TryCatch {
    public static void main(String[] args) {
        try {
            int array[] = new int[5];
            array[6] = 4;
            System.out.println("arr[6 = " + array[6]);

            int data = 5/0;

            String obj = null;
            System.out.println(obj.length());
//        } catch (ArithmeticException e){//ArithmeticException: dành cho phép tính
//            System.out.println(e);
//        }catch (NullPointerException e){//NullPointerException: dành cho null
//            System.out.println(e);
//        }catch (ArrayIndexOutOfBoundsException e){//ArrayIndexOutOfBoundsException: dành cho mảng
//            System.out.println(e);
//        }catch (IllegalArgumentException e){//IllegalArgumentException: dành cho định dạng khác với phương thức
//            System.out.println(e);
//        }catch (IllegalStateException e){//IllegalStateException: dành cho trạng thái của môi trường không phù hợp với hoạt động cố gắng thực hiện
//            System.out.println(e);
//        }catch (NumberFormatException e){//IllegalStateException: dành cho chuyển đổi một Chuỗi thành số nhưng không thể chuyển đổi: 5.35 và 5,35
//            System.out.println(e);
        } catch (Exception e){//Exception: dùng chung cho tất cả mọi trường hợp phía trên, chỉ cần 1 Exception là đủ
            System.out.println(e);
        }

        System.out.println("Finished");

    }
}
