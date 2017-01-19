package com.a8.data;

import com.a8.data.guice.A8MyBatisModule;
import com.a8.data.mapper.PlayerMapper;
import com.a8.data.model.Player;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.PrivateModule;
import com.google.inject.name.Names;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;

/**
 * Created by fornia on 17-1-19.
 */
public class Manager {
    private static Logger logger = LoggerFactory.getLogger(Manager.class);
    private Injector injector;
    private static Manager manager = new Manager();
    public Injector getInjector(){
        return injector;
    }
    private Manager(){
        init();
    }

    public static Manager getInstance(){
        return manager;
    }
    public void init(){
        injector=createInjector();
    }

    private Injector createInjector(){
        Injector injector = Guice.createInjector(new PrivateModule() {
            @Override
            protected void configure() {
                install(new A8MyBatisModule());
                Names.bindProperties(this.binder(), getConnectionProperties("datas"));
                expose(PlayerMapper.class);
            }
        });
        return injector;
    }

    private final static Properties getConnectionProperties(String schema) {
        Properties properties = new Properties();
        try {
            org.apache.commons.configuration.Configuration configuration = new PropertiesConfiguration("db-" + schema + ".properties");
            properties.setProperty("JDBC.url", configuration.getString("JDBC.url"));
            properties.setProperty("JDBC.username", configuration.getString("JDBC.username"));
            properties.setProperty("JDBC.password", configuration.getString("JDBC.password"));
        } catch (ConfigurationException e) {
            logger.error("init error",e);
            throw new RuntimeException("read configuration exception!", e);
        }
        return properties;
    }
}
