package sawitalready.dbeucker.de.sawitalready;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import database.Show;

/**
 * Created by D on 20.05.2015.
 */
public class AddShow extends Activity {


    private TextView txtseekbarStatus;
    private AlertDialog alertDialog;
    private static final String ALERT_DIALOG_TITLE = "Add Season to the Show";
    private static final String ALERT_DIALOG_MESSAGE = "Every Show got some Seasons ";

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_add_show);
        getActionBar().setDisplayHomeAsUpEnabled(true);


    }
    public void clickAddShow(View v) {
        showDialog();
    }

    public void showDialog(){

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);

        LayoutInflater inflater = (LayoutInflater)this.getSystemService(LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.addshowdialog, (ViewGroup)findViewById(R.id.dialog_root));


        txtseekbarStatus = (TextView) layout.findViewById(R.id.seekbarStatus);
        txtseekbarStatus.setText("Seasons: " + 0 + "/" + 30);

        alertDialogBuilder.setView(layout);
        alertDialogBuilder.setTitle(ALERT_DIALOG_TITLE);
        alertDialogBuilder.setMessage(ALERT_DIALOG_MESSAGE).setCancelable(false);

       SeekBar seekbar = (SeekBar) layout.findViewById(R.id.seekBar);

        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){
            int progress = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progresValue, boolean fromUser) {
                progress = progresValue;
                txtseekbarStatus.setText("Seasons: " + progress + "/" + seekBar.getMax());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                txtseekbarStatus.setText("Seasons: " + progress + "/" + seekBar.getMax());

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                txtseekbarStatus.setText("Seasons: " + progress + "/" + seekBar.getMax());

            }
        });

        alertDialogBuilder.setNegativeButton(R.string.back, new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        this.alertDialog = alertDialogBuilder.create();
        this.alertDialog.show();

    }

}
