package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eؑؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0029e {
    public static final C3341e Companion = new Object();
    public final long ad;
    public final boolean appmetrica;
    public final C5471e license;
    public final boolean metrica;
    public final long vip;

    public /* synthetic */ C0029e(int i, long j, long j2, boolean z, C5471e c5471e, boolean z2) {
        if (3 != (i & 3)) {
            AbstractC5756e.billing(i, 3, C12114e.ad.appmetrica());
            throw null;
        }
        this.ad = j;
        this.vip = j2;
        if ((i & 4) == 0) {
            this.metrica = false;
        } else {
            this.metrica = z;
        }
        if ((i & 8) == 0) {
            this.license = null;
        } else {
            this.license = c5471e;
        }
        if ((i & 16) == 0) {
            this.appmetrica = false;
        } else {
            this.appmetrica = z2;
        }
    }
}
