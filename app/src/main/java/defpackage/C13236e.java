package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leؙْٓ;", "Leِٝؓ;", "Leٌؙۡ;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eؙْٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13236e extends AbstractC11865e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final float f26272e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final float f26273e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final AbstractC17016e f26274e;

    public C13236e(AbstractC17016e abstractC17016e, float f, float f2) {
        this.f26274e = abstractC17016e;
        this.f26273e = f;
        this.f26272e = f2;
        boolean z = true;
        boolean z2 = f >= 0.0f || Float.isNaN(f);
        if (f2 < 0.0f && !Float.isNaN(f2)) {
            z = false;
        }
        if (!z2 || !z) {
            AbstractC9534e.ad("Padding from alignment line must be a non-negative number");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C13236e c13236e = obj instanceof C13236e ? (C13236e) obj : null;
        return c13236e != null && AbstractC7890e.billing(this.f26274e, c13236e.f26274e) && C15765e.vip(this.f26273e, c13236e.f26273e) && C15765e.vip(this.f26272e, c13236e.f26272e);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f26272e) + AbstractC1414e.license(this.f26274e.hashCode() * 31, this.f26273e, 31);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٌؙۡ, eْۤۡ] */
    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        ?? abstractC13616e = new AbstractC13616e();
        abstractC13616e.f13860e = this.f26274e;
        abstractC13616e.f13861e = this.f26273e;
        abstractC13616e.f13859e = this.f26272e;
        return abstractC13616e;
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        C6709e c6709e = (C6709e) abstractC13616e;
        c6709e.f13860e = this.f26274e;
        c6709e.f13861e = this.f26273e;
        c6709e.f13859e = this.f26272e;
    }
}
