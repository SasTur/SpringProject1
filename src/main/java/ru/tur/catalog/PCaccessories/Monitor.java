package ru.tur.catalog.PCaccessories;

import ru.tur.catalog.AccessoriesInfo;

import java.util.ArrayList;
import java.util.List;

public class Monitor implements AccessoriesInfo {
    List<String> monitorList = new ArrayList<>();

    {
        monitorList.add("ACER");
        monitorList.add("ASUS");
        monitorList.add("DELL");
        monitorList.add("SAMSUNG");
        monitorList.add("HUAWEI");
        monitorList.add("XIAOMI");
    }

    @Override
    public String showBrand() {
        System.out.println("Мониторы марки: ");

        for (String monitor : monitorList)
            System.out.println("    " + monitor);
        return "";
    }
}
