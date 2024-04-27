package ru.liga.dcs.lesson05;

import java.util.*;

public class Permutations04 {

    /**
     * Генерирует все перестановки символов в заданной строке.
     *
     * @param str входная строка
     * @return список всех перестановок строки
     */
    public List<String> generateAllPermutations(String str) {
        if(Objects.equals(str, "")) {
            return new ArrayList<>();
        }
        String[] arrStr = str.split("");
        Set<String> setStr = new HashSet<>();

        for(int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                //System.out.println(arrStr[i] + " " + arrStr[j]);
                //setStr.add(permutation(arrStr, i, setStr));
                permutation(arrStr, i, j, setStr);
                //if(setStr.add(permutation(arrStr, i, setStr))) {
                //    System.out.println("--- Added ---");
                //    System.out.println(setStr.stream().toList());
                //}
                //System.out.println();
            }
        }
        //System.out.println(setStr.stream().toList());
        return setStr.stream().toList();
    }

    private void permutation(String[] arrStr, int indexFirstSymbol, int indexSecondSymbol, Set<String> setStr) {
        StringBuilder result = new StringBuilder();
        String[] tempArrStr = Arrays.copyOf(arrStr, arrStr.length);

        for(int i = indexFirstSymbol; i < arrStr.length; i++) {
            for (int j = indexSecondSymbol; j < arrStr.length; j++) {
                //System.out.println(arrStr[i] + " " + arrStr[j]);
                //permutation(arrStr, i, j, setStr);
                String tempSymbol = arrStr[indexFirstSymbol];
                tempArrStr[indexFirstSymbol] = arrStr[indexSecondSymbol];
                tempArrStr[indexSecondSymbol] = tempSymbol;

                for (String s : tempArrStr) {
                    result.append(s);
                }

                if(!setStr.add(result.toString())) {
                    permutation(arrStr, i, j, setStr);
                }
                //if(setStr.add(permutation(arrStr, i, setStr))) {
                    //System.out.println("--- Added ---");
                    //System.out.println(setStr.stream().toList());
                //}
                //System.out.println();
            }
        }

/*
        String tempSymbol = arrStr[indexFirstSymbol];
        tempArrStr[indexFirstSymbol] = arrStr[indexSecondSymbol];
        tempArrStr[indexSecondSymbol] = tempSymbol;

        for (String s : tempArrStr) {
            result.append(s);
        }
*/
        //System.out.println(result.toString());
        //return result.toString();
    }



}
