package com.xml.writer;

import com.xml.model.Item;
import com.xml.reader.StaXParser;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        StaxWriter configFile = new StaxWriter();
        configFile.setFile("config2.xml");
        try {
            configFile.saveConfig();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
