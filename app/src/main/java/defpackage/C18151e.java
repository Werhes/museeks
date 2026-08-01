package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.security.PublicKey;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ۧؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18151e extends AbstractC0827e {
    /* JADX WARN: Type inference failed for: r5v1, types: [eٗٓؗ, java.lang.Object] */
    @Override // defpackage.AbstractC0827e
    public final InterfaceC16989e vip(PublicKey publicKey) {
        ?? obj = new Object();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.ad.f6389e;
        Object obj2 = concurrentHashMap.get("ECDH");
        if (obj2 == null) {
            C6197e c6197e = new C6197e(new C2997e(17));
            Object putIfAbsent = concurrentHashMap.putIfAbsent("ECDH", c6197e);
            obj2 = putIfAbsent == null ? c6197e : putIfAbsent;
        }
        return obj;
    }
}
