package ru.tur.catalog.PCaccessories;

import ru.tur.catalog.AccessoriesInfo;

import java.util.ArrayList;
import java.util.List;

public class HardDrive implements AccessoriesInfo {
    List<String> hardDriveList = new ArrayList<>();

    {
        hardDriveList.add("SEAGATE");
        hardDriveList.add("TOSHIBA");
        hardDriveList.add("WD");
    }

    @Override
    public String showBrand() {
        System.out.println("Жесткие диски марки: ");

        for (String hardDrive : hardDriveList)
            System.out.println("    " + hardDrive);
        return "";
    }
}
