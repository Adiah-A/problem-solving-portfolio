class Solution {
    public String reorganizeString(String s) {
        
        //you coudk have two pointers and go through teh array
        //if teh current character is next to itself, find teh next non similar character and put there?

        //take teh most repeating charcter and place it in your result string
        //

        Map<Character, Integer> count = new HashMap<>();

        for(char ch : s.toCharArray()){
            count.put(ch, count.getOrDefault(ch, 0) + 1);
        }

        PriorityQueue<Character> maxHeap = new PriorityQueue( (a,b) -> count.get(b) - count.get(a));
        maxHeap.addAll(count.keySet());

        StringBuilder result = new StringBuilder();

        while(maxHeap.size() > 1){
            char current = maxHeap.remove();
            char next = maxHeap.remove();

            result.append(current);
            result.append(next);

            count.put( current, count.get(current) - 1);
            count.put( next, count.get(next) - 1);

            if(count.get(current) > 0){
                maxHeap.add(current);
            }
            if(count.get(next) > 0){
                maxHeap.add(next);
            }
        }

        if(maxHeap.size() > 0){
            char curr = maxHeap.remove();
            if(count.get(curr) > 1){
                return "";
            }

            result.append(curr);
        }

        return result.toString();
    }
}