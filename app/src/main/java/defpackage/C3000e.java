package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leؔۦۣ;", "Leِٝؓ;", "Leُؙۦ;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eؔۦۣ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
final class C3000e extends AbstractC11865e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C1839e f7053e;

    public C3000e(C1839e c1839e) {
        this.f7053e = c1839e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3000e)) {
            return false;
        }
        return AbstractC7890e.billing(this.f7053e, ((C3000e) obj).f7053e);
    }

    public final int hashCode() {
        return this.f7053e.hashCode();
    }

    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        return new C10858e(this.f7053e);
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        C10858e c10858e = (C10858e) abstractC13616e;
        c10858e.getClass();
        C1839e license = AbstractC15890e.license(this.f7053e, AbstractC5851e.mopub(c10858e).f27610e);
        c10858e.m2937e(license, (InterfaceC2141e) AbstractC10432e.vip(c10858e, AbstractC11473e.mopub));
        C2804e c2804e = c10858e.f21502e;
        if (c2804e == null) {
            throw AbstractC5087e.m1749interface("Min size state is not set.");
        }
        C2804e.ad(c2804e, null, null, license, 23);
        AbstractC1599e.purchase(c10858e);
    }
}
