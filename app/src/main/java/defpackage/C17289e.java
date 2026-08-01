package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗ۟ٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17289e extends AbstractC16824e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C17476e f33921e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C4983e f33922e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C2394e f33923e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final Object f33924e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C17476e f33925e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final InterfaceC18107e f33926e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f33927e = 0;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final C5042e f33928e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final InterfaceC8850e f33929e;

    public C17289e(C5042e c5042e, C8788e c8788e) {
        this.f33928e = c5042e;
        this.f33929e = c8788e.purchase;
        this.f33923e = c8788e.ad;
        this.f33922e = c8788e.license;
        this.f33925e = c8788e.vip;
        this.f33921e = c8788e.billing;
        Object obj = c8788e.appmetrica;
        InterfaceC13033e interfaceC13033e = obj instanceof InterfaceC13033e ? (InterfaceC13033e) obj : null;
        if (interfaceC13033e == null) {
            InterfaceC13033e.ad.getClass();
            interfaceC13033e = C15066e.vip;
        }
        this.f33924e = interfaceC13033e;
        this.f33926e = c8788e.metrica;
    }

    public C17289e(C9788e c9788e, byte[] bArr, AbstractC16824e abstractC16824e) {
        this.f33928e = c9788e;
        this.f33924e = bArr;
        this.f33923e = abstractC16824e.billing();
        this.f33922e = abstractC16824e.yandex();
        this.f33925e = abstractC16824e.appmetrica();
        this.f33921e = abstractC16824e.purchase();
        this.f33926e = abstractC16824e.ad();
        this.f33929e = abstractC16824e.advert();
    }

    @Override // defpackage.InterfaceC3052e
    public final InterfaceC18107e ad() {
        switch (this.f33927e) {
            case 0:
                return (C3057e) this.f33926e;
            default:
                return this.f33926e;
        }
    }

    @Override // defpackage.InterfaceC18435e
    public final InterfaceC8850e advert() {
        switch (this.f33927e) {
            case 0:
                return this.f33929e;
            default:
                return this.f33929e;
        }
    }

    @Override // defpackage.AbstractC16824e
    public final C17476e appmetrica() {
        switch (this.f33927e) {
            case 0:
                return this.f33925e;
            default:
                return this.f33925e;
        }
    }

    @Override // defpackage.AbstractC16824e
    public final C2394e billing() {
        switch (this.f33927e) {
            case 0:
                return this.f33923e;
            default:
                return this.f33923e;
        }
    }

    @Override // defpackage.AbstractC16824e
    public final InterfaceC13033e metrica() {
        switch (this.f33927e) {
            case 0:
                return (InterfaceC13033e) this.f33924e;
            default:
                return AbstractC4265e.ad((byte[]) this.f33924e);
        }
    }

    @Override // defpackage.AbstractC16824e
    public final C17476e purchase() {
        switch (this.f33927e) {
            case 0:
                return this.f33921e;
            default:
                return this.f33921e;
        }
    }

    @Override // defpackage.AbstractC16824e
    public final C5042e vip() {
        switch (this.f33927e) {
            case 0:
                return this.f33928e;
            default:
                return (C9788e) this.f33928e;
        }
    }

    @Override // defpackage.AbstractC16824e
    public final C4983e yandex() {
        switch (this.f33927e) {
            case 0:
                return this.f33922e;
            default:
                return this.f33922e;
        }
    }
}
