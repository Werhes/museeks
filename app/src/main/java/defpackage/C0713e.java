package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۦۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0713e implements InterfaceC16707e {
    public final long ad;
    public final long appmetrica;
    public final long license;
    public final long metrica;
    public final long vip;

    public C0713e(long j, long j2, long j3, long j4, long j5) {
        this.ad = j;
        this.vip = j2;
        this.metrica = j3;
        this.license = j4;
        this.appmetrica = j5;
    }

    @Override // defpackage.InterfaceC16707e
    public final /* synthetic */ C16975e ad() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0713e.class == obj.getClass()) {
            C0713e c0713e = (C0713e) obj;
            if (this.ad == c0713e.ad && this.vip == c0713e.vip && this.metrica == c0713e.metrica && this.license == c0713e.license && this.appmetrica == c0713e.appmetrica) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC1561e.metrica(this.appmetrica) + ((AbstractC1561e.metrica(this.license) + ((AbstractC1561e.metrica(this.metrica) + ((AbstractC1561e.metrica(this.vip) + ((AbstractC1561e.metrica(this.ad) + 527) * 31)) * 31)) * 31)) * 31);
    }

    @Override // defpackage.InterfaceC16707e
    public final /* synthetic */ byte[] metrica() {
        return null;
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.ad + ", photoSize=" + this.vip + ", photoPresentationTimestampUs=" + this.metrica + ", videoStartPosition=" + this.license + ", videoSize=" + this.appmetrica;
    }

    @Override // defpackage.InterfaceC16707e
    public final /* synthetic */ void vip(C4761e c4761e) {
    }
}
