//THIS IS THE CONTROLLER
//handles the button and comms with the model
//outputs the computed payment in the view

package ca.yorku.eecs.mcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class EntryForm extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mortgage_layout);
    }

    public void buttonClicked(View v)
    {
        //add code

        EditText principleView = (EditText) findViewById(R.id.pBox);
        String principle = principleView.getText().toString();

        EditText amortizationView = (EditText) findViewById(R.id.aBox);
        String amortization = amortizationView.getText().toString();

        EditText interestView = (EditText) findViewById(R.id.iBox);
        String interest = interestView.getText().toString();

        MortgageModel myModel = new MortgageModel(principle, amortization, interest);
        String myMCalc = myModel.computePayment();

        ((TextView) findViewById(R.id.result)).setText(myMCalc);
    }
}
