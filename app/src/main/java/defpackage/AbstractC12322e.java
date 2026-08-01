package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚّؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC12322e {
    public static final InterfaceC16772e ad(InterfaceC2334e interfaceC2334e) {
        if (interfaceC2334e instanceof InterfaceC10518e) {
            C13655e f36708e = ((InterfaceC10518e) ((InterfaceC14287e) interfaceC2334e)).getF36708e();
            if (f36708e != null) {
                return f36708e;
            }
            throw new IllegalArgumentException("Cannot delete unmanaged objects.");
        }
        if (interfaceC2334e instanceof InterfaceC16772e) {
            return (InterfaceC16772e) interfaceC2334e;
        }
        throw new IllegalArgumentException(AbstractC17861e.Signature("Cannot delete custom Deleteable objects: ", AbstractC3820e.ad.vip(interfaceC2334e.getClass()).mopub()));
    }

    public static C9520e appmetrica(C9553e c9553e) {
        C9520e c9520e = c9553e.f18942package;
        if (c9520e != null) {
            return c9520e;
        }
        float f = AbstractC8345e.ad;
        C9520e c9520e2 = new C9520e(AbstractC7893e.license(c9553e, 39), AbstractC7893e.ad(c9553e, AbstractC7893e.license(c9553e, 39)), AbstractC6532e.billing(C3618e.vip(AbstractC8345e.appmetrica, AbstractC7893e.license(c9553e, AbstractC8345e.metrica)), AbstractC7893e.license(c9553e, 39)), C3618e.vip(0.38f, AbstractC7893e.ad(c9553e, AbstractC7893e.license(c9553e, 39))));
        c9553e.f18942package = c9520e2;
        return c9520e2;
    }

    public static C7433e billing(C13770e c13770e, int i) {
        c13770e.m3676strictfp(2106917102);
        long appmetrica = AbstractC7893e.appmetrica(c13770e, AbstractC18481e.appmetrica);
        c13770e.Signature(false);
        boolean appmetrica2 = c13770e.appmetrica(appmetrica);
        Object m3681throw = c13770e.m3681throw();
        if (appmetrica2 || m3681throw == C2987e.ad) {
            m3681throw = AbstractC16619e.ad(AbstractC18481e.purchase, appmetrica);
            c13770e.m3682throws(m3681throw);
        }
        return (C7433e) m3681throw;
    }

    public static C2332e license() {
        return new C2332e(AbstractC2891e.ad, AbstractC2891e.purchase, AbstractC2891e.license, AbstractC2891e.appmetrica, AbstractC2891e.metrica, AbstractC2891e.vip);
    }

    public static C2332e metrica() {
        return new C2332e(AbstractC8345e.ad, AbstractC8345e.startapp, AbstractC8345e.billing, AbstractC8345e.yandex, AbstractC8345e.purchase, AbstractC8345e.license);
    }

    public static InterfaceC12864e purchase(InterfaceC12864e interfaceC12864e, C4254e c4254e, Function1 function1) {
        return interfaceC12864e.premium(new C2519e(c4254e, C11371e.purchase, function1));
    }

    public static long startapp(C10675e c10675e) {
        C18511e c18511e = AbstractC11062e.f21949e;
        C15308e mo1917goto = c18511e.mo1917goto(c10675e);
        long j = 0;
        if (mo1917goto != null) {
            if (!mo1917goto.ad) {
                C10649e c10649e = new C10649e(AbstractC7762e.loadAd(AbstractC7762e.startapp(AbstractC7762e.loadAd(c18511e.subs(c10675e), new C10981e(1, c18511e, AbstractC11062e.class, "metadataOrNull", "metadataOrNull(Lokio/Path;)Lokio/FileMetadata;", 0, 0, 13)), C16473e.f32298e), C11778e.f23654e));
                while (c10649e.hasNext()) {
                    j += ((Number) c10649e.next()).longValue();
                }
                return j;
            }
            Long l = mo1917goto.license;
            if (l != null) {
                return l.longValue();
            }
        }
        return 0L;
    }

    public static C9520e vip(long j, long j2, long j3, long j4, C13770e c13770e, int i, int i2) {
        if ((i2 & 1) != 0) {
            j = C3618e.adcel;
        }
        if ((i2 & 2) != 0) {
            j2 = AbstractC7893e.vip(j, c13770e);
        }
        if ((i2 & 4) != 0) {
            j3 = C3618e.adcel;
        }
        if ((i2 & 8) != 0) {
            j4 = C3618e.vip(0.38f, j2);
        }
        return appmetrica(((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad).ad(j, j2, j3, j4);
    }

    public static C9520e yandex(long j, long j2, C13770e c13770e, int i, int i2) {
        C9520e c9520e;
        long vip = (i2 & 2) != 0 ? AbstractC7893e.vip(j, c13770e) : j2;
        long j3 = C3618e.adcel;
        long vip2 = C3618e.vip(0.38f, AbstractC7893e.vip(j, c13770e));
        C9553e c9553e = ((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad;
        C9520e c9520e2 = c9553e.f18955transient;
        if (c9520e2 == null) {
            float f = AbstractC18481e.ad;
            C9520e c9520e3 = new C9520e(AbstractC7893e.license(c9553e, 35), AbstractC7893e.ad(c9553e, AbstractC7893e.license(c9553e, 35)), AbstractC7893e.license(c9553e, 35), C3618e.vip(0.38f, AbstractC7893e.ad(c9553e, AbstractC7893e.license(c9553e, 35))));
            c9553e.f18955transient = c9520e3;
            c9520e = c9520e3;
        } else {
            c9520e = c9520e2;
        }
        return c9520e.ad(j, vip, j3, vip2);
    }
}
