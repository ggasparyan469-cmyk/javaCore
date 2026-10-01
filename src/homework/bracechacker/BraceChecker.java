package homework.bracechacker;

public class BraceChecker {
    private String text;

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        Stack stack = new Stack(1);


        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            char last;
            switch(c) {
                case '{':
                case ')':
                case ']':
                    stack.push(c);
                    break;
                case '(':
                    last=(char)stack.pop();
                if(last != '('){
                    System.err.println("Error at"+i+":closed" +c
                    +"but opened" + last );
                }
                break;
                case '}':
                    last=(char)stack.pop();
                    if(last != '}'){
                        System.err.println("Error at"+i+":closed" +c
                                +"but opened" + last );
                    }
                    break;
                case '[':
                    last=(char)stack.pop();
                    if(last != ']'){
                        System.err.println("Error at"+i+":closed" +c
                                +"but opened" + last );
                    }
            }

        }
        while(stack.pop() != 0){
            char last =(char) stack.pop();
            System.err.println("Error at"+":opened" +last
                    +"but not closed"   );
        }
        }
    }

