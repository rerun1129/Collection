package map;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropSaveTest {


    public static void main(String[] args) {

        Properties properties = new Properties();

        properties.setProperty("소유자","홍길동");
        properties.setProperty("작성일","2021-07-20");
        properties.setProperty("파일 사이즈", "20Kb");
        properties.setProperty("비고", "냉무");

        System.out.println(properties);

        try {
            properties.store(new FileOutputStream("config.txt"),"설정 파일");
            properties.storeToXML(new FileOutputStream("config.xml"),"설정 XML");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
