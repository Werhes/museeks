package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؚؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4718e extends AbstractC14941e implements InterfaceC9646e {

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public C11260e f10103e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final C11106e f10104e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final C6535e f10105e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public C15503e f10106e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final C8143e f10107e;

    public C4718e(C12816e c12816e, InterfaceC5334e interfaceC5334e, C15503e c15503e, C6535e c6535e) {
        super(interfaceC5334e, c12816e);
        this.f10105e = c6535e;
        C8143e c8143e = new C8143e(c15503e.f30631e, c15503e.f30627e);
        this.f10107e = c8143e;
        this.f10104e = new C11106e(c15503e, c8143e, c6535e, new C15146e(this, 29));
        this.f10106e = c15503e;
    }

    @Override // defpackage.InterfaceC9646e
    /* renamed from: eؗٔٓ */
    public final InterfaceC8528e mo1385e() {
        C11260e c11260e = this.f10103e;
        if (c11260e == null) {
            return null;
        }
        return c11260e;
    }

    /* renamed from: eٖٕٚ, reason: contains not printable characters */
    public final void m1671e(C18277e c18277e) {
        C15503e c15503e = this.f10106e;
        if (c15503e == null) {
            throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize");
        }
        this.f10106e = null;
        this.f10103e = new C11260e(this, c15503e.f30634e, this.f10107e, this.f10105e, null, c18277e, "scope of " + this, new C3411e(17, this));
    }

    @Override // defpackage.AbstractC14941e, defpackage.AbstractC2214e
    public final String toString() {
        StringBuilder sb = new StringBuilder("builtins package fragment for ");
        sb.append(this.f29618e);
        sb.append(" from ");
        int i = AbstractC2876e.ad;
        sb.append(AbstractC14300e.metrica(this));
        return sb.toString();
    }
}
