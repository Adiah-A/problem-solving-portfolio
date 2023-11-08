class OrderedStream {

    String[] stream;
    int ptr;

    public OrderedStream(int n) {
        ptr = 0;
        stream = new String[n];
    }
    
    public List<String> insert(int idKey, String value) {
        stream[idKey - 1] = value;
        List<String> res = new ArrayList<>();

        while(ptr < stream.length && stream[ptr] != null){
            res.add(stream[ptr]);
            ptr++;
        }

        return res;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */