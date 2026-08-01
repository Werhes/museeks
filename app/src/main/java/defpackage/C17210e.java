package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٗۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17210e {
    public static final C11883e billing = AbstractC9743e.startapp(new C4671e(19), new C14151e(0, 15));
    public final C2616e ad;
    public final C0576e purchase;
    public final C2616e vip = new C2616e(0.0f);
    public final C16330e metrica = new C16330e(0);
    public C0763e license = C0763e.appmetrica;
    public long appmetrica = C12347e.vip;

    public C17210e(EnumC17426e enumC17426e, float f) {
        this.ad = new C2616e(f);
        this.purchase = new C0576e(enumC17426e, C12575e.f25232e);
    }

    public final void ad(EnumC17426e enumC17426e, C0763e c0763e, int i, int i2) {
        float f = i2 - i;
        this.vip.startapp(f);
        float f2 = c0763e.ad;
        float f3 = c0763e.vip;
        C0763e c0763e2 = this.license;
        float f4 = c0763e2.ad;
        C2616e c2616e = this.ad;
        if (f2 != f4 || f3 != c0763e2.vip) {
            boolean z = enumC17426e == EnumC17426e.f34146e;
            if (z) {
                f2 = f3;
            }
            float f5 = z ? c0763e.license : c0763e.metrica;
            float purchase = c2616e.purchase();
            float f6 = i;
            float f7 = purchase + f6;
            c2616e.startapp(c2616e.purchase() + ((f5 <= f7 && (f2 >= purchase || f5 - f2 <= f6)) ? (f2 >= purchase || f5 - f2 > f6) ? 0.0f : f2 - purchase : f5 - f7));
            this.license = c0763e;
        }
        c2616e.startapp(AbstractC3062e.vip(c2616e.purchase(), 0.0f, f));
        this.metrica.startapp(i);
    }
}
