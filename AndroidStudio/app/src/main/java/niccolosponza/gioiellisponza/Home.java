package niccolosponza.gioiellisponza;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageSwitcher;

public class Home extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ImageSwitcher imgSw = (ImageSwitcher) findViewById(R.id.Home_Immagini);

        Button btnUnici = (Button) findViewById(R.id.Home_Unici);
        Button btnSpeciali = (Button) findViewById(R.id.Home_Speciali);
        Button btnGalleria = (Button) findViewById(R.id.Home_Galleria);
        Button btnEventi = (Button) findViewById(R.id.Home_Eventi);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
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
