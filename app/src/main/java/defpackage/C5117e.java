package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۘۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5117e implements InterfaceC17717e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final long f10980e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC17717e f10981e;

    public C5117e(InterfaceC17717e interfaceC17717e, long j) {
        this.f10981e = interfaceC17717e;
        this.f10980e = j;
    }

    @Override // defpackage.InterfaceC17717e
    public final boolean ad() {
        return this.f10981e.ad();
    }

    @Override // defpackage.InterfaceC17717e
    public final AbstractC3424e adcel(long j, AbstractC3424e abstractC3424e, AbstractC3424e abstractC3424e2, AbstractC3424e abstractC3424e3) {
        long j2 = this.f10980e;
        return j < j2 ? abstractC3424e3 : this.f10981e.adcel(j - j2, abstractC3424e, abstractC3424e2, abstractC3424e3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5117e)) {
            return false;
        }
        C5117e c5117e = (C5117e) obj;
        return c5117e.f10980e == this.f10980e && AbstractC7890e.billing(c5117e.f10981e, this.f10981e);
    }

    public final int hashCode() {
        int hashCode = this.f10981e.hashCode() * 31;
        long j = this.f10980e;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    @Override // defpackage.InterfaceC17717e
    public final long inmobi(AbstractC3424e abstractC3424e, AbstractC3424e abstractC3424e2, AbstractC3424e abstractC3424e3) {
        return this.f10981e.inmobi(abstractC3424e, abstractC3424e2, abstractC3424e3) + this.f10980e;
    }

    @Override // defpackage.InterfaceC17717e
    public final AbstractC3424e pro(long j, AbstractC3424e abstractC3424e, AbstractC3424e abstractC3424e2, AbstractC3424e abstractC3424e3) {
        long j2 = this.f10980e;
        return j < j2 ? abstractC3424e : this.f10981e.pro(j - j2, abstractC3424e, abstractC3424e2, abstractC3424e3);
    }

    @Override // defpackage.InterfaceC17717e
    public final AbstractC3424e tapsense(AbstractC3424e abstractC3424e, AbstractC3424e abstractC3424e2, AbstractC3424e abstractC3424e3) {
        return adcel(inmobi(abstractC3424e, abstractC3424e2, abstractC3424e3), abstractC3424e, abstractC3424e2, abstractC3424e3);
    }
}
