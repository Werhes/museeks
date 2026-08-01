package defpackage;

import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۣۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9083e {
    public static final C16005e ad;
    public static final float appmetrica;
    public static final float license;
    public static final float metrica;
    public static final float vip;

    static {
        float f = 0;
        ad = new C16005e(f, f, f, f);
        float f2 = AbstractC11256e.ad;
        vip = f2;
        metrica = f2;
        license = AbstractC12413e.ad;
        appmetrica = AbstractC12413e.vip;
    }

    public static C5958e ad(C13770e c13770e) {
        C5070e yandex = AbstractC10560e.yandex(c13770e);
        Object m3681throw = c13770e.m3681throw();
        Object obj = C2987e.ad;
        if (m3681throw == obj) {
            m3681throw = new C13117e(8);
            c13770e.m3682throws(m3681throw);
        }
        Function0 function0 = (Function0) m3681throw;
        InterfaceC6512e metrica2 = AbstractC11008e.metrica(c13770e, 4);
        C15217e ad2 = AbstractC9571e.ad(c13770e);
        boolean purchase = c13770e.purchase(yandex) | c13770e.purchase(function0) | c13770e.purchase(metrica2) | c13770e.purchase(ad2);
        Object m3681throw2 = c13770e.m3681throw();
        if (purchase || m3681throw2 == obj) {
            m3681throw2 = new C5958e(yandex, metrica2, ad2, function0);
            c13770e.m3682throws(m3681throw2);
        }
        return (C5958e) m3681throw2;
    }

    public static C10339e appmetrica(C13770e c13770e) {
        C5070e yandex = AbstractC10560e.yandex(c13770e);
        Object m3681throw = c13770e.m3681throw();
        Object obj = C2987e.ad;
        if (m3681throw == obj) {
            m3681throw = new C13117e(8);
            c13770e.m3682throws(m3681throw);
        }
        Function0 function0 = (Function0) m3681throw;
        boolean purchase = c13770e.purchase(yandex) | c13770e.purchase(function0);
        Object m3681throw2 = c13770e.m3681throw();
        if (purchase || m3681throw2 == obj) {
            m3681throw2 = new C10339e(yandex, function0);
            c13770e.m3682throws(m3681throw2);
        }
        return (C10339e) m3681throw2;
    }

    public static C13793e license(long j, long j2, long j3, C13770e c13770e, int i) {
        long j4 = (i & 2) != 0 ? C3618e.adcel : j2;
        long j5 = C3618e.adcel;
        long j6 = (i & 16) != 0 ? j5 : j3;
        C13793e vip2 = vip(((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad);
        return vip2.ad(j, j4, j5, j5, j6, vip2.purchase);
    }

    public static C10996e metrica(C13770e c13770e) {
        WeakHashMap weakHashMap = C8845e.isVip;
        return new C10996e(new C15657e(C16728e.subscription(c13770e).billing, C16728e.subscription(c13770e).vip), AbstractC17113e.appmetrica | 16);
    }

    public static C13793e purchase(long j, long j2, long j3, long j4, long j5, C13770e c13770e, int i) {
        return vip(((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad).ad(j, (i & 2) != 0 ? C3618e.adcel : j2, (i & 4) != 0 ? C3618e.adcel : j3, (i & 8) != 0 ? C3618e.adcel : j4, (i & 16) != 0 ? C3618e.adcel : j5, C3618e.adcel);
    }

    public static C13793e vip(C9553e c9553e) {
        C13793e c13793e = c9553e.f18947static;
        if (c13793e != null) {
            return c13793e;
        }
        int i = AbstractC8987e.ad;
        C13793e c13793e2 = new C13793e(AbstractC7893e.license(c9553e, 35), AbstractC7893e.license(c9553e, AbstractC8987e.vip), AbstractC7893e.license(c9553e, AbstractC8987e.ad), AbstractC7893e.license(c9553e, AbstractC8987e.license), AbstractC7893e.license(c9553e, AbstractC8987e.appmetrica), AbstractC7893e.license(c9553e, AbstractC8987e.metrica));
        c9553e.f18947static = c13793e2;
        return c13793e2;
    }
}
