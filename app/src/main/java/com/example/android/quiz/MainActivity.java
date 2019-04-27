package com.example.android.quiz;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Question1(View view){
        RadioButton rb1 = findViewById(R.id.question1_opt1);
        RadioButton rb2 = findViewById(R.id.question1_opt2);
        RadioButton rb3 = findViewById(R.id.question1_opt3);
        RadioButton rb4 = findViewById(R.id.question1_opt4);
        switch(view.getId() ) {
            case R.id.question1_opt3:   rb1.setChecked(false);
                                        rb2.setChecked(false);
                                        rb4.setChecked(false);
                                        break;
            case R.id.question1_opt2:   rb1.setChecked(false);
                                        rb3.setChecked(false);
                                        rb4.setChecked(false);
                                        break;
            case R.id.question1_opt1:   rb2.setChecked(false);
                                        rb3.setChecked(false);
                                        rb4.setChecked(false);
                                        break;
            case R.id.question1_opt4:   rb1.setChecked(false);
                                        rb3.setChecked(false);
                                        rb2.setChecked(false);
                                        break;
        }
    }

    public void Question2(View view){
        RadioButton rb1 = findViewById(R.id.question2_opt1);
        RadioButton rb2 = findViewById(R.id.question2_opt2);
        RadioButton rb3 = findViewById(R.id.question2_opt3);
        RadioButton rb4 = findViewById(R.id.question2_opt4);
        switch(view.getId() ) {
            case R.id.question2_opt3:   rb1.setChecked(false);
                rb2.setChecked(false);
                rb4.setChecked(false);
                break;
            case R.id.question2_opt2:   rb1.setChecked(false);
                rb3.setChecked(false);
                rb4.setChecked(false);
                break;
            case R.id.question2_opt1:   rb2.setChecked(false);
                rb3.setChecked(false);
                rb4.setChecked(false);
                break;
            case R.id.question2_opt4:   rb1.setChecked(false);
                rb3.setChecked(false);
                rb2.setChecked(false);
                break;
        }
    }

    public void Question3(View view){
        RadioButton rb1 = findViewById(R.id.question3_opt1);
        RadioButton rb2 = findViewById(R.id.question3_opt2);
        RadioButton rb3 = findViewById(R.id.question3_opt3);
        RadioButton rb4 = findViewById(R.id.question3_opt4);
        switch(view.getId() ) {
            case R.id.question3_opt3:   rb1.setChecked(false);
                rb2.setChecked(false);
                rb4.setChecked(false);
                break;
            case R.id.question3_opt2:   rb1.setChecked(false);
                rb3.setChecked(false);
                rb4.setChecked(false);
                break;
            case R.id.question3_opt1:   rb2.setChecked(false);
                rb3.setChecked(false);
                rb4.setChecked(false);
                break;
            case R.id.question3_opt4:   rb1.setChecked(false);
                rb3.setChecked(false);
                rb2.setChecked(false);
                break;
        }
    }

    public void Question4(View view){
        RadioButton rb1 = findViewById(R.id.question4_opt1);
        RadioButton rb2 = findViewById(R.id.question4_opt2);
        RadioButton rb3 = findViewById(R.id.question4_opt3);
        RadioButton rb4 = findViewById(R.id.question4_opt4);
        switch(view.getId() ) {
            case R.id.question4_opt3:   rb1.setChecked(false);
                rb2.setChecked(false);
                rb4.setChecked(false);
                break;
            case R.id.question4_opt2:   rb1.setChecked(false);
                rb3.setChecked(false);
                rb4.setChecked(false);
                break;
            case R.id.question4_opt1:   rb2.setChecked(false);
                rb3.setChecked(false);
                rb4.setChecked(false);
                break;
            case R.id.question4_opt4:   rb1.setChecked(false);
                rb3.setChecked(false);
                rb2.setChecked(false);
                break;
        }
    }

    public void Question5(View view){
        RadioButton rb1 = findViewById(R.id.question5_opt1);
        RadioButton rb2 = findViewById(R.id.question5_opt2);
        RadioButton rb3 = findViewById(R.id.question5_opt3);
        RadioButton rb4 = findViewById(R.id.question5_opt4);
        switch(view.getId() ) {
            case R.id.question5_opt3:   rb1.setChecked(false);
                rb2.setChecked(false);
                rb4.setChecked(false);
                break;
            case R.id.question5_opt2:   rb1.setChecked(false);
                rb3.setChecked(false);
                rb4.setChecked(false);
                break;
            case R.id.question5_opt1:   rb2.setChecked(false);
                rb3.setChecked(false);
                rb4.setChecked(false);
                break;
            case R.id.question5_opt4:   rb1.setChecked(false);
                rb3.setChecked(false);
                rb2.setChecked(false);
                break;
        }
    }

    public void submit(View view){
        DisplayMessage(CreateMessage(CalculateMarks()));
    }

    public int CalculateMarks(){
        int marks = 0;
        if(((RadioButton)findViewById(R.id.question1_opt3)).isChecked()) {
            marks = marks + 5;
            ((TextView)findViewById(R.id.question1)).setTextColor(Color.parseColor("#FF00FF37"));
        }
        else
            ((TextView)findViewById(R.id.question1)).setTextColor(Color.parseColor("#FFFF0008"));
        if(((RadioButton)findViewById(R.id.question2_opt4)).isChecked()) {
            marks = marks + 5;
            ((TextView)findViewById(R.id.question2)).setTextColor(Color.parseColor("#FF00FF37"));
        }
        else
            ((TextView)findViewById(R.id.question2)).setTextColor(Color.parseColor("#FFFF0008"));
        if(((RadioButton)findViewById(R.id.question3_opt2)).isChecked()) {
            marks = marks + 5;
            ((TextView)findViewById(R.id.question3)).setTextColor(Color.parseColor("#FF00FF37"));
        }
        else
            ((TextView)findViewById(R.id.question3)).setTextColor(Color.parseColor("#FFFF0008"));
        if(((RadioButton)findViewById(R.id.question4_opt1)).isChecked()) {
            marks = marks + 5;
            ((TextView)findViewById(R.id.question4)).setTextColor(Color.parseColor("#FF00FF37"));
        }
        else
            ((TextView)findViewById(R.id.question4)).setTextColor(Color.parseColor("#FFFF0008"));
        if(((RadioButton)findViewById(R.id.question5_opt3)).isChecked()) {
            marks = marks + 5;
            ((TextView)findViewById(R.id.question5)).setTextColor(Color.parseColor("#FF00FF37"));
        }
        else
            ((TextView)findViewById(R.id.question5)).setTextColor(Color.parseColor("#FFFF0008"));
        if(((CheckBox)findViewById(R.id.question6_opt1)).isChecked() && ((CheckBox)findViewById(R.id.question6_opt2)).isChecked() && ((CheckBox)findViewById(R.id.question6_opt4)).isChecked() && !((CheckBox)findViewById(R.id.question6_opt3)).isChecked()) {
            marks = marks + 5;
            ((TextView)findViewById(R.id.question6)).setTextColor(Color.parseColor("#FF00FF37"));
        }
        else
            ((TextView)findViewById(R.id.question6)).setTextColor(Color.parseColor("#FFFF0008"));
        if(((CheckBox)findViewById(R.id.question7_opt1)).isChecked() && ((CheckBox)findViewById(R.id.question7_opt2)).isChecked() && !((CheckBox)findViewById(R.id.question7_opt3)).isChecked() && !((CheckBox)findViewById(R.id.question7_opt4)).isChecked()) {
            marks = marks + 5;
            ((TextView)findViewById(R.id.question7)).setTextColor(Color.parseColor("#FF00FF37"));
        }
        else
            ((TextView)findViewById(R.id.question7)).setTextColor(Color.parseColor("#FFFF0008"));
        return marks;
    }

    public String CreateMessage(int marks){
        String ResultStatement;
        if(marks > 25)
            ResultStatement = "Outstanding!!";
        else if(marks > 15)
            ResultStatement = "Good!!";
        else
            ResultStatement = "Better Luck Next Time";
        return "Name : " + ((EditText)findViewById(R.id.name_of_player)).getText() + "\nMarks : " + marks + "/35\n" + ResultStatement + "\n";
    }

    public void DisplayMessage(String OutputMessage){
        Context context = getApplicationContext();
        (Toast.makeText(context, OutputMessage, Toast.LENGTH_SHORT)).show();
    }

    public void reset(View view){
        ((RadioButton)findViewById(R.id.question1_opt1)).setChecked(false);
        ((RadioButton)findViewById(R.id.question1_opt2)).setChecked(false);
        ((RadioButton)findViewById(R.id.question1_opt3)).setChecked(false);
        ((RadioButton)findViewById(R.id.question1_opt4)).setChecked(false);
        ((RadioButton)findViewById(R.id.question2_opt1)).setChecked(false);
        ((RadioButton)findViewById(R.id.question2_opt2)).setChecked(false);
        ((RadioButton)findViewById(R.id.question2_opt3)).setChecked(false);
        ((RadioButton)findViewById(R.id.question2_opt4)).setChecked(false);
        ((RadioButton)findViewById(R.id.question3_opt1)).setChecked(false);
        ((RadioButton)findViewById(R.id.question3_opt2)).setChecked(false);
        ((RadioButton)findViewById(R.id.question3_opt3)).setChecked(false);
        ((RadioButton)findViewById(R.id.question3_opt4)).setChecked(false);
        ((RadioButton)findViewById(R.id.question4_opt1)).setChecked(false);
        ((RadioButton)findViewById(R.id.question4_opt2)).setChecked(false);
        ((RadioButton)findViewById(R.id.question4_opt3)).setChecked(false);
        ((RadioButton)findViewById(R.id.question4_opt4)).setChecked(false);
        ((RadioButton)findViewById(R.id.question5_opt1)).setChecked(false);
        ((RadioButton)findViewById(R.id.question5_opt2)).setChecked(false);
        ((RadioButton)findViewById(R.id.question5_opt3)).setChecked(false);
        ((RadioButton)findViewById(R.id.question5_opt4)).setChecked(false);
        ((CheckBox)findViewById(R.id.question6_opt1)).setChecked(false);
        ((CheckBox)findViewById(R.id.question6_opt2)).setChecked(false);
        ((CheckBox)findViewById(R.id.question6_opt3)).setChecked(false);
        ((CheckBox)findViewById(R.id.question6_opt4)).setChecked(false);
        ((CheckBox)findViewById(R.id.question7_opt1)).setChecked(false);
        ((CheckBox)findViewById(R.id.question7_opt2)).setChecked(false);
        ((CheckBox)findViewById(R.id.question7_opt3)).setChecked(false);
        ((CheckBox)findViewById(R.id.question7_opt4)).setChecked(false);
        ((EditText)findViewById(R.id.name_of_player)).setText("");
    }
}
