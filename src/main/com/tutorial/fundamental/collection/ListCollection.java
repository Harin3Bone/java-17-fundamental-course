package com.tutorial.fundamental.collection;

import com.tutorial.fundamental.variables.Computer;

import java.util.ArrayList;
import java.util.List;

public class ListCollection {

    public List<Integer> filterList(List<Integer> dataList) {
//         Java 11
//        return dataList.stream()
//                .filter(data -> data < 10)
//                .collect(Collectors.toList());

//         Java 17
        return dataList.stream()
                .filter(data -> data < 10)
                .toList();
    }

    public List<Computer> mapList(List<Integer> dataList) {
        return dataList.stream()
                .map(data -> {
                    var computer = new Computer("Intel", 0, "Nvidia");
                    computer.setRam(data);
                    return computer;
                })
                .toList();
    }

    public List<Computer> forEachList(List<Integer> dataList) {
        var computerList = new ArrayList<Computer>();
        dataList.forEach(data -> {
            var computer = new Computer("Intel", 0, "Nvidia");
            computer.setRam(data);
            computerList.add(computer);
        });
        return computerList;
    }

}
