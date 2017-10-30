package datastructures.week1;

public class Brackets {

    public String check(String text) {
        return "";
    }

    enum Type {
        CIRCLE {
            @Override
            boolean isOpenChar(char c) {
                return c == '(';
            }

            @Override
            boolean isClosedChar(char c) {
                return c == ')';
            }
        },
        SQUARE {
            @Override
            boolean isOpenChar(char c) {
                return c == '[';
            }

            @Override
            boolean isClosedChar(char c) {
                return c == ']';
            }
        },
        CURLY {
            @Override
            boolean isOpenChar(char c) {
                return c == '{';
            }

            @Override
            boolean isClosedChar(char c) {
                return c == '}';
            }
        };

        abstract boolean isOpenChar(char c);
        abstract boolean isClosedChar(char c);
        Type selectType(char c) {
            switch (c){
                case '(':
                    return CURLY;
                    break;
                case ')':
                    return CURLY;
                    break;

            }
        }
    }
}
