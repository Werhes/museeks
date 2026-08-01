package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leْٕۚ;", "Leِٝؓ;", "Leؒ۠ۥ;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eْٕۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* data */ class C15706e extends AbstractC11865e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C6260e f30948e;

    public C15706e(C6260e c6260e) {
        this.f30948e = c6260e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C15706e) && AbstractC7890e.billing(this.f30948e, ((C15706e) obj).f30948e);
    }

    public final int hashCode() {
        return this.f30948e.hashCode();
    }

    public final String toString() {
        return "FocusRestorerElement(fallback=" + this.f30948e + ')';
    }

    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        return new C1377e(this.f30948e);
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        ((C1377e) abstractC13616e).f4171e = this.f30948e;
    }
}
