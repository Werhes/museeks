package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۣۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13598e extends AbstractC13616e implements InterfaceC8501e, InterfaceC17303e, InterfaceC17453e {

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public C5715e f26980e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public C2815e f26981e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public InterfaceC8079e f26983e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public InterfaceC2872e f26984e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public final C13108e f26985e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public String f26987e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public float f26982e = 1.0f;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public boolean f26986e = true;

    public C13598e(C13108e c13108e, InterfaceC8079e interfaceC8079e, InterfaceC2872e interfaceC2872e, C2815e c2815e, String str, C5715e c5715e) {
        this.f26983e = interfaceC8079e;
        this.f26984e = interfaceC2872e;
        this.f26981e = c2815e;
        this.f26987e = str;
        this.f26980e = c5715e;
        this.f26985e = c13108e;
    }

    @Override // defpackage.InterfaceC17303e
    public final int ad(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        long vip = AbstractC2278e.vip(0, 0, 0, i, 7);
        C5715e c5715e = this.f26980e;
        if (c5715e != null) {
            c5715e.yandex(vip);
        }
        if (this.f26985e.startapp() == 9205357640488583168L) {
            return interfaceC16719e.loadAd(i);
        }
        long m3621e = m3621e(vip);
        return Math.max(C5602e.adcel(m3621e), interfaceC16719e.loadAd(i));
    }

    @Override // defpackage.InterfaceC17453e
    public final void adcel(InterfaceC15671e interfaceC15671e) {
        String str = this.f26987e;
        if (str != null) {
            AbstractC14594e.billing(interfaceC15671e, str);
            AbstractC14594e.advert(interfaceC15671e, 5);
        }
    }

    @Override // defpackage.InterfaceC17303e
    public final int billing(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        long vip = AbstractC2278e.vip(0, i, 0, 0, 13);
        C5715e c5715e = this.f26980e;
        if (c5715e != null) {
            c5715e.yandex(vip);
        }
        if (this.f26985e.startapp() == 9205357640488583168L) {
            return interfaceC16719e.mo2529while(i);
        }
        long m3621e = m3621e(vip);
        return Math.max(C5602e.startapp(m3621e), interfaceC16719e.mo2529while(i));
    }

    @Override // defpackage.InterfaceC17453e
    /* renamed from: break */
    public final /* synthetic */ boolean mo358break() {
        return false;
    }

    @Override // defpackage.InterfaceC8501e
    /* renamed from: case */
    public final /* synthetic */ void mo292case() {
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: eَؑۨ */
    public final void mo338e() {
        this.f26985e.loadAd(null);
    }

    /* renamed from: eؒٚۨ, reason: contains not printable characters */
    public final long m3621e(long j) {
        float adcel;
        int startapp;
        float vip;
        boolean purchase = C5602e.purchase(j);
        boolean appmetrica = C5602e.appmetrica(j);
        if (!purchase || !appmetrica) {
            boolean z = C5602e.license(j) && C5602e.metrica(j);
            C13108e c13108e = this.f26985e;
            long startapp2 = c13108e.startapp();
            if (startapp2 != 9205357640488583168L) {
                if (z && (purchase || appmetrica)) {
                    adcel = C5602e.yandex(j);
                    startapp = C5602e.billing(j);
                } else {
                    float intBitsToFloat = Float.intBitsToFloat((int) (startapp2 >> 32));
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (startapp2 & 4294967295L));
                    if (Math.abs(intBitsToFloat) <= Float.MAX_VALUE) {
                        int i = AbstractC14940e.vip;
                        adcel = AbstractC3062e.vip(intBitsToFloat, C5602e.adcel(j), C5602e.yandex(j));
                    } else {
                        adcel = C5602e.adcel(j);
                    }
                    if (Math.abs(intBitsToFloat2) <= Float.MAX_VALUE) {
                        int i2 = AbstractC14940e.vip;
                        vip = AbstractC3062e.vip(intBitsToFloat2, C5602e.startapp(j), C5602e.billing(j));
                        long m3622e = m3622e((Float.floatToRawIntBits(vip) & 4294967295L) | (Float.floatToRawIntBits(adcel) << 32));
                        return C5602e.ad(AbstractC2278e.billing(AbstractC1561e.appmetrica(Float.intBitsToFloat((int) (m3622e >> 32))), j), 0, AbstractC2278e.purchase(AbstractC1561e.appmetrica(Float.intBitsToFloat((int) (4294967295L & m3622e))), j), 0, 10, j);
                    }
                    startapp = C5602e.startapp(j);
                }
                vip = startapp;
                long m3622e2 = m3622e((Float.floatToRawIntBits(vip) & 4294967295L) | (Float.floatToRawIntBits(adcel) << 32));
                return C5602e.ad(AbstractC2278e.billing(AbstractC1561e.appmetrica(Float.intBitsToFloat((int) (m3622e2 >> 32))), j), 0, AbstractC2278e.purchase(AbstractC1561e.appmetrica(Float.intBitsToFloat((int) (4294967295L & m3622e2))), j), 0, 10, j);
            }
            if (z && ((InterfaceC1365e) c13108e.f26055e.f29092e.getValue()).ad() != null) {
                return C5602e.ad(C5602e.yandex(j), 0, C5602e.billing(j), 0, 10, j);
            }
        }
        return j;
    }

    @Override // defpackage.InterfaceC17453e
    /* renamed from: eؒۖۗ */
    public final /* synthetic */ boolean mo359e() {
        return false;
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: eؚؚؓ */
    public final boolean mo293e() {
        return false;
    }

    @Override // defpackage.InterfaceC8501e
    /* renamed from: eُؚٕ */
    public final void mo294e(C4017e c4017e) {
        C14434e c14434e = c4017e.f8940e;
        long m3622e = m3622e(c14434e.f28537e.m4560try());
        long ad = this.f26983e.ad(AbstractC14940e.vip(m3622e), AbstractC14940e.vip(c14434e.f28537e.m4560try()), c4017e.getLayoutDirection());
        int i = (int) (ad >> 32);
        int i2 = (int) (ad & 4294967295L);
        C18478e c18478e = c14434e.f28537e;
        long m4560try = c18478e.m4560try();
        c18478e.m4557this().billing();
        try {
            C5389e c5389e = (C5389e) c18478e.f36228e;
            if (this.f26986e) {
                C18478e c18478e2 = (C18478e) c5389e.f11540e;
                c5389e.appmetrica(0.0f, 0.0f, (31 & 4) != 0 ? Float.intBitsToFloat((int) (c18478e2.m4560try() >> 32)) : 0.0f, (31 & 8) != 0 ? Float.intBitsToFloat((int) (c18478e2.m4560try() & 4294967295L)) : 0.0f, 1);
            }
            c5389e.m1898this(i, i2);
            this.f26985e.billing(c4017e, m3622e, this.f26982e, this.f26981e);
            c18478e.m4557this().admob();
            c18478e.m4533continue(m4560try);
            c4017e.ad();
        } catch (Throwable th) {
            AbstractC0054e.m224this(c18478e, m4560try);
            throw th;
        }
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: eّْٝ */
    public final void mo228e() {
        this.f26985e.vip();
    }

    /* renamed from: eٌٔٗ, reason: contains not printable characters */
    public final long m3622e(long j) {
        if (C2108e.billing(j)) {
            return 0L;
        }
        long startapp = this.f26985e.startapp();
        if (startapp == 9205357640488583168L) {
            return j;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (startapp >> 32));
        if (Math.abs(intBitsToFloat) > Float.MAX_VALUE) {
            intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        }
        float intBitsToFloat2 = Float.intBitsToFloat((int) (startapp & 4294967295L));
        if (Math.abs(intBitsToFloat2) > Float.MAX_VALUE) {
            intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        long yandex = this.f26984e.yandex(floatToRawIntBits, j);
        return (Math.abs(Float.intBitsToFloat((int) (yandex >> 32))) > Float.MAX_VALUE || Math.abs(Float.intBitsToFloat((int) (4294967295L & yandex))) > Float.MAX_VALUE) ? j : AbstractC0258e.appmetrica(floatToRawIntBits, yandex);
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: e٘ٔ٘ */
    public final void mo229e() {
        InterfaceC18435e m3623e = m3623e();
        C13108e c13108e = this.f26985e;
        c13108e.f26053e = m3623e;
        c13108e.metrica();
    }

    @Override // defpackage.InterfaceC17303e
    public final InterfaceC17242e license(InterfaceC13158e interfaceC13158e, InterfaceC16719e interfaceC16719e, long j) {
        C5715e c5715e = this.f26980e;
        if (c5715e != null) {
            c5715e.yandex(j);
        }
        AbstractC2832e admob = interfaceC16719e.admob(m3621e(j));
        return interfaceC13158e.ads(admob.f6806e, admob.f6804e, C9139e.f18290e, new C4889e(admob, 0));
    }

    @Override // defpackage.InterfaceC17303e
    public final int purchase(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        long vip = AbstractC2278e.vip(0, i, 0, 0, 13);
        C5715e c5715e = this.f26980e;
        if (c5715e != null) {
            c5715e.yandex(vip);
        }
        if (this.f26985e.startapp() == 9205357640488583168L) {
            return interfaceC16719e.metrica(i);
        }
        long m3621e = m3621e(vip);
        return Math.max(C5602e.startapp(m3621e), interfaceC16719e.metrica(i));
    }

    @Override // defpackage.InterfaceC17453e
    public final /* synthetic */ boolean smaato() {
        return true;
    }

    @Override // defpackage.InterfaceC17303e
    public final int startapp(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        long vip = AbstractC2278e.vip(0, 0, 0, i, 7);
        C5715e c5715e = this.f26980e;
        if (c5715e != null) {
            c5715e.yandex(vip);
        }
        if (this.f26985e.startapp() == 9205357640488583168L) {
            return interfaceC16719e.smaato(i);
        }
        long m3621e = m3621e(vip);
        return Math.max(C5602e.adcel(m3621e), interfaceC16719e.smaato(i));
    }
}
