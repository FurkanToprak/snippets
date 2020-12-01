import java.util.Arrays;

class Solution {
    public int largestValsFromLabels(int[] values, int[] labels, int num_wanted, int use_limit) {
        if(num_wanted == 0 || use_limit == 0)
            return 0;
        Integer[] indices = new Integer[values.length];
        for(int i = 0; i < values.length; ++i) {
            indices[i] = i;
        }
        Arrays.sort(indices, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return -Integer.compare(values[o1], values[o2]); 
            }
        });
        int sum = 0;
        int used = 0;
        HashMap<Integer, Integer> usage = new HashMap<Integer, Integer>();
        for(int i = 0; i < indices.length && used < num_wanted; ++i) {
            int index = indices[i];
            Integer a = usage.get(labels[index]);
            if (a == null) {
                a = 0;
            }
            if (a++ < use_limit) {
                usage.put(labels[index], a);
                sum += values[index];
                ++used;
            }
        }
        
        return sum;
    }
}
