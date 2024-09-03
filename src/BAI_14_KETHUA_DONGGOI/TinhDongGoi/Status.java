package BAI_14_KETHUA_DONGGOI.TinhDongGoi;

import BAI_14_KETHUA_DONGGOI.TinhKeThua.Person;

public class Status {
    //triển khai tính đóng gói trong java
    private String testcaseKey;
    private String testcaseName;
    private String body;
    private String method;
    private int httpCode;

    //chuột phải -> chọn generate -> getter and setter ->chọn các biến cần -> OK
    public String getTestcaseKey() {
        return testcaseKey;
    }

    public void setTestcaseKey(String testcaseKey) {
        this.testcaseKey = testcaseKey;
    }

    public String getTestcaseName() {
        return testcaseName;
    }

    public void setTestcaseName(String testcaseName) {
        this.testcaseName = testcaseName;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public int getHttpCode() {
        return httpCode;
    }

    public void setHttpCode(int httpCode) {
        this.httpCode = httpCode;
    }


}
