package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًُؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7666e {
    public static C7666e yandex;
    public final EnumC7792e ad;
    public final C1839e appmetrica;
    public final InterfaceC2141e license;
    public final C11315e metrica;
    public final C1839e vip;
    public float purchase = Float.NaN;
    public float billing = Float.NaN;

    public C7666e(EnumC7792e enumC7792e, C1839e c1839e, C11315e c11315e, InterfaceC2141e interfaceC2141e) {
        this.ad = enumC7792e;
        this.vip = c1839e;
        this.metrica = c11315e;
        this.license = interfaceC2141e;
        this.appmetrica = AbstractC15890e.license(c1839e, enumC7792e);
    }

    public final long ad(int i, long j) {
        int startapp;
        float f = this.billing;
        float f2 = this.purchase;
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            String str = AbstractC14029e.ad;
            long vip = AbstractC2278e.vip(0, 0, 0, 0, 15);
            C1839e c1839e = this.appmetrica;
            C11315e c11315e = this.metrica;
            float adcel = AbstractC9186e.vip(str, c1839e, vip, c11315e, this.license, 1, 96).adcel();
            float adcel2 = AbstractC9186e.vip(AbstractC14029e.vip, this.appmetrica, AbstractC2278e.vip(0, 0, 0, 0, 15), c11315e, this.license, 2, 96).adcel() - adcel;
            this.billing = adcel;
            this.purchase = adcel2;
            f2 = adcel2;
            f = adcel;
        }
        if (i != 1) {
            int round = Math.round((f2 * (i - 1)) + f);
            startapp = round >= 0 ? round : 0;
            int billing = C5602e.billing(j);
            if (startapp > billing) {
                startapp = billing;
            }
        } else {
            startapp = C5602e.startapp(j);
        }
        return AbstractC2278e.ad(C5602e.adcel(j), C5602e.yandex(j), startapp, C5602e.billing(j));
    }
}
