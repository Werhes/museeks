package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۢ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9839e extends AbstractC13870e {

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public long f19428e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public long f19429e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public InterfaceC2869e f19430e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public boolean f19431e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public final C0576e f19432e;

    public C9839e(InterfaceC2869e interfaceC2869e) {
        super(1);
        this.f19430e = interfaceC2869e;
        this.f19429e = AbstractC2999e.ad;
        this.f19428e = AbstractC2278e.vip(0, 0, 0, 0, 15);
        this.f19432e = AbstractC14533e.startapp(null);
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: eَؑۨ */
    public final void mo338e() {
        this.f19432e.setValue(null);
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: e٘ٔ٘ */
    public final void mo229e() {
        this.f19429e = AbstractC2999e.ad;
        this.f19431e = false;
    }

    @Override // defpackage.AbstractC13870e, defpackage.InterfaceC17303e
    public final InterfaceC17242e license(InterfaceC13158e interfaceC13158e, InterfaceC16719e interfaceC16719e, long j) {
        AbstractC2832e admob;
        char c;
        long j2;
        C6534e c6534e;
        long license;
        C6534e c6534e2;
        if (interfaceC13158e.mo398transient()) {
            this.f19428e = j;
            this.f19431e = true;
            admob = interfaceC16719e.admob(j);
        } else {
            admob = interfaceC16719e.admob(this.f19431e ? this.f19428e : j);
        }
        AbstractC2832e abstractC2832e = admob;
        long j3 = (abstractC2832e.f6804e & 4294967295L) | (abstractC2832e.f6806e << 32);
        if (interfaceC13158e.mo398transient()) {
            this.f19429e = j3;
            c = ' ';
            license = j3;
            j2 = license;
        } else {
            long j4 = !C12729e.vip(this.f19429e, AbstractC2999e.ad) ? this.f19429e : j3;
            C0576e c0576e = this.f19432e;
            C6534e c6534e3 = (C6534e) c0576e.getValue();
            if (c6534e3 != null) {
                C7558e c7558e = c6534e3.ad;
                c = ' ';
                j2 = j3;
                boolean z = (C12729e.vip(j4, ((C12729e) c7558e.license()).ad) || c7558e.appmetrica()) ? false : true;
                if (!C12729e.vip(j4, ((C12729e) c7558e.appmetrica.getValue()).ad) || z) {
                    c6534e3.vip = ((C12729e) c7558e.license()).ad;
                    c6534e2 = c6534e3;
                    AbstractC5336e.purchase(m3623e(), null, 0, new C2454e(c6534e2, j4, this, null, 4), 3);
                } else {
                    c6534e2 = c6534e3;
                }
                c6534e = c6534e2;
            } else {
                c = ' ';
                j2 = j3;
                long j5 = j4;
                long j6 = 1;
                c6534e = new C6534e(new C7558e(new C12729e(j5), AbstractC9546e.yandex, new C12729e((j6 << 32) | (j6 & 4294967295L)), 8), j5);
            }
            c0576e.setValue(c6534e);
            license = AbstractC2278e.license(j, ((C12729e) c6534e.ad.license()).ad);
        }
        int i = (int) (license >> c);
        int i2 = (int) (license & 4294967295L);
        return interfaceC13158e.ads(i, i2, C9139e.f18290e, new C2010e(this, j2, i, i2, interfaceC13158e, abstractC2832e));
    }
}
