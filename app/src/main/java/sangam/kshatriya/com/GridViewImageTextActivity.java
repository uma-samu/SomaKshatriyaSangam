package sangam.kshatriya.com;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class GridViewImageTextActivity extends AppCompatActivity {

    GridView androidGridView;

    String[] gridViewString = {
            "Home", "About Us", "History", "Story", "Temple", "Members", "Contact Us"
    } ;
    int[] gridViewImageId = {
            R.drawable.home, R.drawable.about_us, R.drawable.history, R.drawable.story, R.drawable.temple,  R.drawable.members, R.drawable.contact_us

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridview_image_text_example);

        CustomGridViewActivity adapterViewAndroid = new CustomGridViewActivity(GridViewImageTextActivity.this, gridViewString, gridViewImageId);
        androidGridView=(GridView)findViewById(R.id.grid_view_image_text);
        androidGridView.setAdapter(adapterViewAndroid);
        androidGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int i, long id) {
                if(i==0){
                    Intent intent = new Intent("sangam.kshatriya.com.home");
                    startActivity(intent);
                }
                if(i==1){
                    Intent intent = new Intent("sangam.kshatriya.com.aboutus");
                    startActivity(intent);
                }
                if(i==2){
                    Intent intent = new Intent("sangam.kshatriya.com.history");
                    startActivity(intent);
                }
                if(i==3){
                    Intent intent = new Intent("sangam.kshatriya.com.story");
                    startActivity(intent);
                }
                if(i==4){
                    Intent intent = new Intent("sangam.kshatriya.com.temples");
                    startActivity(intent);
                }
                if(i==5){
                    Intent intent = new Intent("sangam.kshatriya.com.members");
                    startActivity(intent);
                }
                if(i==6){
                    Intent intent = new Intent("sangam.kshatriya.com.contactus");
                    startActivity(intent);
                }
            }
        });

    }
}