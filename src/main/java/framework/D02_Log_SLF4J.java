package framework;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class D02_Log_SLF4J {
    public static void main(String[] args) {
        final Logger logger = LoggerFactory.getLogger(D02_Log_SLF4J.class);
        logger.info("sjli use slf4j.");
        logger.debug("=====测试日志debug级别打印====");
        logger.info("======测试日志info级别打印=====");
        logger.error("=====测试日志error级别打印====");
        logger.warn("======测试日志warn级别打印=====");

        // 可以使用占位符打印出一些参数信息
        String str1 = "blog.itcodai.com";
        String str2 = "blog.csdn.net/eson_15";
        logger.info("======这是用占位符输出的日志", str1, str2);
    }
}
