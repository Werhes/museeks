package defpackage;

import android.util.Log;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۡؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0620e {
    public final int metrica;
    public final HashMap ad = new HashMap();
    public final int vip = 64;

    public C0620e(int i) {
        this.metrica = i;
    }

    public static String vip(int i, String str) {
        if (str != null) {
            str = str.trim();
            if (str.length() > i) {
                return str.substring(0, i);
            }
        }
        return str;
    }

    public final synchronized Map ad() {
        return DesugarCollections.unmodifiableMap(new HashMap(this.ad));
    }

    public final synchronized void license(Map map) {
        try {
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw new IllegalArgumentException("Custom attribute key must not be null.");
                }
                String vip = vip(this.metrica, str);
                if (this.ad.size() >= this.vip && !this.ad.containsKey(vip)) {
                    i++;
                }
                String str2 = (String) entry.getValue();
                this.ad.put(vip, str2 == null ? BuildConfig.FLAVOR : vip(this.metrica, str2));
            }
            if (i > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i + " entries when adding custom keys. Maximum allowable: " + this.vip, null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean metrica(String str) {
        String vip = vip(this.metrica, "com.crashlytics.version-control-info");
        if (this.ad.size() >= this.vip && !this.ad.containsKey(vip)) {
            Log.w("FirebaseCrashlytics", "Ignored entry \"com.crashlytics.version-control-info\" when adding custom keys. Maximum allowable: " + this.vip, null);
            return false;
        }
        String vip2 = vip(this.metrica, str);
        String str2 = (String) this.ad.get(vip);
        if (str2 == null ? vip2 == null : str2.equals(vip2)) {
            return false;
        }
        this.ad.put(vip, vip2);
        return true;
    }
}
