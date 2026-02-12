import java.util.*;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2){

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for(int n : nums1){
            set1.add(n);
        }

        for(int n : nums2){
            set2.add(n);
        }

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        // nums1 - nums2
        Iterator<Integer> it1 = set1.iterator();
        while(it1.hasNext()){
            int val = it1.next();
            if(!set2.contains(val)){
                list1.add(val);
            }
        }

        // nums2 - nums1
        Iterator<Integer> it2 = set2.iterator();
        while(it2.hasNext()){
            int val = it2.next();
            if(!set1.contains(val)){
                list2.add(val);
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        result.add(list1);
        result.add(list2);

        return result;
    }
}
