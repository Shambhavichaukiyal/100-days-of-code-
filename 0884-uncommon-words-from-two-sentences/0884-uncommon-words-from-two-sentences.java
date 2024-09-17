class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String s1array[]=s1.split(" ");
        String s2array[]=s2.split(" ");
         List<String> result = new ArrayList<>();
        HashMap<String,Integer> map= new HashMap<>();
        for(String a:s1array)
        {
            
                map.put(a,map.getOrDefault(a, 0) + 1);
            
        }
         for (String word : s2array) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        for (String word : map.keySet()) {
            if (map.get(word) == 1) {
                result.add(word);
            }
        }
 return result.toArray(new String[0]);
    }}