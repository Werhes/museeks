package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؚٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5679e {
    public static final C15816e ad = new C15816e(22, new C11689e(22));
    public static SharedPreferences vip;

    public static final void ad(int i, C11644e c11644e, InterfaceC10260e interfaceC10260e, InterfaceC6428e interfaceC6428e, InterfaceC8642e interfaceC8642e, C13770e c13770e, C10707e c10707e, C8202e c8202e, InterfaceC12864e interfaceC12864e, C16005e c16005e, Function1 function1, boolean z) {
        C10707e c10707e2;
        C11644e c11644e2;
        InterfaceC6428e interfaceC6428e2;
        InterfaceC8642e interfaceC8642e2;
        C8202e c8202e2;
        boolean z2;
        C8202e ad2;
        C11644e ad3;
        int i2;
        boolean z3;
        InterfaceC6428e interfaceC6428e3;
        boolean z4;
        InterfaceC8642e interfaceC8642e3;
        c13770e.m3671package(635941664);
        int i3 = i | (c13770e.purchase(c10707e) ? 4 : 2) | (c13770e.purchase(interfaceC12864e) ? 32 : 16) | 374890624;
        int i4 = c13770e.yandex(function1) ? 4 : 2;
        boolean z5 = true;
        if (c13770e.m3673protected(i3 & 1, ((306783379 & i3) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            c13770e.m3655case();
            int i5 = i & 1;
            Object obj = C2987e.ad;
            if (i5 == 0 || c13770e.isPro()) {
                ad2 = AbstractC8644e.ad(c13770e);
                C9616e c9616e = AbstractC16497e.metrica;
                C15217e ad4 = AbstractC9571e.ad(c13770e);
                boolean purchase = c13770e.purchase(ad4);
                Object m3681throw = c13770e.m3681throw();
                if (purchase || m3681throw == obj) {
                    m3681throw = new C4807e(ad4);
                    c13770e.m3682throws(m3681throw);
                }
                ad3 = AbstractC8281e.ad(c13770e);
                i2 = i3 & (-1908409217);
                z3 = false;
                interfaceC6428e3 = c9616e;
                z4 = true;
                interfaceC8642e3 = (C4807e) m3681throw;
            } else {
                c13770e.m3659default();
                i2 = i3 & (-1908409217);
                ad3 = c11644e;
                interfaceC8642e3 = interfaceC8642e;
                ad2 = c8202e;
                z4 = z;
                z3 = false;
                interfaceC6428e3 = interfaceC6428e;
            }
            c13770e.admob();
            int i6 = (i2 & 14) | 48;
            if ((((i6 & 14) ^ 6) <= 4 || !c13770e.purchase(c10707e)) && (i6 & 6) != 4) {
                z5 = z3;
            }
            Object m3681throw2 = c13770e.m3681throw();
            if (z5 || m3681throw2 == obj) {
                c10707e2 = c10707e;
                m3681throw2 = new C0314e(new C17785e(c10707e2, interfaceC6428e3, 12));
                c13770e.m3682throws(m3681throw2);
            } else {
                c10707e2 = c10707e;
            }
            C11644e c11644e3 = ad3;
            AbstractC10432e.ad(interfaceC12864e, ad2, (C0314e) m3681throw2, c16005e, false, interfaceC8642e3, z4, c11644e3, interfaceC6428e3, interfaceC10260e, function1, c13770e, ((i2 >> 3) & 14) | 818113536, ((i4 << 3) & 112) | 6);
            interfaceC8642e2 = interfaceC8642e3;
            z2 = z4;
            c11644e2 = c11644e3;
            interfaceC6428e2 = interfaceC6428e3;
            c8202e2 = ad2;
        } else {
            c10707e2 = c10707e;
            c13770e.m3659default();
            c11644e2 = c11644e;
            interfaceC6428e2 = interfaceC6428e;
            interfaceC8642e2 = interfaceC8642e;
            c8202e2 = c8202e;
            z2 = z;
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C16539e(c10707e2, interfaceC12864e, c8202e2, c16005e, interfaceC10260e, interfaceC6428e2, interfaceC8642e2, z2, c11644e2, function1, i);
        }
    }

    public static final InterfaceC12864e appmetrica(C13770e c13770e, InterfaceC12864e interfaceC12864e) {
        if (interfaceC12864e.mo256volatile(C5430e.f11656e)) {
            return interfaceC12864e;
        }
        c13770e.m3672private(1219399079);
        InterfaceC12864e interfaceC12864e2 = (InterfaceC12864e) interfaceC12864e.appmetrica(C0115e.f1276e, new C1827e(4, c13770e));
        c13770e.Signature(false);
        return interfaceC12864e2;
    }

    public static SharedPreferences billing(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            try {
                if (vip == null) {
                    vip = (SharedPreferences) AbstractC1599e.smaato(new CallableC8878e(2, context));
                }
                sharedPreferences = vip;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sharedPreferences;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void license(InterfaceC4238e interfaceC4238e) {
        if (((AbstractC13616e) interfaceC4238e).f27022e.f27016e && interfaceC4238e.mo345return(ad) != null) {
            throw new ClassCastException();
        }
    }

    public static final InterfaceC12864e metrica(InterfaceC12864e interfaceC12864e, Function3 function3) {
        return interfaceC12864e.premium(new C2064e(function3));
    }

    public static final InterfaceC12864e purchase(C13770e c13770e, InterfaceC12864e interfaceC12864e) {
        c13770e.m3676strictfp(439770924);
        InterfaceC12864e appmetrica = appmetrica(c13770e, interfaceC12864e);
        c13770e.Signature(false);
        return appmetrica;
    }

    public static final void vip(int i, C11644e c11644e, InterfaceC10260e interfaceC10260e, InterfaceC6428e interfaceC6428e, InterfaceC8642e interfaceC8642e, C13770e c13770e, C10707e c10707e, C8202e c8202e, InterfaceC12864e interfaceC12864e, C16005e c16005e, Function1 function1, boolean z) {
        C10707e c10707e2;
        C11644e c11644e2;
        InterfaceC8642e interfaceC8642e2;
        C8202e c8202e2;
        boolean z2;
        C8202e ad2;
        C11644e ad3;
        int i2;
        boolean z3;
        InterfaceC8642e interfaceC8642e3;
        InterfaceC10260e interfaceC10260e2;
        c13770e.m3671package(-2072102870);
        int i3 = i | (c13770e.purchase(c10707e) ? 4 : 2) | (c13770e.purchase(interfaceC12864e) ? 32 : 16) | 373317760;
        int i4 = c13770e.yandex(function1) ? 4 : 2;
        boolean z4 = true;
        if (c13770e.m3673protected(i3 & 1, ((306783379 & i3) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            c13770e.m3655case();
            int i5 = i & 1;
            Object obj = C2987e.ad;
            if (i5 == 0 || c13770e.isPro()) {
                ad2 = AbstractC8644e.ad(c13770e);
                C15217e ad4 = AbstractC9571e.ad(c13770e);
                boolean purchase = c13770e.purchase(ad4);
                Object m3681throw = c13770e.m3681throw();
                if (purchase || m3681throw == obj) {
                    m3681throw = new C4807e(ad4);
                    c13770e.m3682throws(m3681throw);
                }
                ad3 = AbstractC8281e.ad(c13770e);
                i2 = i3 & (-1908409217);
                z3 = true;
                interfaceC8642e3 = (C4807e) m3681throw;
            } else {
                c13770e.m3659default();
                i2 = i3 & (-1908409217);
                ad3 = c11644e;
                interfaceC8642e3 = interfaceC8642e;
                ad2 = c8202e;
                z3 = z;
            }
            c13770e.admob();
            int i6 = (i2 & 14) | 48;
            if ((((i6 & 14) ^ 6) <= 4 || !c13770e.purchase(c10707e)) && (i6 & 6) != 4) {
                z4 = false;
            }
            Object m3681throw2 = c13770e.m3681throw();
            if (z4 || m3681throw2 == obj) {
                interfaceC10260e2 = interfaceC10260e;
                c10707e2 = c10707e;
                m3681throw2 = new C0314e(new C17785e(c10707e2, interfaceC10260e2, 13));
                c13770e.m3682throws(m3681throw2);
            } else {
                interfaceC10260e2 = interfaceC10260e;
                c10707e2 = c10707e;
            }
            C11644e c11644e3 = ad3;
            AbstractC10432e.ad(interfaceC12864e, ad2, (C0314e) m3681throw2, c16005e, true, interfaceC8642e3, z3, c11644e3, interfaceC6428e, interfaceC10260e2, function1, c13770e, ((i2 >> 3) & 14) | 818113536, 6 | ((i4 << 3) & 112));
            interfaceC8642e2 = interfaceC8642e3;
            z2 = z3;
            c11644e2 = c11644e3;
            c8202e2 = ad2;
        } else {
            c10707e2 = c10707e;
            c13770e.m3659default();
            c11644e2 = c11644e;
            interfaceC8642e2 = interfaceC8642e;
            c8202e2 = c8202e;
            z2 = z;
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C16539e(c10707e2, interfaceC12864e, c8202e2, c16005e, interfaceC6428e, interfaceC10260e, interfaceC8642e2, z2, c11644e2, function1, i);
        }
    }
}
