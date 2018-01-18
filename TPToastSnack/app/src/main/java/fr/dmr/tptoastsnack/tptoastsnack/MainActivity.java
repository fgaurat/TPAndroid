package fr.dmr.tptoastsnack.tptoastsnack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.support.design.widget.Snackbar;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void clickToast(View view){
        Toast.makeText(this,"Un Toast",Toast.LENGTH_SHORT).show();

    }

    public void clickSnack(View view){
        Snackbar.make(view,"Snack !",Snackbar.LENGTH_SHORT).show();
    }


}
