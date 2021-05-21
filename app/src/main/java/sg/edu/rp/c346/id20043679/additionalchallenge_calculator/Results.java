package sg.edu.rp.c346.id20043679.additionalchallenge_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Results extends AppCompatActivity {

    TextView results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        results = findViewById(R.id.textView);

        Intent intentReceived = getIntent();

        double numberOne = intentReceived.getDoubleExtra("Number1", 0);
        double numberTwo = intentReceived.getDoubleExtra("Number2", 0);

        double sum = numberOne + numberTwo;
        double multiply = numberOne * numberTwo;
        double division = numberOne/numberTwo;
        double subtraction = numberOne - numberTwo;

        String println = String.format("Sum: %.3f\nMultiply: %.3f\nDivision: %.3f\nSubtraction: %.3f", sum, multiply, division, subtraction);

        results.setText(println);




    }
}