package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leِۥٙ;", "Leِٝؓ;", "Leٟؖۙ;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eِۥٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12101e extends AbstractC11865e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C4988e f24261e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C1839e f24262e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C11388e f24263e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final boolean f24264e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C7102e f24265e;

    public C12101e(C7102e c7102e, C11388e c11388e, C1839e c1839e, boolean z, C4988e c4988e) {
        this.f24265e = c7102e;
        this.f24263e = c11388e;
        this.f24262e = c1839e;
        this.f24264e = z;
        this.f24261e = c4988e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12101e)) {
            return false;
        }
        C12101e c12101e = (C12101e) obj;
        return this.f24264e == c12101e.f24264e && AbstractC7890e.billing(this.f24265e, c12101e.f24265e) && AbstractC7890e.billing(this.f24263e, c12101e.f24263e) && AbstractC7890e.billing(this.f24262e, c12101e.f24262e) && this.f24261e.equals(c12101e.f24261e);
    }

    public final int hashCode() {
        return this.f24261e.hashCode() + AbstractC1786e.smaato(this.f24262e, (this.f24263e.hashCode() + ((this.f24265e.hashCode() + ((this.f24264e ? 1231 : 1237) * 31)) * 31)) * 31, 961);
    }

    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        return new C4353e(this.f24265e, this.f24263e, this.f24262e, this.f24264e, this.f24261e);
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        C4353e c4353e = (C4353e) abstractC13616e;
        C7102e c7102e = c4353e.f9486e;
        C7102e c7102e2 = this.f24265e;
        c4353e.f9486e = c7102e2;
        c7102e2.getClass();
        boolean z = this.f24264e;
        c4353e.f9485e = z;
        boolean z2 = !z;
        C2371e c2371e = c7102e2.ad;
        c2371e.getClass();
        c2371e.f5937e.setValue(new C7086e(this.f24263e, this.f24262e, z, z2, this.f24261e.metrica == 4));
        if (AbstractC7890e.billing(c7102e, c7102e2)) {
            return;
        }
        c4353e.f9487e.m1765e(c7102e2.billing);
    }
}
