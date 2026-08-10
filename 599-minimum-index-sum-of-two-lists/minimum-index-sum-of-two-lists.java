class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
       Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        
        List<String> result = new ArrayList<>();
        int minSum = Integer.MAX_VALUE;
        
        // Traverse list2 to find common items and calculate index sum
        for (int j = 0; j < list2.length; j++) {
            String current = list2[j];
            
            if (map.containsKey(current)) {
                int sum = j + map.get(current);
                
                // If a smaller index sum is found, clear previous results
                if (sum < minSum) {
                    minSum = sum;
                    result.clear();
                    result.add(current);
                } 
                // If it matches the current minimum sum, add to the results
                else if (sum == minSum) {
                    result.add(current);
                }
            }
        }
        
        // Convert the dynamic list back to a string array
        return result.toArray(new String[0]); 
    }
}