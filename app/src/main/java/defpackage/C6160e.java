package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leؙْؔ;", "Leِٝؓ;", "Leًٓۙ;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eؙْؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* data */ class C6160e extends AbstractC11865e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C7513e f12929e;

    public C6160e(C7513e c7513e) {
        this.f12929e = c7513e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6160e) && AbstractC7890e.billing(this.f12929e, ((C6160e) obj).f12929e);
    }

    public final int hashCode() {
        return this.f12929e.hashCode();
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.f12929e + ')';
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eًٓۙ, eْۤۡ] */
    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        ?? abstractC13616e = new AbstractC13616e();
        abstractC13616e.f27437e = this.f12929e;
        return abstractC13616e;
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        ((C13854e) abstractC13616e).f27437e = this.f12929e;
    }
}
