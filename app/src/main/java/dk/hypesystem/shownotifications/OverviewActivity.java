package dk.hypesystem.shownotifications;
import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class OverviewActivity extends Activity {
    public final static String REGISTRATION_ID_EXTRA = "dk.hypesystem.shownotifications.overview.registrationid";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.overview_activity);
    }
}
