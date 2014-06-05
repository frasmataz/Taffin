package com.frasersharp.taffin;

import android.support.v7.app.ActionBarActivity;
import android.support.v4.app.Fragment;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.TextureView;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		ImageButton imageButton = (ImageButton) findViewById(R.id.imageButton1);
		final SeekBar bar = (SeekBar) findViewById(R.id.seekBar1);
		final TextView text = (TextView) findViewById(R.id.textView1);
		text.setText("Taffin.");

		bar.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
			
			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onProgressChanged(SeekBar seekBar, int progress,
					boolean fromUser) {
				// TODO Auto-generated method stub
				if(progress<33) {
					text.setText("Taffin.");
				} else if(progress>=33&&progress<66) {
					text.setText("Mega Taffin.");
				} else if(progress>66) {
					text.setText("FINAL OMEGA TAFFIN.");
				}
			}
		});
		
		imageButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

				if (bar.getProgress() < 33) {
					MediaPlayer mp = MediaPlayer.create(
							getApplicationContext(), R.raw.here1);
					mp.start();
				} else if (bar.getProgress() >= 33 && bar.getProgress() < 66) {
					MediaPlayer mp = MediaPlayer.create(
							getApplicationContext(), R.raw.here2);
					mp.start();
				} else if (bar.getProgress() >= 66) {
					MediaPlayer mp = MediaPlayer.create(
							getApplicationContext(), R.raw.here3);
					mp.start();
				}

			}

		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
