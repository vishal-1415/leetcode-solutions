class Solution {
    public int calPoints(String[] operations) {
        Stack<String> stack = new Stack<>();
        for(String op : operations){
            if(op.equals("C")){
                stack.pop();
            }else if(op.equals("D")){
                int prev = Integer.parseInt(stack.peek());
                prev = 2 * prev;
                stack.push(String.valueOf(prev)); 
            }else if(op.equals("+")){
                int num1 = Integer.parseInt(stack.pop());
                int num2 = Integer.parseInt(stack.pop());
                int addition = num1 + num2;
                stack.push(String.valueOf(num2));
                stack.push(String.valueOf(num1));
                stack.push(String.valueOf(addition));
            }
            else{
                stack.push(op);
            }
        }
        int sum = 0;
        while(!stack.isEmpty()){
            int number = Integer.parseInt(stack.pop());
            sum += number;
        }

    return sum;
    }
} 