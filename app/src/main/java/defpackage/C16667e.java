package defpackage;

import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۧ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16667e extends Thread {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f32684e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f32685e = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16667e(AbstractC3881e abstractC3881e) {
        super("ExoPlayer:SimpleDecoder");
        this.f32684e = abstractC3881e;
    }

    public C16667e(HashMap hashMap) {
        this.f32684e = hashMap;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (this.f32685e) {
            case 0:
                do {
                    try {
                    } catch (InterruptedException e) {
                        throw new IllegalStateException(e);
                    }
                } while (((AbstractC3881e) this.f32684e).adcel());
                return;
            default:
                HashMap hashMap = (HashMap) this.f32684e;
                Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
                for (String str : hashMap.keySet()) {
                    buildUpon.appendQueryParameter(str, (String) hashMap.get(str));
                }
                String uri = buildUpon.build().toString();
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
                    try {
                        int responseCode = httpURLConnection.getResponseCode();
                        if (responseCode < 200 || responseCode >= 300) {
                            StringBuilder sb = new StringBuilder(String.valueOf(uri).length() + 65);
                            sb.append("Received non-success response code ");
                            sb.append(responseCode);
                            sb.append(" from pinging URL: ");
                            sb.append(uri);
                            Log.w("HttpUrlPinger", sb.toString());
                        }
                        httpURLConnection.disconnect();
                        return;
                    } catch (Throwable th) {
                        httpURLConnection.disconnect();
                        throw th;
                    }
                } catch (IOException e2) {
                    e = e2;
                    String message = e.getMessage();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + String.valueOf(uri).length() + 27);
                    sb2.append("Error while pinging URL: ");
                    sb2.append(uri);
                    sb2.append(". ");
                    sb2.append(message);
                    Log.w("HttpUrlPinger", sb2.toString(), e);
                    return;
                } catch (IndexOutOfBoundsException e3) {
                    String message2 = e3.getMessage();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(message2).length() + String.valueOf(uri).length() + 32);
                    sb3.append("Error while parsing ping URL: ");
                    sb3.append(uri);
                    sb3.append(". ");
                    sb3.append(message2);
                    Log.w("HttpUrlPinger", sb3.toString(), e3);
                    return;
                } catch (RuntimeException e4) {
                    e = e4;
                    String message3 = e.getMessage();
                    StringBuilder sb22 = new StringBuilder(String.valueOf(message3).length() + String.valueOf(uri).length() + 27);
                    sb22.append("Error while pinging URL: ");
                    sb22.append(uri);
                    sb22.append(". ");
                    sb22.append(message3);
                    Log.w("HttpUrlPinger", sb22.toString(), e);
                    return;
                } finally {
                }
        }
    }
}
