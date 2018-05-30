package util;

import org.apache.log4j.PropertyConfigurator;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class LogConfiguration {
    public static void initLog(){
        //指定日期生成的格式
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy_MM_dd HH_mm_ss");
        //获取日期
        String date=dateFormat.format(new Date());
        //声明日志文件存储路径以及文件名和格式
        final String logFilePath = "./result/logs"+date+".log";
        Properties proconfig=new Properties();
        proconfig.setProperty("log4j.rootLogger","info,toConsole,toFile");
        proconfig.setProperty("log4j.appender.toConsole","org.apache.log4j.ConsoleAppender");
        proconfig.setProperty("log4j.appender.toConsole.layout","org.apache.log4j.PatternLayout");
        proconfig.setProperty("log4j.appender.toConsole.layout.ConversionPattrn","[%d{yyyy-MM-dd HH:mm:ss}] [%p] %m%n");
        proconfig.setProperty("log4j.appender.toFile","org.apache.log4j.DailyRollingFileAppender");
        proconfig.setProperty("log4j.appender.toFile.layout","org.apache.log4j.PatternLayout");
        proconfig.setProperty("log4j.appender.toFile.layout.ConversionPattrn","[%d{yyyy-MM-dd HH:mm:ss}] [%p] %m%n");
        proconfig.setProperty("log4j.appender.toFile.file",logFilePath);
        //让配置生效
        PropertyConfigurator.configure(proconfig);

    }
}