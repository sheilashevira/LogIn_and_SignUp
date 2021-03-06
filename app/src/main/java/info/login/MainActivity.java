package info.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText1, editText2;
    String text1, text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void loginMasuk(View view){
        editText1 = (EditText) findViewById(R.id.edittext_username);
        editText2 = (EditText) findViewById(R.id.edittext_password);
        text1 = editText1.getText().toString();
        text2 = editText2.getText().toString();

        if((text1.contains("hijoy"))&&(text2.contains("14162328"))){
            Toast.makeText(this,"Login Success !",Toast.LENGTH_SHORT).show();
            Intent i = new Intent(MainActivity.this,Main2Activity.class);
            startActivity(i);
        }else if((text1.matches("") || text2.matches(""))){
            Toast.makeText(this, "Enter Username and Password !", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this,"Invalid Username or Password. Try Again !",Toast.LENGTH_SHORT).show();
        }
    }

    public void register (View view){

        startActivity(new Intent(getApplicationContext(), SignUp.class));
    }
}
