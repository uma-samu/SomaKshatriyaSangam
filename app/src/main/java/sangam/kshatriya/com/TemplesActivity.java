package sangam.kshatriya.com;

import android.os.Bundle;
import android.app.Activity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TemplesActivity extends Activity {

    String[] templesArray = {"Shri Nimishamba Devi Temple\nShukravarapet Khammmam, Andhra pradesh",
            "Shri Nimishamba Devi Temple\nKeerthi Nagar Colony, Warangal\n\nSanjay: 9866135004; Prabhakar: 9966871501",
            "Shri Nimishamba Devi Temple\nNirmal ,Adilabad",
            "Shri Nimishamba Devi Temple\nBalkonda",
            "Shri Nimishamba Devi Temple\nBoduppal, Pentareddy Colony, Hyderabad\n\nContact: 9247755136",
            "Shri Nimishamba Devi Temple\nNirmal ,Adilabad",
            "Shri Nimishamba Devi Temple\nChittari Street, Kurnool, Andhra Pradesh",
            "Shri Nimishamba Devi Temple\nCheruvukatta Ananthapuram, Andhra Pradesh",
            "Shri Nimishamba Devi Temple\nPark road Nandyal.( kurnool district )Andhra Pradesh"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temples);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.activity_listview, templesArray);

        ListView listView = (ListView) findViewById(R.id.temples_list);
        listView.setAdapter(adapter);
    }

}
