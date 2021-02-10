package mcm.edu.ph.taewagecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCalculate;

        btnCalculate = findViewById(R.id.btnCalculate);
        btnCalculate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Double Operand1 = 0.0;
        Double regularRate = 100.0;

        EditText txtOperand1;
        TextView txtAnswer;

        EditText Op1 = findViewById(R.id.txtOperand1);
        TextView ans = findViewById(R.id.txtAnswer);

        Operand1 = Double.parseDouble(Op1.getText().toString());


        switch (v.getId()) {
            case R.id.btnCalculate:
                ans.setText(Double.toString(doMultiply(Operand1,regularRate)));
                break;
        }

    }

    public static double doMultiply(double operand1, double regularRate){
        double answer = 0.0;
        answer = operand1 * regularRate;
        return answer;

    }
}