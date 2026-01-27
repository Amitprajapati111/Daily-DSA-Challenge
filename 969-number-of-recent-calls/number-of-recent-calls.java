//Queue method
class RecentCounter {
    Queue<Integer> q;

    public RecentCounter(){
        q = new LinkedList<>();

    }
    public int ping(int t) {
        q.add(t);

        while(q.peek()< t-3000){
            q.remove();
        }
        return q.size();
    }


}






// class RecentCounter {
//     List<Integer> list;

//     public RecentCounter() {
//         list = new ArrayList<>();
        
//     }
    
//     public int ping(int t) {
//         list.add(t);

//         //Sliding Window
//         while(list.get(0) < t-3000){
//             list.remove(0);
//         }
//         return list.size();
  
//     }
// }

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */