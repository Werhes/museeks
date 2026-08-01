package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leؓٓۚ;", "Leِٝؓ;", "Leٌٕؔ;", "tv-material"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eؓٓۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
final class C1804e extends AbstractC11865e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final long f4868e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final float f4869e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC16154e f4870e;

    public C1804e(InterfaceC16154e interfaceC16154e, float f, long j) {
        this.f4870e = interfaceC16154e;
        this.f4869e = f;
        this.f4868e = j;
    }

    public final boolean equals(Object obj) {
        C1804e c1804e = obj instanceof C1804e ? (C1804e) obj : null;
        return c1804e != null && AbstractC7890e.billing(this.f4870e, c1804e.f4870e) && this.f4869e == c1804e.f4869e && C3618e.metrica(this.f4868e, c1804e.f4868e);
    }

    public final int hashCode() {
        int license = AbstractC1414e.license(this.f4870e.hashCode() * 31, this.f4869e, 31);
        int i = C3618e.mopub;
        return C10994e.ad(this.f4868e) + license;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٌٕؔ, eْۤۡ] */
    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        ?? abstractC13616e = new AbstractC13616e();
        abstractC13616e.f17555e = this.f4870e;
        abstractC13616e.f17556e = this.f4869e;
        abstractC13616e.f17554e = this.f4868e;
        return abstractC13616e;
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        C8700e c8700e = (C8700e) abstractC13616e;
        c8700e.f17555e = this.f4870e;
        c8700e.f17556e = this.f4869e;
        c8700e.f17554e = this.f4868e;
        if (c8700e.f17553e == null) {
            C11447e vip = AbstractC17331e.vip();
            c8700e.f17553e = vip;
            c8700e.f17557e = vip.ad;
        }
        c8700e.m2466e();
    }
}
