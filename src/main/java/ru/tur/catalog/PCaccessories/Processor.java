package ru.tur.catalog.PCaccessories;

import ru.tur.catalog.AccessoriesInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Processor implements AccessoriesInfo {
    List<String> processorList = new ArrayList<>();

    {
        processorList.add("AMD");
        processorList.add("INTEL");
    }


    Random random = new Random();

    @Override
    public String showBrand() {
        System.out.println("Процессоры марки: ");

        for (String processor : processorList)
            System.out.println("    " + processor);
        return "";
    }
}
