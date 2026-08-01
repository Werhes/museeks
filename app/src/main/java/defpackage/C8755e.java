package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leٌٌ٘;", "Leِٝؓ;", "Leُٕٗ;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eٌٌ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* data */ class C8755e extends AbstractC11865e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C2245e f17652e;

    public C8755e(C2245e c2245e) {
        this.f17652e = c2245e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8755e) && AbstractC7890e.billing(this.f17652e, ((C8755e) obj).f17652e);
    }

    public final int hashCode() {
        return this.f17652e.hashCode();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsElement(animator=" + this.f17652e + ')';
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eْۤۡ, eُٕٗ] */
    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        ?? abstractC13616e = new AbstractC13616e();
        abstractC13616e.f21874e = this.f17652e;
        return abstractC13616e;
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        C11042e c11042e = (C11042e) abstractC13616e;
        C2245e c2245e = c11042e.f21874e;
        C2245e c2245e2 = this.f17652e;
        if (AbstractC7890e.billing(c2245e, c2245e2) || !c11042e.f27022e.f27016e) {
            return;
        }
        C2245e c2245e3 = c11042e.f21874e;
        c2245e3.purchase();
        c2245e3.license = null;
        c2245e3.vip = -1;
        c2245e2.mopub = c11042e;
        c11042e.f21874e = c2245e2;
    }
}
