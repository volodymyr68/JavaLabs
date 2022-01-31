package com.company.lab2;

import javax.lang.model.element.Element;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Stream;

public class HourOperations  extends  Hour implements Comparator<Hour>{

    public void sortHoursByBuyers(Store Store) {
         Hour hours = Stream.of(Store.getHours())
                .min(Comparator.comparingInt(Hour::getNumOfBuyers))
                                .get();
                Arrays.sort(Store.getHours(),Comparator.comparingInt(Hour::getNumOfBuyers));
                Arrays.sort(Store.getHours(),Comparator.comparingInt(Hour::getNumOfBuyers));

    }
    public void sortHoursByComment(Store Store, Hour hour){
        List<Hour> sourceList   = Arrays.asList(Store.getHours());
       // List<Hour> l1b = ArrayList<Hour>(Arrays.asList(Store.getHours()));
        //Comparator<Hour> comp =Comparator.comparing(Hour::getComment);
       // sourceList.sort(comp,);




    }

    public int compare(Hour a, Hour b)
    {

        return a.getComment().compareTo(b.getComment());
    }
}
