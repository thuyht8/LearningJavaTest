package BAI_5_IF_ELSE;

public class DieukienIfElseIf {
    public static void main(String[] args) {
        //mục đích của If else if: kiểm tra đc nhiều điều kiện
        int marks = 65;

        if (marks < 60){
            System.out.println("xếp loại D");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("xếp loại C");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("xếp loại B");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("xếp loại A");
        } else if (marks >= 90) {
            System.out.println("xếp loại A+");
        }else {
            System.out.println("giá trị ko thỏa mãn");
        }
    }
}
