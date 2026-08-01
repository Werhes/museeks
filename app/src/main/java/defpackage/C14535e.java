package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leٔؗۚ;", "Leِٝؓ;", "Leٗ۠ۥ;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eٔؗۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* data */ class C14535e extends AbstractC11865e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final InterfaceC6256e f28737e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C7911e f28738e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C0398e f28739e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final C6260e f28740e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final boolean f28741e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C2547e f28742e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final C16174e f28743e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C15860e f28744e;

    public C14535e(C2547e c2547e, C0398e c0398e, C7911e c7911e, boolean z, InterfaceC6256e interfaceC6256e, C15860e c15860e, C16174e c16174e, C6260e c6260e) {
        this.f28742e = c2547e;
        this.f28739e = c0398e;
        this.f28738e = c7911e;
        this.f28741e = z;
        this.f28737e = interfaceC6256e;
        this.f28744e = c15860e;
        this.f28743e = c16174e;
        this.f28740e = c6260e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14535e)) {
            return false;
        }
        C14535e c14535e = (C14535e) obj;
        return this.f28742e.equals(c14535e.f28742e) && AbstractC7890e.billing(this.f28739e, c14535e.f28739e) && this.f28738e.equals(c14535e.f28738e) && this.f28741e == c14535e.f28741e && AbstractC7890e.billing(this.f28737e, c14535e.f28737e) && this.f28744e.equals(c14535e.f28744e) && AbstractC7890e.billing(this.f28743e, c14535e.f28743e) && AbstractC7890e.billing(this.f28740e, c14535e.f28740e);
    }

    public final int hashCode() {
        return this.f28740e.hashCode() + ((this.f28743e.hashCode() + ((this.f28744e.hashCode() + ((this.f28737e.hashCode() + ((((((((this.f28738e.hashCode() + ((this.f28739e.hashCode() + (this.f28742e.hashCode() * 31)) * 31)) * 31) + 1237) * 31) + (this.f28741e ? 1231 : 1237)) * 31) + 1237) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.f28742e + ", value=" + this.f28739e + ", state=" + this.f28738e + ", readOnly=false, enabled=" + this.f28741e + ", isPassword=false, offsetMapping=" + this.f28737e + ", manager=" + this.f28744e + ", imeOptions=" + this.f28743e + ", focusRequester=" + this.f28740e + ')';
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٗ۠ۥ, eؙؒؐ, eْۤۡ] */
    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        ?? abstractC6126e = new AbstractC6126e();
        abstractC6126e.f33994e = this.f28742e;
        abstractC6126e.f33993e = this.f28739e;
        abstractC6126e.f33996e = this.f28738e;
        abstractC6126e.f33999e = this.f28741e;
        abstractC6126e.f33992e = this.f28737e;
        C15860e c15860e = this.f28744e;
        abstractC6126e.f33995e = c15860e;
        abstractC6126e.f33997e = this.f28743e;
        abstractC6126e.f33998e = this.f28740e;
        c15860e.purchase = new C7147e(abstractC6126e, 4);
        return abstractC6126e;
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        C17320e c17320e = (C17320e) abstractC13616e;
        boolean z = c17320e.f33999e;
        C16174e c16174e = c17320e.f33997e;
        C15860e c15860e = c17320e.f33995e;
        c17320e.f33994e = this.f28742e;
        C0398e c0398e = this.f28739e;
        c17320e.f33993e = c0398e;
        c17320e.f33996e = this.f28738e;
        boolean z2 = this.f28741e;
        c17320e.f33999e = z2;
        c17320e.f33992e = this.f28737e;
        C15860e c15860e2 = this.f28744e;
        c17320e.f33995e = c15860e2;
        C16174e c16174e2 = this.f28743e;
        c17320e.f33997e = c16174e2;
        c17320e.f33998e = this.f28740e;
        if (z2 != z || z2 != z || !AbstractC7890e.billing(c16174e2, c16174e) || !C12347e.license(c0398e.vip)) {
            AbstractC15118e.appmetrica(c17320e);
        }
        if (c15860e2.equals(c15860e)) {
            return;
        }
        c15860e2.purchase = new C7147e(c17320e, 0);
    }
}
