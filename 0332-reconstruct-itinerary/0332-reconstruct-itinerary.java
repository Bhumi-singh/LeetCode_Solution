class Solution {
    HashMap<String, PriorityQueue<String>> graph=new HashMap<>();
    List<String> ans=new ArrayList<>();
    public List<String> findItinerary(List<List<String>> tickets) {
        for(List<String> ticket:tickets){
            String from=ticket.get(0);
            String to=ticket.get(1);
            PriorityQueue<String> pq=graph.getOrDefault(from,new PriorityQueue<>());
            pq.add(to);
            graph.put(from,pq);
        }
            dfs("JFK");
            Collections.reverse(ans);
            return ans;
    }
    private void dfs(String src){
        while (graph.containsKey(src) && !graph.get(src).isEmpty()) {
            String next = graph.get(src).poll(); 
            dfs(next);
        }

        ans.add(src);
    }
}