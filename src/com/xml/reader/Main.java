package com.xml.reader;

import com.xml.model.Item;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        StaXParser read = new StaXParser();
        List<Item> readConfig = read.readConfig("config.xml");
        for (Item item : readConfig) {
            System.out.println(item);
        }
    }
}
