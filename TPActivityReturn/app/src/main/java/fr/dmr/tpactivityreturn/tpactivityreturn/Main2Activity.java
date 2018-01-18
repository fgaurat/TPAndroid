package fr.dmr.tpactivityreturn.tpactivityreturn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class Main2Activity extends AppCompatActivity {

    EditText txtValue;
    private final static  int RESULT_CODE=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txtValue = findViewById(R.id.txtValue);

    }

    public void clickQuitter(View v){
        String s = txtValue.getText().toString();

        Intent i = new Intent();
        i.putExtra("TXT_VALUE",s);
        setResult(RESULT_OK,i);

        finish();
    }

}
