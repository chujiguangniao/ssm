package com.cjgn;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;

public class Generator {
    public static void main(String[] args) {
        AutoGenerator autoGenerator = new AutoGenerator();
        DataSourceConfig datasourse = new DataSourceConfig();
        datasourse.setDriverName("com.mysql.cj.jdbc.Driver");
        datasourse.setUrl("jdbc:mysql:///mybatisplus_db?serverTimezone=UTC");
        datasourse.setUsername("root");
        datasourse.setPassword("123456");
        autoGenerator.setDataSource(datasourse);
        autoGenerator.execute();
    }
}
