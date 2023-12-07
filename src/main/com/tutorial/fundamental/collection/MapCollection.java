package com.tutorial.fundamental.collection;

import java.util.HashMap;
import java.util.Map;

public class MapCollection {

    public Map<String, Integer> initialMap() {
        // Intialize Map then setup value
        var myMap1 = new HashMap<String, Integer>();
        myMap1.put("One", 1);
        myMap1.put("Two", 2);
        myMap1.put("Three", 3);

        // Initialize Map and setup value
        var myMap2 = Map.of(
                "One", 1,
                "Two", 2,
                "Three", 3
        );

        // Initialize Map and setup value with sub-function
        var myMap3 = new HashMap<>() {{
            put("One", 1);
            put("Two", 2);
            put("Three", 3);
        }};

        return myMap1;
    }

    public void mapReplaceValue() {
        var myMap = new HashMap<String, Integer>();
        myMap.put("One", 1);

        System.out.println("Initial value: " + myMap.get("One"));

        myMap.put("One", 2);
        System.out.println("Replace value: " + myMap.get("One"));
    }

    public void mapPutAll(Map<String, Integer> valueMap) {
        var myMap = new HashMap<String, Integer>();
        myMap.put("One", 1);
        myMap.put("Two", 2);
        System.out.println("Before Put All: " + myMap);

        myMap.putAll(valueMap);
        System.out.println("After Put All: " + myMap);
    }

    public void removeValue() {
        var initMap = this.initialMap();
        initMap.remove("One");
    }

    public void putIfAbsent() {
        var initMap = this.initialMap();
        System.out.println("Initial Map: " + initMap);

        initMap.putIfAbsent("One", 4);
        System.out.println("Initial Put One (If Absent): " + initMap);

        initMap.putIfAbsent("Four", 4);
        System.out.println("Initial Put Four (If Absent): " + initMap);
    }

    public void checkContainValue() {
        var initMap = this.initialMap();
        var bool = initMap.containsKey("One");
        System.out.println("Contains Key One: " + bool);

        bool = initMap.containsKey("Four");
        System.out.println("Contains Key Four: " + bool);
    }

    public void computeValue() {
        var initMap = this.initialMap();
        System.out.println("Initial Map: " + initMap);

        initMap.compute("One", (key, value) -> value == null ? 1 : value * 5);
        System.out.println("Compute One: " + initMap);

        initMap.compute("Four", (key, value) -> {
            if (value == null) {
                return 1;
            } else {
                return value * 5;
            }
        });
        System.out.println("Compute Four: " + initMap);
    }

    public void removeAllValue() {
        var initMap = this.initialMap();
        System.out.println("Initial Map: " + initMap);

        initMap.clear();
        System.out.println("Remove All: " + initMap);
    }

    public void entrySetConcept() {
        Map<String, Integer> initMap = this.initialMap();
        System.out.println(initMap);

        // For loop every thing in Map
        initMap.entrySet().forEach(entry -> {
            var value = entry.getValue();
            entry.setValue(value * 2);
        });
        System.out.println(initMap);

    }
}
