/**
 * 2016-11-16
 * 어플의 로딩 엑티비티
 * @author jk
 * @version 1.0
 */

package pineapple.iq_quest;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class LoadingActivity extends Activity {
    @Override
    public void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        try{
            //Wait 2 seconds.
            Thread.sleep(2000);

        }

        catch(InterruptedException e){
            e.printStackTrace();
        }
            //Go to main activity
        startActivity(new Intent(this,MainMenuActivity.class));
        finish();
    }
}
