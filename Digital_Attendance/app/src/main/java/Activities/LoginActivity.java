package Activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import jatin.digital_attendance.R;

public class LoginActivity extends AppCompatActivity {
    EditText name;
    EditText passward;
    Button signin;
    Boolean alreadysidnin=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        name=(EditText)findViewById(R.id.name_field);
        passward=(EditText)findViewById(R.id.password_field);
        signin=(Button)findViewById(R.id.signin_field);
        signin.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            String passwardcheck=passward.getText().toString();
            String namecheck=name.getText().toString();
            if(passwardcheck.length()<6 )
            {
                Toast.makeText(LoginActivity.this,"passward requires minimum 6 chracters",Toast.LENGTH_SHORT).show();
//                Log.i("pppp", "onClick: ");
            }
            else
            if(namecheck.length()<2)
            {
                Toast.makeText(LoginActivity.this,"Incorrect name",Toast.LENGTH_SHORT).show();
            }
            else
            {
                Intent i = new Intent();
                i.setClass(LoginActivity.this, MainScreen.class);
                startActivity(i);
            }
            alreadysidnin=true;
            SharedPreferences.Editor editor = getSharedPreferences("login", MODE_PRIVATE).edit();
            editor.putBoolean("alreadysignin", true);

            editor.commit();
        }
    });
    }

}
