package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؗۨ */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC4863e {
    public static /* synthetic */ boolean ad(Unsafe unsafe, AbstractC13307e abstractC13307e, long j, C9503e c9503e, C9503e c9503e2) {
        while (!unsafe.compareAndSwapObject(abstractC13307e, j, c9503e, c9503e2)) {
            if (unsafe.getObject(abstractC13307e, j) != c9503e) {
                return false;
            }
        }
        return true;
    }
}
