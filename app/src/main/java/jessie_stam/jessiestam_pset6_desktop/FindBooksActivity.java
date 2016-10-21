package jessie_stam.jessiestam_pset6_desktop;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

/**
 * Created by Jessie on 15-10-2016.
 */

public class FindBooksActivity extends EmailPasswordActivity {

    CheckBox check_title;
    CheckBox check_isbn;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_findbooks);

        check_title = (CheckBox) findViewById(R.id.check_title);
        check_isbn = (CheckBox) findViewById(R.id.check_isbn);


    }

    public void changeCheckBox(View view) {

        if (view == check_title) {
            check_title.setChecked(true);
            check_isbn.setChecked(false);
        }
        else {
            check_title.setChecked(false);
            check_isbn.setChecked(true);
        }

    }
}
