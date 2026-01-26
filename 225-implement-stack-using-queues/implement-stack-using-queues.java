//----Two Queue---- //
// class MyStack {
//     Queue<Integer> q1 = new LinkedList<>();
//     Queue<Integer> q2 = new LinkedList<>();

//     public MyStack() {   
//     }
    
//     public void push(int x) {
//         q1.add(x);    
//     }
    
//     public int pop() {
//         while(q1.size()>1){
//             q2.add(q1.remove());
//         }
//         int top = q1.remove();

//         Queue<Integer> temp = q1;
//         q1=q2;
//         q2=temp;
//         return top;   
//     }
    
//     public int top() {
//         while(q1.size()>1){
//             q2.add(q1.remove());
//         }
//         int top = q1.peek();
//         q2.add(q1.remove());
//         Queue<Integer> temp = q1;
//         q1=q2;
//         q2=temp;
//         return top;   
//     }
    
//     public boolean empty() {
//         return q1.isEmpty();   
//     }
// }


// -----Follow-up: ONE Queue------ //
public class MyStack{
    Queue<Integer> q = new LinkedList<>();
    public MyStack(){
    }

    public void push(int x){
        q.add(x);
        int size = q.size();

        for(int i=1; i<size; i++){
            q.add(q.remove());
        }
    }
    public int pop(){
        return q.remove();
    }
    public int top(){
        return q.peek();
    }
    public boolean empty(){
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */