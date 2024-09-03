package BAI_13_STATIC;

import constants.ConfigData;

public class SetupBrowse {

    public static void main(String[] args) {
        ConfigData configData = new ConfigData(); //cách này áp dụng có biến bình thường ko có static
        System.out.println(configData.USERNAME);

        System.out.println(ConfigData.URL);//cách này chỉ dùng cho biến static
    }
}

