package ru.tur.catalog;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import ru.tur.catalog.PCaccessories.*;

import java.util.List;

@Configuration
@ComponentScan("ru.tur.catalog")
public class SpringConfig {
    @Bean
    public Monitor compBean1() {
        return new Monitor();
    }

    @Bean
    public MotherBoard compBean2() {
        return new MotherBoard();
    }

    @Bean
    public VideoCard compBean3() {
        return new VideoCard();
    }

    @Bean
    public Processor compBean4() {
        return new Processor();
    }

    @Bean
    public PowerSupplyUnit compBean5() {
        return new PowerSupplyUnit();
    }

    @Bean
    public MemoryModule compBean6() {
        return new MemoryModule();
    }

    @Bean
    public HardDrive compBean7() {
        return new HardDrive();
    }

    @Bean
    @Scope("prototype")
    public Computer computer(List<AccessoriesInfo> list) {
        return new Computer(list);
    }
}
