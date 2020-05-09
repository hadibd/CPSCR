package cpscr.edu.bd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OfficeStaff extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_office_staff);

    }

    public void OfficStaff1(View view) {
        Intent intent = new Intent(getApplicationContext(), Webview.class);
        intent.putExtra("URL", getResources().getString(R.string.office_staff1_url));
        startActivity(intent);
    }

    public void OfficStaff2(View view) {
        Intent intent = new Intent(getApplicationContext(), Webview.class);
        intent.putExtra("URL", getResources().getString(R.string.office_staff1_url2));
        startActivity(intent);
    }
}
