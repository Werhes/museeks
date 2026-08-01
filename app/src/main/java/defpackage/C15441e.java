package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leْٕ۠;", "Leِٝؓ;", "Leّؕٝ;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eْٕ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
final class C15441e extends AbstractC11865e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f30518e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f30519e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C1839e f30520e;

    public C15441e(C1839e c1839e, int i, int i2) {
        this.f30520e = c1839e;
        this.f30519e = i;
        this.f30518e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15441e)) {
            return false;
        }
        C15441e c15441e = (C15441e) obj;
        return AbstractC7890e.billing(this.f30520e, c15441e.f30520e) && this.f30519e == c15441e.f30519e && this.f30518e == c15441e.f30518e;
    }

    public final int hashCode() {
        return (((this.f30520e.hashCode() * 31) + this.f30519e) * 31) + this.f30518e;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eّؕٝ, eْۤۡ] */
    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        ?? abstractC13616e = new AbstractC13616e();
        abstractC13616e.f7500e = this.f30520e;
        abstractC13616e.f7501e = this.f30519e;
        abstractC13616e.f7499e = this.f30518e;
        abstractC13616e.f7503e = -1;
        abstractC13616e.f7504e = -1;
        return abstractC13616e;
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        C3324e c3324e = (C3324e) abstractC13616e;
        C1839e c1839e = c3324e.f7500e;
        C1839e c1839e2 = this.f30520e;
        boolean billing = AbstractC7890e.billing(c1839e, c1839e2);
        int i = this.f30519e;
        int i2 = this.f30518e;
        if (billing && c3324e.f7501e == i && c3324e.f7499e == i2) {
            return;
        }
        c3324e.f7500e = c1839e2;
        c3324e.f7501e = i;
        c3324e.f7499e = i2;
        c3324e.f7497e = AbstractC15890e.license(c1839e2, AbstractC5851e.mopub(c3324e).f27610e);
        c3324e.f7498e = true;
        AbstractC1599e.purchase(c3324e);
    }
}
