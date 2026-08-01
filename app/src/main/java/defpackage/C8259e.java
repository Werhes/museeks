package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eً۠ٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8259e extends AbstractC13656e {
    public final C0520e metrica;
    public final C11709e vip;

    public C8259e(C11709e c11709e, C0520e c0520e) {
        super(new C6571e(c11709e, c0520e));
        this.vip = c11709e;
        this.metrica = c0520e;
    }

    @Override // defpackage.AbstractC13656e
    public final AbstractC1186e ad(InterfaceC5334e interfaceC5334e) {
        AbstractC10226e mo1458e;
        C11709e c11709e = this.vip;
        InterfaceC5052e license = AbstractC1284e.license(interfaceC5334e, c11709e);
        if (license != null) {
            if (!AbstractC14300e.advert(license, 3)) {
                license = null;
            }
            if (license != null && (mo1458e = license.mo1458e()) != null) {
                return mo1458e;
            }
        }
        return C18139e.vip(EnumC16799e.f32920e, c11709e.toString(), this.metrica.f2667e);
    }

    @Override // defpackage.AbstractC13656e
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.vip.purchase());
        sb.append('.');
        sb.append(this.metrica);
        return sb.toString();
    }
}
