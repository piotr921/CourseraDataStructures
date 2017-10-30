package datastructures.week1;

import java.util.Stack;

class Brackets {

    class OpenBrace {

        private Character symbol;
        Integer place;

        public OpenBrace() {
            this.symbol = ' ';
            this.place = -1;
        }

        OpenBrace(Character symbol, int place) {
            this.symbol = symbol;
            this.place = place;
        }

        Character getSymbol() {
            return symbol;
        }

        Integer getPlace() {
            return place;
        }
    }

    String isBalanced(String text) {
        Stack<OpenBrace> openBrackets = new Stack<>();
        int index = 1;
        for (Character c : text.toCharArray()) {
            if (c.equals('(') || c.equals('{') || c.equals('[')) {
                openBrackets.push(new OpenBrace(c, index));
            } else {
                if (openBrackets.empty()) {
                    return selectMessage(false, openBrackets);
                }
                Character top = openBrackets.pop().getSymbol();
                if ((top.equals('(') && !c.equals(')')) ||
                    (top.equals('{') && !c.equals('}')) ||
                    (top.equals('[') && !c.equals(']'))) {
                    return selectMessage(false, openBrackets);
                }
            }
            index++;
        }
        return selectMessage(openBrackets.isEmpty(), openBrackets);
    }

    private String selectMessage(boolean isBalanced, Stack<OpenBrace> stack) {
        return isBalanced ? "Success" : stack.peek().getPlace().toString();
    }

}
