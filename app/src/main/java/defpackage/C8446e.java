package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leٌٌؓ;", "Leِٝؓ;", "Leْٔؐ;", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eٌٌؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
final /* data */ class C8446e extends AbstractC11865e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final InterfaceC6512e f17202e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final boolean f17203e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C15274e f17204e;

    public C8446e(C15274e c15274e, boolean z, InterfaceC6512e interfaceC6512e) {
        this.f17204e = c15274e;
        this.f17203e = z;
        this.f17202e = interfaceC6512e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8446e)) {
            return false;
        }
        C8446e c8446e = (C8446e) obj;
        return AbstractC7890e.billing(this.f17204e, c8446e.f17204e) && this.f17203e == c8446e.f17203e && AbstractC7890e.billing(this.f17202e, c8446e.f17202e);
    }

    public final int hashCode() {
        return this.f17202e.hashCode() + (((this.f17204e.hashCode() * 31) + (this.f17203e ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "ThumbElement(interactionSource=" + this.f17204e + ", checked=" + this.f17203e + ", animationSpec=" + this.f17202e + ')';
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eْٔؐ, eْۤۡ] */
    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        ?? abstractC13616e = new AbstractC13616e();
        abstractC13616e.f28523e = this.f17204e;
        abstractC13616e.f28524e = this.f17203e;
        abstractC13616e.f28522e = this.f17202e;
        abstractC13616e.f28520e = Float.NaN;
        abstractC13616e.f28525e = Float.NaN;
        return abstractC13616e;
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        C14426e c14426e = (C14426e) abstractC13616e;
        c14426e.f28523e = this.f17204e;
        boolean z = c14426e.f28524e;
        boolean z2 = this.f17203e;
        if (z != z2) {
            AbstractC1599e.purchase(c14426e);
        }
        c14426e.f28524e = z2;
        c14426e.f28522e = this.f17202e;
        if (c14426e.f28527e == null && !Float.isNaN(c14426e.f28525e)) {
            c14426e.f28527e = AbstractC7111e.ad(c14426e.f28525e);
        }
        if (c14426e.f28526e != null || Float.isNaN(c14426e.f28520e)) {
            return;
        }
        c14426e.f28526e = AbstractC7111e.ad(c14426e.f28520e);
    }
}
