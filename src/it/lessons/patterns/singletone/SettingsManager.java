/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.lessons.patterns.singletone;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

/**
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it>
 */
public class SettingsManager {

    private static SettingsManager _instance = null;
    private Properties prop = new Properties();
    private String ip;
    private String port;
    private static final String IP_KEY = "server";
    private static final String PORT_KEY = "port";

    private SettingsManager() {
        InputStream input = null;
        try {
            input = new FileInputStream("server.properties");
            // load a properties file
            prop.load(input);

//            closeTime = Integer.valueOf(prop.getProperty(KEY_CLOSE_TIME));
            ip = prop.getProperty(IP_KEY);
            port = prop.getProperty(PORT_KEY);

        } catch (IOException io) {
            io.printStackTrace();
        } finally {
            try {
                input.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static SettingsManager getInstance() {
        if (_instance == null) {
            _instance = new SettingsManager();
        }

        return _instance;
    }

    public String getIp() {
        return ip;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        prop.setProperty(PORT_KEY, port);

        OutputStream output = null;
        try {
            output = new FileOutputStream("server.properties");
            prop.store(output, "ciao ciao");

        } catch (IOException io) {
            io.printStackTrace();
        } finally {
            try {
                output.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.port = port;

    }
}
