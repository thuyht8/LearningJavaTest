package BAI_TAP_VE_NHA;

public class Bai_6_VongLapFor {
    public static void main(String[] args) {
        int index = 0;//index là vị trí trung gián để gán giá trị i  vào cho theo số thứ tự
        int number[] = new int[51];

        for (int i = 0; i <= 50; i += 2) {
            System.out.println(i);
            number[index] = i;//add giá trị số chawnx vào mảng A
            index++;
        }

        //in giá trị trong mảng sao khi đã add giá trị
        for (int i = 0; i <= 50; i += 2) {
            System.out.println(number[i]);
        }
        }
    }

