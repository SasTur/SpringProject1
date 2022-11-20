package ru.tur.catalog.PCaccessories;

import ru.tur.catalog.AccessoriesInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Screen implements AccessoriesInfo {
    List<String> screenList = new ArrayList<>();

    {
        screenList.add("ACER");
        screenList.add("ASUS");
        screenList.add("DELL");
        screenList.add("SAMSUNG");
        screenList.add("HUAWEI");
        screenList.add("XIAOMI");
    }

    @Override
    public String showBrand() {
        System.out.println("Мониторы марки: ");

        for (String screen : screenList)
            System.out.println("    " + screen);
        return "";
    }
}
