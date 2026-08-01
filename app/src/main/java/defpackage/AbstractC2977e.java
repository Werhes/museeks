package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔۥؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC2977e {
    public static /* synthetic */ boolean ad(Unsafe unsafe, AbstractC13307e abstractC13307e, long j, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(abstractC13307e, j, obj, obj2)) {
            if (unsafe.getObject(abstractC13307e, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
