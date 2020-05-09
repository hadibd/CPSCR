package cpscr.edu.bd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FeesPayment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fees_payment);
    }

    public void Rocket(View view) {
        Intent intent = new Intent(getApplicationContext(), Webview.class);
        intent.putExtra("URL", getResources().getString(R.string.url_rocket));
        startActivity(intent);
    }

    public void Nogod(View view) {
        Intent intent = new Intent(getApplicationContext(), Webview.class);
        intent.putExtra("URL", getResources().getString(R.string.url_nagod));
        startActivity(intent);
    }

    public void bchash(View view) {
        Intent intent = new Intent(getApplicationContext(), Webview.class);
        intent.putExtra("URL", getResources().getString(R.string.url_bcash));
        startActivity(intent);
    }

    public void tcash(View view) {
        Intent intent = new Intent(getApplicationContext(), Webview.class);
        intent.putExtra("URL", getResources().getString(R.string.url_tcash));
        startActivity(intent);
    }
}
