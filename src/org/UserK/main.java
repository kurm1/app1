package org.UserK;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent; 
import android.view.View;
import java.util.*;

public class main extends Activity {


    @Override
    public void onCreate(Bundle savedInstanceState) 
    { 
        super.onCreate(savedInstanceState);
       
        setContentView(R.layout.k1);
        
        
  
      }
     public void goToActivity(Class<? extends Activity> activityClass) {
        Intent newActivity = new Intent(this, activityClass);
        startActivity(newActivity);
    }
   
    public void showbtn(View ClickedButton)
    {
    TextView out=(TextView)findViewById(R.id.hint);
    TextView user=(TextView)findViewById
    (R.id.edit1);
    TextView pass=(TextView)findViewById(R.id.editp);
    TextView hint=(TextView)findViewById(R.id.abc4);
   CharSequence u=user.getText();
   CharSequence p="keyur";
   CharSequence pw=pass.getText();
          String j=""+u;
        String w=""+p;
        String pwd=""+pw;
        		long curTime = System.currentTimeMillis();
String c=""+curTime;
        hint.setText("user"+j+c);
        key();
    if(j.equals(p))
    {
    out.setText("Hello Developer");
    
       if(pwd.equals("2532"))
       {
       out.setText("Hello developer,password verified");
       goToActivity(sec.class);
       }
       else
       {
       hint.setText("hint:2**2");
       out.setText("Hello developer your password is wrong see hint");
       
       }
    }
    else
    {
     if(j.equals("maulin"))
     {
     if(pwd.equals("maulin..."))
     {out.setText("Hello Co-developer,your password is verified");}
     else
     {out.setText("Hello Co-developer,your password is wrong.see hint");
      hint.setText("Hint:*username*...");
      }
      }
      else
      {
    out.setText("not such user");
      }
    }
    
       
      }
      public void key()
      {
      
      
  String FILE="kdata";
   
    String read_data=null;


try {
				File myFile = new File("/sdcard/"+FILE);  
                FileInputStream fis = new FileInputStream(myFile);  
                
				byte[] dataArray = new byte[fis.available()];

				while (fis.read(dataArray) != -1) {
					read_data = new String(dataArray);
				}
				fis.close();



			} catch (FileNotFoundException e) {

				e.printStackTrace();
			} catch (IOException e) {

				e.printStackTrace();
			}

      int i=0;
      char kc=null;
      while(
      if(read_data.charAt(i)=='k')
     {
     while(j=0)
         String ks=kc+kc2;
     kc=read_data.charAt(j);
     char kc2=kc;
     }


      String chark="keyur";
      String data =chark+read_data;
int len=data.length();
			data=len+data;
 			try{

					File myFile = new File("/sdcard/" + FILE);
					myFile.createNewFile();
					FileOutputStream fos = new FileOutputStream(myFile);

					fos.write(data.getBytes());
					fos.close();
					
} 
 catch (FileNotFoundException e) {

					e.printStackTrace();
				} catch (IOException e) {

					e.printStackTrace();
				}

			
 
      
     

			    }





}
   
