class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        String result;
        int n= senate.length();
        for(int i=0;i<n;i++){
            if(senate.charAt(i)=='R'){
                q1.add(i);
            }
            else{
                q2.add(i);
            }
        }

        while(!q1.isEmpty()&&!q2.isEmpty()){
            if(q1.peek()<q2.peek()){
                q1.add(n++);
            }
            else{
                q2.add(n++);
            }
            q1.poll();
            q2.poll();
        }
        if(q1.isEmpty()){
            result="Dire";
        }
        else{
            result="Radiant";
        }
        return result;
    }
}