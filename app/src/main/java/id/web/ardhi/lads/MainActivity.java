package id.web.ardhi.lads;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void kirimData(View view){
        String sharedPrefFile = "contoh_sharedPreferences";
        SharedPreferences mPreferences = getSharedPreferences(sharedPrefFile, MODE_PRIVATE);

        EditText editTextUsername = findViewById(R.id.input_username);
        EditText editTextPassword = findViewById(R.id.input_password);

        String username = editTextUsername.getText().toString();
        String password = editTextPassword.getText().toString();

        SharedPreferences.Editor preferencesEditor = mPreferences.edit();
        preferencesEditor.putString("username", username);
        preferencesEditor.putString("password", password);
        preferencesEditor.apply();

        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);


    }
}
