package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؔؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2373e {
    public static final C16005e metrica;
    public static final C16005e vip;
    public static final C3924e ad = AbstractC6549e.ad;
    public static final float license = 20;
    public static final float appmetrica = 8;

    static {
        float f = 16;
        float f2 = 10;
        vip = new C16005e(f, f2, f, f2);
        metrica = new C16005e(12, f2, f, f2);
    }

    public static C9010e ad(long j, C13770e c13770e, int i) {
        long vip2 = (i & 1) != 0 ? C3618e.vip(0.8f, ((C6032e) c13770e.adcel(AbstractC12491e.ad)).adcel()) : j;
        C15492e c15492e = AbstractC12491e.ad;
        long vip3 = C3618e.vip(0.8f, ((C6032e) c13770e.adcel(c15492e)).appmetrica());
        long appmetrica2 = ((C6032e) c13770e.adcel(c15492e)).appmetrica();
        long metrica2 = ((C6032e) c13770e.adcel(c15492e)).metrica();
        return new C9010e(vip2, vip3, appmetrica2, metrica2, appmetrica2, metrica2, C3618e.vip(0.4f, ((C6032e) c13770e.adcel(c15492e)).adcel()), C3618e.vip(0.4f, ((C6032e) c13770e.adcel(c15492e)).appmetrica()));
    }
}
