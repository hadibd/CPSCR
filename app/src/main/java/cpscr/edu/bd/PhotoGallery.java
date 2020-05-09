package cpscr.edu.bd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class PhotoGallery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_gallery);
    }

    public void photo_gallery(View view) {

        Intent intent = new Intent(getApplicationContext(), Webview.class);
        intent.putExtra("URL", "http://cpscr.edu.bd/gallery/photo-gallery/");
        startActivity(intent);
    }

    public void bangobondhu_corner(View view) {
        Intent intent = new Intent(getApplicationContext(), Webview.class);
        intent.putExtra("URL", "http://cpscr.edu.bd/gallery/bangobandhu-corner/");
        startActivity(intent);
    }

    public void video_gallery(View view) {
        Intent intent = new Intent(getApplicationContext(), Webview.class);
        intent.putExtra("URL", "http://cpscr.edu.bd/gallery/video-gallery/");
        startActivity(intent);
    }

    public void video_channel(View view) {
        Toast.makeText(getApplicationContext(), "Not Available", Toast.LENGTH_SHORT).show();
    }
}
