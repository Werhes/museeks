package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘْۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13093e {
    public static final long license = TimeUnit.DAYS.toMillis(7);
    public final String ad;
    public final long metrica;
    public final String vip;

    public C13093e(long j, String str, String str2) {
        this.ad = str;
        this.vip = str2;
        this.metrica = j;
    }

    public static String ad(long j, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j);
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.w("FirebaseMessaging", "Failed to encode token: " + e);
            return null;
        }
    }

    public static C13093e vip(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new C13093e(0L, str, null);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new C13093e(jSONObject.getLong("timestamp"), jSONObject.getString("token"), jSONObject.getString("appVersion"));
        } catch (JSONException e) {
            Log.w("FirebaseMessaging", "Failed to parse token: " + e);
            return null;
        }
    }
}
