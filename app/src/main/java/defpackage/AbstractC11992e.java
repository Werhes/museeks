package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٜۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11992e {
    public static final float ad;

    static {
        AbstractC12220e.license(AbstractC16429e.billing, AbstractC16429e.startapp, AbstractC16429e.yandex, AbstractC16429e.adcel);
        ad = AbstractC14493e.vip;
    }

    public static C8872e ad(long j, long j2, long j3, long j4, C13770e c13770e, int i) {
        long j5 = (i & 1) != 0 ? C3618e.adcel : j;
        long j6 = (i & 2) != 0 ? C3618e.adcel : j2;
        long j7 = (i & 4) != 0 ? C3618e.adcel : j3;
        long j8 = C3618e.adcel;
        long j9 = (i & 32) != 0 ? j8 : j4;
        C8872e metrica = metrica(((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad);
        return metrica.ad(j5, j6, j7, j9, j8, j8, metrica.billing, j8, j8, j8, metrica.mopub, metrica.advert, metrica.smaato, metrica.amazon, metrica.loadAd, metrica.Signature, metrica.admob, metrica.subscription, metrica.remoteconfig, metrica.pro, metrica.signatures, metrica.tapsense, metrica.isVip, metrica.inmobi);
    }

    public static C8872e metrica(C9553e c9553e) {
        C8872e c8872e = c9553e.f18933finally;
        if (c8872e != null) {
            return c8872e;
        }
        float f = AbstractC14493e.ad;
        long license = AbstractC7893e.license(c9553e, 35);
        long license2 = AbstractC7893e.license(c9553e, AbstractC14493e.tapsense);
        long license3 = AbstractC7893e.license(c9553e, AbstractC14493e.inmobi);
        long license4 = AbstractC7893e.license(c9553e, AbstractC14493e.f28657this);
        long license5 = AbstractC7893e.license(c9553e, AbstractC14493e.isPro);
        long license6 = AbstractC7893e.license(c9553e, AbstractC14493e.f28655interface);
        long license7 = AbstractC7893e.license(c9553e, AbstractC14493e.ads);
        long license8 = AbstractC7893e.license(c9553e, AbstractC14493e.premium);
        long license9 = AbstractC7893e.license(c9553e, AbstractC14493e.subs);
        long license10 = AbstractC7893e.license(c9553e, AbstractC14493e.f28653class);
        long license11 = AbstractC7893e.license(c9553e, AbstractC14493e.crashlytics);
        long license12 = AbstractC7893e.license(c9553e, AbstractC14493e.firebase);
        C8872e c8872e2 = new C8872e(license, license2, license3, license4, license5, license6, AbstractC7893e.license(c9553e, 35), C3618e.vip(AbstractC14493e.metrica, AbstractC7893e.license(c9553e, AbstractC14493e.admob)), C3618e.vip(AbstractC14493e.license, AbstractC7893e.license(c9553e, AbstractC14493e.subscription)), C3618e.vip(AbstractC14493e.billing, AbstractC7893e.license(c9553e, AbstractC14493e.signatures)), C3618e.vip(AbstractC14493e.appmetrica, AbstractC7893e.license(c9553e, AbstractC14493e.remoteconfig)), C3618e.vip(AbstractC14493e.purchase, AbstractC7893e.license(c9553e, AbstractC14493e.pro)), license7, license8, license9, license10, license11, license12, AbstractC7893e.license(c9553e, 46), AbstractC7893e.license(c9553e, 21), AbstractC7893e.license(c9553e, 21), AbstractC7893e.license(c9553e, 21), AbstractC7893e.license(c9553e, 21), AbstractC7893e.license(c9553e, 21));
        c9553e.f18933finally = c8872e2;
        return c8872e2;
    }

    public static C8872e vip(long j, long j2, C13770e c13770e, int i) {
        long j3 = (i & 1) != 0 ? C3618e.adcel : j;
        long j4 = C3618e.adcel;
        return metrica(((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad).ad(j3, j4, j4, j2, j4, j4, j4, j4, j4, j4, j4, j4, j4, j4, j4, j4, j4, j4, j4, j4, j4, j4, j4, j4);
    }
}
