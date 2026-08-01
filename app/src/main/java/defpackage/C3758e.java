package defpackage;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕۦَ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3758e {
    public static volatile C3758e ad;
    public static final C3758e vip;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eؕۦَ] */
    static {
        ?? obj = new Object();
        Map map = Collections.EMPTY_MAP;
        vip = obj;
    }

    public static C3758e ad() {
        C3758e c3758e;
        Class cls = AbstractC2037e.ad;
        C3758e c3758e2 = ad;
        if (c3758e2 != null) {
            return c3758e2;
        }
        synchronized (C3758e.class) {
            try {
                c3758e = ad;
                if (c3758e == null) {
                    Class cls2 = AbstractC12482e.ad;
                    C3758e c3758e3 = null;
                    if (cls2 != null) {
                        try {
                            c3758e3 = (C3758e) cls2.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    c3758e = c3758e3 != null ? c3758e3 : vip;
                    ad = c3758e;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3758e;
    }
}
