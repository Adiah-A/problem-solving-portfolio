class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        res.add(new ArrayList<>());
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int[] players : matches){
            int winner = players[0];
            map.put(winner, map.getOrDefault(winner, 0) + 0);
        }
        
        for(int[] players : matches){
            int loser = players[1];
            map.put(loser, map.getOrDefault(loser, 0) + 1);
        }
        
        for(int key: map.keySet()){
            if(map.get(key) == 0){ 
                res.get(0).add(key);
            }else if(map.get(key) == 1){
                res.get(1).add(key);
            }
        }

        Collections.sort(res.get(0));
        Collections.sort(res.get(1));            
        return res;
    }
}