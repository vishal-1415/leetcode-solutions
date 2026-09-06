class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        Deque<Integer> stack = new ArrayDeque<>();

        for (int A : asteroids) {

            boolean isAlive = true;

            while (!stack.isEmpty() && stack.peek() > 0 && A < 0 && isAlive) {
                if (stack.peek() < -A) {
                    stack.pop();
                } else if (stack.peek() == -A) {
                    stack.pop();
                    isAlive = false;
                } else {
                    isAlive = false;
                }
            }

            if (isAlive) {
                stack.push(A);
            }

        }

        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        
    return result;
    }
}