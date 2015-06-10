package sawitalready.dbeucker.de.sawitalready;

import android.app.Activity;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.Menu;
import android.view.View;
import android.widget.ExpandableListView;
import android.content.Intent;
import android.widget.ListView;
import android.widget.Toast;

import adapter.Group;
import adapter.MyExpandableListAdapter;

/**
 * Created by D on 18.05.2015.
 */
public class ShowActivity extends Activity{

    SparseArray<Group> groups = new SparseArray<Group>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        createData();
        ExpandableListView listView = (ExpandableListView) findViewById(R.id.listView);
        adapter.MyExpandableListAdapter adapter = new adapter.MyExpandableListAdapter(this,
                groups,this);
        listView.setAdapter(adapter);

    }

    public void createData() {
        String ShowName = getIntent().getStringExtra("ShowName");
        for (int j = 0; j < 6; j++) {
            Group group = new Group(ShowName + " Staffel " + (j+1));
            for (int i = 0; i < 6; i++) {
                group.children.add("Folge " + (i+1));
            }
            groups.append(j, group);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


}
