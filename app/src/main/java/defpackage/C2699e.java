package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔٛؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2699e implements InterfaceC5372e {
    public final InterfaceC5372e ad;
    public final C17709e license;
    public final InterfaceC5372e metrica;
    public final InterfaceC5372e vip;

    public C2699e(InterfaceC5372e interfaceC5372e, InterfaceC5372e interfaceC5372e2, InterfaceC5372e interfaceC5372e3) {
        this.ad = interfaceC5372e;
        this.vip = interfaceC5372e2;
        this.metrica = interfaceC5372e3;
        InterfaceC9998e[] interfaceC9998eArr = new InterfaceC9998e[0];
        C17955e c17955e = new C17955e(17, this);
        if (AbstractC5304e.m1866native("kotlin.Triple")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        C7469e c7469e = new C7469e("kotlin.Triple");
        c17955e.invoke(c7469e);
        this.license = new C17709e("kotlin.Triple", C6805e.appmetrica, c7469e.metrica.size(), AbstractC1660e.m670implements(interfaceC9998eArr), c7469e);
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C10985e c10985e = (C10985e) obj;
        C17709e c17709e = this.license;
        AbstractC15920e abstractC15920e = (AbstractC15920e) interfaceC5757e.metrica(c17709e);
        abstractC15920e.applovin(c17709e, 0, this.ad, c10985e.f21742e);
        abstractC15920e.applovin(c17709e, 1, this.vip, c10985e.f21741e);
        abstractC15920e.applovin(c17709e, 2, this.metrica, c10985e.f21740e);
        abstractC15920e.vip(c17709e);
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return this.license;
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        C17709e c17709e = this.license;
        InterfaceC2043e metrica = interfaceC11754e.metrica(c17709e);
        Object obj = AbstractC2641e.ad;
        Object obj2 = obj;
        Object obj3 = obj2;
        Object obj4 = obj3;
        while (true) {
            int yandex = metrica.yandex(c17709e);
            if (yandex == -1) {
                metrica.vip(c17709e);
                if (obj2 == obj) {
                    throw new IllegalArgumentException("Element 'first' is missing");
                }
                if (obj3 == obj) {
                    throw new IllegalArgumentException("Element 'second' is missing");
                }
                if (obj4 != obj) {
                    return new C10985e(obj2, obj3, obj4);
                }
                throw new IllegalArgumentException("Element 'third' is missing");
            }
            if (yandex == 0) {
                obj2 = metrica.subscription(c17709e, 0, this.ad, null);
            } else if (yandex == 1) {
                obj3 = metrica.subscription(c17709e, 1, this.vip, null);
            } else {
                if (yandex != 2) {
                    throw new IllegalArgumentException(AbstractC1786e.admob(yandex, "Unexpected index "));
                }
                obj4 = metrica.subscription(c17709e, 2, this.metrica, null);
            }
        }
    }
}
