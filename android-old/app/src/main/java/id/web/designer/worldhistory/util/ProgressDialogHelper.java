package id.web.designer.worldhistory.util;

import android.app.ProgressDialog;
import android.content.Context;
import android.view.View;

/**
 * Created by dragank on 2/25/2016.
 */
public class ProgressDialogHelper {
    private static ProgressDialog progress;

    public static void dismissProgress() {
        if (progress != null) {
            progress.dismiss();
            progress.cancel();
            progress = null;
        }
    }

    public static void showProgress(Context mContext) {
        if (progress != null) {
            return;
        }
        progress = new ProgressDialog(mContext);
        progress.setView(View.inflate(mContext, id.web.designer.worldhistory.R.layout.progress_bar_layout, null));
        progress.setMessage(mContext.getResources().getString(id.web.designer.worldhistory.R.string.loading));
        progress.show();
    }
}
