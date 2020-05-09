package cpscr.edu.bd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Splash_screen extends AppCompatActivity {

    TextView appNameTop, appNameTv;
    LinearLayout BottomTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // For FullScreen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash_screen);

        Animation fromBottom = AnimationUtils.loadAnimation(this, R.anim.from_bottom);
        Animation fromTop = AnimationUtils.loadAnimation(this, R.anim.from_top);

        appNameTv = findViewById(R.id.appNameTv);
        appNameTop = findViewById(R.id.appNameTop);
        BottomTv = findViewById(R.id.BottomTv);

        appNameTv.setAnimation(fromTop);
        appNameTop.setAnimation(fromTop);
        BottomTv.setAnimation(fromBottom);

        getSupportActionBar().hide();


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), Dashboard.class));
                finish();
            }
        }, 5000);
    }
}
