package ru.tur.catalog.PCaccessories;

import ru.tur.catalog.AccessoriesInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class VideoCard implements AccessoriesInfo {
    List<String> videCardList = new ArrayList<>();

    {
        videCardList.add("ASUS");
        videCardList.add("DELL");
        videCardList.add("GIGABYTE");
        videCardList.add("MSI");
        videCardList.add("PALIT");
        videCardList.add("PNY");
        videCardList.add("POWERCOLOR");
    }

    Random random = new Random();

    @Override
    public String showBrand() {
        System.out.println("Видео карты марки: ");

        for (String videCard : videCardList)
            System.out.println("    " + videCard);
        return "";
    }
}
