package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leٔ۟ٗ;", "Leِٝؓ;", "Leَۗۥ;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eٔ۟ٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14997e extends AbstractC11865e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C15274e f29725e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final boolean f29726e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final EnumC17426e f29727e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final boolean f29728e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC10481e f29729e;

    public C14997e(InterfaceC10481e interfaceC10481e, EnumC17426e enumC17426e, boolean z, boolean z2, C15274e c15274e) {
        this.f29729e = interfaceC10481e;
        this.f29727e = enumC17426e;
        this.f29726e = z;
        this.f29728e = z2;
        this.f29725e = c15274e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14997e)) {
            return false;
        }
        C14997e c14997e = (C14997e) obj;
        return AbstractC7890e.billing(this.f29729e, c14997e.f29729e) && this.f29727e == c14997e.f29727e && this.f29726e == c14997e.f29726e && this.f29728e == c14997e.f29728e && AbstractC7890e.billing(this.f29725e, c14997e.f29725e);
    }

    public final int hashCode() {
        int hashCode = (((((this.f29727e.hashCode() + (this.f29729e.hashCode() * 31)) * 961) + (this.f29726e ? 1231 : 1237)) * 31) + (this.f29728e ? 1231 : 1237)) * 961;
        C15274e c15274e = this.f29725e;
        return (hashCode + (c15274e != null ? c15274e.hashCode() : 0)) * 31;
    }

    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        return new C10469e(null, null, null, this.f29725e, this.f29727e, this.f29729e, this.f29726e, this.f29728e);
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        ((C10469e) abstractC13616e).m2812e(null, null, null, this.f29725e, this.f29727e, this.f29729e, this.f29726e, this.f29728e);
    }
}
