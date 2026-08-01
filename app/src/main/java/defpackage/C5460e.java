package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leؘؘّ;", "Leِٝؓ;", "Leٍۧٛ;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eؘؘّ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5460e extends AbstractC11865e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC11968e f11728e;

    public C5460e(InterfaceC11968e interfaceC11968e) {
        this.f11728e = interfaceC11968e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5460e) {
            return AbstractC7890e.billing(((C5460e) obj).f11728e, this.f11728e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11728e.hashCode();
    }

    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        return new C9924e(this.f11728e);
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        C9924e c9924e = (C9924e) abstractC13616e;
        InterfaceC11968e interfaceC11968e = c9924e.f19629e;
        InterfaceC11968e interfaceC11968e2 = this.f11728e;
        if (AbstractC7890e.billing(interfaceC11968e2, interfaceC11968e)) {
            return;
        }
        c9924e.f19629e = interfaceC11968e2;
        c9924e.mo1899e();
    }
}
