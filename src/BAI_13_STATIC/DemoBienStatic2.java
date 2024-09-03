package BAI_13_STATIC;

public class DemoBienStatic2 {
    public void getInfo (){
        DemoBienStatic1 demoStatic1 = new DemoBienStatic1();
        System.out.println(demoStatic1.caseId);
        System.out.println(demoStatic1.testcaseKey);

    }
    public static void main(String[] args) {
        System.out.println(DemoBienStatic1.testcaseName);//chỉ gọi biến này khi nó có chứa static

        if (DemoBienStatic1.testcaseName.contains("TAO MOI BONDTEMP")) {
            System.out.println("BONDTEMP");
        }
        DemoBienStatic2 demoStatic2 = new DemoBienStatic2();
        demoStatic2.getInfo();
    }
}

