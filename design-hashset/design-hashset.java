class MyHashSet {
   private final int ARRAY_SIZE = 1000; 
    private Node[] bucket; 
    
    public MyHashSet() {
        bucket = new Node[ARRAY_SIZE];
    }
    
    public void add(int key) {
        int index = getIndex(key);
        if(bucket[index]==null){
            bucket[index] = new Node(-1);
        }
        Node prev = findElement(key,index);
        if(prev.next == null){
            prev.next = new Node(key);
        }
    }
    
    public void remove(int key) {
        int index = getIndex(key);
        if(bucket[index] == null) return; 
        
        Node prev = findElement(key, index);
        if(prev.next != null){
            prev.next = prev.next.next; 
        }
    }
    
    public boolean contains(int key) {
        int index = getIndex(key);
        if(bucket[index]==null) return false; 
        Node prev = findElement(key, index);
        return prev.next != null;
    }
    
    private int getIndex(int key){
        return Integer.hashCode(key) % ARRAY_SIZE; 
    }
    
    private Node findElement(int key, int index){
        Node prev = bucket[index];
        while(prev.next != null && prev.next.val != key){
            prev = prev.next; 
        }
        return prev; 
    }
    
    private static class Node{
        int val; 
        Node next; 
        
        Node(int val){
            this.val = val ;
        }
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */