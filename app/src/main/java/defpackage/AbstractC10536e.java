package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۛۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10536e {
    public static final float ad;
    public static final C12502e metrica;
    public static final float vip;

    static {
        long ad2 = AbstractC11160e.ad(16, 8);
        ad = 200;
        vip = 320;
        metrica = new C12502e(ad2);
    }

    public static C6824e ad(C13770e c13770e, int i) {
        int mo493e = ((InterfaceC14388e) c13770e.adcel(AbstractC11473e.yandex)).mo493e(AbstractC2241e.ad);
        long ad2 = ((C1692e) ((InterfaceC3075e) c13770e.adcel(AbstractC11473e.signatures))).ad();
        boolean license = c13770e.license(mo493e);
        boolean z = true;
        if ((((i & 14) ^ 6) <= 4 || !c13770e.license(1)) && (i & 6) != 4) {
            z = false;
        }
        boolean appmetrica = license | z | c13770e.appmetrica(ad2);
        Object m3681throw = c13770e.m3681throw();
        if (appmetrica || m3681throw == C2987e.ad) {
            m3681throw = new C6824e(mo493e, ad2);
            c13770e.m3682throws(m3681throw);
        }
        return (C6824e) m3681throw;
    }
}
