import dataStructures.Stack;

import static java.lang.Math.random;

/**
 */
public class StackApp {
    public static void main(String[] args) {
        Stack stack = new Stack(20);
        for (int i = 0; i < 20; i++) {

            stack.push((long)(random()*i));
        }

        while (!stack.isEmpty()) {
            long value;
            value = stack.pop();
            System.out.println(value);
        }

    }
}
