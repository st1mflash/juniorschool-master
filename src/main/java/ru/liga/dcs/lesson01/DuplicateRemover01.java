package ru.liga.dcs.lesson01;
//DONE
import java.util.*;
import java.util.stream.Collectors;

public class DuplicateRemover01 {

    public List<String> removeDuplicates(List<String> originalList) {
        if(originalList == null) {
            return null;
        }

        return originalList
                .stream()
                .distinct()
                .collect(Collectors.toList());
    }

}
