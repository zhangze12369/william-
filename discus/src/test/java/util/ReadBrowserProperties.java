package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadBrowserProperties {
    public String URL;
    public  String readBrowser() throws IOException, InterruptedException {
        Properties properties=new Properties();
        InputStream ips=new FileInputStream("./ConfigBroser.properties");
        properties.load(ips);

        String broType = properties.getProperty("browserName");
          URL = properties.getProperty("URL");

        ips.close();
        Thread.sleep(2000);
        return broType;
    }
}
