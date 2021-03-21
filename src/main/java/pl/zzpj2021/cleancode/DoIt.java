package pl.zzpj2021.cleancode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class DoIt {

    Map<Integer, Integer> integerMap = new HashMap<>();
    private int minValue = Integer.MIN_VALUE;
    private int maxValue = Integer.MAX_VALUE;

    public DoIt(List<Integer> i1) {
        init(i1);
    }

    public void init(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            init(list.get(i));
        }
    }

    public void init(Integer i) {
        if (integerMap.containsKey(i)) {
            Integer k = integerMap.get(i);
            integerMap.put(i, k + 1);
        } else {
            integerMap.put(1, 1);
        }

        if (i > minValue) {
            minValue = i;
        }

        if (i < maxValue) {
            maxValue = i;
        }
    }

    public int doIt(int key) {
        if (integerMap.containsKey(key)) {
            return integerMap.get(key);
        } else {
            return 0;
        }
    }

    public double isGood() {
        double acc = 0;
        double divider = 0;
        for (Entry<Integer, Integer> entry : integerMap.entrySet()) {
            divider += entry.getValue();
            acc += entry.getKey() * entry.getValue();
        }
        return acc / divider;
    }

    public int getMinValue() {
        return minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }

    //TODO: future use when i will know what  my name and number are
    public String getFizzBuzzNumber(int number) {
        //TODO: implement
        return null;
    }
}