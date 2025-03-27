import java.util.stack;
public class PostFixExpression {
        public static int evaluatepostfix (String expression) {
		Stack<Integer> stack=new Stack<>();
		for (int i=0; i<expression.length(); i++) {
			char ch=expression.CharAt(i);
			if(Character.isDigit (ch)) {
				stack.push (ch-'0');
        		}
			else{
				int operand2=stack.pop();
				int operand1=stack.pop();
				switch (ch) {
					case'+':
						stack.push(operand1+operand2);
						break;
					case'-':
						stack.push(operand1-operand2);
						break;
					case'*':
						stack.push(operand1*operand2);
						break;
				`	case'\':
						stack.push(operand1/operand2);
						break;
				}
			}
        }
	return stack.pop();	
	}
	public static void main(String[] args) {
	String PostFixExprssion="231*+9-";
	int result=evaluatepostfix(PostFixExpression);
	System.out.println("the expression\" "+ PostFixExpression+" \ "evaluates to:"+result);
	}
} 