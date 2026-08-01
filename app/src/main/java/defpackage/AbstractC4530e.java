package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؖۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4530e {
    public static final float ad;
    public static final float metrica;
    public static final float vip = 12;

    static {
        float f = 2;
        ad = f;
        metrica = f;
    }

    public static final void ad(boolean z, Function0 function0, InterfaceC12864e interfaceC12864e, boolean z2, C9657e c9657e, C13770e c13770e, int i) {
        C13770e c13770e2;
        InterfaceC12864e interfaceC12864e2;
        boolean z3;
        C9657e c9657e2;
        C9657e c9657e3;
        boolean z4;
        C9657e c9657e4;
        InterfaceC12864e interfaceC12864e3;
        InterfaceC16132e interfaceC16132e;
        C9657e c9657e5;
        InterfaceC16132e mopub;
        InterfaceC12864e interfaceC12864e4;
        c13770e.m3671package(408580840);
        int i2 = i | (c13770e.billing(z) ? 4 : 2) | (c13770e.yandex(function0) ? 32 : 16) | 208256;
        if (c13770e.m3673protected(i2 & 1, (74899 & i2) != 74898)) {
            c13770e.m3655case();
            int i3 = i & 1;
            InterfaceC12864e interfaceC12864e5 = C0115e.f1276e;
            if (i3 == 0 || c13770e.isPro()) {
                C9553e c9553e = ((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad;
                C9657e c9657e6 = c9553e.f18957volatile;
                if (c9657e6 == null) {
                    float f = AbstractC7511e.ad;
                    c9657e3 = new C9657e(AbstractC7893e.license(c9553e, 26), AbstractC7893e.license(c9553e, 19), C3618e.vip(0.38f, AbstractC7893e.license(c9553e, 18)), C3618e.vip(0.38f, AbstractC7893e.license(c9553e, 18)));
                    c9553e.f18957volatile = c9657e3;
                } else {
                    c9657e3 = c9657e6;
                }
                z4 = true;
                c9657e4 = c9657e3;
                interfaceC12864e3 = interfaceC12864e5;
            } else {
                c13770e.m3659default();
                interfaceC12864e3 = interfaceC12864e;
                z4 = z2;
                c9657e4 = c9657e;
            }
            c13770e.admob();
            InterfaceC16132e ad2 = AbstractC16102e.ad(z ? vip / 2 : 0, AbstractC11008e.metrica(c13770e, 2), null, c13770e, 0, 12);
            c9657e4.getClass();
            long j = (z4 && z) ? c9657e4.ad : (!z4 || z) ? (z4 || !z) ? c9657e4.license : c9657e4.metrica : c9657e4.vip;
            if (z4) {
                c13770e.m3676strictfp(1194671677);
                interfaceC16132e = ad2;
                c9657e5 = c9657e4;
                c13770e2 = c13770e;
                mopub = AbstractC3145e.ad(j, AbstractC11008e.metrica(c13770e, 4), null, null, c13770e2, 0, 12);
                c13770e2.Signature(false);
            } else {
                interfaceC16132e = ad2;
                c13770e2 = c13770e;
                c9657e5 = c9657e4;
                c13770e2.m3676strictfp(1194849338);
                mopub = AbstractC14533e.mopub(new C3618e(j), c13770e2);
                c13770e2.Signature(false);
            }
            InterfaceC16132e interfaceC16132e2 = mopub;
            if (function0 != null) {
                z3 = z4;
                interfaceC12864e4 = AbstractC17947e.adcel(interfaceC12864e5, z, null, AbstractC17052e.ad(AbstractC7511e.vip / 2, 4, 0L, false), z3, new C11796e(3), function0);
            } else {
                z3 = z4;
                interfaceC12864e4 = interfaceC12864e5;
            }
            if (function0 != null) {
                C4782e c4782e = AbstractC7562e.ad;
                interfaceC12864e5 = C10623e.f20937e;
            }
            InterfaceC12864e billing = AbstractC18007e.billing(AbstractC12220e.mopub(AbstractC18007e.Signature(interfaceC12864e3.premium(interfaceC12864e5).premium(interfaceC12864e4), C5438e.f11700e), ad), AbstractC7511e.ad);
            boolean purchase = c13770e2.purchase(interfaceC16132e2) | c13770e2.purchase(interfaceC16132e);
            Object m3681throw = c13770e2.m3681throw();
            if (purchase || m3681throw == C2987e.ad) {
                m3681throw = new C2099e(interfaceC16132e2, interfaceC16132e, 1);
                c13770e2.m3682throws(m3681throw);
            }
            AbstractC18366e.ad(billing, (Function1) m3681throw, c13770e2, 0);
            interfaceC12864e2 = interfaceC12864e3;
            c9657e2 = c9657e5;
        } else {
            c13770e2 = c13770e;
            c13770e2.m3659default();
            interfaceC12864e2 = interfaceC12864e;
            z3 = z2;
            c9657e2 = c9657e;
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C14492e(z, function0, interfaceC12864e2, z3, c9657e2, i, 1);
        }
    }
}
