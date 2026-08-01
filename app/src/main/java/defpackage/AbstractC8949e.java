package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۙۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8949e {
    static {
        AbstractC1101e.startapp(new C10673e(16));
    }

    public static final InterfaceC16154e ad(C13770e c13770e, int i) {
        C17500e c17500e = ((C7019e) c13770e.adcel(AbstractC11785e.ad)).metrica;
        C3924e c3924e = c17500e.appmetrica;
        C3924e c3924e2 = c17500e.ad;
        C3924e c3924e3 = c17500e.license;
        switch (AbstractC8703e.m2467class(i)) {
            case 0:
                return c17500e.yandex;
            case 1:
                return c3924e;
            case 2:
                return c17500e.billing;
            case 3:
                return vip(c3924e);
            case 4:
                return c3924e2;
            case 5:
                return vip(c3924e2);
            case 6:
                return AbstractC6549e.ad;
            case 7:
                return c3924e3;
            case 8:
                C3924e c3924e4 = c17500e.license;
                C1536e c1536e = AbstractC16871e.startapp;
                return C3924e.metrica(c3924e4, c1536e, null, null, c1536e, 6);
            case 9:
                return c17500e.purchase;
            case 10:
                C3924e c3924e5 = c17500e.license;
                C1536e c1536e2 = AbstractC16871e.startapp;
                return C3924e.metrica(c3924e5, null, c1536e2, c1536e2, null, 9);
            case 11:
                return vip(c3924e3);
            case 12:
                return c17500e.metrica;
            case 13:
                return AbstractC10432e.ad;
            case 14:
                return c17500e.vip;
            default:
                throw new C14803e(10);
        }
    }

    public static C3924e vip(C3924e c3924e) {
        C1536e c1536e = AbstractC16871e.startapp;
        return C3924e.metrica(c3924e, null, null, c1536e, c1536e, 3);
    }
}
