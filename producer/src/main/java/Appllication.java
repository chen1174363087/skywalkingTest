import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = "com.chenxin" , exclude = DataSourceAutoConfiguration.class)
@EnableFeignClients
public class Appllication {
    public static void main(String[] args) {
        SpringApplication.run(Appllication.class, args);
    }
}
