`````````````
 ## // convert String inputs to int values for use in a calculation
 int number1 = Integer.parseInt(firstNumber);
 ````````````
 ```
 int number2 = Integer.parseInt(secondNumber);

 int sum = number1 + number2;

 // end class Addition

String secondNumber =
JOptionPane.showInputDialog("Enter second integer");
// display result in a JOptionPane message dialog
JOptionPane.showMessageDialog(null, "The sum is " + sum,
"Sum of Two Integers", JOptionPane.PLAIN_MESSAGE);
```

| Message dialog type | Description                                       |
| :------------------ | ------------------------------------------------- |
| ERROR_MESSAGE       | Indicates an error.                               |
| INFORMATION_MESSAGE | Indicates an informational message.               |
| WARNING_MESSAGE     | Warns of a potential problem.                     |
| QUESTION_MESSAGE    | Poses a question. This dialog normally requires a |
|                     | response, such as clicking a Yes or a No button.  |
| PLAIN_MESSAGE       | A dialog that contains a message, but no icon.    |
`````````````
