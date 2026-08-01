package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗؔٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16750e implements InterfaceC10597e {
    public C16750e(C2532e c2532e, String str) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c2532e.f6388e;
        Object obj = concurrentHashMap.get(str);
        if (obj == null) {
            C6197e c6197e = new C6197e(new C11639e(str, 1));
            Object putIfAbsent = concurrentHashMap.putIfAbsent(str, c6197e);
            obj = putIfAbsent == null ? c6197e : putIfAbsent;
        }
    }
}
