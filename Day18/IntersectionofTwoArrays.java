class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> a = new HashSet<>();
        Set<Integer> inter = new HashSet<>();
        for(int x : nums1){
            a.add(x);
        }
        for(int x : nums2){
            if(a.contains (x)){
                inter.add(x);
            }
        }
        return inter.stream()
               .mapToInt(Integer::intValue)
               .toArray();
    }
}