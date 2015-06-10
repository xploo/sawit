package sawitalready.dbeucker.de.sawitalready;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import android.widget.ListView;
import android.view.View;

import adapter.NewArrayAdapter;


public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
       // setContentView(R.layout.activity_main);

        String[] values = new String[] { "Game of Thrones", "Supernatural", "Dr. House",
                "The Flash", "Daredevil", "Agents of SHIELD", "Castle", "The Walking Dead",
                "True Detective", "Attack on Titan" };
        String[] values2 = new String[] {
                "5 Staffeln","10 Staffeln","8 Staffeln","2 Staffeln","1 Staffel","2 Staffeln","7 Staffeln","5 Staffeln","1 Staffel","1 Staffel"
        };
        // use your custom layout
        NewArrayAdapter adapter = new NewArrayAdapter(this,values,values2);
        setListAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        menu.findItem(R.id.add_show).setVisible(true);
        return true;
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        String item = (String) getListAdapter().getItem(position);
        Toast.makeText(this, item + " selected", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, ShowActivity.class);
        intent.putExtra("ShowName",item);
        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        switch (item.getItemId()) {
            case R.id.add_show:
                //openSearch();
                Intent intent = new Intent(this, AddShow.class);
                startActivity(intent);
                return true;
            case R.id.action_settings:
                //openSettings();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
