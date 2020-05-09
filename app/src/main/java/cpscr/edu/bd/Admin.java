package cpscr.edu.bd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Admin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
    }

    public void Accountant(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:"+getResources().getString(R.string.assistant_accountant_no)));
        startActivity(intent);
    }
    public void Admin(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:"+getResources().getString(R.string.admin_officer_no)));
        startActivity(intent);
    }
    public void ConfidentialStaff(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:"+getResources().getString(R.string.confidential_staff_no)));
        startActivity(intent);
    }
    public void Technitian1(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:"+getResources().getString(R.string.technical_support_no1)));
        startActivity(intent);
    }
    public void Technitian2(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:"+getResources().getString(R.string.technical_support_no2)));
        startActivity(intent);
    }
}
