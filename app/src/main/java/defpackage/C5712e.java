package defpackage;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٖٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5712e {
    public static volatile C5712e ad;
    public static final C5712e vip;

    /* JADX WARN: Type inference failed for: r0v0, types: [eؘٖٙ, java.lang.Object] */
    static {
        ?? obj = new Object();
        Map map = Collections.EMPTY_MAP;
        vip = obj;
    }

    public static C5712e ad() {
        C5712e c5712e;
        C10051e c10051e = C10051e.metrica;
        C5712e c5712e2 = ad;
        if (c5712e2 != null) {
            return c5712e2;
        }
        synchronized (C5712e.class) {
            try {
                c5712e = ad;
                if (c5712e == null) {
                    Class cls = AbstractC2510e.ad;
                    C5712e c5712e3 = null;
                    if (cls != null) {
                        try {
                            c5712e3 = (C5712e) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    c5712e = c5712e3 != null ? c5712e3 : vip;
                    ad = c5712e;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c5712e;
    }
}
