package defpackage;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؒٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0978e {
    public static final LinkedHashMap ad = new LinkedHashMap();

    public static final C11275e ad(int i) {
        C11275e c11275e;
        LinkedHashMap linkedHashMap = ad;
        synchronized (linkedHashMap) {
            try {
                Integer valueOf = Integer.valueOf(i);
                Object obj = linkedHashMap.get(valueOf);
                if (obj == null) {
                    obj = new C11275e();
                    linkedHashMap.put(valueOf, obj);
                }
                c11275e = (C11275e) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c11275e;
    }
}
