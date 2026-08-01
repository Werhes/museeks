package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leَۨؓ;", "Leِٝؓ;", "Leٕۖ٘;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eَۨؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
final /* data */ class C10692e extends AbstractC11865e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C8392e f21059e;

    public C10692e(C8392e c8392e) {
        this.f21059e = c8392e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10692e) && this.f21059e.equals(((C10692e) obj).f21059e);
    }

    public final int hashCode() {
        return this.f21059e.hashCode();
    }

    public final String toString() {
        return "FocusPropertiesElement(scope=" + this.f21059e + ')';
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٕۖ٘, eْۤۡ] */
    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        ?? abstractC13616e = new AbstractC13616e();
        abstractC13616e.f30864e = this.f21059e;
        return abstractC13616e;
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        ((C15653e) abstractC13616e).f30864e = this.f21059e;
    }
}
