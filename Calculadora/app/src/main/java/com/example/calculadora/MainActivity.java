package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.lang.Math;


public class MainActivity extends AppCompatActivity {

    public EditText input;
    public double operand_1, operand_2, result;
    public int operacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input=(EditText)findViewById(R.id.txt_numbers);

        //Icono en el Action Bar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_calculator);



    }

    //Botón: .
    public void button (View vista){
        String number = input.getText().toString();
        number = number+".";
        input.setText(number);
    }

    //Botón: 0
    public void button0 (View vista){
        String number = input.getText().toString();
        number = number+"0";
        input.setText(number);
    }

    //Botón: 1
    public void button1 (View vista){
        String number = input.getText().toString();
        number = number+"1";
        input.setText(number);
    }

    //Botón: 2
    public void button2 (View vista){
        String number = input.getText().toString();
        number = number+"2";
        input.setText(number);
    }

    //Botón: 3
    public void button3 (View vista){
        String number = input.getText().toString();
        number = number+"3";
        input.setText(number);
    }

    //Botón: 4
    public void button4 (View vista){
        String number = input.getText().toString();
        number = number+"4";
        input.setText(number);
    }

    //Botón: 5
    public void button5 (View vista){
        String number = input.getText().toString();
        number = number+"5";
        input.setText(number);
    }

    //Botón: 6
    public void button6 (View vista){
        String number = input.getText().toString();
        number = number+"6";
        input.setText(number);
    }

    //Botón: 7
    public void button7 (View vista){
        String number = input.getText().toString();
        number = number+"7";
        input.setText(number);
    }

    //Botón: 8
    public void button8 (View vista){
        String number = input.getText().toString();
        number = number+"8";
        input.setText(number);
    }

    //Botón: 9
    public void button9 (View vista){
        String number = input.getText().toString();
        number = number+"9";
        input.setText(number);
    }

    //SUMA
    public void suma(View vista){
        try {
            String aux_1 = input.getText().toString();
            operand_1 = Double.parseDouble(aux_1);

        }catch (NumberFormatException ex){
            System.out.println("Ha ocurrido un problema: "+ex.getMessage());
        }
        input.setText("");
        operacion = 1; //operacion 1 corresponde a suma
    }

    //RESTA
    public void resta(View vista){
        try {
            String aux_1 = input.getText().toString();
            operand_1 = Double.parseDouble(aux_1);

        }catch (NumberFormatException ex){
            System.out.println("Ha ocurrido un problema: "+ex.getMessage());
        }
        input.setText("");
        operacion = 2; //operacion 2 corresponde a resta
    }

    //MULTIPLICACION
    public void multiplicacion(View vista){
        try {
            String aux_1 = input.getText().toString();
            operand_1 = Double.parseDouble(aux_1);

        }catch (NumberFormatException ex){
            System.out.println("Ha ocurrido un problema: "+ex.getMessage());
        }
        input.setText("");
        operacion = 3; //operacion 3 corresponde a multiplicacion
    }

    //DIVISION
    public void division(View vista){
        try {
            String aux_1 = input.getText().toString();
            operand_1 = Double.parseDouble(aux_1);

        }catch (NumberFormatException ex){
            System.out.println("Ha ocurrido un problema: "+ex.getMessage());
        }
        input.setText("");
        operacion = 4; //operacion 4 corresponde a division
    }

    //SENO
    public void sin(View vista){
        try {
            String aux_1 = input.getText().toString();
            operand_1 = Double.parseDouble(aux_1);

        }catch (NumberFormatException ex){
            System.out.println("Ha ocurrido un problema: "+ex.getMessage());
        }

        input.setText("Sin("+operand_1+")");
        operacion = 5; //operacion 5 corresponde a seno

    }

    //COSENO
    public void cos(View vista){
        try {
            String aux_1 = input.getText().toString();
            operand_1 = Double.parseDouble(aux_1);

        }catch (NumberFormatException ex){
            System.out.println("Ha ocurrido un problema: "+ex.getMessage());
        }
        input.setText("Cos("+operand_1+")");
        operacion = 6; //operacion 6 corresponde a coseno
    }

    //TANGENTE
    public void tan(View vista){
        try {
            String aux_1 = input.getText().toString();
            operand_1 = Double.parseDouble(aux_1);

        }catch (NumberFormatException ex){
            System.out.println("Ha ocurrido un problema: "+ex.getMessage());
        }
        input.setText("Tan("+operand_1+")");
        operacion = 7; //operacion 7 corresponde a tangente
    }

    //RESULTADO
    public void resultado(View vista){
        try {
            String aux_2 = input.getText().toString();
            operand_2 = Double.parseDouble(aux_2);

        }catch (NumberFormatException ex){
            System.out.println("Ha ocurrido un problema: "+ex.getMessage());
        }
        input.setText("");

        switch (operacion){
            case 1:
                result = operand_1 + operand_2;
                input.setText(""+result);
                break;

            case 2:
                result = operand_1 - operand_2;
                input.setText(""+result);
                break;

            case 3:
                result = operand_1 * operand_2;
                input.setText(""+result);
                break;

            case 4:
                if(operand_2 == 0){
                    input.setText("Math Error!");
                }else{
                    result = operand_1/operand_2;
                    input.setText(""+result);
                }
                break;

            case 5:
                double senToRadian = Math.toRadians(operand_1);
                result = (Math.sin(senToRadian));
                input.setText(""+result);
                break;

            case 6:
                double cosToRadian = Math.toRadians(operand_1);
                result = (Math.cos(cosToRadian));
                input.setText(""+result);
                break;

            case 7:
                if(operand_1 == 90){
                    input.setText("Math Error!");
                }else{
                    double tanToRadian = Math.toRadians(operand_1);
                    result = (Math.tan(tanToRadian));
                    input.setText(""+result);
                }
                break;

            default:
                String cast = String.valueOf(operand_2);
                input.setText(cast);
                break;

        }


    }

    public void clear (View vista){
        input.setText("");
        operand_1 = 0.0;
        operand_2 = 0.0;
        result = 0.0;
    }

}