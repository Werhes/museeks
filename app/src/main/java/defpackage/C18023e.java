package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Le٘ۜۚ;", "Leِٝؓ;", "Leٖٔؗ;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: e٘ۜۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18023e extends AbstractC11865e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final float f35345e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final float f35346e;

    public C18023e(float f, float f2) {
        this.f35346e = f;
        this.f35345e = f2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18023e)) {
            return false;
        }
        C18023e c18023e = (C18023e) obj;
        return C15765e.vip(this.f35346e, c18023e.f35346e) && C15765e.vip(this.f35345e, c18023e.f35345e);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f35345e) + (Float.floatToIntBits(this.f35346e) * 31);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٖٔؗ, eْۤۡ] */
    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        ?? abstractC13616e = new AbstractC13616e();
        abstractC13616e.f31818e = this.f35346e;
        abstractC13616e.f31819e = this.f35345e;
        return abstractC13616e;
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        C16201e c16201e = (C16201e) abstractC13616e;
        c16201e.f31818e = this.f35346e;
        c16201e.f31819e = this.f35345e;
    }
}
