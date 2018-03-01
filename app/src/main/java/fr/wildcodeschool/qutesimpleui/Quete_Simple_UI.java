package fr.wildcodeschool.qutesimpleui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Quete_Simple_UI extends AppCompatActivity {


    private EditText editText;
    private EditText editText2;
    private TextView editText3;
    private Button button;
    private CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quete__simple__ui);

        editText = findViewById(R.id.editText_last);
        editText2 = findViewById(R.id.editText_first);
        editText3 = findViewById(R.id.editText3);
        button = findViewById(R.id.button_accept);

        // CheckBox config //
        CheckBox Test = findViewById(R.id.checkBox);
        Test.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    editText.setEnabled(true);
                    editText2.setEnabled(true);
                    button.setEnabled(true);
                }
                else {
                    editText.setEnabled(false);
                    editText2.setEnabled(false);
                    button.setEnabled(false);
                }
            }
        });

        // Button config //
        button.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View view) {
                                          EditText nom = findViewById(R.id.editText_last);
                                          String nomstring = nom.getText().toString();
                                          EditText prenom = findViewById(R.id.editText_first);
                                          String prenomstring = prenom.getText().toString();
                                          TextView congrats = findViewById(R.id.TextViewCongrats);
                                          if (prenomstring.equals("") || nomstring.equals("")) {
                                              Toast.makeText(Quete_Simple_UI.this, "Please fill your Firstname and Lastname ! ", Toast.LENGTH_SHORT).show();
                                          } else {
                                              congrats.setText("Congratulation " + nomstring + " " + prenomstring);
                                          }
                                      }

                                  });
        }
}