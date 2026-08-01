package defpackage;

import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٖٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC16127e {
    public static final C7936e ad;

    static {
        int i = AbstractC18186e.ad;
        int i2 = C1724e.ad;
        ad = new C7936e(2);
    }

    public static long ad(C0829e c0829e) {
        C14267e c14267e = c0829e.f3214e;
        if (c14267e != null) {
            long longValue = c14267e.f28203e.longValue();
            return (c0829e.f3220e == null || c0829e.Signature() >= longValue) ? longValue : c0829e.Signature();
        }
        if (c0829e.f3220e != null) {
            return c0829e.Signature();
        }
        return -1L;
    }

    public static boolean vip(C0829e c0829e) {
        long ad2 = ad(c0829e);
        if (ad2 == -1) {
            EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
            ad.getClass();
            int i = C1724e.ad;
            return false;
        }
        Iterator it = c0829e.f3218e.iterator();
        boolean z = false;
        while (true) {
            if (it.hasNext()) {
                C15116e c15116e = (C15116e) it.next();
                if (z) {
                    String str = c15116e.ad;
                    HashMap hashMap = EnumC2113e.f5461e;
                    if (!str.equals("id3 ") && !str.equals("LIST") && !str.equals("INFO")) {
                        break;
                    }
                } else if (c15116e.vip == ad2) {
                    z = true;
                }
            } else if (z) {
                return true;
            }
        }
        return false;
    }
}
