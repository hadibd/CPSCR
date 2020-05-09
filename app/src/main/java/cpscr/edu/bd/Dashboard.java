package cpscr.edu.bd;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Dashboard extends AppCompatActivity {

    ListView HomePageList;
    String[] mUrl;
    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        ArrayAdapter arrayAdapter = new ArrayAdapter <String> (this, R.layout.listview, R.id.ListLayoutTvId, getResources().getStringArray(R.array.home_page_list));
        HomePageList  = findViewById(R.id.homePageListId);
        mUrl = getResources().getStringArray(R.array.url);
        HomePageList.setAdapter(arrayAdapter);

        builder = new AlertDialog.Builder(this);

        HomePageList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    Intent intent = new Intent(getApplicationContext(), Webview.class);
                    intent.putExtra("URL", mUrl[position]);
                    startActivity(intent);
                }
                if (position==1){
                    Intent intent = new Intent(getApplicationContext(), Webview.class);
                    intent.putExtra("URL", mUrl[position] );
                    startActivity(intent);
                }
                if (position==2){
                    Intent intent = new Intent(getApplicationContext(), Webview.class);
                    intent.putExtra("URL", mUrl[position]);
                    startActivity(intent);
                }
                if (position==3){
                    Intent intent = new Intent(getApplicationContext(), Webview.class);
                    intent.putExtra("URL", mUrl[position]);
                    startActivity(intent);
                }
                if (position==4){
                    Intent intent = new Intent(getApplicationContext(), Webview.class);
                    intent.putExtra("URL", mUrl[position]);
                    startActivity(intent);
                }
                if (position==5){
                    Intent intent = new Intent(getApplicationContext(), Teacher.class);
                    startActivity(intent);
                }
                if (position==6){
                    Intent intent = new Intent(getApplicationContext(), OfficeStaff.class);
                    startActivity(intent);
                }
                if (position==7){
                    Intent intent = new Intent(getApplicationContext(), Webview.class);
                    intent.putExtra("URL", mUrl[position]);
                    startActivity(intent);
                }
                if (position==8){
                    Intent intent = new Intent(getApplicationContext(), Webview.class);
                    intent.putExtra("URL", mUrl[position]);
                    startActivity(intent);
                }
                if (position==9){
                    Intent intent = new Intent(getApplicationContext(), Webview.class);
                    intent.putExtra("URL", mUrl[position]);
                    startActivity(intent);
                }
                if (position==10){
                    Intent intent = new Intent(getApplicationContext(), Webview.class);
                    intent.putExtra("URL", mUrl[position]);
                    startActivity(intent);
                }
                if (position==11){
                    Intent intent = new Intent(getApplicationContext(), Webview.class);
                    intent.putExtra("URL", mUrl[position]);
                    startActivity(intent);
                }
                if (position==12){
                    Intent intent = new Intent(getApplicationContext(), Webview.class);
                    intent.putExtra("URL", mUrl[position]);
                    startActivity(intent);
                }
                if (position==13){
                    Intent intent = new Intent(getApplicationContext(), FeesPayment.class);
                    startActivity(intent);

                }
                if (position==14){
                    Intent intent = new Intent(getApplicationContext(), Webview.class);
                    intent.putExtra("URL", mUrl[position]);
                    startActivity(intent);
                }
                if (position==15){
                    Intent intent = new Intent(getApplicationContext(), Webview.class);
                    intent.putExtra("URL", mUrl[position]);
                    startActivity(intent);
                }
                if (position==16){
                    Intent intent = new Intent(getApplicationContext(), Webview.class);
                    intent.putExtra("URL", mUrl[position]);
                    startActivity(intent);
                }
                if (position==17){
                    Intent intent = new Intent(getApplicationContext(), Webview.class);
                    intent.putExtra("URL", mUrl[position]);
                    startActivity(intent);
                }
                if (position==18){
                    Intent intent = new Intent(getApplicationContext(), Webview.class);
                    intent.putExtra("URL", mUrl[position]);
                    startActivity(intent);
                }
                if (position==19){
                    Intent intent = new Intent(getApplicationContext(), PhotoGallery.class);
                    startActivity(intent);

                }
                if (position==20){
                    Intent intent = new Intent(getApplicationContext(), Webview.class);
                    intent.putExtra("URL", mUrl[position]);
                    startActivity(intent);
                }
                if (position==21){
                    Toast.makeText(getApplicationContext(),"Not Available", Toast.LENGTH_SHORT);
                }
                if (position==22){
                    Intent intent = new Intent(getApplicationContext(), Webview.class);
                    intent.putExtra("URL", mUrl[position]);
                    startActivity(intent);
                }
                if (position==23){
                    Intent intent = new Intent(getApplicationContext(), Webview.class);
                    intent.putExtra("URL", mUrl[position]);
                    startActivity(intent);
                }
                if (position==24){
                    Intent intent = new Intent(getApplicationContext(), Address.class);
                    startActivity(intent);
                }
                if (position==25){
                    Intent intent = new Intent(getApplicationContext(), Admin.class);
                    startActivity(intent);
                }
            }
        });
    }
}
