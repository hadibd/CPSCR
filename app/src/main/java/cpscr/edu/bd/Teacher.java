package cpscr.edu.bd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Teacher extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher);
    }

    public void teacherListCollege(View view) {
        Intent intent = new Intent(getApplicationContext(), Webview.class);
        intent.putExtra("URL", "http://cpscr.edu.bd/administration/faculty-member-college/");
        startActivity(intent);
    }

    public void TeacherListSchool(View view) {
        Intent intent = new Intent(getApplicationContext(), Webview.class);
        intent.putExtra("URL", "http://cpscr.edu.bd/administration/faculty-member-school/");
        startActivity(intent);
    }

    public void ClassTeacherPrimary(View view) {
        Intent intent = new Intent(getApplicationContext(), Webview.class);
        intent.putExtra("URL", "http://cpscr.edu.bd/academic/academic-school/primary-school/");
        startActivity(intent);
    }

    public void ClassTeacherSecondary(View view) {
        Intent intent = new Intent(getApplicationContext(), Webview.class);
        intent.putExtra("URL", "http://cpscr.edu.bd/academic/academic-school/secondary-school/");
        startActivity(intent);
    }

    public void ClassTeacherEleven(View view) {
        Intent intent = new Intent(getApplicationContext(), Webview.class);
        intent.putExtra("URL", "http://cpscr.edu.bd/class-teacher-eleven/");
        startActivity(intent);
    }

    public void ClassTeacherTwelve(View view) {
        Intent intent = new Intent(getApplicationContext(), Webview.class);
        intent.putExtra("URL", "http://cpscr.edu.bd/academic/academic-college/class-teacher/");
        startActivity(intent);
    }


}
