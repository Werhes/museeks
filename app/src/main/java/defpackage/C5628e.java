package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٜٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5628e {
    public static final /* synthetic */ AtomicReferenceFieldUpdater ad = AtomicReferenceFieldUpdater.newUpdater(C5628e.class, Object.class, "current");
    private volatile /* synthetic */ Object current = C9139e.f18290e;

    public final Object ad(C1293e c1293e, C2163e c2163e) {
        while (true) {
            Map map = (Map) this.current;
            Object obj = map.get(c1293e);
            if (obj != null) {
                return obj;
            }
            HashMap hashMap = new HashMap(map);
            C7954e c7954e = new C7954e();
            hashMap.put(c1293e, c7954e);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ad;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, map, hashMap)) {
                if (atomicReferenceFieldUpdater.get(this) != map) {
                    break;
                }
            }
            return c7954e;
        }
    }

    public final Object vip(C1293e c1293e) {
        return ((Map) this.current).get(c1293e);
    }
}
