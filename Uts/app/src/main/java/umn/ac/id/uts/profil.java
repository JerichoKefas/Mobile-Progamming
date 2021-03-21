package umn.ac.id.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class profil extends AppCompatActivity {
    private Button backbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        TextView youtube = (TextView) findViewById(R.id.textView6);
        youtube.setMovementMethod(LinkMovementMethod.getInstance());
        TextView youtube2= (TextView) findViewById(R.id.textView9);
        youtube2.setMovementMethod(LinkMovementMethod.getInstance());
        TextView youtube3= (TextView) findViewById(R.id.textView10);
        youtube3.setMovementMethod(LinkMovementMethod.getInstance());
        TextView youtube4= (TextView) findViewById(R.id.textView11);
        youtube4.setMovementMethod(LinkMovementMethod.getInstance());
        backbtn = (Button) findViewById(R.id.backbutton);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain();
            }
        });
    }
    public void openMain(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}