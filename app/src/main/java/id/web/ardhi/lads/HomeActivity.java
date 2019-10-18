package id.web.ardhi.lads;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        String sharedPrefFile = "contoh_sharedPreferences";
        SharedPreferences mPreferences = getSharedPreferences(sharedPrefFile, MODE_PRIVATE);

        String username = mPreferences.getString("username", "");
        String password = mPreferences.getString("password", "");

        TextView textViewUsername = findViewById(R.id.username);
        TextView textViewPasword = findViewById(R.id.password);

        textViewUsername.setText(username);
        textViewPasword.setText(password);
    }
}
