package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, d2 = {"Leًٗۘ;", "T", "Leِٝؓ;", "Leٍٚۨ;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eًٗۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17219e<T> extends AbstractC11865e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final boolean f33745e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final EnumC17426e f33746e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final InterfaceC8642e f33747e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C14995e f33748e;

    public C17219e(C14995e c14995e, EnumC17426e enumC17426e, boolean z, InterfaceC8642e interfaceC8642e) {
        this.f33748e = c14995e;
        this.f33746e = enumC17426e;
        this.f33745e = z;
        this.f33747e = interfaceC8642e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17219e)) {
            return false;
        }
        C17219e c17219e = (C17219e) obj;
        return AbstractC7890e.billing(this.f33748e, c17219e.f33748e) && this.f33746e == c17219e.f33746e && this.f33745e == c17219e.f33745e && AbstractC7890e.billing(this.f33747e, c17219e.f33747e);
    }

    public final int hashCode() {
        int hashCode = (((this.f33746e.hashCode() + (this.f33748e.hashCode() * 31)) * 31) + (this.f33745e ? 1231 : 1237)) * 28629151;
        InterfaceC8642e interfaceC8642e = this.f33747e;
        return hashCode + (interfaceC8642e != null ? interfaceC8642e.hashCode() : 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٍٚۨ, eؘۙۢ, eْۤۡ] */
    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        C14099e c14099e = AbstractC11750e.ad;
        boolean z = this.f33745e;
        EnumC17426e enumC17426e = this.f33746e;
        ?? abstractC5881e = new AbstractC5881e(c14099e, z, null, enumC17426e);
        abstractC5881e.f19003e = this.f33748e;
        abstractC5881e.f19005e = enumC17426e;
        abstractC5881e.f19004e = this.f33747e;
        return abstractC5881e;
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        boolean z;
        boolean z2;
        C9570e c9570e = (C9570e) abstractC13616e;
        InterfaceC8642e interfaceC8642e = this.f33747e;
        c9570e.f19004e = interfaceC8642e;
        C14995e c14995e = c9570e.f19003e;
        C14995e c14995e2 = this.f33748e;
        if (AbstractC7890e.billing(c14995e, c14995e2)) {
            z = false;
        } else {
            c9570e.f19003e = c14995e2;
            c9570e.m2620e(interfaceC8642e);
            z = true;
        }
        EnumC17426e enumC17426e = c9570e.f19005e;
        EnumC17426e enumC17426e2 = this.f33746e;
        if (enumC17426e != enumC17426e2) {
            c9570e.f19005e = enumC17426e2;
            z2 = true;
        } else {
            z2 = z;
        }
        c9570e.m1981e(c9570e.f12412e, this.f33745e, null, enumC17426e2, z2);
    }
}
