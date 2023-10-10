class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        //We can look at using a hashmap to store each character with a precedence, 
        //1 being teh highest and teh last one (string length) being teh lowest
        //we can then use taht to look up different stuff

        HashMap<Character, Integer> dictionary = new HashMap<>();
        int count = 0;
        boolean works = false;

        for(char letter : order.toCharArray()){
            dictionary.put(letter, count);
            count++;
        }

        for(int i = 0; i < words.length - 1; i ++){
            works = false;
            int length = Math.min(words[i].length(), words[i+1].length());

            for(int j = 0 ; j < length; j ++){
                if(words[i].charAt(j) != words[i+1].charAt(j)){
                    if(dictionary.get(words[i].charAt(j)) > 
                        dictionary.get(words[i+1].charAt(j))){
                    return false;
                    }else{
                        works = true;
                        break; //No need to continue since thsi 
                    }
                }
                
            }

            if(words[i+1].length() < words[i].length() && !works){
                return false;
            }
        }

        return true;
    }
}