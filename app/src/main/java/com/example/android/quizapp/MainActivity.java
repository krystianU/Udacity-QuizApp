package com.example.android.quizapp;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private String createResultMessage(int result, String name) {
        String resultMessage;
        resultMessage = "Dear " + name + ", your score is: " + result + " out of 6";
        return resultMessage;
    }

    public void questionChecker(View view) {
        int points = 0;
        EditText editTextName = (EditText) findViewById(R.id.edit_text_name);
        String name = editTextName.getText().toString();
        //  Question 1 checker method
        RadioButton radioButton1 = (RadioButton) findViewById(R.id.question_1_radioButton1);
        boolean isRadioButtonChecked = radioButton1.isChecked();
        if (isRadioButtonChecked) {
            points++;
        }
        //  Question 2 checker method
        CheckBox checkBox1 = (CheckBox) findViewById(R.id.question_2_checkBox1);
        boolean isCheckBox1Checked = checkBox1.isChecked();
        CheckBox checkBox2 = (CheckBox) findViewById(R.id.question_2_checkBox2);
        boolean isCheckBox2Checked = checkBox2.isChecked();
        CheckBox checkBox3 = (CheckBox) findViewById(R.id.question_2_checkBox3);
        boolean isCheckBox3Checked = checkBox3.isChecked();
        CheckBox checkBox4 = (CheckBox) findViewById(R.id.question_2_checkBox4);
        boolean isCheckBox4Checked = checkBox4.isChecked();

        if (isCheckBox1Checked && isCheckBox2Checked && isCheckBox3Checked && isCheckBox4Checked) {

        } else if (isCheckBox1Checked && isCheckBox2Checked && isCheckBox4Checked) {
            points++;
        }
        //  Question 3 checker method
        EditText editText1 = (EditText) findViewById(R.id.question_3_editText);
        if (editText1.getText().toString().equals(getString(R.string.question_3_answer))) {
            points++;
        }
        //  Question 4 checker method
        RadioButton radioButton2 = (RadioButton) findViewById(R.id.question_4_radioButton2);
        boolean isRadioButtonChecked1 = radioButton2.isChecked();
        if (isRadioButtonChecked1) {
            points++;
        }
        //  Question 5 checker method
        RadioButton radioButton3 = (RadioButton) findViewById(R.id.question_5_radioButton4);
        boolean isRadioButtonChecked2 = radioButton3.isChecked();
        if (isRadioButtonChecked2) {
            points++;
        }
        //  Question 6 checker method
        CheckBox checkBox5 = (CheckBox) findViewById(R.id.question_6_checkBox1);
        boolean isCheckBox5Checked = checkBox5.isChecked();
        CheckBox checkBox6 = (CheckBox) findViewById(R.id.question_6_checkBox2);
        boolean isCheckBox6Checked = checkBox6.isChecked();
        CheckBox checkBox7 = (CheckBox) findViewById(R.id.question_6_checkBox3);
        boolean isCheckBox7Checked = checkBox7.isChecked();
        CheckBox checkBox8 = (CheckBox) findViewById(R.id.question_6_checkBox4);
        boolean isCheckBox8Checked = checkBox8.isChecked();

        if (isCheckBox5Checked && isCheckBox6Checked && isCheckBox7Checked && isCheckBox8Checked) {
            points++;
        }
        String resultMessage = createResultMessage(points, name);
        showResult(resultMessage);

    }
    private void showResult(String resultMessage){
        Toast.makeText(MainActivity.this, resultMessage, Toast.LENGTH_LONG).show();
       }

}




