package com.example.complaintmanagementsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.complaintmanagementsystem.Models.User.Professor;

public class ProfessorRegistration extends AppCompatActivity {
    private static String designation="Dean";
    private static String faculty="Computer Engg";

    private static String name;
    private static String email;
    private static String pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_professor_registration);


        Spinner spinner1 = (Spinner) findViewById(R.id.designation);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,
                R.array.designationProfessor, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner1.setAdapter(adapter1);

        Spinner spinner2 = (Spinner) findViewById(R.id.faculty);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
                R.array.facultyArray, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner2.setAdapter(adapter2);


        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int pos, long id) {
                designation = parent.getItemAtPosition(pos).toString();
            }


            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                return;
            }

        });

        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int pos, long id) {
                faculty = parent.getItemAtPosition(pos).toString();

            }


            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                return;
            }

        });

        Intent intent = getIntent();
        name = intent.getExtras().getString("name");
        email = intent.getExtras().getString("email");
        pass = intent.getExtras().getString("pass");

    }

    public void professorRegistration(View v){
        EditText editTextOfficeNo = (EditText) findViewById(R.id.officeNo);
        String officeNo = editTextOfficeNo.getText().toString();

        Professor professor = new Professor(pass,name,email,2,faculty,designation,officeNo);
        Log.e("pass", pass);
        Log.e("name", name);
        Log.e("email", email);
        Log.e("role", String.valueOf(2));
        Log.e("faculty", faculty);
        Log.e("designation", designation);
        Log.e("Office No", String.valueOf(officeNo));
        return;
    }


}
