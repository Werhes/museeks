package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۙؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7411e {
    public final long ad;
    public final int appmetrica;
    public final AtomicInteger license;
    public long metrica;
    public long vip;

    public C7411e(C5401e c5401e) {
        this.appmetrica = c5401e.f11581e;
        long currentTimeMillis = System.currentTimeMillis();
        this.ad = currentTimeMillis;
        this.vip = currentTimeMillis;
        this.license = new AtomicInteger(1);
    }
}
