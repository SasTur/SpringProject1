package ru.tur.catalog.PCaccessories;

import ru.tur.catalog.AccessoriesInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PowerSupplyUnit implements AccessoriesInfo {
    List<String> powerSupplyUnitList = new ArrayList<>();

    {
        powerSupplyUnitList.add("ACCORD");
        powerSupplyUnitList.add("AEROCOOL");
        powerSupplyUnitList.add("CHIEFTEC");
        powerSupplyUnitList.add("COOLER MASTER");
        powerSupplyUnitList.add("DEEPCOOL");
        powerSupplyUnitList.add("GIGABYTE");
        powerSupplyUnitList.add("HIPRO");
        powerSupplyUnitList.add("LINKWORLD");
        powerSupplyUnitList.add("SEASONIC");
        powerSupplyUnitList.add("ZALMAN");
    }

    @Override
    public String showBrand() {
        System.out.println("Блоки питания марки: ");

        for (String powerSupplyUnit : powerSupplyUnitList)
            System.out.println("    " + powerSupplyUnit);
        return "";
    }
}
