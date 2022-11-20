package ru.tur.catalog.PCaccessories;

import ru.tur.catalog.AccessoriesInfo;

import java.util.ArrayList;
import java.util.List;

public class MemoryModule implements AccessoriesInfo {
    List<String> memoryModuleList = new ArrayList<>();

    {
        memoryModuleList.add("A-DATA");
        memoryModuleList.add("AMD");
        memoryModuleList.add("CORSAIR");
        memoryModuleList.add("CRUCIAL");
        memoryModuleList.add("KIMTIGO");
        memoryModuleList.add("KINGSTON");
        memoryModuleList.add("NETAC");
        memoryModuleList.add("PATRIOT");
        memoryModuleList.add("SAMSUNG");
        memoryModuleList.add("ТМИ");
    }

    @Override
    public String showBrand() {
        System.out.println("Модули памяти марки: ");

        for (String memoryModule : memoryModuleList)
            System.out.println("    " + memoryModule);
        return "";
    }
}
