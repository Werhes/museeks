package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eّٗۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16971e {
    public static final C0030e Companion = new Object();
    public final long ad;
    public final long metrica;
    public final long vip;

    public /* synthetic */ C16971e(int i, long j, long j2, long j3) {
        if (1 != (i & 1)) {
            AbstractC5756e.billing(i, 1, C2990e.ad.appmetrica());
            throw null;
        }
        this.ad = j;
        this.vip = (i & 2) == 0 ? 1000 * j : j2;
        if ((i & 4) == 0) {
            this.metrica = j / 1000;
        } else {
            this.metrica = j3;
        }
    }

    public C16971e(long j) {
        this.ad = j;
        long j2 = 1000;
        this.vip = j * j2;
        this.metrica = j / j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16971e) && this.ad == ((C16971e) obj).ad;
    }

    public final int hashCode() {
        long j = this.ad;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return AbstractC10257e.mopub(new StringBuilder("Time(ms="), this.ad, ')');
    }
}
