package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍُؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2469e implements Closeable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public C0560e f6311e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public volatile Future f6312e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final URL f6313e;

    public C2469e(URL url) {
        this.f6313e = url;
    }

    public final Bitmap ad() {
        boolean isLoggable = Log.isLoggable("FirebaseMessaging", 4);
        URL url = this.f6313e;
        if (isLoggable) {
            Log.i("FirebaseMessaging", "Starting download of: " + url);
        }
        URLConnection openConnection = url.openConnection();
        if (openConnection.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = openConnection.getInputStream();
        try {
            byte[] yandex = AbstractC10115e.yandex(new C2527e(inputStream, 0));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                Log.v("FirebaseMessaging", "Downloaded " + yandex.length + " bytes from " + url);
            }
            if (yandex.length > 1048576) {
                throw new IOException("Image exceeds max size of 1048576");
            }
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(yandex, 0, yandex.length);
            if (decodeByteArray == null) {
                throw new IOException("Failed to decode image: " + url);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Successfully downloaded image: " + url);
            }
            return decodeByteArray;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f6312e.cancel(true);
    }
}
