package info.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {

    EditText fullname,username,email,password,phone,confirm;
    //RadioGroup gender;
    String fullname1,username1,email1,password1,phone1,confirm1;
    //Enum gender1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    public void registerMasuk (View view){
        fullname = (EditText) findViewById(R.id.fullname);
        username = (EditText) findViewById(R.id.username);
        email = (EditText) findViewById(R.id.email);
        phone = (EditText) findViewById(R.id.phone);
        password = (EditText) findViewById(R.id.pass);
        confirm = (EditText) findViewById(R.id.confirm);
        //gender = (RadioGroup) findViewById(R.id.gender);
        fullname1 = fullname.getText().toString();
        username1 = username.getText().toString();
        email1 = email.getText().toString();
        password1 = password.getText().toString();
        phone1 = phone.getText().toString();
        confirm1 = confirm.getText().toString();

        if(fullname1.matches("")){
            Toast.makeText(this, "Fill the Blank", Toast.LENGTH_SHORT).show();
        }else if(username1.matches("")){
            Toast.makeText(this, "Fill the Blank", Toast.LENGTH_SHORT).show();
        }else if(email1.matches("")){
            Toast.makeText(this, "Fill the Blank", Toast.LENGTH_SHORT).show();
        }else if(phone1.matches("")){
            Toast.makeText(this, "Fill the Blank", Toast.LENGTH_SHORT).show();
        }else if(password1.matches("")){
            Toast.makeText(this, "Fill the Blank", Toast.LENGTH_SHORT).show();
        }else if(confirm1.matches("")){
            Toast.makeText(this, "Fill the Blank", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this,"Register Success !",Toast.LENGTH_SHORT).show();
            Intent i2 = new Intent(SignUp.this,MainActivity.class);
            startActivity(i2);
        }
    }
}
