class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n = words.length;
        int Shortest_Distance = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (words[i].equals(target)) {
                int forward = (i - startIndex + n) % n;
                int backward = (startIndex - i + n) % n;

                Shortest_Distance = Math.min(Shortest_Distance, Math.min(forward, backward));
            }
        }

        return Shortest_Distance == Integer.MAX_VALUE ? -1 : Shortest_Distance;
    }
}