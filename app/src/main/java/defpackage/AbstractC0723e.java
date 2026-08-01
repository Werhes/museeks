package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۧٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC0723e {
    public static /* synthetic */ boolean ad(Unsafe unsafe, AbstractC0586e abstractC0586e, long j, C17100e c17100e, C17100e c17100e2) {
        while (!unsafe.compareAndSwapObject(abstractC0586e, j, c17100e, c17100e2)) {
            if (unsafe.getObject(abstractC0586e, j) != c17100e) {
                return false;
            }
        }
        return true;
    }
}
