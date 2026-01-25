class Solution {
    public int firstUniqChar(String s) {
        Queue<Integer> q = new LinkedList<>();
        int freq[] = new int[26];

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            freq[ch-'a']++;
            q.add(i);
        }
        while(!q.isEmpty() && freq[s.charAt(q.peek())-'a']>1){
            q.remove();
        }
        if(q.isEmpty()){
            return -1;
        }
        else{
            return q.peek();
        }
        
    }
}