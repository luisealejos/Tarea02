package com.example.tarea02.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar.Tab;
import android.support.v7.app.ActionBar.TabListener;
import android.support.v7.app.ActionBarActivity;
import android.text.util.Linkify;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tarea02.R;

public class InfoStoreActivity extends ActionBarActivity  implements TabListener {
	
	private String store = "";
    public final static String NAME = "name";
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.fragment_store_info);  

            Bundle b = this.getIntent().getExtras();                  
    		String txtName = b.getString(NAME);
    		store = txtName;
    		
    		String txtDescription = "";
    		String txtAddress ="";
            String txtTelephone ="";
            String txtHorario ="";
            String txtWebsite ="";
            String txtEmail ="";
            
            if (txtName.equals("Lego Store")) {
            	txtAddress ="Tercer nivel D-Mall";
            	txtDescription = "Tienda de Lego";
                txtTelephone ="2499-9760";
                txtHorario ="Lun - Jue: 10:00 - 20:00\nVie - Sáb: 10:00 - 21:00\nDom: 10:00 - 19:00";
                txtWebsite ="https://es-la.facebook.com/legoguatemala";
                txtEmail ="info@legostore.com";
            } else if (txtName.equals("Artemis Edinter")) {
            	txtDescription = "Librerías Artemis Edinter con más de 33 años de experiencia en el mundo del libro.";
            	txtAddress ="Segundo nivel D-Mall";
                txtTelephone ="2336-6320";
                txtHorario ="Lun - Jue: 10:00 - 20:00\nVie - Sáb: 10:00 - 21:00\nDom: 10:00 - 19:00";
                txtWebsite ="http://www.artemisedinter.com/";
                txtEmail ="info@artemis.com.gt";
            } else if (txtName.equals("McCafe")) {
            	txtDescription = "Bebidas calientes y frias así como diversas opciones de platillos dulces y salados.";
            	txtAddress ="Primer nivel D-Mall";
                txtTelephone ="2385-5402";
                txtHorario ="Lun - Jue: 10:00 - 20:00\nVie - Sáb: 10:00 - 21:00\nDom: 10:00 - 19:00";
                txtWebsite ="https://es-la.facebook.com/McCafeGuatemala";
                txtEmail ="contact@mccafe.com";
            } else if (txtName.equals("Nine West")) {
            	txtDescription = "Calzado exclusivo para ti, siempre a la moda con estilos vanguardistas.";
            	txtAddress ="Primer nivel D-Mall";
                txtTelephone ="2336-6889";
                txtHorario ="Lun - Jue: 10:00 - 20:00\nVie - Sáb: 10:00 - 21:00\nDom: 10:00 - 19:00";
                txtWebsite ="http://www.ninewestca.com/";
                txtEmail ="info@ninewestca.com";
            } else if (txtName.equals("Bershka")) {
            	txtDescription = "Productos situados de acorde a tu estilo, desde formal hasta deportiva, y de prendas básicas a las de mayor tendencia.";
            	txtAddress ="Primer nivel D-Mall";
                txtTelephone ="2336-6978";
                txtHorario ="Lun - Jue: 10:00 - 20:00\nVie - Sáb: 10:00 - 21:00\nDom: 10:00 - 19:00";
                txtWebsite ="http://www.bershka.com/";
                txtEmail ="contact@bershka.com";
            } else if (txtName.equals("Aparicio")) {
            	txtDescription = "Venta de joyas y relojes.";
            	txtAddress ="Primer nivel D-Mall";
                txtTelephone ="2336-6720";
                txtHorario ="Lun - Jue: 10:00 - 20:00\nVie - Sáb: 10:00 - 21:00\nDom: 10:00 - 19:00";
                txtWebsite ="http://aparicio.com.gt/";
                txtEmail ="servicio@aparicio.com.gt";
            } else if (txtName.equals("Siman")) {
            	txtDescription = "Venta de ropa, accesorios, electrodomésticos y muebles.";
            	txtAddress ="Primer nivel D-Mall";
                txtTelephone ="2444-7777";
                txtHorario ="Lun - Jue: 10:00 - 20:00\nVie - Sáb: 10:00 - 21:00\nDom: 10:00 - 19:00";
                txtWebsite ="http://www.siman.com/guatemala/";
                txtEmail ="contacto@siman.com";
            } else if (txtName.equals("Adoc")) {
            	txtDescription = "Esta es una de las zapaterías más grandes de Guatemala. Aquí podrá encontrar zapatos para toda la familia.";
            	txtAddress ="Segundo nivel D-Mall";
                txtTelephone ="2336-6883";
                txtHorario ="Lun - Jue: 10:00 - 20:00\nVie - Sáb: 10:00 - 21:00\nDom: 10:00 - 19:00";
                txtWebsite ="https://es-la.facebook.com/adoccentroamerica";
                txtEmail ="servicio@adoc.com.gt";
            } else if (txtName.equals("Max")) {
            	txtDescription = "Productos eléctricos y electrónicos para el entretenimiento y la comodidad en el hogar";
            	txtAddress ="Segundo nivel D-Mall";
                txtTelephone ="2336-6950";
                txtHorario ="Lun - Jue: 10:00 - 20:00\nVie - Sáb: 10:00 - 21:00\nDom: 10:00 - 19:00";
                txtWebsite ="http://www.max.com.gt/";
                txtEmail ="RRHH@max.com.gt";
            } else if (txtName.equals("BAM")) {
            	txtDescription = "Servicios Financieros.";
            	txtAddress ="Segundo nivel D-Mall";
                txtTelephone ="2338-6565";
                txtHorario ="Lun - Jue: 10:00 - 20:00\nVie - Sáb: 10:00 - 21:00\nDom: 10:00 - 19:00";
                txtWebsite ="http://www.bam.com.gt/";
                txtEmail ="bam@bam.com.gt";
            } else {
            	txtDescription = "";
            	txtAddress ="";
                txtTelephone ="";
                txtHorario ="";
                txtWebsite ="";
                txtEmail ="";
            }
            //txtAddress = txtAddress + "\nNew York, NY   34 Maint St New York, NY";
            txtTelephone = "Telefono: " + txtTelephone;
            txtWebsite = "Web: " + txtWebsite;
            txtEmail = "Contacto: " + txtEmail;
    		
            TextView txtDescription1 = (TextView)findViewById(R.id.txtDescription);
    		TextView txtName1 = (TextView)findViewById(R.id.txtName); 
    		TextView txtAddress1 = (TextView)findViewById(R.id.txtAddress); 
    		TextView txtTelephone1 = (TextView)findViewById(R.id.txtTelephone); 
    		TextView txtHorario1 = (TextView)findViewById(R.id.txtHorario); 
    		TextView txtWebsite1 = (TextView)findViewById(R.id.txtWebsite); 
    		TextView txtEmail1 = (TextView)findViewById(R.id.txtEmail); 
    		
    		txtDescription1.setText(txtDescription);
    		txtName1.setText(txtName);
    		txtAddress1.setText(txtAddress);
    		txtTelephone1.setText(txtTelephone);
    		txtHorario1.setText(txtHorario);
    		txtWebsite1.setText(txtWebsite);
    		txtEmail1.setText(txtEmail);
    		
    		//Linkify.addLinks(txtDescription1, Linkify.ALL);
    		//Linkify.addLinks(txtName1, Linkify.ALL);
    		Linkify.addLinks(txtAddress1, Linkify.MAP_ADDRESSES);
    		Linkify.addLinks(txtTelephone1, Linkify.PHONE_NUMBERS);
    		//Linkify.addLinks(txtHorario1, Linkify.ALL);
    		Linkify.addLinks(txtWebsite1, Linkify.WEB_URLS);
    		Linkify.addLinks(txtEmail1, Linkify.EMAIL_ADDRESSES);
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
            getMenuInflater().inflate(R.menu.info_store, menu);                
            return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	Intent i;
        switch (item.getItemId()) {
	        case R.id.action_image:                                
	        	i = new Intent(getApplicationContext(),ImageViewActivity.class);
        		i.putExtra("name", store);
        		startActivity(i);
	        	return true;
	        case R.id.action_list:
	        	i = new Intent(getApplicationContext(),MainActivity.class);
        		i.putExtra("name", store);
        		startActivity(i);
                return true;
	        case R.id.action_favorite:
	        	Toast.makeText(getApplicationContext(), "Favorito", Toast.LENGTH_SHORT).show();
	        	return true;
	        case R.id.action_share:
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);                                        
                intent.putExtra(Intent.EXTRA_TEXT, getResources().getText(R.string.msg_share) + " " + store + "!\n Visitalo en D-Mall.");
                intent.setType("text/plain");
                startActivity(Intent.createChooser(intent, getResources().getText(R.string.action_share)));
	        	return true;
	        default :
               return super.onOptionsItemSelected(item);
        }                
    }
    
    public String getStoreSelected(){
    	return store;
    }

	@Override
	public void onTabReselected(Tab arg0, FragmentTransaction arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTabSelected(Tab arg0, FragmentTransaction arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTabUnselected(Tab arg0, FragmentTransaction arg1) {
		// TODO Auto-generated method stub
		
	}
    
}
