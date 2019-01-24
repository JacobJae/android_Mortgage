package com.example.mortgage;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class EntryForm extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mortgage_layout);
    }

    public void buttonClicked(View v) {
        String p = ((EditText) findViewById(R.id.principle)).getText().toString();
        String a = ((EditText) findViewById(R.id.amortization)).getText().toString();
        String i = ((EditText) findViewById(R.id.interest)).getText().toString();
        MortgageModel m = new MortgageModel(p, a, i);
        ((TextView) findViewById(R.id.answer)).setText(m.computePayment());
    }
}
