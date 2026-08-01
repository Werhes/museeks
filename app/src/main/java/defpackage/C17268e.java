package defpackage;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗۛۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17268e {
    public static volatile C17268e ad;
    public static final C17268e vip;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eٗۛۤ] */
    static {
        ?? obj = new Object();
        Map map = Collections.EMPTY_MAP;
        vip = obj;
    }

    public static C17268e ad() {
        C17268e c17268e = ad;
        if (c17268e != null) {
            return c17268e;
        }
        synchronized (C17268e.class) {
            try {
                C17268e c17268e2 = ad;
                if (c17268e2 != null) {
                    return c17268e2;
                }
                int i = AbstractC3433e.ad;
                C17268e adcel = AbstractC0903e.adcel();
                ad = adcel;
                return adcel;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
