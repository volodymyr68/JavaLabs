package com.company.lab2;

import java.util.*;

public class HourOperations  {

    public void sortHoursByBuyers(Store Store) {
                Arrays.sort(Store.getHours(),Comparator.comparingInt(Hour::getNumOfBuyers));
    }
    public void sortHoursByComment(Store Store){
        Arrays.sort(Store.getHours(), Comparator.comparing(Hour::getComment));

    }
}
