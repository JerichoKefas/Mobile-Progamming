package umn.ac.id.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    EditText user, pass;
    Button btnlogin;
    String rightusername ="uasmobile";
    String rightpassword = "uasmobilegenap";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        user = findViewById(R.id.user);
        pass = findViewById(R.id.pass);
        btnlogin = findViewById(R.id.button);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(user.getText().toString()) || TextUtils.isEmpty((pass.getText().toString()))){
                    Toast.makeText(login.this,"Empty Data", Toast.LENGTH_LONG).show();
                }else if (user.getText().toString().equals(rightusername)) {
                    if (pass.getText().toString().equals(rightpassword)) {
                        loginSukses();
                    } else {
                        Toast.makeText(login.this, "Invalid Username/Password", Toast.LENGTH_LONG).show();
                    }
                }else {
                    Toast.makeText(login.this, "Invalid Username/Password", Toast.LENGTH_LONG).show();
                }
            }
        });

    }

    public void loginSukses() {
        Intent intent = new Intent(this, musiklist.class);
        startActivity(intent);
    }
}