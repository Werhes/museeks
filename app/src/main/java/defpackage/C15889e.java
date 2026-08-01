package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؐؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15889e {
    public final long ad;
    public final boolean metrica;
    public final long vip;

    public C15889e(long j, long j2, boolean z) {
        this.ad = j;
        this.vip = j2;
        this.metrica = z;
    }

    public final C15889e ad(C15889e c15889e) {
        return new C15889e(C2152e.startapp(this.ad, c15889e.ad), Math.max(this.vip, c15889e.vip), this.metrica || c15889e.metrica);
    }
}
