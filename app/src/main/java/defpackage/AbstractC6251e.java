package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؙؚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6251e {
    public static final float ad;
    public static final C2128e appmetrica;
    public static final C18351e license;
    public static final float metrica;
    public static final float vip;

    static {
        int i = C3618e.mopub;
        C1299e c1299e = C1299e.ad;
        ad = 240;
        vip = 360;
        metrica = 720;
        C13789e c13789e = AbstractC0750e.vip;
        C13789e c13789e2 = new C13789e(0.0f, 1.0f, 0.0f, 1.0f);
        C12870e c12870e = new C12870e(600, 100, c13789e);
        C12870e c12870e2 = new C12870e(350, 100, c13789e2);
        AbstractC12696e.yandex(350, 2, c13789e2);
        C12870e c12870e3 = new C12870e(600, 100, c13789e);
        C12870e c12870e4 = new C12870e(350, 100, c13789e2);
        license = AbstractC15869e.license(c12870e, 2).ad(AbstractC15869e.metrica(c12870e3, 14));
        appmetrica = AbstractC15869e.appmetrica(c12870e2, 2).ad(AbstractC15869e.yandex(c12870e4, 14));
        AbstractC12696e.yandex(100, 2, AbstractC0750e.appmetrica);
    }

    public static final void ad(Function1 function1, final InterfaceC12864e interfaceC12864e, InterfaceC16154e interfaceC16154e, C12316e c12316e, float f, float f2, C13770e c13770e, final int i) {
        Function1 function12;
        final InterfaceC16154e interfaceC16154e2;
        final C12316e c12316e2;
        final float f3;
        final float f4;
        float f5;
        C12316e c12316e3;
        float f6;
        InterfaceC16154e interfaceC16154e3;
        c13770e.m3671package(-2008777812);
        int i2 = i | 14229504;
        if (c13770e.m3673protected(i2 & 1, (38347923 & i2) != 38347922)) {
            c13770e.m3655case();
            if ((i & 1) == 0 || c13770e.isPro()) {
                C1299e c1299e = C1299e.ad;
                InterfaceC16154e ad2 = AbstractC8949e.ad(c13770e, AbstractC11170e.vip);
                C1299e c1299e2 = C1299e.ad;
                float f7 = AbstractC17572e.ad;
                C12316e c12316e4 = new C12316e(AbstractC7893e.appmetrica(c13770e, 38), AbstractC7893e.appmetrica(c13770e, AbstractC11170e.ad), C1299e.vip(c13770e, 3072));
                f5 = C1299e.vip;
                c12316e3 = c12316e4;
                f6 = C1299e.metrica;
                interfaceC16154e3 = ad2;
            } else {
                c13770e.m3659default();
                interfaceC16154e3 = interfaceC16154e;
                c12316e3 = c12316e;
                f5 = f;
                f6 = f2;
            }
            c13770e.admob();
            long j = c12316e3.ad;
            AbstractC12121e.ad(AbstractC18007e.smaato(interfaceC12864e.premium(new C1904e(1.0f)), vip), interfaceC16154e3, j, AbstractC7893e.vip(j, c13770e), f5, f6, null, AbstractC16653e.license(401953073, new C17689e(27, c12316e3), c13770e), c13770e, 12804096, 64);
            Object m3681throw = c13770e.m3681throw();
            if (m3681throw == C2987e.ad) {
                function12 = function1;
                m3681throw = new C4338e(function12);
                c13770e.m3682throws(m3681throw);
            } else {
                function12 = function1;
            }
            AbstractC0815e.license(false, (Function0) m3681throw, c13770e, 6);
            interfaceC16154e2 = interfaceC16154e3;
            f3 = f5;
            f4 = f6;
            c12316e2 = c12316e3;
        } else {
            function12 = function1;
            c13770e.m3659default();
            interfaceC16154e2 = interfaceC16154e;
            c12316e2 = c12316e;
            f3 = f;
            f4 = f2;
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            final Function1 function13 = function12;
            subscription.license = new Function2(interfaceC12864e, interfaceC16154e2, c12316e2, f3, f4, i) { // from class: eؔۙٚ

                /* renamed from: eّؑؑ, reason: contains not printable characters */
                public final /* synthetic */ float f6773e;

                /* renamed from: eًؔؐ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC16154e f6774e;

                /* renamed from: eؘٙؓ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC12864e f6775e;

                /* renamed from: eؙِٖ, reason: contains not printable characters */
                public final /* synthetic */ C12316e f6776e;

                /* renamed from: eٗۚۖ, reason: contains not printable characters */
                public final /* synthetic */ float f6778e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int advert = AbstractC5190e.advert(100666807);
                    AbstractC6251e.ad(Function1.this, this.f6775e, this.f6774e, this.f6776e, this.f6773e, this.f6778e, (C13770e) obj, advert);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
