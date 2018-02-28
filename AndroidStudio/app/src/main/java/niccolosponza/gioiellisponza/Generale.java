package niccolosponza.gioiellisponza;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;

public class Generale extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Button btnInviaMail = (Button) findViewById(R.id.Email_Invia);

        btnInviaMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.home);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id) {
            case R.id.btn_Info:
                setContentView(R.layout.informazioni);
                break;
            case R.id.btn_SendEmail:
                setContentView(R.layout.email);
                break;
            case R.id.btn_Esci:
                System.out.print("Esci");
                break;
        }
        return false;
    }
}
