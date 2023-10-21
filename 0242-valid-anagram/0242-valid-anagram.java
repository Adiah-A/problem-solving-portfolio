class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> word = new HashMap<>();

        for(Character ch : s.toCharArray()){
            word.put(ch, word.getOrDefault(ch, 0) + 1);
        }

        for(Character ch : t.toCharArray()){
            if(word.containsKey(ch)){
                if(word.get(ch) > 0 ){
                    word.replace(ch, word.get(ch) - 1);
                }else{
                    return false; //you either have an additional appearance 
                                    //of the letter in t that is not in s
                }
            }else{
                return false;
            }
        }

        for(Character key : word.keySet()){
            if(word.get(key) > 0){
                return false;
            }
        }

        return true;
    }
}