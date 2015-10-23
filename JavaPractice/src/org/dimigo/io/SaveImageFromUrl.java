package org.dimigo.io;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

/**
 * Created by HIPERCUBE on 10/23/15.
 */
public class SaveImageFromUrl {
    public static void main(String[] args) throws Exception {
        String imageUrl = "https://static.dimigo.in/img/logobeta.png";
        URL url = new URL(imageUrl);

        try (InputStream is = url.openStream();
             OutputStream os = new FileOutputStream("/Users/HIPERCUBE/IdeaProjects/JavaPractice/JavaPractice/files/logo.png")) {
            int result;

            while ((result = is.read()) != -1)
                os.write(result);

            byte[] buf = new byte[100];

            while ((result = is.read(buf)) != -1)
                os.write(buf, 0, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
