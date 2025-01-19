JAVA FILE:-

package com.example.sumapp;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    EditText firstnum,secondnum;
    TextView FirstNumber,SecondNumber,Ans;
    Button bt;
    double a,b,c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstnum=findViewById(R.id.editText_first_no);
        secondnum=findViewById(R.id.editText_second_no);
        FirstNumber=findViewById(R.id.textView_first_no);
        SecondNumber=findViewById(R.id.textView_second_no);
        Ans=findViewById(R.id.textView_answer);
        bt=findViewById(R.id.add_button);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=Double.parseDouble(firstnum.getText().toString());
                b=Double.parseDouble(secondnum.getText().toString());
                c=a+b;
                Ans.setText("Sum ="+c);
            }
        });
    }
}
