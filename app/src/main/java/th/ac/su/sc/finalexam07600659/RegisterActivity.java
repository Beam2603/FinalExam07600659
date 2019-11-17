package th.ac.su.sc.finalexam07600659;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {
    private EditText fullname;
    private EditText user;
    private  EditText pass;
    private Button register;

    protected void onCreate(Bundle saveInstanceState) {

        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_register);
        fullname =(EditText) findViewById(R.id.full_name_edit_text);
        user =(EditText) findViewById(R.id.username_edit_text);
        pass=(EditText) findViewById(R.id.password_edit_text);
        register=(Button) findViewById(R.id.register_button);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a=fullname.getText().toString();
                String b=user.getText().toString();
                String c=pass.getText().toString();
                if(sucess(a,b,c)){
                  printt();;
                }else{
                    new AlertDialog.Builder(RegisterActivity.this).setMessage("All fields are required").show();
                }
            }
        });
    }
    public boolean sucess(String str,String str1,String str2){
        if(str.length()>0 && str1.length()>0 && str2.length()>0){
            return  true;
        }else if(str.length()>0 || str1.length()>0 || str2.length()>0){
            return true;
        }else{
            return false;
        }

    }
    public void printt(){
        StringBuilder builder=new StringBuilder();
        if(fullname.length()>0 && user.length()>0 && pass.length()>0){
            new AlertDialog.Builder(this).setMessage("Register successfully").show();
        }else if(fullname.length()>0 || user.length()>0 || pass.length()>0){
            new AlertDialog.Builder(this).setMessage("All fields are required").show();
        }
    }

}
