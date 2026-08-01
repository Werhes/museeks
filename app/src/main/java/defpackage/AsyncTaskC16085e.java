package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.util.SparseArray;
import androidx.mediarouter.app.MediaRouteButton;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٖ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class AsyncTaskC16085e extends AsyncTask {
    public final int ad;
    public final /* synthetic */ MediaRouteButton metrica;
    public final Context vip;

    public AsyncTaskC16085e(MediaRouteButton mediaRouteButton, int i, Context context) {
        this.metrica = mediaRouteButton;
        this.ad = i;
        this.vip = context;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        SparseArray sparseArray = MediaRouteButton.f439e;
        int i = this.ad;
        if (((Drawable.ConstantState) sparseArray.get(i)) == null) {
            return AbstractC4628e.purchase(this.vip, i);
        }
        return null;
    }

    @Override // android.os.AsyncTask
    public final void onCancelled(Object obj) {
        Drawable drawable = (Drawable) obj;
        if (drawable != null) {
            MediaRouteButton.f439e.put(this.ad, drawable.getConstantState());
        }
        this.metrica.f453e = null;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Drawable drawable = (Drawable) obj;
        int i = this.ad;
        MediaRouteButton mediaRouteButton = this.metrica;
        if (drawable != null) {
            MediaRouteButton.f439e.put(i, drawable.getConstantState());
            mediaRouteButton.f453e = null;
        } else {
            Drawable.ConstantState constantState = (Drawable.ConstantState) MediaRouteButton.f439e.get(i);
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            mediaRouteButton.f453e = null;
        }
        mediaRouteButton.setRemoteIndicatorDrawableInternal(drawable);
    }
}
