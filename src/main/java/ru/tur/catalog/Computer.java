package ru.tur.catalog;

import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;

@Scope("prototype")
public class Computer {
    private List<AccessoriesInfo> list = new ArrayList<>();

    public Computer() {
    }

    public Computer(List<AccessoriesInfo> list) {
        this.list = list;
    }

    public void showDetails() {
        for (AccessoriesInfo accessoriesInfo : list)
            System.out.println(accessoriesInfo.showBrand());
    }
}
