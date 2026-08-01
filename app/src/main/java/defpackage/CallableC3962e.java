package defpackage;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؖٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class CallableC3962e implements Callable {
    public final /* synthetic */ int ad;
    public final /* synthetic */ C18162e vip;

    public /* synthetic */ CallableC3962e(C18162e c18162e, int i) {
        this.ad = i;
        this.vip = c18162e;
    }

    private final Object ad() {
        String byteArrayOutputStream;
        C18162e c18162e = this.vip;
        synchronized (c18162e) {
            try {
                C7551e c7551e = (C7551e) c18162e.ad.get();
                ArrayList metrica = c7551e.metrica();
                c7551e.vip();
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < metrica.size(); i++) {
                    C14984e c14984e = (C14984e) metrica.get(i);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", c14984e.ad);
                    jSONObject.put("dates", new JSONArray((Collection) c14984e.vip));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", "2");
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        base64OutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return byteArrayOutputStream;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.ad) {
            case 0:
                return ad();
            default:
                C18162e c18162e = this.vip;
                synchronized (c18162e) {
                    ((C7551e) c18162e.ad.get()).mopub(System.currentTimeMillis(), ((C1779e) c18162e.metrica.get()).ad());
                }
                return null;
        }
    }
}
