package org.dimigo.abstractclass;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by HIPERCUBE on 9/3/15.
 */
public class RequestProcessor {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        RequestProcessor p = new RequestProcessor();
        InputStream is = p.getClass().getResourceAsStream("map.properties");

        if (is == null)
            throw new RuntimeException("File Load Failed");
        else {
            Properties prop = new Properties();
            prop.load(is);

            String actionName = prop.getProperty("insert");

            if(actionName==null){
                System.out.println("등록된 action 정보가 없습니다.");
                return;
            }

            Class cls = Class.forName(actionName);

        }
    }
}
