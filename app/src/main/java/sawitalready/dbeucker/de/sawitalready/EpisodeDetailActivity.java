package sawitalready.dbeucker.de.sawitalready;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by D on 18.05.2015.
 */
public class EpisodeDetailActivity extends Activity{

    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_epidsode_detail);
        getActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
