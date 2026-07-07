class Solution {
    public void dfs(int start,List<List<Integer>>rooms,boolean[] vis){
             vis[start] = true;
    for (int key : rooms.get(start)) {   
        if (!vis[key]) {
            dfs(key, rooms, vis);
        }

             }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
         boolean[] vis = new boolean[rooms.size()];
        

        dfs(0, rooms, vis);

       for(int i=0;i<rooms.size();i++){
         if(!vis[i]) return false;
       }
        
        return true;
    }
}