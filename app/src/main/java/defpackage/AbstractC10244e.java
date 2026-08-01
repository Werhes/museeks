package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10244e {
    public static final C16005e ad;
    public static final float license;
    public static final float metrica;
    public static final C16005e vip;

    static {
        float f = AbstractC15731e.ad;
        float f2 = AbstractC15731e.vip;
        float f3 = 16;
        float f4 = AbstractC14672e.ad;
        float f5 = 8;
        ad = new C16005e(f, f5, f2, f5);
        AbstractC12220e.license(f3, f5, f2, f5);
        float f6 = 12;
        vip = new C16005e(f6, f5, f6, f5);
        AbstractC12220e.license(f6, f5, f3, f5);
        metrica = 58;
        C0576e c0576e = AbstractC8882e.ad;
        license = ((Boolean) c0576e.getValue()).booleanValue() ? 36 : AbstractC14672e.ad;
        ((Boolean) c0576e.getValue()).booleanValue();
        ((Boolean) c0576e.getValue()).booleanValue();
        ((Boolean) c0576e.getValue()).booleanValue();
        ((Boolean) c0576e.getValue()).booleanValue();
        ((Boolean) c0576e.getValue()).getClass();
        ((Boolean) c0576e.getValue()).getClass();
        ((Boolean) c0576e.getValue()).getClass();
        ((Boolean) c0576e.getValue()).getClass();
        ((Boolean) c0576e.getValue()).getClass();
        ((Boolean) c0576e.getValue()).getClass();
        ((Boolean) c0576e.getValue()).booleanValue();
        ((Boolean) c0576e.getValue()).booleanValue();
        ((Boolean) c0576e.getValue()).booleanValue();
        ((Boolean) c0576e.getValue()).booleanValue();
    }

    public static C3134e ad(long j, long j2, long j3, long j4, C13770e c13770e, int i) {
        if ((i & 1) != 0) {
            j = C3618e.adcel;
        }
        long j5 = j;
        if ((i & 2) != 0) {
            j2 = C3618e.adcel;
        }
        long j6 = j2;
        if ((i & 4) != 0) {
            j3 = C3618e.adcel;
        }
        return vip(((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad).ad(j5, j6, j3, (i & 8) != 0 ? C3618e.adcel : j4);
    }

    public static C3134e appmetrica(long j, C13770e c13770e) {
        long j2 = C3618e.adcel;
        return metrica(((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad).ad(j2, j, j2, j2);
    }

    public static C3134e license(C9553e c9553e) {
        C3134e c3134e = c9553e.f18943private;
        if (c3134e != null) {
            return c3134e;
        }
        long j = C3618e.startapp;
        C3134e c3134e2 = new C3134e(j, AbstractC7893e.license(c9553e, 26), j, C3618e.vip(0.38f, AbstractC7893e.license(c9553e, 19)));
        c9553e.f18943private = c3134e2;
        return c3134e2;
    }

    public static C3134e metrica(C9553e c9553e) {
        C3134e c3134e = c9553e.f18948strictfp;
        if (c3134e != null) {
            return c3134e;
        }
        long j = C3618e.startapp;
        C3134e c3134e2 = new C3134e(j, AbstractC7893e.license(c9553e, 19), j, C3618e.vip(0.38f, AbstractC7893e.license(c9553e, 19)));
        c9553e.f18948strictfp = c3134e2;
        return c3134e2;
    }

    public static C3134e purchase(long j, long j2, C13770e c13770e, int i) {
        long j3 = C3618e.adcel;
        return license(((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad).ad(j3, j, j3, (i & 8) != 0 ? j3 : j2);
    }

    public static C3134e vip(C9553e c9553e) {
        C3134e c3134e = c9553e.f18949super;
        if (c3134e != null) {
            return c3134e;
        }
        float f = AbstractC5844e.ad;
        C3134e c3134e2 = new C3134e(AbstractC7893e.license(c9553e, 26), AbstractC7893e.license(c9553e, AbstractC5844e.adcel), C3618e.vip(AbstractC5844e.metrica, AbstractC7893e.license(c9553e, AbstractC5844e.yandex)), C3618e.vip(AbstractC5844e.license, AbstractC7893e.license(c9553e, AbstractC5844e.startapp)));
        c9553e.f18949super = c3134e2;
        return c3134e2;
    }
}
