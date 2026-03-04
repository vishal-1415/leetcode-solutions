class Solution {
    List<Integer> order = new ArrayList<>();

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] pre : prerequisites) {
            graph.get(pre[1]).add(pre[0]);
        }
        int[] state = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if (dfs(graph, state, i)) {
                return new int[0];
            }
        }
        Collections.reverse(order);            //TC:O(V + E) SC:O(V + E)
        int[] result = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            result[i] = order.get(i);
        }
        return result;
    }

    public boolean dfs(List<List<Integer>> graph, int[] state, int course) {
        if (state[course] == 1)
            return true;
        if (state[course] == 2)
            return false;
        state[course] = 1;
        for (int next : graph.get(course)) {
            if (dfs(graph, state, next)) {
                return true;
            }
        }
        state[course] = 2;
        order.add(course);
        return false;
    }
}