class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      //Create a list of Lists that is going to containg teh result
      //Create a Hashmap with the unique strtngs as key and the list of anagrams as value
      //do a for loop over each string in strs
      //for each word, make an array of characters
      //Sort the array of characters
      //Change the array back to a string and see if it is a key in teh map
      //if yes, you have found an anagram, add the orginla word to a list value
      //else, a new word was found, put teh sorted version as key and add a list 
      //to that list, add the original word


      //add teh values to teh list of lists created above with .values() and return the list

      List<List<String>> anagrams = new ArrayList<>();
      HashMap<String, List<String>> uniqueStrs = new HashMap<>();

      for(String str : strs){
          char[] arr = str.toCharArray();
          Arrays.sort(arr); //Tim Sort //nlog(n)

          String sorted = String.valueOf(arr);

          if(uniqueStrs.containsKey(sorted)){
              uniqueStrs.get(sorted).add(str);
          }else{
              uniqueStrs.put(sorted, new ArrayList<>());
              uniqueStrs.get(sorted).add(str);
          }
      }
      
      for(List<String> list : uniqueStrs.values()){
          anagrams.add(list);
      }
      

      return anagrams;

     
    }
}