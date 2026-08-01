package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leٕٙۦ;", "Leِٝؓ;", "Leؗۛؗ;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eٕٙۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
final class C15556e extends AbstractC11865e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C15212e f30711e;

    public C15556e(C15212e c15212e) {
        this.f30711e = c15212e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C15556e) {
            return AbstractC7890e.billing(this.f30711e, ((C15556e) obj).f30711e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f30711e.hashCode();
    }

    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        return new C5154e(this.f30711e);
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        ((C5154e) abstractC13616e).m1765e(this.f30711e);
    }
}
