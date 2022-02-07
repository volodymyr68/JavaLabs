package com.company.lab2;

import java.util.*;
import java.util.stream.Stream;

public class HourOperations  {

    public void sortHoursByBuyers(Store Store) {
         Hour hours = Stream.of(Store.getHours())
                .min(Comparator.comparingInt(Hour::getNumOfBuyers))
                                .get();
                Arrays.sort(Store.getHours(),Comparator.comparingInt(Hour::getNumOfBuyers));
                Arrays.sort(Store.getHours(),Comparator.comparingInt(Hour::getNumOfBuyers));

    }
    public void sortHoursByComment(Store Store){
        Arrays.sort(Store.getHours(), Comparator.comparing(Hour::getComment));

    }
}
