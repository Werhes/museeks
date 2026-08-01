package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؓٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6144e implements InterfaceC17220e {
    public final boolean ad;
    public final long metrica;
    public final float vip;

    public C6144e(float f, long j, boolean z) {
        this.ad = z;
        this.vip = f;
        this.metrica = j;
    }

    @Override // defpackage.InterfaceC17220e
    public final void ad(C15274e c15274e, C13770e c13770e) {
        c13770e.m3676strictfp(1257603829);
        c13770e.Signature(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6144e)) {
            return false;
        }
        C6144e c6144e = (C6144e) obj;
        if (this.ad == c6144e.ad && C15765e.vip(this.vip, c6144e.vip)) {
            return C3618e.metrica(this.metrica, c6144e.metrica);
        }
        return false;
    }

    @Override // defpackage.InterfaceC17220e
    public final int hashCode() {
        int license = AbstractC1414e.license((this.ad ? 1231 : 1237) * 31, this.vip, 961);
        int i = C3618e.mopub;
        return C10994e.ad(this.metrica) + license;
    }

    @Override // defpackage.InterfaceC17220e
    public final InterfaceC5077e vip(C15274e c15274e) {
        C5954e c5954e = new C5954e(3, this);
        return new C7065e(c15274e, this.ad, this.vip, c5954e, 1);
    }
}
