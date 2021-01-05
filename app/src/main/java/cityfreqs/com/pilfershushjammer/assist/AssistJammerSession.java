package cityfreqs.com.pilfershushjammer.assist;

import android.app.assist.AssistContent;
import android.app.assist.AssistStructure;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.service.voice.VoiceInteractionSession;
import android.widget.Toast;

import androidx.annotation.RequiresApi;

public class AssistJammerSession extends VoiceInteractionSession {

    // taken from: https://github.com/commonsguy/cw-omnibus/tree/master/Assist/TapOffNow

    public AssistJammerSession(Context context) {
        super(context);
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onHandleAssist(Bundle data, AssistStructure structure, AssistContent content) {
        super.onHandleAssist(data, structure, content);

        Toast.makeText(getContext(),
                "AssistJammer blocked the Assistant",
                Toast.LENGTH_SHORT)
                .show();
    }
}
