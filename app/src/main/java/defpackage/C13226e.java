package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْْؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13226e implements InterfaceC16707e {
    public final long ad;
    public final long metrica;
    public final long vip;

    public C13226e(long j, long j2, long j3) {
        this.ad = j;
        this.vip = j2;
        this.metrica = j3;
    }

    @Override // defpackage.InterfaceC16707e
    public final /* synthetic */ C16975e ad() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13226e)) {
            return false;
        }
        C13226e c13226e = (C13226e) obj;
        return this.ad == c13226e.ad && this.vip == c13226e.vip && this.metrica == c13226e.metrica;
    }

    public final int hashCode() {
        return AbstractC1561e.metrica(this.metrica) + ((AbstractC1561e.metrica(this.vip) + ((AbstractC1561e.metrica(this.ad) + 527) * 31)) * 31);
    }

    @Override // defpackage.InterfaceC16707e
    public final /* synthetic */ byte[] metrica() {
        return null;
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.ad + ", modification time=" + this.vip + ", timescale=" + this.metrica;
    }

    @Override // defpackage.InterfaceC16707e
    public final /* synthetic */ void vip(C4761e c4761e) {
    }
}
