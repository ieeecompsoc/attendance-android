package Activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import jatin.digital_attendance.R;

public class MainScreen extends AppCompatActivity {
    RecyclerView recyclerView;
    CardView setup;
    CardView attendance;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setup=(CardView)findViewById(R.id.setup_card);
        setup.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        // open setup activity
        Intent i = new Intent();
        i.setClass(MainScreen.this,SetUp.class);
        startActivity(i);
    }
});
        attendance=(CardView)findViewById(R.id.attendance_card);
        attendance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // open attendance mark activity
                Intent i = new Intent();
                i.setClass(MainScreen.this,AttendanceView.class);
                startActivity(i);
            }
        });
//        recyclerView = (RecyclerView) findViewById(R.id.recycle);
//        recyclerView.setHasFixedSize(true);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.my_menu,menu);
        return true;
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.exportback){


        }else if(id == R.id.importbackup){


        }else if(id == R.id.about){

        }else if(id == R.id.signout){
            SharedPreferences prefs = getSharedPreferences("login", MODE_PRIVATE);
            Boolean restoredText = prefs.getBoolean("alreadysignin",true);
            if (restoredText = true) {
               restoredText=false;
            }
        }
        return true;
    }

}
