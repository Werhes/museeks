package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leٌٖٗ;", "Leِٝؓ;", "Leؕۦؑ;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eٌٖٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* data */ class C16265e extends AbstractC11865e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C2815e f31941e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final InterfaceC2872e f31942e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final InterfaceC8079e f31943e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final float f31944e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final AbstractC10727e f31945e;

    public C16265e(AbstractC10727e abstractC10727e, InterfaceC8079e interfaceC8079e, InterfaceC2872e interfaceC2872e, float f, C2815e c2815e) {
        this.f31945e = abstractC10727e;
        this.f31943e = interfaceC8079e;
        this.f31942e = interfaceC2872e;
        this.f31944e = f;
        this.f31941e = c2815e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16265e)) {
            return false;
        }
        C16265e c16265e = (C16265e) obj;
        return AbstractC7890e.billing(this.f31945e, c16265e.f31945e) && AbstractC7890e.billing(this.f31943e, c16265e.f31943e) && AbstractC7890e.billing(this.f31942e, c16265e.f31942e) && Float.compare(this.f31944e, c16265e.f31944e) == 0 && AbstractC7890e.billing(this.f31941e, c16265e.f31941e);
    }

    public final int hashCode() {
        int license = AbstractC1414e.license((this.f31942e.hashCode() + ((this.f31943e.hashCode() + (((this.f31945e.hashCode() * 31) + 1231) * 31)) * 31)) * 31, this.f31944e, 31);
        C2815e c2815e = this.f31941e;
        return license + (c2815e == null ? 0 : c2815e.hashCode());
    }

    public final String toString() {
        return "PainterElement(painter=" + this.f31945e + ", sizeToIntrinsics=true, alignment=" + this.f31943e + ", contentScale=" + this.f31942e + ", alpha=" + this.f31944e + ", colorFilter=" + this.f31941e + ')';
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eْۤۡ, eؕۦؑ] */
    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        ?? abstractC13616e = new AbstractC13616e();
        abstractC13616e.f8346e = this.f31945e;
        abstractC13616e.f8347e = true;
        abstractC13616e.f8345e = this.f31943e;
        abstractC13616e.f8344e = this.f31942e;
        abstractC13616e.f8348e = this.f31944e;
        abstractC13616e.f8349e = this.f31941e;
        return abstractC13616e;
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        C3755e c3755e = (C3755e) abstractC13616e;
        boolean z = c3755e.f8347e;
        AbstractC10727e abstractC10727e = this.f31945e;
        boolean z2 = (z && C2108e.vip(c3755e.f8346e.startapp(), abstractC10727e.startapp())) ? false : true;
        c3755e.f8346e = abstractC10727e;
        c3755e.f8347e = true;
        c3755e.f8345e = this.f31943e;
        c3755e.f8344e = this.f31942e;
        c3755e.f8348e = this.f31944e;
        c3755e.f8349e = this.f31941e;
        if (z2) {
            AbstractC1599e.purchase(c3755e);
        }
        AbstractC12640e.advert(c3755e);
    }
}
