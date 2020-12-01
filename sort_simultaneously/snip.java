import java.util.Arrays;

class Snippet {
    public void snip(int[] arr1, int[] arr2) {
        if (arr1.length !== arr2.length) return;
        Integer[] indices = new Integer[arr1.length];
        for(int i = 0; i < values.length; ++i) {
            indices[i] = i;
        }
        // Sorts based on arr1.
        Arrays.sort(indices, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return /*uncomment for descending: -*/Integer.compare(arr1[o1], arr1[o2]); 
            }
        });
        // To access, arr1[indices[i]] or arr2[indices[i]]
    }
}
