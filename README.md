# Postfix-Calculator
ADS Assignment 

REQUIREMENTS:


The postfix expression calculator is using a stack which is an abstract data structure. To implement the stack use as underlying data structure a generic linked list. In the linked list it is only necessary to implement the operations required for this assignment.

The program must provide an API with just one operation:  
int evaluateExpression( ArrayList<Token> tokenList ) 
so no GUI is necessary. 
As can be seen evaluateExpression takes an ArrayList of Tokens as input. The Tokens are either numbers wrapped in an Operand class or operators wrapped in an Operator class. Both classes are implementations of the Token interface.
When all tokens in the list have been evaluated getResult in the calculator will return the result of the calculation which is now top of the stack. 
Finally evaluateExpression returns the result as an integer.

All public methods must be tested with unit tests. Remember to test that the right exceptions are thrown.
