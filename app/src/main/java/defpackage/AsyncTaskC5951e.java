package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.support.v4.media.MediaDescriptionCompat;
import android.util.Log;
import j$.util.Objects;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘْ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class AsyncTaskC5951e extends AsyncTask {
    public final Bitmap ad;
    public final /* synthetic */ DialogC1747e license;
    public int metrica;
    public final Uri vip;

    public AsyncTaskC5951e(DialogC1747e dialogC1747e) {
        this.license = dialogC1747e;
        MediaDescriptionCompat mediaDescriptionCompat = dialogC1747e.f4749e;
        Bitmap bitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.f10e;
        if (bitmap != null && bitmap.isRecycled()) {
            Log.w("MediaRouteCtrlDialog", "Can't fetch the given art bitmap because it's already recycled.");
            bitmap = null;
        }
        this.ad = bitmap;
        MediaDescriptionCompat mediaDescriptionCompat2 = dialogC1747e.f4749e;
        this.vip = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.f18e : null;
    }

    public final BufferedInputStream ad(Uri uri) {
        InputStream openInputStream;
        String lowerCase = uri.getScheme().toLowerCase();
        if ("android.resource".equals(lowerCase) || "content".equals(lowerCase) || "file".equals(lowerCase)) {
            openInputStream = this.license.f4761e.getContentResolver().openInputStream(uri);
        } else {
            URLConnection openConnection = new URL(uri.toString()).openConnection();
            openConnection.setConnectTimeout(30000);
            openConnection.setReadTimeout(30000);
            openInputStream = openConnection.getInputStream();
        }
        if (openInputStream == null) {
            return null;
        }
        return new BufferedInputStream(openInputStream);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        if (r5 != null) goto L11;
     */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x002f: MOVE (r3 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:60:0x002f */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f5  */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doInBackground(java.lang.Object[] r10) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AsyncTaskC5951e.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        DialogC1747e dialogC1747e = this.license;
        dialogC1747e.f4756e = null;
        Bitmap bitmap2 = dialogC1747e.f4764e;
        Bitmap bitmap3 = this.ad;
        boolean equals = Objects.equals(bitmap2, bitmap3);
        Uri uri = this.vip;
        if (equals && Objects.equals(dialogC1747e.f4759e, uri)) {
            return;
        }
        dialogC1747e.f4764e = bitmap3;
        dialogC1747e.f4777e = bitmap;
        dialogC1747e.f4759e = uri;
        dialogC1747e.f4780e = this.metrica;
        dialogC1747e.f4783e = true;
        dialogC1747e.loadAd();
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        DialogC1747e dialogC1747e = this.license;
        dialogC1747e.f4783e = false;
        dialogC1747e.f4777e = null;
        dialogC1747e.f4780e = 0;
    }
}
