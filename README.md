# Sum_App-Android-
In this app, we’ll create a simple android application for adding two numbers. 

XML FILE:-
(activity_main.xml)

<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <TextView
        android:id="@+id/textView_first_no"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="First Number"
        android:textSize="20sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.125"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.33" />

    <TextView
        android:id="@+id/textView_second_no"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Second Number"
        android:textSize="20sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.104"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView_first_no"
        app:layout_constraintVertical_bias="0.071" />

    <TextView
        android:id="@+id/textView_answer"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:hint="Answer"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.657" />

    <Button
        android:id="@+id/add_button"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="ADD"
        app:layout_constraintBottom_toTopOf="@+id/textView_answer"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.9" />

    <EditText
        android:id="@+id/editText_first_no"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:ems="10"
        android:inputType="number"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.382"
        app:layout_constraintStart_toEndOf="@+id/textView_first_no"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.323" />

    <EditText
        android:id="@+id/editText_second_no"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:ems="10"
        android:inputType="number"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.344"
        app:layout_constraintStart_toEndOf="@+id/textView_second_no"
        app:layout_constraintTop_toBottomOf="@+id/editText_first_no"
        app:layout_constraintVertical_bias="0.033" />
</androidx.constraintlayout.widget.ConstraintLayout>

JAVA FILE:-
(MainActivity.java)
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

