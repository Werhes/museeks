package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؔ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11498e {
    public static final AtomicIntegerFieldUpdater vip = AtomicIntegerFieldUpdater.newUpdater(C11498e.class, "ad");
    public volatile int ad;

    public final int ad() {
        return vip.decrementAndGet(this);
    }

    public final String toString() {
        return String.valueOf(this.ad);
    }
}
