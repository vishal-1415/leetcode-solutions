class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }
        for(int[] pre : prerequisites){
            graph.get(pre[1]).add(pre[0]);
        }
        int[] state = new int[numCourses]; // state array to track visiting status of each course
        // Run DFS for every course
        for(int i = 0;i<numCourses;i++){     //TC : O(V + E)  SC : O(V + E)
            if(dfs(graph,state,i)){
                return false;// If cycle detected, cannot finish all courses
            }
        }
        return true;
    }
    public boolean dfs( List<List<Integer>> graph,int[] state,int course){
        if(state[course] == 1) return true;
        if(state[course] == 2) return false;
        state[course] = 1;
        for(int next:graph.get(course)){
            if(dfs(graph,state,next)){
                return true;
            }
        }
        state[course] = 2;
        return false;    
    }
}