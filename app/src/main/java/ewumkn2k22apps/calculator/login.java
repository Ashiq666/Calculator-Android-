package ewumkn2k22apps.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;

public class login extends AppCompatActivity {
    private EditText edituserId,edituserpass, editrePass;
    private CheckBox RememberUserID,RememberLogin;
    boolean isCreating = false;
    SharedPreferences SRPref;
    SharedPreferences.Editor useredit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        SRPref = getSharedPreferences("userSharedPref",MODE_PRIVATE);
        useredit = SRPref.edit();

        findViewById(R.id.btnexit).setOnDragListener(view -> finish());

        edituserId = findViewById(R.id.edituserId);

    }
}