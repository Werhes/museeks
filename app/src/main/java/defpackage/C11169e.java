package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leُٟٗ;", "Leِٝؓ;", "Leٌُۣ;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eُٟٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11169e extends AbstractC11865e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C15274e f22430e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final boolean f22431e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final EnumC17426e f22432e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final C11644e f22433e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final InterfaceC8642e f22434e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC10481e f22435e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final boolean f22436e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final InterfaceC13547e f22437e;

    public C11169e(C11644e c11644e, InterfaceC13547e interfaceC13547e, InterfaceC8642e interfaceC8642e, C15274e c15274e, EnumC17426e enumC17426e, InterfaceC10481e interfaceC10481e, boolean z, boolean z2) {
        this.f22435e = interfaceC10481e;
        this.f22432e = enumC17426e;
        this.f22431e = z;
        this.f22434e = interfaceC8642e;
        this.f22430e = c15274e;
        this.f22437e = interfaceC13547e;
        this.f22436e = z2;
        this.f22433e = c11644e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11169e.class != obj.getClass()) {
            return false;
        }
        C11169e c11169e = (C11169e) obj;
        return AbstractC7890e.billing(this.f22435e, c11169e.f22435e) && this.f22432e == c11169e.f22432e && this.f22431e == c11169e.f22431e && AbstractC7890e.billing(this.f22434e, c11169e.f22434e) && AbstractC7890e.billing(this.f22430e, c11169e.f22430e) && AbstractC7890e.billing(this.f22437e, c11169e.f22437e) && this.f22436e == c11169e.f22436e && AbstractC7890e.billing(this.f22433e, c11169e.f22433e);
    }

    public final int hashCode() {
        int hashCode = (((((this.f22432e.hashCode() + (this.f22435e.hashCode() * 31)) * 31) + (this.f22431e ? 1231 : 1237)) * 31) + 1237) * 31;
        InterfaceC8642e interfaceC8642e = this.f22434e;
        int hashCode2 = (hashCode + (interfaceC8642e != null ? interfaceC8642e.hashCode() : 0)) * 31;
        C15274e c15274e = this.f22430e;
        int hashCode3 = (hashCode2 + (c15274e != null ? c15274e.hashCode() : 0)) * 31;
        InterfaceC13547e interfaceC13547e = this.f22437e;
        int hashCode4 = (((hashCode3 + (interfaceC13547e != null ? interfaceC13547e.hashCode() : 0)) * 31) + (this.f22436e ? 1231 : 1237)) * 31;
        C11644e c11644e = this.f22433e;
        return hashCode4 + (c11644e != null ? c11644e.hashCode() : 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٌُۣ, eؙؒؐ, eْۤۡ] */
    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        ?? abstractC6126e = new AbstractC6126e();
        abstractC6126e.f22861e = this.f22435e;
        abstractC6126e.f22860e = this.f22432e;
        abstractC6126e.f22868e = this.f22431e;
        abstractC6126e.f22871e = this.f22434e;
        abstractC6126e.f22859e = this.f22430e;
        abstractC6126e.f22866e = this.f22437e;
        abstractC6126e.f22869e = this.f22436e;
        abstractC6126e.f22870e = this.f22433e;
        return abstractC6126e;
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        C15274e c15274e = this.f22430e;
        ((C11359e) abstractC13616e).m3202e(this.f22433e, this.f22437e, this.f22434e, c15274e, this.f22432e, this.f22435e, this.f22436e, this.f22431e);
    }
}
