package pl.zzpj2021.cleancode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Average {

    Map<Integer, Integer> integerMap = new HashMap<>();
    private int minValue = Integer.MIN_VALUE;
    private int maxValue = Integer.MAX_VALUE;

    public Average(List<Integer> integerList) {
        init(integerList);
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

    public double countAverage() {
        double acc = 0;
        double divider = 0;
        for (Entry<Integer, Integer> entry : integerMap.entrySet()) {
            acc += entry.getKey() * entry.getValue();
            divider += entry.getValue();
        }
        return acc / divider;
    }

    public int getMinValue() {
        return minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }
}
