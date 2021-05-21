package sg.edu.rp.c346.id20043679.additionalchallenge_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText numberOne;
    EditText numberTwo;
    Button btnCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberOne = findViewById(R.id.editTextNum1);
        numberTwo = findViewById(R.id.editTextNum2);
        btnCalculate = findViewById(R.id.calculate);


        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Results.class);
                intent.putExtra("Number1", Double.parseDouble(numberOne.getText().toString()));
                intent.putExtra("Number2", Double.parseDouble(numberTwo.getText().toString()));
                startActivity(intent);
            }
        });

    }
}