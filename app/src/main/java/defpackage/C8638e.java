package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌِٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8638e implements InterfaceC5632e {
    public static volatile C8638e metrica;
    public final AppMeasurementSdk ad;
    public final ConcurrentHashMap vip;

    public C8638e(AppMeasurementSdk appMeasurementSdk) {
        AbstractC9528e.startapp(appMeasurementSdk);
        this.ad = appMeasurementSdk;
        this.vip = new ConcurrentHashMap();
    }

    public final void ad(String str, String str2, Bundle bundle) {
        if (AbstractC10945e.metrica.contains(str) || AbstractC10945e.vip.contains(str2)) {
            return;
        }
        C1410e c1410e = AbstractC10945e.license;
        int i = c1410e.f4224e;
        int i2 = 0;
        int i3 = 0;
        while (i3 < i) {
            boolean containsKey = bundle.containsKey((String) c1410e.get(i3));
            i3++;
            if (containsKey) {
                return;
            }
        }
        if ("_cmp".equals(str2)) {
            if (AbstractC10945e.metrica.contains(str)) {
                return;
            }
            C1410e c1410e2 = AbstractC10945e.license;
            int i4 = c1410e2.f4224e;
            while (i2 < i4) {
                boolean containsKey2 = bundle.containsKey((String) c1410e2.get(i2));
                i2++;
                if (containsKey2) {
                    return;
                }
            }
            int hashCode = str.hashCode();
            if (hashCode != 101200) {
                if (hashCode != 101230) {
                    if (hashCode != 3142703 || !str.equals("fiam")) {
                        return;
                    } else {
                        bundle.putString("_cis", "fiam_integration");
                    }
                } else if (!str.equals("fdl")) {
                    return;
                } else {
                    bundle.putString("_cis", "fdl_integration");
                }
            } else if (!str.equals("fcm")) {
                return;
            } else {
                bundle.putString("_cis", "fcm_integration");
            }
        }
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle.putLong("_r", 1L);
        }
        this.ad.logEvent(str, str2, bundle);
    }

    public final C15802e vip(String str, C16911e c16911e) {
        if (!AbstractC10945e.metrica.contains(str)) {
            boolean isEmpty = str.isEmpty();
            ConcurrentHashMap concurrentHashMap = this.vip;
            if (isEmpty || !concurrentHashMap.containsKey(str) || concurrentHashMap.get(str) == null) {
                boolean equals = "fiam".equals(str);
                AppMeasurementSdk appMeasurementSdk = this.ad;
                InterfaceC17847e c17659e = equals ? new C17659e(appMeasurementSdk, c16911e) : "clx".equals(str) ? new C8167e(appMeasurementSdk, c16911e) : null;
                if (c17659e != null) {
                    concurrentHashMap.put(str, c17659e);
                    return new C15802e(22);
                }
            }
        }
        return null;
    }
}
