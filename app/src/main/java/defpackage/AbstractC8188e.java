package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۙۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8188e {
    public static final float ad = 2;

    public static C4835e ad(C13770e c13770e) {
        C9553e c9553e = ((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad;
        C4835e c4835e = c9553e.f18951synchronized;
        if (c4835e != null) {
            return c4835e;
        }
        long license = AbstractC7893e.license(c9553e, AbstractC0720e.billing);
        long j = C3618e.startapp;
        long license2 = AbstractC7893e.license(c9553e, AbstractC0720e.purchase);
        int i = AbstractC0720e.license;
        long license3 = AbstractC7893e.license(c9553e, i);
        int i2 = AbstractC0720e.appmetrica;
        long license4 = AbstractC7893e.license(c9553e, i2);
        float f = AbstractC0720e.ad;
        C4835e c4835e2 = new C4835e(license, j, license3, j, C3618e.vip(f, license4), j, C3618e.vip(f, AbstractC7893e.license(c9553e, i2)), AbstractC7893e.license(c9553e, i), AbstractC7893e.license(c9553e, AbstractC0720e.startapp), C3618e.vip(f, AbstractC7893e.license(c9553e, i2)), C3618e.vip(AbstractC0720e.metrica, AbstractC7893e.license(c9553e, AbstractC0720e.yandex)), C3618e.vip(f, AbstractC7893e.license(c9553e, i2)), license2);
        c9553e.f18951synchronized = c4835e2;
        return c4835e2;
    }
}
