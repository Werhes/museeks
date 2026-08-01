package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leِٓۛ;", "Leِٝؓ;", "Leٍۛؓ;", "tv-material"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eِٓۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
final class C13926e extends AbstractC11865e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C9630e f27631e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC16154e f27632e;

    public C13926e(InterfaceC16154e interfaceC16154e, C9630e c9630e) {
        this.f27632e = interfaceC16154e;
        this.f27631e = c9630e;
    }

    public final boolean equals(Object obj) {
        C13926e c13926e = obj instanceof C13926e ? (C13926e) obj : null;
        return c13926e != null && AbstractC7890e.billing(this.f27632e, c13926e.f27632e) && AbstractC7890e.billing(this.f27631e, c13926e.f27631e);
    }

    public final int hashCode() {
        return this.f27631e.hashCode() + (this.f27632e.hashCode() * 31);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٍۛؓ, eْۤۡ] */
    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        ?? abstractC13616e = new AbstractC13616e();
        abstractC13616e.f19265e = this.f27632e;
        abstractC13616e.f19266e = this.f27631e;
        return abstractC13616e;
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        C9746e c9746e = (C9746e) abstractC13616e;
        c9746e.f19265e = this.f27632e;
        c9746e.f19266e = this.f27631e;
    }
}
