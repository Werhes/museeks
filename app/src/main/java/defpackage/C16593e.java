package defpackage;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٖۣ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16593e {
    public static volatile C16593e ad;
    public static final C16593e vip;

    /* JADX WARN: Type inference failed for: r0v0, types: [eؙٖۣ, java.lang.Object] */
    static {
        ?? obj = new Object();
        Map map = Collections.EMPTY_MAP;
        vip = obj;
    }

    public static C16593e ad() {
        C16593e c16593e;
        C5623e c5623e = C5623e.metrica;
        C16593e c16593e2 = ad;
        if (c16593e2 != null) {
            return c16593e2;
        }
        synchronized (C16593e.class) {
            try {
                c16593e = ad;
                if (c16593e == null) {
                    Class cls = AbstractC15191e.ad;
                    C16593e c16593e3 = null;
                    if (cls != null) {
                        try {
                            c16593e3 = (C16593e) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    c16593e = c16593e3 != null ? c16593e3 : vip;
                    ad = c16593e;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c16593e;
    }
}
