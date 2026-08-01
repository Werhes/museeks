package defpackage;

import android.database.Cursor;
import android.os.Build;
import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٟؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC12640e {
    public static void Signature(AbstractC13717e abstractC13717e, AbstractC13717e abstractC13717e2, Function1 function1) {
        if (abstractC13717e != abstractC13717e2) {
            abstractC13717e2.getClass();
            AbstractC13717e.admob(abstractC13717e);
            abstractC13717e2.metrica();
        } else if (abstractC13717e instanceof C15120e) {
            ((C15120e) abstractC13717e).subscription = function1;
        } else if (abstractC13717e instanceof C13142e) {
            ((C13142e) abstractC13717e).yandex = function1;
        } else {
            throw new IllegalStateException(("Non-transparent snapshot was reused: " + abstractC13717e).toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3, types: [eؔ۟ٓ] */
    public static final void ad(C13119e c13119e, Function1 function1, InterfaceC12864e interfaceC12864e, C18351e c18351e, C2128e c2128e, Function2 function2, C2892e c2892e, C13770e c13770e, int i) {
        int i2;
        C2892e c2892e2;
        C13770e c13770e2;
        C11139e c11139e;
        C5761e c5761e;
        C5761e c5761e2;
        boolean z;
        C18351e c18351e2;
        C13119e c13119e2;
        C15037e c15037e;
        C15037e c15037e2;
        boolean z2;
        C15037e c15037e3;
        boolean z3;
        C15037e c15037e4;
        boolean z4;
        C15037e c15037e5;
        boolean z5;
        C15037e c15037e6;
        int i3;
        C15037e c15037e7;
        C15037e c15037e8;
        C2128e c2128e2;
        boolean z6;
        C2892e c2892e3;
        C2892e c2892e4 = c2892e;
        C13770e c13770e3 = c13770e;
        C0576e c0576e = c13119e.license;
        c13770e3.m3671package(1912839215);
        if ((i & 6) == 0) {
            i2 = (c13770e3.purchase(c13119e) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e3.yandex(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c13770e3.purchase(interfaceC12864e) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c13770e3.purchase(c18351e) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c13770e3.purchase(c2128e) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= c13770e3.yandex(function2) ? 131072 : 65536;
        }
        int i4 = i2 | 1572864;
        if ((12582912 & i) == 0) {
            i4 |= c13770e3.yandex(c2892e4) ? 8388608 : 4194304;
        }
        int i5 = i4;
        if (!c13770e3.m3673protected(i5 & 1, (4793491 & i5) != 4793490)) {
            c13770e3.m3659default();
            c13770e2 = c13770e3;
            c2892e2 = c2892e4;
        } else if (((Boolean) function1.invoke(c0576e.getValue())).booleanValue() || ((Boolean) function1.invoke(c13119e.metrica())).booleanValue() || c13119e.billing() || c13119e.license()) {
            c13770e3.m3676strictfp(-232386135);
            int i6 = i5 & 14;
            int i7 = i6 | 48;
            int i8 = i7 & 14;
            boolean z7 = ((i8 ^ 6) > 4 && c13770e3.purchase(c13119e)) || (i7 & 6) == 4;
            Object m3681throw = c13770e3.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (z7 || m3681throw == c5170e) {
                m3681throw = c13119e.metrica();
                c13770e3.m3682throws(m3681throw);
            }
            if (c13119e.billing()) {
                m3681throw = c13119e.metrica();
            }
            c13770e3.m3676strictfp(1844425648);
            EnumC10292e subscription = subscription(c13119e, function1, m3681throw, c13770e3);
            c13770e3.Signature(false);
            Object value = c0576e.getValue();
            c13770e3.m3676strictfp(1844425648);
            EnumC10292e subscription2 = subscription(c13119e, function1, value, c13770e3);
            c13770e3.Signature(false);
            C13119e appmetrica = AbstractC0207e.appmetrica(c13119e, subscription, subscription2, "EnterExitTransition", c13770e, i8 | 3072);
            C13770e c13770e4 = c13770e;
            C11139e c11139e2 = AbstractC15869e.ad;
            boolean purchase = c13770e4.purchase(appmetrica);
            Object m3681throw2 = c13770e4.m3681throw();
            if (purchase || m3681throw2 == c5170e) {
                m3681throw2 = AbstractC14533e.startapp(c18351e);
                c13770e4.m3682throws(m3681throw2);
            }
            InterfaceC3314e interfaceC3314e = (InterfaceC3314e) m3681throw2;
            Object metrica = appmetrica.metrica();
            C0576e c0576e2 = appmetrica.license;
            Object value2 = c0576e2.getValue();
            EnumC10292e enumC10292e = EnumC10292e.f20309e;
            if (metrica == value2 && appmetrica.metrica() == enumC10292e) {
                if (appmetrica.billing()) {
                    interfaceC3314e.setValue(c18351e);
                } else {
                    interfaceC3314e.setValue(C18351e.vip);
                }
            } else if (c0576e2.getValue() == enumC10292e) {
                interfaceC3314e.setValue(((C18351e) interfaceC3314e.getValue()).ad(c18351e));
            }
            C18351e c18351e3 = (C18351e) interfaceC3314e.getValue();
            boolean purchase2 = c13770e4.purchase(appmetrica);
            Object m3681throw3 = c13770e4.m3681throw();
            if (purchase2 || m3681throw3 == c5170e) {
                m3681throw3 = AbstractC14533e.startapp(c2128e);
                c13770e4.m3682throws(m3681throw3);
            }
            InterfaceC3314e interfaceC3314e2 = (InterfaceC3314e) m3681throw3;
            if (appmetrica.metrica() == c0576e2.getValue() && appmetrica.metrica() == enumC10292e) {
                if (appmetrica.billing()) {
                    interfaceC3314e2.setValue(c2128e);
                } else {
                    interfaceC3314e2.setValue(C2128e.vip);
                }
            } else if (c0576e2.getValue() != enumC10292e) {
                interfaceC3314e2.setValue(((C2128e) interfaceC3314e2.getValue()).ad(c2128e));
            }
            C2128e c2128e3 = (C2128e) interfaceC3314e2.getValue();
            InterfaceC3314e mopub = AbstractC14533e.mopub(function2, c13770e4);
            Object invoke = function2.invoke(appmetrica.metrica(), c0576e2.getValue());
            boolean purchase3 = c13770e4.purchase(appmetrica) | c13770e4.purchase(mopub);
            Object m3681throw4 = c13770e4.m3681throw();
            InterfaceC5083e interfaceC5083e = null;
            if (purchase3 || m3681throw4 == c5170e) {
                m3681throw4 = new C14869e(appmetrica, mopub, interfaceC5083e, 5);
                c13770e4.m3682throws(m3681throw4);
            }
            InterfaceC3314e adcel = AbstractC14533e.adcel(c13770e4, invoke, (Function2) m3681throw4);
            Object metrica2 = appmetrica.metrica();
            EnumC10292e enumC10292e2 = EnumC10292e.f20308e;
            if (metrica2 == enumC10292e2 && c0576e2.getValue() == enumC10292e2 && ((Boolean) adcel.getValue()).booleanValue()) {
                c13770e4.m3676strictfp(-229368781);
                z6 = false;
                c13770e4.Signature(false);
                c2892e3 = c2892e4;
            } else {
                c13770e4.m3676strictfp(-230699766);
                boolean z8 = i6 == 4;
                Object m3681throw5 = c13770e4.m3681throw();
                if (z8 || m3681throw5 == c5170e) {
                    m3681throw5 = new C1382e(appmetrica);
                    c13770e4.m3682throws(m3681throw5);
                }
                C1382e c1382e = (C1382e) m3681throw5;
                Object m3681throw6 = c13770e4.m3681throw();
                if (m3681throw6 == c5170e) {
                    m3681throw6 = C7309e.f14945e;
                    c13770e4.m3682throws(m3681throw6);
                }
                Function0 function0 = (Function0) m3681throw6;
                c13770e4.m3676strictfp(-167964673);
                c13770e4.Signature(false);
                c13770e4.m3676strictfp(-167961890);
                c13770e4.Signature(false);
                C5761e c5761e3 = c18351e3.ad;
                C5761e c5761e4 = c2128e3.ad;
                C1223e c1223e = c5761e3.vip;
                C4980e c4980e = c5761e3.metrica;
                boolean z9 = (c1223e == null && c5761e4.vip == null) ? false : true;
                boolean z10 = (c4980e == null && c5761e4.metrica == null) ? false : true;
                C11139e c11139e3 = AbstractC9546e.billing;
                if (z9) {
                    c13770e4.m3676strictfp(-911488127);
                    Object m3681throw7 = c13770e4.m3681throw();
                    if (m3681throw7 == c5170e) {
                        m3681throw7 = "Built-in slide";
                        c13770e4.m3682throws("Built-in slide");
                    }
                    z = z10;
                    c5761e2 = c5761e4;
                    c5761e = c5761e3;
                    c18351e2 = c18351e3;
                    c13119e2 = appmetrica;
                    C15037e purchase4 = AbstractC0207e.purchase(c13119e2, c11139e3, (String) m3681throw7, c13770e4, 384, 0);
                    c11139e = c11139e3;
                    c13770e4.Signature(false);
                    c15037e = purchase4;
                } else {
                    c11139e = c11139e3;
                    c5761e = c5761e3;
                    c5761e2 = c5761e4;
                    z = z10;
                    c18351e2 = c18351e3;
                    c13119e2 = appmetrica;
                    c13770e4.m3676strictfp(-911382324);
                    c13770e4.Signature(false);
                    c15037e = null;
                }
                if (z) {
                    c13770e4.m3676strictfp(-911290533);
                    Object m3681throw8 = c13770e4.m3681throw();
                    if (m3681throw8 == c5170e) {
                        m3681throw8 = "Built-in shrink/expand";
                        c13770e4.m3682throws("Built-in shrink/expand");
                    }
                    C15037e purchase5 = AbstractC0207e.purchase(c13119e2, AbstractC9546e.yandex, (String) m3681throw8, c13770e4, 384, 0);
                    c13770e4.Signature(false);
                    c15037e2 = purchase5;
                } else {
                    c13770e4.m3676strictfp(-911179709);
                    c13770e4.Signature(false);
                    c15037e2 = null;
                }
                if (z) {
                    c13770e4.m3676strictfp(-911106083);
                    Object m3681throw9 = c13770e4.m3681throw();
                    if (m3681throw9 == c5170e) {
                        m3681throw9 = "Built-in InterruptionHandlingOffset";
                        c13770e4.m3682throws("Built-in InterruptionHandlingOffset");
                    }
                    C15037e purchase6 = AbstractC0207e.purchase(c13119e2, c11139e, (String) m3681throw9, c13770e4, 384, 0);
                    z2 = false;
                    c13770e4.Signature(false);
                    c15037e3 = purchase6;
                } else {
                    z2 = false;
                    c13770e4.m3676strictfp(-910935677);
                    c13770e4.Signature(false);
                    c15037e3 = null;
                }
                boolean z11 = !z;
                float[] fArr = C4717e.ad;
                c13770e4.m3676strictfp(-910130296);
                c13770e4.Signature(z2);
                boolean z12 = (c5761e.ad == null && c5761e2.ad == null) ? false : true;
                boolean z13 = (c5761e.license == null && c5761e2.license == null) ? false : true;
                C11139e c11139e4 = AbstractC9546e.ad;
                if (z12) {
                    c13770e4.m3676strictfp(-703879421);
                    Object m3681throw10 = c13770e4.m3681throw();
                    if (m3681throw10 == c5170e) {
                        m3681throw10 = "Built-in alpha";
                        c13770e4.m3682throws("Built-in alpha");
                    }
                    z3 = z11;
                    C15037e purchase7 = AbstractC0207e.purchase(c13119e2, c11139e4, (String) m3681throw10, c13770e4, 384, 0);
                    c13770e4.Signature(false);
                    c15037e4 = purchase7;
                } else {
                    z3 = z11;
                    c13770e4.m3676strictfp(-703709976);
                    c13770e4.Signature(false);
                    c15037e4 = null;
                }
                if (z13) {
                    c13770e4.m3676strictfp(-703642333);
                    Object m3681throw11 = c13770e4.m3681throw();
                    if (m3681throw11 == c5170e) {
                        m3681throw11 = "Built-in scale";
                        c13770e4.m3682throws("Built-in scale");
                    }
                    z4 = z13;
                    c15037e5 = c15037e4;
                    C15037e purchase8 = AbstractC0207e.purchase(c13119e2, c11139e4, (String) m3681throw11, c13770e4, 384, 0);
                    z5 = false;
                    c13770e4.Signature(false);
                    c15037e6 = purchase8;
                } else {
                    z4 = z13;
                    c15037e5 = c15037e4;
                    z5 = false;
                    c13770e4.m3676strictfp(-703472888);
                    c13770e4.Signature(false);
                    c15037e6 = null;
                }
                if (z4) {
                    c13770e4.m3676strictfp(-703395232);
                    i3 = i5;
                    c15037e7 = c15037e6;
                    c15037e8 = AbstractC0207e.purchase(c13119e2, AbstractC15869e.ad, "TransformOriginInterruptionHandling", c13770e4, 384, 0);
                    c13770e4.Signature(z5);
                } else {
                    i3 = i5;
                    c15037e7 = c15037e6;
                    c13770e4.m3676strictfp(-703222904);
                    c13770e4.Signature(z5);
                    c15037e8 = null;
                }
                boolean yandex = c13770e4.yandex(c15037e5) | c13770e4.purchase(c18351e2) | c13770e4.purchase(c2128e3) | c13770e4.yandex(c15037e7) | c13770e4.purchase(c13119e2) | c13770e4.yandex(c15037e8);
                Object m3681throw12 = c13770e4.m3681throw();
                if (yandex || m3681throw12 == c5170e) {
                    c2128e2 = c2128e3;
                    m3681throw12 = new C9703e(c15037e5, c15037e7, c13119e2, c18351e2, c2128e2, c15037e8);
                    c13770e4.m3682throws(m3681throw12);
                } else {
                    c2128e2 = c2128e3;
                }
                C9703e c9703e = (C9703e) m3681throw12;
                boolean billing = c13770e4.billing(z3) | c13770e4.purchase(function0);
                Object m3681throw13 = c13770e4.m3681throw();
                if (billing || m3681throw13 == c5170e) {
                    m3681throw13 = new C4257e(z3, function0);
                    c13770e4.m3682throws(m3681throw13);
                }
                C0115e c0115e = C0115e.f1276e;
                InterfaceC12864e premium = AbstractC12546e.yandex(c0115e, (Function1) m3681throw13).premium(new C17711e(c13119e2, c15037e2, c15037e3, c15037e, c18351e2, c2128e2, function0, c9703e)).premium(c0115e);
                c13770e4.m3676strictfp(-7404393);
                c13770e4.Signature(false);
                InterfaceC12864e premium2 = interfaceC12864e.premium(premium.premium(c0115e));
                Object m3681throw14 = c13770e4.m3681throw();
                if (m3681throw14 == c5170e) {
                    m3681throw14 = new C18538e(c1382e);
                    c13770e4.m3682throws(m3681throw14);
                }
                C18538e c18538e = (C18538e) m3681throw14;
                long j = c13770e4.f27286case;
                int i9 = (int) (j ^ (j >>> 32));
                InterfaceC3483e advert = c13770e4.advert();
                InterfaceC12864e purchase9 = AbstractC5679e.purchase(c13770e4, premium2);
                InterfaceC5685e.mopub.getClass();
                C7309e c7309e = C2721e.vip;
                c13770e4.m3666import();
                if (c13770e4.f27292implements) {
                    c13770e4.mopub(c7309e);
                } else {
                    c13770e4.m3684volatile();
                }
                AbstractC2270e.yandex(c13770e4, c18538e, C2721e.billing);
                AbstractC2270e.yandex(c13770e4, advert, C2721e.purchase);
                AbstractC2270e.appmetrica(c13770e4, Integer.valueOf(i9), C2721e.adcel);
                AbstractC2270e.purchase(c13770e4, C2721e.mopub);
                AbstractC2270e.yandex(c13770e4, purchase9, C2721e.license);
                ?? r11 = c2892e;
                r11.invoke(c1382e, c13770e4, Integer.valueOf((i3 >> 18) & 112));
                c13770e4.Signature(true);
                z6 = false;
                c13770e4.Signature(false);
                c2892e3 = r11;
            }
            c13770e4.Signature(z6);
            c13770e2 = c13770e4;
            c2892e2 = c2892e3;
        } else {
            c13770e3.m3676strictfp(-229362829);
            c13770e3.Signature(false);
            c13770e2 = c13770e3;
            c2892e2 = c2892e4;
        }
        C2846e subscription3 = c13770e2.subscription();
        if (subscription3 != null) {
            subscription3.license = new C17314e(c13119e, function1, interfaceC12864e, c18351e, c2128e, function2, c2892e2, i);
        }
    }

    public static AbstractC13717e adcel() {
        return (AbstractC13717e) AbstractC12909e.vip.get();
    }

    public static void admob() {
        boolean z;
        synchronized (AbstractC12909e.metrica) {
            C12618e c12618e = AbstractC12909e.adcel.yandex;
            z = false;
            if (c12618e != null) {
                if (c12618e.startapp()) {
                    z = true;
                }
            }
        }
        if (z) {
            AbstractC12909e.ad();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void advert(InterfaceC8501e interfaceC8501e) {
        if (((AbstractC13616e) interfaceC8501e).f27022e.f27016e) {
            AbstractC5851e.yandex(interfaceC8501e, 1).m4404e();
        }
    }

    public static Object amazon(C5888e c5888e, Function0 function0) {
        AbstractC13717e c15120e;
        AbstractC13717e abstractC13717e = (AbstractC13717e) AbstractC12909e.vip.get();
        if (abstractC13717e instanceof C15120e) {
            C15120e c15120e2 = (C15120e) abstractC13717e;
            if (c15120e2.pro == AbstractC15390e.appmetrica()) {
                Function1 function1 = c15120e2.subscription;
                Function1 function12 = c15120e2.remoteconfig;
                try {
                    ((C15120e) abstractC13717e).subscription = AbstractC12909e.mopub(c5888e, function1, true);
                    ((C15120e) abstractC13717e).remoteconfig = function12;
                    return function0.invoke();
                } finally {
                    c15120e2.subscription = function1;
                    c15120e2.remoteconfig = function12;
                }
            }
        }
        if (abstractC13717e == null || (abstractC13717e instanceof C12478e)) {
            c15120e = new C15120e(abstractC13717e instanceof C12478e ? (C12478e) abstractC13717e : null, c5888e, null, true, false);
        } else {
            c15120e = abstractC13717e.signatures(c5888e);
        }
        try {
            AbstractC13717e adcel = c15120e.adcel();
            try {
                Object invoke = function0.invoke();
                AbstractC13717e.admob(adcel);
                c15120e.metrica();
                return invoke;
            } catch (Throwable th) {
                AbstractC13717e.admob(adcel);
                throw th;
            }
        } catch (Throwable th2) {
            c15120e.metrica();
            throw th2;
        }
    }

    public static final void appmetrica(C13119e c13119e, Function1 function1, InterfaceC12864e interfaceC12864e, C18351e c18351e, C2128e c2128e, C2892e c2892e, C13770e c13770e, int i) {
        int i2;
        C18351e c18351e2;
        C2128e c2128e2;
        C2892e c2892e2;
        c13770e.m3671package(1706321816);
        if ((i & 6) == 0) {
            i2 = (c13770e.purchase(c13119e) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e.yandex(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c13770e.purchase(interfaceC12864e) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            c18351e2 = c18351e;
            i2 |= c13770e.purchase(c18351e2) ? 2048 : 1024;
        } else {
            c18351e2 = c18351e;
        }
        if ((i & 24576) == 0) {
            c2128e2 = c2128e;
            i2 |= c13770e.purchase(c2128e2) ? 16384 : 8192;
        } else {
            c2128e2 = c2128e;
        }
        if ((i & 196608) == 0) {
            c2892e2 = c2892e;
            i2 |= c13770e.yandex(c2892e2) ? 131072 : 65536;
        } else {
            c2892e2 = c2892e;
        }
        if (c13770e.m3673protected(i2 & 1, (74899 & i2) != 74898)) {
            int i3 = i2 & 112;
            int i4 = i2 & 14;
            boolean z = (i3 == 32) | (i4 == 4);
            Object m3681throw = c13770e.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (z || m3681throw == c5170e) {
                m3681throw = new C4223e(function1, c13119e);
                c13770e.m3682throws(m3681throw);
            }
            InterfaceC12864e purchase = AbstractC18127e.purchase(interfaceC12864e, (Function3) m3681throw);
            Object m3681throw2 = c13770e.m3681throw();
            if (m3681throw2 == c5170e) {
                m3681throw2 = C14865e.f29413e;
                c13770e.m3682throws(m3681throw2);
            }
            ad(c13119e, function1, purchase, c18351e2, c2128e2, (Function2) m3681throw2, c2892e2, c13770e, 196608 | i4 | i3 | (i2 & 7168) | (57344 & i2) | ((i2 << 6) & 29360128));
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C10342e(c13119e, function1, interfaceC12864e, c18351e, c2128e, c2892e, i);
        }
    }

    public static void billing(String str, String str2, Object obj) {
        String mopub = mopub(str);
        if (Log.isLoggable(mopub, 3)) {
            Log.d(mopub, String.format(str2, obj));
        }
    }

    public static final void license(boolean z, InterfaceC12864e interfaceC12864e, C18351e c18351e, C2128e c2128e, String str, C2892e c2892e, C13770e c13770e, int i, int i2) {
        int i3;
        InterfaceC12864e interfaceC12864e2;
        String str2;
        c13770e.m3671package(-1448730565);
        if ((i & 6) == 0) {
            i3 = (c13770e.billing(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= c13770e.purchase(interfaceC12864e) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= c13770e.purchase(c18351e) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= c13770e.purchase(c2128e) ? 2048 : 1024;
        }
        int i5 = i3 | 24576;
        if ((196608 & i) == 0) {
            i5 |= c13770e.yandex(c2892e) ? 131072 : 65536;
        }
        if (c13770e.m3673protected(i5 & 1, (74899 & i5) != 74898)) {
            if (i4 != 0) {
                interfaceC12864e = C0115e.f1276e;
            }
            interfaceC12864e2 = interfaceC12864e;
            C13119e advert = AbstractC0207e.advert(Boolean.valueOf(z), "AnimatedVisibility", c13770e, (i5 & 14) | ((i5 >> 9) & 112), 0);
            Object m3681throw = c13770e.m3681throw();
            if (m3681throw == C2987e.ad) {
                m3681throw = C5430e.f11637e;
                c13770e.m3682throws(m3681throw);
            }
            int i6 = i5 << 3;
            appmetrica(advert, (Function1) m3681throw, interfaceC12864e2, c18351e, c2128e, c2892e, c13770e, (i6 & 57344) | (i6 & 896) | 48 | (i6 & 7168) | (i5 & 458752));
            str2 = "AnimatedVisibility";
        } else {
            c13770e.m3659default();
            interfaceC12864e2 = interfaceC12864e;
            str2 = str;
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C2552e(z, interfaceC12864e2, c18351e, c2128e, str2, c2892e, i, i2);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Collection, java.lang.Object] */
    public static C2007e loadAd(C17689e c17689e) {
        AbstractC12909e.appmetrica(AbstractC12909e.ad);
        synchronized (AbstractC12909e.metrica) {
            AbstractC12909e.yandex = AbstractC13480e.m3572catch(c17689e, AbstractC12909e.yandex);
            Unit unit = Unit.INSTANCE;
        }
        return new C2007e(10, c17689e);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void metrica(defpackage.InterfaceC10799e r13, boolean r14, defpackage.InterfaceC12864e r15, defpackage.C18351e r16, defpackage.C2128e r17, java.lang.String r18, defpackage.C2892e r19, defpackage.C13770e r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC12640e.metrica(eُؖؖ, boolean, eّۤۧ, eۙۧ, eؓ۟ٗ, java.lang.String, eؔ۟ٓ, eٓؕۥ, int, int):void");
    }

    public static String mopub(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return "TRuntime.".concat(str);
        }
        String concat = "TRuntime.".concat(str);
        return concat.length() > 23 ? concat.substring(0, 23) : concat;
    }

    public static final void purchase(final C13440e c13440e, final C2892e c2892e, InterfaceC12864e interfaceC12864e, final boolean z, final boolean z2, boolean z3, Function1 function1, C2892e c2892e2, C13770e c13770e, final int i) {
        final C2892e c2892e3;
        final InterfaceC12864e interfaceC12864e2;
        final boolean z4;
        final Function1 function12;
        C14995e c14995e;
        boolean z5;
        C9708e c9708e;
        Function1 function13;
        c13770e.m3671package(503624135);
        int i2 = i | (c13770e.yandex(c13440e) ? 4 : 2) | 384 | (c13770e.billing(z2) ? 16384 : 8192) | 1769472;
        if (c13770e.m3673protected(i2 & 1, (4793491 & i2) != 4793490)) {
            Object m3681throw = c13770e.m3681throw();
            int i3 = 9;
            C5170e c5170e = C2987e.ad;
            if (m3681throw == c5170e) {
                m3681throw = new C4671e(i3);
                c13770e.m3682throws(m3681throw);
            }
            Function1 function14 = (Function1) m3681throw;
            C14995e c14995e2 = c13440e.ad;
            C14995e c14995e3 = c13440e.ad;
            boolean z6 = ((EnumC3856e) ((C0576e) c14995e2.license).getValue()) == EnumC3856e.f8687e;
            if (c13440e.vip != null) {
                c13770e.m3676strictfp(-1348484770);
                C12870e c12870e = AbstractC14692e.ad;
                C14995e c14995e4 = c13440e.ad;
                Function1 function15 = c13440e.vip;
                if (function15 == null) {
                    function15 = null;
                }
                c14995e = c14995e3;
                z5 = z6;
                c9708e = AbstractC14692e.ad(c14995e4, function15, null, c13770e, AbstractC14692e.metrica << 9, 4);
                c13770e.Signature(false);
            } else {
                c14995e = c14995e3;
                z5 = z6;
                c13770e.m3676strictfp(1146846870);
                c13770e.Signature(false);
                c9708e = null;
            }
            C0115e c0115e = C0115e.f1276e;
            InterfaceC12864e appmetrica = AbstractC11750e.appmetrica(c0115e, c14995e2, EnumC17426e.f34145e, z5, c9708e);
            InterfaceC2747e license = AbstractC17074e.license(C5438e.f11676e, true);
            long j = c13770e.f27286case;
            int i4 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, appmetrica);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            C14865e c14865e = C2721e.billing;
            AbstractC2270e.yandex(c13770e, license, c14865e);
            C14865e c14865e2 = C2721e.purchase;
            AbstractC2270e.yandex(c13770e, advert, c14865e2);
            Integer valueOf = Integer.valueOf(i4);
            C14865e c14865e3 = C2721e.adcel;
            AbstractC2270e.yandex(c13770e, valueOf, c14865e3);
            C5430e c5430e = C2721e.mopub;
            AbstractC2270e.purchase(c13770e, c5430e);
            C14865e c14865e4 = C2721e.license;
            AbstractC2270e.yandex(c13770e, purchase, c14865e4);
            InterfaceC12864e vip = C14486e.ad.vip();
            C17354e c17354e = AbstractC16497e.ad;
            C14544e c14544e = C5438e.f11685e;
            C8587e ad = AbstractC6451e.ad(c17354e, c14544e, c13770e, 0);
            long j2 = c13770e.f27286case;
            int i5 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC3483e advert2 = c13770e.advert();
            InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e, vip);
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, ad, c14865e);
            AbstractC2270e.yandex(c13770e, advert2, c14865e2);
            AbstractC13501e.mopub(i5, c13770e, c14865e3, c13770e, c5430e);
            AbstractC2270e.yandex(c13770e, purchase2, c14865e4);
            C3533e c3533e = C3533e.ad;
            c2892e.invoke(c3533e, c13770e, 54);
            c13770e.Signature(true);
            boolean yandex = ((i2 & 57344) == 16384) | c13770e.yandex(c13440e);
            Object m3681throw2 = c13770e.m3681throw();
            if (yandex || m3681throw2 == c5170e) {
                m3681throw2 = new C9623e(1, c13440e, z, z2);
                c13770e.m3682throws(m3681throw2);
            }
            C14995e c14995e5 = c14995e;
            C6850e c6850e = new C6850e(c14995e5, (Function2) m3681throw2);
            C8587e ad2 = AbstractC6451e.ad(c17354e, c14544e, c13770e, 0);
            long j3 = c13770e.f27286case;
            int i6 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC3483e advert3 = c13770e.advert();
            InterfaceC12864e purchase3 = AbstractC5679e.purchase(c13770e, c6850e);
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, ad2, c14865e);
            AbstractC2270e.yandex(c13770e, advert3, c14865e2);
            AbstractC13501e.mopub(i6, c13770e, c14865e3, c13770e, c5430e);
            AbstractC2270e.yandex(c13770e, purchase3, c14865e4);
            c2892e3 = c2892e2;
            c2892e3.invoke(c3533e, c13770e, 54);
            c13770e.Signature(true);
            c13770e.Signature(true);
            EnumC3856e enumC3856e = (EnumC3856e) ((C0576e) c14995e5.license).getValue();
            boolean yandex2 = c13770e.yandex(c13440e);
            Object m3681throw3 = c13770e.m3681throw();
            if (yandex2 || m3681throw3 == c5170e) {
                function13 = function14;
                m3681throw3 = new C10954e(c13440e, function13, (InterfaceC5083e) null, 22);
                c13770e.m3682throws(m3681throw3);
            } else {
                function13 = function14;
            }
            AbstractC17680e.appmetrica(enumC3856e, function13, (Function2) m3681throw3, c13770e);
            interfaceC12864e2 = c0115e;
            function12 = function13;
            z4 = true;
        } else {
            c2892e3 = c2892e2;
            c13770e.m3659default();
            interfaceC12864e2 = interfaceC12864e;
            z4 = z3;
            function12 = function1;
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new Function2(c2892e, interfaceC12864e2, z, z2, z4, function12, c2892e3, i) { // from class: eَؚۢ

                /* renamed from: eّؑؑ, reason: contains not printable characters */
                public final /* synthetic */ boolean f20036e;

                /* renamed from: eًؔؐ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC12864e f20037e;

                /* renamed from: eؘٙؓ, reason: contains not printable characters */
                public final /* synthetic */ C2892e f20038e;

                /* renamed from: eٌٍٚ, reason: contains not printable characters */
                public final /* synthetic */ C2892e f20039e;

                /* renamed from: eؙِٖ, reason: contains not printable characters */
                public final /* synthetic */ boolean f20040e;

                /* renamed from: eؘَٗ, reason: contains not printable characters */
                public final /* synthetic */ Function1 f20042e;

                /* renamed from: eٗۚۖ, reason: contains not printable characters */
                public final /* synthetic */ boolean f20043e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int advert4 = AbstractC5190e.advert(12586033);
                    AbstractC12640e.purchase(C13440e.this, this.f20038e, this.f20037e, this.f20040e, this.f20036e, this.f20043e, this.f20042e, this.f20039e, (C13770e) obj, advert4);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static AbstractC13717e smaato(AbstractC13717e abstractC13717e) {
        if (abstractC13717e instanceof C15120e) {
            C15120e c15120e = (C15120e) abstractC13717e;
            if (c15120e.pro == AbstractC15390e.appmetrica()) {
                c15120e.subscription = null;
                return abstractC13717e;
            }
        }
        if (abstractC13717e instanceof C13142e) {
            C13142e c13142e = (C13142e) abstractC13717e;
            if (c13142e.startapp == AbstractC15390e.appmetrica()) {
                c13142e.yandex = null;
                return abstractC13717e;
            }
        }
        AbstractC13717e billing = AbstractC12909e.billing(abstractC13717e, null, false);
        billing.adcel();
        return billing;
    }

    public static int startapp(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        return cursor.getColumnIndexOrThrow("`" + str + "`");
    }

    public static final EnumC10292e subscription(C13119e c13119e, Function1 function1, Object obj, C13770e c13770e) {
        c13770e.m3662final(-422486745, c13119e);
        boolean billing = c13119e.billing();
        EnumC10292e enumC10292e = EnumC10292e.f20311e;
        EnumC10292e enumC10292e2 = EnumC10292e.f20308e;
        EnumC10292e enumC10292e3 = EnumC10292e.f20309e;
        if (billing) {
            c13770e.m3676strictfp(-212166497);
            c13770e.Signature(false);
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                enumC10292e = enumC10292e3;
            } else if (((Boolean) function1.invoke(c13119e.metrica())).booleanValue()) {
                enumC10292e = enumC10292e2;
            }
        } else {
            c13770e.m3676strictfp(-211892364);
            Object m3681throw = c13770e.m3681throw();
            if (m3681throw == C2987e.ad) {
                m3681throw = AbstractC14533e.startapp(Boolean.FALSE);
                c13770e.m3682throws(m3681throw);
            }
            InterfaceC3314e interfaceC3314e = (InterfaceC3314e) m3681throw;
            if (((Boolean) function1.invoke(c13119e.metrica())).booleanValue()) {
                interfaceC3314e.setValue(Boolean.TRUE);
            }
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                enumC10292e = enumC10292e3;
            } else if (((Boolean) interfaceC3314e.getValue()).booleanValue()) {
                enumC10292e = enumC10292e2;
            }
            c13770e.Signature(false);
        }
        c13770e.Signature(false);
        return enumC10292e;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void vip(defpackage.C0283e r13, boolean r14, defpackage.InterfaceC12864e r15, defpackage.C18351e r16, defpackage.C2128e r17, java.lang.String r18, defpackage.C2892e r19, defpackage.C13770e r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC12640e.vip(eْؑٙ, boolean, eّۤۧ, eۙۧ, eؓ۟ٗ, java.lang.String, eؔ۟ٓ, eٓؕۥ, int, int):void");
    }

    public static void yandex(String str, String str2, Exception exc) {
        String mopub = mopub(str);
        if (Log.isLoggable(mopub, 6)) {
            Log.e(mopub, str2, exc);
        }
    }
}
