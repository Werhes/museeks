package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔٙٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2673e {
    public static final AtomicIntegerFieldUpdater vip = AtomicIntegerFieldUpdater.newUpdater(C2673e.class, "ad");
    public volatile int ad;

    public final boolean ad() {
        return vip.compareAndSet(this, 0, 1);
    }

    public final String toString() {
        return String.valueOf(vip());
    }

    public final boolean vip() {
        return this.ad != 0;
    }
}
