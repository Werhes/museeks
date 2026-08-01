package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leؚٔؒ;", "Leِٝؓ;", "Leّۣٚ;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eؚٔؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* data */ class C7151e extends AbstractC11865e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final long f14631e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final boolean f14632e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final InterfaceC16154e f14633e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final long f14634e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final float f14635e;

    public C7151e(float f, InterfaceC16154e interfaceC16154e, boolean z, long j, long j2) {
        this.f14635e = f;
        this.f14633e = interfaceC16154e;
        this.f14632e = z;
        this.f14634e = j;
        this.f14631e = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7151e)) {
            return false;
        }
        C7151e c7151e = (C7151e) obj;
        return C15765e.vip(this.f14635e, c7151e.f14635e) && AbstractC7890e.billing(this.f14633e, c7151e.f14633e) && this.f14632e == c7151e.f14632e && C3618e.metrica(this.f14634e, c7151e.f14634e) && C3618e.metrica(this.f14631e, c7151e.f14631e);
    }

    public final int hashCode() {
        int applovin = (AbstractC0054e.applovin(this.f14633e, Float.floatToIntBits(this.f14635e) * 31, 31) + (this.f14632e ? 1231 : 1237)) * 31;
        int i = C3618e.mopub;
        return C10994e.ad(this.f14631e) + AbstractC5087e.m1744class(applovin, this.f14634e, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        AbstractC10257e.admob(this.f14635e, sb, ", shape=");
        sb.append(this.f14633e);
        sb.append(", clip=");
        sb.append(this.f14632e);
        sb.append(", ambientColor=");
        AbstractC5087e.m1754try(this.f14634e, ", spotColor=", sb);
        sb.append((Object) C3618e.startapp(this.f14631e));
        sb.append(')');
        return sb.toString();
    }

    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        return new C12842e(new C10570e(2, this));
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        C12842e c12842e = (C12842e) abstractC13616e;
        C10570e c10570e = new C10570e(2, this);
        c12842e.f25663e = c10570e;
        AbstractC1599e.mopub(c12842e, c10570e);
    }
}
