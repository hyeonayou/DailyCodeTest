import java.util.ArrayList;
import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        List <Integer> arrayList = new ArrayList<>();

        for (int element : array) {
            arrayList.add(element);
        }

        int count = Collections.frequency(arrayList, n);
        return count;
    }
}