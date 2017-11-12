package com.sanruza.alpak.liftquote;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

// Fix Arrows and remove the upper button.

public class MainActivity extends AppCompatActivity {

    int Position = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        //INITIALIZERS

        final View view = (View) findViewById(R.id.Rlayout);
        final RelativeLayout RelLayout = (RelativeLayout) findViewById(R.id.Rlayout);

        final TextView txt = (TextView) findViewById(R.id.textView);

        final Button deepBtn = (Button) findViewById(R.id.dButton);
        final Button iBtn = (Button) findViewById(R.id.iButton);
        /**
        ImageView rightArrow = (ImageView) findViewById(R.id.arrowRight);
        ImageView leftArrow = (ImageView) findViewById(R.id.arrowLeft);

        //ONCLICKS

        rightArrow.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Position++;
                if(Position == 3){
                    Position = 1;
                }

                if(Position==1){
                    deepBtn.setText("PHILOSOPHICAL");
                } else if (Position == 2) {
                    deepBtn.setText("INSPIRATIONAL");
                }

            }
        });

        leftArrow.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Position--;
                if(Position == 0){
                    Position = 2;
                }
                    if(Position== 1){
                        deepBtn.setText("PHILOSOPHICAL");
                    } else if (Position == 2) {
                        deepBtn.setText("INSPIRATIONAL");
                    }
            }
        });
        **/

        deepBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int x = Quotes.rndGen(85,50);
                String dIndex = "s"+x;
                String Rindex = getString(getApplicationContext().getResources().getIdentifier(dIndex, "string", getPackageName()));
                txt.setText(Rindex);
                // changeBackgroundColor();
                int xC = Quotes.rndGen(6,1);
                switch(xC){
                    case 1:     view.setBackgroundColor(getResources().getColor(R.color.c1));       break;
                    case 2:     view.setBackgroundColor(getResources().getColor(R.color.c2));       break;
                    case 3:     view.setBackgroundColor(getResources().getColor(R.color.c3));       break;
                    case 4:     view.setBackgroundColor(getResources().getColor(R.color.c4));       break;
                    case 5:     view.setBackgroundColor(getResources().getColor(R.color.c5));       break;
                } //end switch
            }
        });

        iBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int x = Quotes.rndGen(35,1);
                String dIndex = "s"+x;
                String Rindex = getString(getApplicationContext().getResources().getIdentifier(dIndex, "string", getPackageName()));
                txt.setText(Rindex);
                // changeBackgroundColor();
                int xC = Quotes.rndGen(6,1);
                switch(xC){
                    case 1:     view.setBackgroundColor(getResources().getColor(R.color.c1));       break;
                    case 2:     view.setBackgroundColor(getResources().getColor(R.color.c2));       break;
                    case 3:     view.setBackgroundColor(getResources().getColor(R.color.c3));       break;
                    case 4:     view.setBackgroundColor(getResources().getColor(R.color.c4));       break;
                    case 5:     view.setBackgroundColor(getResources().getColor(R.color.c5));       break;
                } //end switch
            }
        });





    }

}
