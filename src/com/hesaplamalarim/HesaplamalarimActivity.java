package com.hesaplamalarim;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import android.widget.Toast;



     
    public class HesaplamalarimActivity extends Activity {
    	
    	 
    	  Double a,b,sonuc;
          String[] dizilerim={"+","-","*","/"};
        String donen_islem;
           Spinner spinler;
           EditText number_first;
           EditText number_second;
           TextView textView;
 private OnClickListener myclickListener=new OnClickListener() {
  			
  			@Override
  			public void onClick(View v) {
  				// TODO Auto-generated method stub
  				  a=Double.parseDouble(number_first.getText().toString());
  				  b=Double.parseDouble(number_second.getText().toString());
  				 if(donen_islem=="+")
  					  {
  					  sonuc=a+b;
  					  textView.setText(Double.toString(sonuc));
  					  }
  				 
  				 else if(donen_islem=="-")
  				 { sonuc=a-b;
  					  textView.setText(Double.toString(sonuc));
  				 }
  					 
  				 else if(donen_islem=="*")
  				 {
  					  sonuc=a*b;
  					  textView.setText(Double.toString(sonuc));
  				 }
  					 
  				 else if(donen_islem=="/")
  				 { sonuc=a/b;
  					  textView.setText(Double.toString(sonuc));
  				 }
  				 else 
  				 { 
  					   textView.setText("Lütfen bir iþlem seciniz!");
  					  
  				  }
  				  
  				
  			}
  		};
             
        /** Called when the activity is first created. */
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.main);
            
            
             number_first=(EditText) findViewById(R.id.editText1); 
              number_second=(EditText) findViewById(R.id.editText2);
             Button buton=(Button) findViewById(R.id.button1);
            buton.setOnClickListener(myclickListener);
          
        textView=(TextView) findViewById(R.id.textView1);
            
           
             Spinner spinler=(Spinner) findViewById(R.id.spinner1); 
             ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                     this, android.R.layout.simple_spinner_item, dizilerim);
             
              
               adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinler.setAdapter(adapter);
                spinler.setOnItemSelectedListener(new myclickim());
                
             
             
        }
        public class myclickim implements OnItemSelectedListener{

        

                @Override
                public void onItemSelected(AdapterView<?> parent, View view,
                        int pos, long id) {
 
                	   
                	   donen_islem=dizilerim[pos];
                    Toast.makeText(parent.getContext(), "Seçtiðin iþlem þu:" +
                              parent.getItemAtPosition(pos).toString(), Toast.LENGTH_LONG).show();

                }

                @Override
                public void onNothingSelected(AdapterView<?> arg0) {
                 
                }
        }
    }

			
        	 

			
        	
            
        

  



