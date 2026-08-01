package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؙۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10858e extends AbstractC13616e implements InterfaceC1683e, InterfaceC17303e {

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public C2804e f21502e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public final C1839e f21503e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public InterfaceC1966e f21504e;

    public C10858e(C1839e c1839e) {
        this.f21503e = c1839e;
    }

    @Override // defpackage.InterfaceC17303e
    public final /* synthetic */ int ad(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.appmetrica(this, abstractC9292e, interfaceC16719e, i);
    }

    @Override // defpackage.InterfaceC17303e
    public final /* synthetic */ int billing(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.billing(this, abstractC9292e, interfaceC16719e, i);
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: eؚؚؓ */
    public final boolean mo293e() {
        return false;
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: eُۘٙ */
    public final void mo713e() {
        C2804e c2804e = this.f21502e;
        if (c2804e != null) {
            C2804e.ad(c2804e, null, AbstractC5851e.mopub(this).f27604e, null, 29);
        }
        AbstractC1599e.purchase(this);
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: eّْٝ */
    public final void mo228e() {
        this.f21504e = null;
        this.f21502e = null;
    }

    /* renamed from: eٌٔٗ, reason: contains not printable characters */
    public final void m2937e(C1839e c1839e, InterfaceC2141e interfaceC2141e) {
        C4282e c4282e = c1839e.ad;
        AbstractC16845e abstractC16845e = c4282e.purchase;
        C1812e c1812e = c4282e.metrica;
        if (c1812e == null) {
            c1812e = C1812e.f4893e;
        }
        C6277e c6277e = c4282e.license;
        int i = c6277e != null ? c6277e.ad : 0;
        C5208e c5208e = c4282e.appmetrica;
        this.f21504e = ((C1773e) interfaceC2141e).vip(abstractC16845e, c1812e, i, c5208e != null ? c5208e.ad : 65535);
        AbstractC1599e.purchase(this);
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: eؘٖؗ */
    public final void mo1339e() {
        C2804e c2804e = this.f21502e;
        if (c2804e != null) {
            C2804e.ad(c2804e, AbstractC5851e.mopub(this).f27610e, null, null, 30);
        }
        AbstractC1599e.purchase(this);
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: e٘ٔ٘ */
    public final void mo229e() {
        C1839e license = AbstractC15890e.license(this.f21503e, AbstractC5851e.mopub(this).f27610e);
        InterfaceC2141e interfaceC2141e = (InterfaceC2141e) AbstractC10432e.vip(this, AbstractC11473e.mopub);
        m2937e(license, interfaceC2141e);
        EnumC7792e enumC7792e = AbstractC5851e.mopub(this).f27610e;
        InterfaceC14388e interfaceC14388e = AbstractC5851e.mopub(this).f27604e;
        InterfaceC1966e interfaceC1966e = this.f21504e;
        if (interfaceC1966e == null) {
            throw AbstractC5087e.m1749interface("Font resolution state is not set.");
        }
        this.f21502e = new C2804e(enumC7792e, interfaceC14388e, interfaceC2141e, license, interfaceC1966e.getValue());
    }

    @Override // defpackage.InterfaceC17303e
    public final InterfaceC17242e license(InterfaceC13158e interfaceC13158e, InterfaceC16719e interfaceC16719e, long j) {
        long ad;
        C2804e c2804e = this.f21502e;
        if (c2804e == null) {
            throw AbstractC5087e.m1749interface("Min size state is not set.");
        }
        C0576e c0576e = c2804e.purchase;
        InterfaceC1966e interfaceC1966e = this.f21504e;
        if (interfaceC1966e == null) {
            throw AbstractC5087e.m1749interface("Font resolution state is not set.");
        }
        Object value = interfaceC1966e.getValue();
        if (!AbstractC7890e.billing(value, c2804e.appmetrica)) {
            c2804e.appmetrica = value;
            c0576e.setValue(Boolean.TRUE);
        }
        if (((Boolean) c0576e.getValue()).booleanValue()) {
            ad = AbstractC15605e.ad(c2804e.license, c2804e.vip, c2804e.metrica, AbstractC15605e.ad, 1);
            c2804e.billing = ad;
            c0576e.setValue(Boolean.FALSE);
        }
        long j2 = c2804e.billing;
        AbstractC2832e admob = interfaceC16719e.admob(AbstractC2278e.appmetrica(j, AbstractC2278e.vip((int) (j2 >> 32), 0, (int) (j2 & 4294967295L), 0, 10)));
        return interfaceC13158e.ads(admob.f6806e, admob.f6804e, C9139e.f18290e, new C4889e(admob, 15));
    }

    @Override // defpackage.InterfaceC17303e
    public final /* synthetic */ int purchase(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.metrica(this, abstractC9292e, interfaceC16719e, i);
    }

    @Override // defpackage.InterfaceC17303e
    public final /* synthetic */ int startapp(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.startapp(this, abstractC9292e, interfaceC16719e, i);
    }
}
