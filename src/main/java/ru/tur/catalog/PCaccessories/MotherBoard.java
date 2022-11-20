package ru.tur.catalog.PCaccessories;

import ru.tur.catalog.AccessoriesInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MotherBoard implements AccessoriesInfo {
    List<String> motherBoardList = new ArrayList<>();

    {
        motherBoardList.add("ASROCK");
        motherBoardList.add("ASUS");
        motherBoardList.add("GIGABYTE");
        motherBoardList.add("MSI");
    }

    Random random = new Random();

    @Override
    public String showBrand() {
        System.out.println("Материнские платы марки: ");

        for (String motherBoard : motherBoardList)
            System.out.println("    " + motherBoard);
        return "";
    }
}
