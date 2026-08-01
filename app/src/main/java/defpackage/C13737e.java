package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leٓؓۢ;", "Leِٝؓ;", "Leٖ۠;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eٓؓۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* data */ class C13737e extends AbstractC11865e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final InterfaceC7823e f27226e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C8199e f27227e;

    public C13737e(C8199e c8199e, InterfaceC7823e interfaceC7823e) {
        this.f27227e = c8199e;
        this.f27226e = interfaceC7823e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13737e)) {
            return false;
        }
        C13737e c13737e = (C13737e) obj;
        return AbstractC7890e.billing(c13737e.f27226e, this.f27226e) && AbstractC7890e.billing(c13737e.f27227e, this.f27227e);
    }

    public final int hashCode() {
        return this.f27226e.hashCode();
    }

    public final String toString() {
        return "StyleElement(styleState=" + this.f27227e + ", style=" + this.f27226e + ')';
    }

    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        return new C16546e(this.f27227e, this.f27226e);
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        C16546e c16546e = (C16546e) abstractC13616e;
        c16546e.f32444e = this.f27226e;
        c16546e.m4164e(false);
        C8199e c8199e = this.f27227e;
        if (c8199e == null) {
            c8199e = new C8199e(null);
        }
        if (AbstractC7890e.billing(c16546e.f32452e, c8199e)) {
            return;
        }
        c16546e.f32452e = c8199e;
        c16546e.m4164e(false);
        C2852e c2852e = c16546e.f32447e;
        if (c2852e == null) {
            throw new IllegalStateException("StyleOuterNode with no corresponding StyleInnerNode");
        }
        AbstractC1599e.appmetrica(c2852e);
    }
}
