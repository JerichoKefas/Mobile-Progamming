package umn.ac.id.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button profilbtn;
    private Button loginbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        profilbtn = (Button) findViewById(R.id.profilbutton);
        loginbtn = (Button) findViewById(R.id.loginbutton);

       profilbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProfile();
            }
        });

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLogin();
            }
        });
    }

    public void openProfile(){
        Intent intent = new Intent(this, profil.class);
        startActivity(intent);
    }

    public void openLogin(){
        Intent intent = new Intent(this, login.class);
        startActivity(intent);
    }

}
