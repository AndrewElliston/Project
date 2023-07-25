/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculator;
import java.lang.Math;
/**
 *
 * @author AjEll
 */
public class Button extends javax.swing.JFrame {

    double firstNumber;
    double secondNumber;
    double result;
    String operator; 
   
    public Button() {
        initComponents();
    }

    
   
    private void initComponents() {

        Backspace = new javax.swing.JButton();
        num5 = new javax.swing.JButton();
        num7 = new javax.swing.JButton();
        num8 = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        toPowerOf = new javax.swing.JButton();
        changeSign = new javax.swing.JButton();
        num9 = new javax.swing.JButton();
        divide = new javax.swing.JButton();
        num6 = new javax.swing.JButton();
        addition = new javax.swing.JButton();
        num4 = new javax.swing.JButton();
        multiply = new javax.swing.JButton();
        num1 = new javax.swing.JButton();
        num2 = new javax.swing.JButton();
        num3 = new javax.swing.JButton();
        subtraction = new javax.swing.JButton();
        num0 = new javax.swing.JButton();
        toEqual = new javax.swing.JButton();
        Results = new javax.swing.JTextField();
        decimal = new javax.swing.JButton();
        FullClear1 = new javax.swing.JButton();
        squareRoot = new javax.swing.JButton();
        toPercent = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.green);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Backspace.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Backspace.setText("← ");
        Backspace.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Backspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackspaceActionPerformed(evt);
            }
        });
        getContentPane().add(Backspace, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 80, 70));

        num5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        num5.setText("5");
        num5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        num5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num5ActionPerformed(evt);
            }
        });
        getContentPane().add(num5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 80, 70));

        num7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        num7.setText("7");
        num7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        num7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num7ActionPerformed(evt);
            }
        });
        getContentPane().add(num7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 80, 70));

        num8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        num8.setText("8");
        num8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        num8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num8ActionPerformed(evt);
            }
        });
        getContentPane().add(num8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 80, 70));

        Clear.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Clear.setText("C");
        Clear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        getContentPane().add(Clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 80, 70));

        toPowerOf.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        toPowerOf.setText("^");
        toPowerOf.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        toPowerOf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toPowerOfActionPerformed(evt);
            }
        });
        getContentPane().add(toPowerOf, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 80, 70));

        changeSign.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        changeSign.setText("+/-");
        changeSign.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        changeSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeSignActionPerformed(evt);
            }
        });
        getContentPane().add(changeSign, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 540, 80, 70));

        num9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        num9.setText("9");
        num9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        num9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num9ActionPerformed(evt);
            }
        });
        getContentPane().add(num9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 80, 70));

        divide.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        divide.setText("/");
        divide.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideActionPerformed(evt);
            }
        });
        getContentPane().add(divide, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 80, 70));

        num6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        num6.setText("6");
        num6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        num6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num6ActionPerformed(evt);
            }
        });
        getContentPane().add(num6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 80, 70));

        addition.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        addition.setText("+");
        addition.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                additionActionPerformed(evt);
            }
        });
        getContentPane().add(addition, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, 80, 70));

        num4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        num4.setText("4");
        num4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        num4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num4ActionPerformed(evt);
            }
        });
        getContentPane().add(num4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 80, 70));

        multiply.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        multiply.setText("x");
        multiply.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyActionPerformed(evt);
            }
        });
        getContentPane().add(multiply, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 80, 70));

        num1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        num1.setText("1");
        num1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num1ActionPerformed(evt);
            }
        });
        getContentPane().add(num1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 80, 70));

        num2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        num2.setText("2");
        num2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        num2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num2ActionPerformed(evt);
            }
        });
        getContentPane().add(num2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 80, 70));

        num3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        num3.setText("3");
        num3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        num3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num3ActionPerformed(evt);
            }
        });
        getContentPane().add(num3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 80, 70));

        subtraction.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        subtraction.setText("-");
        subtraction.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        subtraction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtractionActionPerformed(evt);
            }
        });
        getContentPane().add(subtraction, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 80, 70));

        num0.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        num0.setText("0");
        num0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        num0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num0ActionPerformed(evt);
            }
        });
        getContentPane().add(num0, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 80, 70));

        toEqual.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        toEqual.setText("=");
        toEqual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        toEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toEqualActionPerformed(evt);
            }
        });
        getContentPane().add(toEqual, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, 80, 70));

        Results.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultsActionPerformed(evt);
            }
        });
        getContentPane().add(Results, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, 360, 70));

        decimal.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        decimal.setText(".");
        decimal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        decimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decimalActionPerformed(evt);
            }
        });
        getContentPane().add(decimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 80, 70));

        FullClear1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        FullClear1.setText("CE");
        FullClear1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        FullClear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FullClear1ActionPerformed(evt);
            }
        });
        getContentPane().add(FullClear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 80, 70));

        squareRoot.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        squareRoot.setText("√");
        squareRoot.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        squareRoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squareRootActionPerformed(evt);
            }
        });
        getContentPane().add(squareRoot, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 540, 80, 70));

        toPercent.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        toPercent.setText("%");
        toPercent.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        toPercent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toPercentActionPerformed(evt);
            }
        });
        getContentPane().add(toPercent, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 540, 80, 70));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Java Calculator");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 70, 90));

        pack();
    }
    private void EnterNumbers(String numIn){ //this how we get numbers to show on panel
        String Nums = Results.getText() + numIn; // adds numbers on to the end 
        Results.setText(Nums); //Setting the results panel to the numbers that we click
    }
    private void num5ActionPerformed(java.awt.event.ActionEvent evt) {
        EnterNumbers("5");    
    }

    private void changeSignActionPerformed(java.awt.event.ActionEvent evt) {
        double number = Double.parseDouble(String.valueOf(Results.getText())); //as the numbers are input as strings the Double.parseDouble reads thourgh and converts the number into a double and saves it.
        number = number * (-1);
        Results.setText(String.valueOf(number));
    }

    private void num9ActionPerformed(java.awt.event.ActionEvent evt) {
        EnterNumbers("9");         
    }

    private void divideActionPerformed(java.awt.event.ActionEvent evt) {
           firstNumber = Double.parseDouble(Results.getText());
           Results.setText("");
           operator = "/";
    }/

    private void num6ActionPerformed(java.awt.event.ActionEvent evt) {
        EnterNumbers("6");     // inputs the number 6
    }

    private void additionActionPerformed(java.awt.event.ActionEvent evt) {
       firstNumber = Double.parseDouble(Results.getText());
          Results.setText("");
           operator = "+";
    }

    private void num4ActionPerformed(java.awt.event.ActionEvent evt) {
        EnterNumbers("4");         // inputs the number 4
    }

    private void multiplyActionPerformed(java.awt.event.ActionEvent evt) {
        firstNumber = Double.parseDouble(Results.getText());
           Results.setText("");
           operator = "x";
    }

    private void num1ActionPerformed(java.awt.event.ActionEvent evt) {
    EnterNumbers("1");     /// inputs the number 1
    }

    private void num2ActionPerformed(java.awt.event.ActionEvent evt) {
        EnterNumbers("2");     // inputs the number 2
    }

    private void num3ActionPerformed(java.awt.event.ActionEvent evt) {
        EnterNumbers("3");     /// inputs the number 3
    }

    private void subtractionActionPerformed(java.awt.event.ActionEvent evt) {
        firstNumber = Double.parseDouble(Results.getText());
           Results.setText("");
           operator = "-";

    }

    private void num0ActionPerformed(java.awt.event.ActionEvent evt) {
        EnterNumbers("0");         // inputs the number 0
    }

    private void toEqualActionPerformed(java.awt.event.ActionEvent evt) {
        secondNumber = Double.parseDouble(Results.getText()); // Computation then casting the numbers back to Strings for display
        if(operator == "+"){
            result = firstNumber + secondNumber;
            Results.setText(String.valueOf(result));
        }
        if(operator == "x"){
            result = firstNumber * secondNumber;
            Results.setText(String.valueOf(result));
        }
        if(operator == "/"){
            result = firstNumber / secondNumber;
            Results.setText(String.valueOf(result));
        }
        if(operator == "-"){
            result = firstNumber - secondNumber;
            Results.setText(String.valueOf(result));
        }
        if(operator == "^"){
            result = Math.pow(firstNumber,  secondNumber);
            Results.setText(String.valueOf(result));
        }
    }

    private void toPowerOfActionPerformed(java.awt.event.ActionEvent evt) {
       firstNumber = Double.parseDouble(Results.getText());
       Results.setText(""); //Clears the Screen 
       operator = "^";
    }

    private void BackspaceActionPerformed(java.awt.event.ActionEvent evt) {
         String backSpace = null;
         if(Results.getText().length() > 0){
             StringBuilder sb = new StringBuilder(Results.getText()); //Created an object to hold the text from Results 
             sb.deleteCharAt(Results.getText().length()-1); // last digit is removed
             backSpace = sb.toString(); // saves all digits excluding the one recently deleted
             Results.setText(backSpace); // set results panel to digits saced in backspace
         }
    }

    private void num7ActionPerformed(java.awt.event.ActionEvent evt) {
        EnterNumbers("7");       // inputs the number 7
    }

    private void ResultsActionPerformed(java.awt.event.ActionEvent evt) {
        // Text Panel that displays numbers and calculations
        //for other buttons to acess the panel
        //need a method to call to i.e ^
    }

    private void num8ActionPerformed(java.awt.event.ActionEvent evt) {
        EnterNumbers("8");       // inputs the number 8
    }

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {
        Results.setText(""); //Clear Button
        //Doesnt remove the numbers that were previously typed in
    }

    private void decimalActionPerformed(java.awt.event.ActionEvent evt) {
        if(!Results.getText().contains(".")){ //checks to see if current line has a point 
            Results.setText(Results.getText() + decimal.getText()); // appends and sets text to include a point
        }
    }

    private void FullClear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FullClear1ActionPerformed
        Results.setText(""); //sets panel to empty
        String num1;
        String num2;
        
        num1 = String.valueOf(firstNumber); 
        num2 = String.valueOf(secondNumber);
        // ^ converts the doubles into Strings then makes them empty
        num1 = "";
        num2 = "";
        
    }

    private void squareRootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squareRootActionPerformed
        firstNumber = Double.parseDouble(Results.getText());
        Results.setText("");
        operator = "sq"; //couldn't think of another symbol
          if(operator == "sq"){ // calculations are done here instead to avoid the need to input a second number 
            result = Math.sqrt(firstNumber);
            Results.setText(String.valueOf(result));
        }
    }

    private void toPercentActionPerformed(java.awt.event.ActionEvent evt) {
        firstNumber = Double.parseDouble(Results.getText());
        Results.setText("");
        operator = "%";
        if(operator == "%"){
            result = firstNumber / 100.0;
            Results.setText(String.valueOf(result));
        }
    }

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Button().setVisible(true);
            }
        });
    }

   
    private javax.swing.JButton Backspace;
    private javax.swing.JButton Clear;
    private javax.swing.JButton FullClear1;
    private javax.swing.JTextField Results;
    private javax.swing.JButton addition;
    private javax.swing.JButton changeSign;
    private javax.swing.JButton decimal;
    private javax.swing.JButton divide;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton multiply;
    private javax.swing.JButton num0;
    private javax.swing.JButton num1;
    private javax.swing.JButton num2;
    private javax.swing.JButton num3;
    private javax.swing.JButton num4;
    private javax.swing.JButton num5;
    private javax.swing.JButton num6;
    private javax.swing.JButton num7;
    private javax.swing.JButton num8;
    private javax.swing.JButton num9;
    private javax.swing.JButton squareRoot;
    private javax.swing.JButton subtraction;
    private javax.swing.JButton toEqual;
    private javax.swing.JButton toPercent;
    private javax.swing.JButton toPowerOf;
    
}
