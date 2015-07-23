package dk.hypesystem.shownotifications;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SetupActivity extends Activity {
    private ProgressDialog registeringDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setup_activity);

        final EditText senderIdField = (EditText) findViewById(R.id.sender_id_field);
        final Button submitButton = (Button) findViewById(R.id.submit_sender_id);
        submitButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String senderId = senderIdField.getText().toString();
                showLoadingModal();
                String registrationId = getRegistrationId(senderId);
                hideLoadingModal();
                goToOverview(registrationId);
            }
        });
    }

    private void showLoadingModal() {
        registeringDialog = ProgressDialog.show(SetupActivity.this, "", "Getting a Registration ID", true);
    }

    private String getRegistrationId(String senderId) {
        return "";
    }

    private void hideLoadingModal() {
        registeringDialog.hide();
    }

    private void goToOverview(String registrationId) {
        Intent goToOverviewIntent = new Intent(this, OverviewActivity.class);
        goToOverviewIntent.putExtra(OverviewActivity.REGISTRATION_ID_EXTRA, registrationId);
        startActivity(goToOverviewIntent);
    }
}
