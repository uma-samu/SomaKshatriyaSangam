package sangam.kshatriya.com;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MembersActivity extends AppCompatActivity {

    String[] membersArray = {
            "",
            "ADVISORS",
            "Nampally Venkat Ratnam",
            "Racharla Satyanarayana Varma",
            "Muthyala Narsing Rao",
            "Muthyala Narsing Rao",
            "Muthyala Narayana Rao",
            "Polakonda Hanumanth Rao(Legal)",
            "",
            "PRESIDENT",
            "Racharla Keshava Rao",
            "",
            "VICE PRESIDENTS",
            "Nampally Narayana Rao",
            "Kamarouthu Vinod Kumar",
            "Samudrala Gowri Shanker",
            "Sangu Srinivas",
            "Nampally Krishna",
            "",
            "GENERAL SECRETARIES",
            "Koricharla Srinivas Rao",
            "Nampally Ravi Varma",
            "Kamarouthu Ramraj",
            "Yalala Sridhar Varma",
            "",
            "TREASURER",
            "Sirikonda Radha Krishna",
            "",
            "ASST. TREASURER",
            "Dhanalakota Laxman",
            "",
            "SECRETARIES",
            "Koricharla Ashok Kumar",
            "Etroutu Satish Varma",
            "Racharla Raghuram",
            "Danalakota Ganesh - NZB",
            "Nampally Mohan Rao - KHAM",
            "Bramarouthu Mallikarjun Rao - SANG",
            "Bramarouthu Narsing Rao - BK",
            "Polakonda Raj Kumar - KR",
            "Danalakota Dharmender - NG",
            "",
            "ORGANISING SECRETARIES",
            "Ramagiri Srikanth",
            "Danalakota Satish Varma",
            "Nampally Srikanth",
            "Yalala Sunil Kumar",
            "Danalakota Ashok Varma",
            "Nampally Venkata Raja Rao",
            "Danalakota Narsing Rao",
            "Pogulaguntla Mahender Varma",
            "Nampally Raj Shekar",
            "",
            "JOINT SECRETARIES",
            "Sangu Raju",
            "Danalakota Rama Krishna",
            "N.H. Rama Krishna Varma",
            "Muthyala Srinivasa Rao",
            "Dama Raj Mohan",
            "Yalala Satyanarayana",
            "Danalakota Santosh",
            "Koricharla Rajeshwar Rao",
            "Danalakota Devender",
            "",
            "CULTURAL SECRETARIES",
            "Cherala Bala Krishna",
            "Danalakota Suresh Chandra",
            "",
            "CONVINORS",
            "Kamarouthu Sudheer",
            "Sirikonda Harish Karan",
            "",
            "PUBLIC SECRETARY",
            "Muthyala Shyam",
            "",
            "EXECUTIVE MEMBERS",
            "Polakonda Pentaiah",
            "Koricharla Ravinder",
            "Koricharla Mallesh",
            "Nampally Sridhar Rao",
            "Sangu Rajender",
            "Pakala Krishna Rao",
            "Nampally Chandra Prakash",
            "Nampally Srinivas Rao",
            "Samudrala Ashok Varma",
            "Sirikonda Sunil Kumar"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_members);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.activity_listview, membersArray);

        ListView listView = (ListView) findViewById(R.id.members_list);
        listView.setAdapter(adapter);
    }

}
