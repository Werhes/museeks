package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.util.Log;
import androidx.mediarouter.app.license;
import j$.util.Objects;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٜؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class AsyncTaskC4228e extends AsyncTask {
    public final Bitmap ad;
    public final /* synthetic */ license appmetrica;
    public long license;
    public int metrica;
    public final Uri vip;

    public AsyncTaskC4228e(license licenseVar) {
        this.appmetrica = licenseVar;
        MediaDescriptionCompat mediaDescriptionCompat = licenseVar.f490e;
        Bitmap bitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.f10e;
        if (bitmap != null && bitmap.isRecycled()) {
            Log.w("MediaRouteCtrlDialog", "Can't fetch the given art bitmap because it's already recycled.");
            bitmap = null;
        }
        this.ad = bitmap;
        MediaDescriptionCompat mediaDescriptionCompat2 = licenseVar.f490e;
        this.vip = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.f18e : null;
    }

    public final BufferedInputStream ad(Uri uri) {
        InputStream openInputStream;
        String lowerCase = uri.getScheme().toLowerCase();
        if ("android.resource".equals(lowerCase) || "content".equals(lowerCase) || "file".equals(lowerCase)) {
            openInputStream = this.appmetrica.f506e.getContentResolver().openInputStream(uri);
        } else {
            URLConnection openConnection = new URL(uri.toString()).openConnection();
            int i = license.f473e;
            openConnection.setConnectTimeout(i);
            openConnection.setReadTimeout(i);
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
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f0  */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doInBackground(java.lang.Object[] r11) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AsyncTaskC4228e.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        license licenseVar = this.appmetrica;
        licenseVar.f527e = null;
        Bitmap bitmap2 = licenseVar.f534e;
        Bitmap bitmap3 = this.ad;
        boolean equals = Objects.equals(bitmap2, bitmap3);
        Uri uri = this.vip;
        if (equals && Objects.equals(licenseVar.f525e, uri)) {
            return;
        }
        licenseVar.f534e = bitmap3;
        licenseVar.f518e = bitmap;
        licenseVar.f525e = uri;
        licenseVar.f505e = this.metrica;
        licenseVar.f519e = true;
        licenseVar.pro(SystemClock.uptimeMillis() - this.license > 120);
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        this.license = SystemClock.uptimeMillis();
        license licenseVar = this.appmetrica;
        licenseVar.f519e = false;
        licenseVar.f518e = null;
        licenseVar.f505e = 0;
    }
}
