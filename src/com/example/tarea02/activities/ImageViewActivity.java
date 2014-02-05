package com.example.tarea02.activities;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.tarea02.R;

public class ImageViewActivity extends ActionBarActivity {
	ImageView imageView;
	String tienda = "";
	String image = "";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_image_view);
		
		imageView = (ImageView)findViewById(R.id.ImageView);
		
		Bundle b = this.getIntent().getExtras();                  
		String txtName = b.getString("name");
		tienda = txtName;
		Drawable drawable = null;
		Resources res = getResources();
		
		if (txtName.equals("Lego Store")) {
			drawable = res.getDrawable(R.drawable.lego_store);
        } else if (txtName.equals("Artemis Edinter")) {
        	image = "artemis";
        	drawable = res.getDrawable(R.drawable.artemis);
        } else if (txtName.equals("McCafe")) {
        	image = "mc_cafe";
        	drawable = res.getDrawable(R.drawable.mc_cafe);
        } else if (txtName.equals("Siman")) {
        	image = "siman";
        	drawable = res.getDrawable(R.drawable.siman);
        } else if (txtName.equals("Nine West")) {
        	image = "ninewest";
        	drawable = res.getDrawable(R.drawable.ninewest);
        } else if (txtName.equals("Bershka")) {
        	image = "bershka";
        	drawable = res.getDrawable(R.drawable.bershka);
        } else if (txtName.equals("Aparicio")) {
        	image = "aparicio";
        	drawable = res.getDrawable(R.drawable.aparicio);
        } else if (txtName.equals("Adoc")) {
        	image = "adoc";
        	drawable = res.getDrawable(R.drawable.adoc);
        } else if (txtName.equals("Max")) {
        	image = "max";
        	drawable = res.getDrawable(R.drawable.max);
        } else if (txtName.equals("BAM")) {
        	image = "bam";
        	drawable = res.getDrawable(R.drawable.bam);
        } else {
        	
        }
		
		imageView.setImageDrawable(drawable);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.image_view, menu);
		return true;
	}
	
	@Override
    public boolean onOptionsItemSelected(MenuItem item) {
			Intent i;
            switch (item.getItemId()) {
		            case R.id.action_list:
		        		i = new Intent(getApplicationContext(),MainActivity.class);
		        		startActivity(i);
		                return true;
                    case R.id.action_info:
                    		i = new Intent(getApplicationContext(),InfoStoreActivity.class);
                    		i.putExtra("name", tienda);
                    		startActivity(i);
                            return true;
                    case R.id.action_favorite:
        	        	Toast.makeText(getApplicationContext(), "Favorito", Toast.LENGTH_SHORT).show();
        	        	return true;
        	        case R.id.action_share:
        	        	Uri path = Uri.parse("android.resource//" + this.getPackageName() + "/drawable/" + image);
        	        	Intent shareIntent = new Intent();
        	        	shareIntent.setAction(Intent.ACTION_SEND);
        	        	shareIntent.putExtra(Intent.EXTRA_STREAM, path);
        	        	shareIntent.setType("image/png");
        	        	startActivity(Intent.createChooser(shareIntent, "Texto"));
        	        	return true;
                    default :
                            return super.onOptionsItemSelected(item);
            }                
    }
}
