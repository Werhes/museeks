package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leٌّٓ;", "Leِٝؓ;", "Leْۥ;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eٌّٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8673e extends AbstractC11865e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final InterfaceC17220e f17516e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C15274e f17517e;

    public C8673e(C15274e c15274e, InterfaceC17220e interfaceC17220e) {
        this.f17517e = c15274e;
        this.f17516e = interfaceC17220e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8673e)) {
            return false;
        }
        C8673e c8673e = (C8673e) obj;
        return AbstractC7890e.billing(this.f17517e, c8673e.f17517e) && AbstractC7890e.billing(this.f17516e, c8673e.f17516e);
    }

    public final int hashCode() {
        return this.f17516e.hashCode() + (this.f17517e.hashCode() * 31);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eؙؒؐ, eْۥ, eْۤۡ] */
    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        InterfaceC5077e vip = this.f17516e.vip(this.f17517e);
        ?? abstractC6126e = new AbstractC6126e();
        abstractC6126e.f27025e = vip;
        abstractC6126e.m2050e(vip);
        return abstractC6126e;
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        C13620e c13620e = (C13620e) abstractC13616e;
        InterfaceC5077e vip = this.f17516e.vip(this.f17517e);
        c13620e.m2042e(c13620e.f27025e);
        c13620e.f27025e = vip;
        c13620e.m2050e(vip);
    }
}
