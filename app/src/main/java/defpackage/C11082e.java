package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leُٜٙ;", "Leِٝؓ;", "Leؑٚۢ;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eُٜٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* data */ class C11082e extends AbstractC11865e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C16223e f21977e;

    public C11082e(C16223e c16223e) {
        this.f21977e = c16223e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C11082e) && AbstractC7890e.billing(this.f21977e, ((C11082e) obj).f21977e);
    }

    public final int hashCode() {
        return this.f21977e.hashCode();
    }

    public final String toString() {
        return "SharedBoundsNodeElement(sharedElementState=" + this.f21977e + ')';
    }

    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        return new C0404e(this.f21977e);
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        C0404e c0404e = (C0404e) abstractC13616e;
        C16223e c16223e = c0404e.f2444e;
        C16223e c16223e2 = this.f21977e;
        if (c16223e2.equals(c16223e)) {
            return;
        }
        c0404e.f2444e.f31883e.setValue(Boolean.FALSE);
        c0404e.f2444e = c16223e2;
        c16223e2.f31883e.setValue(Boolean.valueOf(c0404e.f27016e));
        if (c0404e.f27016e) {
            c0404e.m342e();
        }
    }
}
