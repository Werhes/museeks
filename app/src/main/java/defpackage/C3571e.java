package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leؕۗ۟;", "Leِٝؓ;", "Leٗۚۛ;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eؕۗ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3571e extends AbstractC11865e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC11968e f8055e;

    public C3571e(InterfaceC11968e interfaceC11968e) {
        this.f8055e = interfaceC11968e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3571e) {
            return AbstractC7890e.billing(((C3571e) obj).f8055e, this.f8055e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8055e.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eؘؔؗ, eٗۚۛ, eْۤۡ] */
    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        ?? abstractC5397e = new AbstractC5397e();
        abstractC5397e.f33792e = this.f8055e;
        return abstractC5397e;
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        C17253e c17253e = (C17253e) abstractC13616e;
        InterfaceC11968e interfaceC11968e = c17253e.f33792e;
        InterfaceC11968e interfaceC11968e2 = this.f8055e;
        if (AbstractC7890e.billing(interfaceC11968e2, interfaceC11968e)) {
            return;
        }
        c17253e.f33792e = interfaceC11968e2;
        c17253e.mo1899e();
    }
}
