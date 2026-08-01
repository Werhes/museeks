package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eٟؓؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1591e {
    public static final C12933e Companion = new Object();
    public final int ad;
    public final int metrica;
    public final long vip;

    public /* synthetic */ C1591e(int i, int i2, int i3, long j) {
        if (7 != (i & 7)) {
            AbstractC5756e.billing(i, 7, C1610e.ad.appmetrica());
            throw null;
        }
        this.ad = i2;
        this.vip = j;
        this.metrica = i3;
    }

    public C1591e(int i, long j) {
        this.ad = i;
        this.vip = j;
        this.metrica = -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1591e)) {
            return false;
        }
        C1591e c1591e = (C1591e) obj;
        return this.ad == c1591e.ad && this.vip == c1591e.vip && this.metrica == c1591e.metrica;
    }

    public final int hashCode() {
        int i = this.ad * 31;
        long j = this.vip;
        return ((i + ((int) (j ^ (j >>> 32)))) * 31) + this.metrica;
    }

    public final String toString() {
        return "AudioPlaylistReorderActionDto(trackId=" + this.ad + ", trackOwnerId=" + this.vip + ", newIndex=" + this.metrica + ")";
    }
}
