public class LRUCache {
    class ListNode{
        ListNode pre;
        ListNode next;
        int key;
        int value;
        ListNode(int key,int value){
            this.key = key;
            this.value = value;
        }
        ListNode(){
            
        }
    }
    private Map<Integer,ListNode>map = new HashMap<Integer,ListNode>();
    private ListNode h = new ListNode();
    private ListNode t = h;
    private int capacity;
    private int size = 0;
    public LRUCache(int capacity) {
        this.capacity = capacity;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            moveToHead(key);
            return map.get(key).value;
        }
        else return -1;
    }
    
    public void set(int key, int value) {
         if(map.containsKey(key)){
             map.get(key).value = value;
             moveToHead(key);
             return;
         };
         if(size == capacity){
             int k = t.key;
             map.remove(k);
             //.pre = null;
             t = t.pre;
             size--;
             t.next = null;
         }
             ListNode i = new ListNode(key,value);
             t.next = i;
             i.pre = t;
             t = t.next;
             map.put(key,i);
             moveToHead(key);
             size ++;
    }
    
    private void moveToHead(int key){
          ListNode l = map.get(key);
          if(l.pre == h) return;
          if(l == t){
              t=t.pre;t.next=null;l.pre = null;
          }else{
            ListNode p = l.pre;
            p.next = l.next;
            if(l.next != null){
                l.next.pre = p;
            }
          } 
           
            l.next = h.next;
            if(h.next != null){
                h.next.pre = l;
                l.pre = h;
            }
            h.next = l;
    }
}
