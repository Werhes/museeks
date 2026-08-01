package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٙٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5711e {
    public static final float ad;
    public static final float appmetrica;
    public static final float billing;
    public static final float license;
    public static final float metrica = 12;
    public static final float purchase;
    public static final float vip;

    static {
        float f = 48;
        ad = f;
        vip = f;
        float f2 = 2;
        license = f2;
        float f3 = 4;
        AbstractC12220e.metrica(f3, 0.0f, 2);
        AbstractC12220e.vip(f3, f2);
        ((Boolean) AbstractC8882e.ad.getValue()).getClass();
        appmetrica = 8;
        purchase = 112;
        billing = 280;
    }

    public static final void ad(InterfaceC12864e interfaceC12864e, C0351e c0351e, InterfaceC3314e interfaceC3314e, C9137e c9137e, InterfaceC16154e interfaceC16154e, long j, float f, float f2, C2892e c2892e, C13770e c13770e, int i) {
        InterfaceC6512e interfaceC6512e;
        boolean z;
        Object startapp;
        Object startapp2;
        c13770e.m3671package(848986741);
        int i2 = i | (c13770e.purchase(interfaceC12864e) ? 4 : 2) | (c13770e.purchase(c0351e) ? 32 : 16) | (c13770e.purchase(c9137e) ? 2048 : 1024) | (c13770e.purchase(interfaceC16154e) ? 16384 : 8192) | (c13770e.appmetrica(j) ? 131072 : 65536) | (c13770e.metrica(f) ? 1048576 : 524288) | (c13770e.metrica(f2) ? 8388608 : 4194304) | (c13770e.purchase(null) ? 67108864 : 33554432) | (c13770e.yandex(c2892e) ? 536870912 : 268435456);
        if (c13770e.m3673protected(i2 & 1, (i2 & 306783379) != 306783378)) {
            C13119e startapp3 = AbstractC0207e.startapp(c0351e, "DropDownMenu", c13770e, (((i2 >> 3) & 14) | 48) & 126, 0);
            InterfaceC6512e metrica2 = AbstractC11008e.metrica(c13770e, 2);
            InterfaceC6512e metrica3 = AbstractC11008e.metrica(c13770e, 5);
            boolean billing2 = startapp3.billing();
            Object obj = C2987e.ad;
            if (billing2) {
                interfaceC6512e = metrica3;
                z = false;
                startapp = AbstractC13501e.startapp(c13770e, 1666827533, false, startapp3);
            } else {
                c13770e.m3676strictfp(1666573488);
                boolean purchase2 = c13770e.purchase(startapp3);
                startapp = c13770e.m3681throw();
                if (purchase2 || startapp == obj) {
                    AbstractC13717e adcel = AbstractC12640e.adcel();
                    Function1 appmetrica2 = adcel != null ? adcel.appmetrica() : null;
                    AbstractC13717e smaato = AbstractC12640e.smaato(adcel);
                    interfaceC6512e = metrica3;
                    try {
                        Object metrica4 = startapp3.metrica();
                        AbstractC12640e.Signature(adcel, smaato, appmetrica2);
                        c13770e.m3682throws(metrica4);
                        startapp = metrica4;
                    } catch (Throwable th) {
                        AbstractC12640e.Signature(adcel, smaato, appmetrica2);
                        throw th;
                    }
                } else {
                    interfaceC6512e = metrica3;
                }
                z = false;
                c13770e.Signature(false);
            }
            boolean booleanValue = ((Boolean) startapp).booleanValue();
            c13770e.m3676strictfp(143964305);
            float f3 = booleanValue ? 1.0f : 0.8f;
            c13770e.Signature(z);
            Float valueOf = Float.valueOf(f3);
            boolean purchase3 = c13770e.purchase(startapp3);
            Object m3681throw = c13770e.m3681throw();
            if (purchase3 || m3681throw == obj) {
                m3681throw = AbstractC14533e.purchase(new C2000e(startapp3, 8));
                c13770e.m3682throws(m3681throw);
            }
            boolean booleanValue2 = ((Boolean) ((InterfaceC16132e) m3681throw).getValue()).booleanValue();
            c13770e.m3676strictfp(143964305);
            float f4 = booleanValue2 ? 1.0f : 0.8f;
            c13770e.Signature(false);
            Float valueOf2 = Float.valueOf(f4);
            boolean purchase4 = c13770e.purchase(startapp3);
            Object m3681throw2 = c13770e.m3681throw();
            if (purchase4 || m3681throw2 == obj) {
                m3681throw2 = AbstractC14533e.purchase(new C2000e(startapp3, 9));
                c13770e.m3682throws(m3681throw2);
            }
            c13770e.m3676strictfp(-745957716);
            c13770e.Signature(false);
            C11139e c11139e = AbstractC9546e.ad;
            C11117e billing3 = AbstractC0207e.billing(startapp3, valueOf, valueOf2, metrica2, c11139e, c13770e, 0);
            if (startapp3.billing()) {
                startapp2 = AbstractC13501e.startapp(c13770e, 1666827533, false, startapp3);
            } else {
                c13770e.m3676strictfp(1666573488);
                boolean purchase5 = c13770e.purchase(startapp3);
                startapp2 = c13770e.m3681throw();
                if (purchase5 || startapp2 == obj) {
                    AbstractC13717e adcel2 = AbstractC12640e.adcel();
                    Function1 appmetrica3 = adcel2 != null ? adcel2.appmetrica() : null;
                    AbstractC13717e smaato2 = AbstractC12640e.smaato(adcel2);
                    try {
                        Object metrica5 = startapp3.metrica();
                        AbstractC12640e.Signature(adcel2, smaato2, appmetrica3);
                        c13770e.m3682throws(metrica5);
                        startapp2 = metrica5;
                    } catch (Throwable th2) {
                        AbstractC12640e.Signature(adcel2, smaato2, appmetrica3);
                        throw th2;
                    }
                }
                c13770e.Signature(false);
            }
            boolean booleanValue3 = ((Boolean) startapp2).booleanValue();
            c13770e.m3676strictfp(892761509);
            float f5 = booleanValue3 ? 1.0f : 0.0f;
            c13770e.Signature(false);
            Float valueOf3 = Float.valueOf(f5);
            boolean purchase6 = c13770e.purchase(startapp3);
            Object m3681throw3 = c13770e.m3681throw();
            if (purchase6 || m3681throw3 == obj) {
                m3681throw3 = AbstractC14533e.purchase(new C2000e(startapp3, 10));
                c13770e.m3682throws(m3681throw3);
            }
            boolean booleanValue4 = ((Boolean) ((InterfaceC16132e) m3681throw3).getValue()).booleanValue();
            c13770e.m3676strictfp(892761509);
            float f6 = booleanValue4 ? 1.0f : 0.0f;
            c13770e.Signature(false);
            Float valueOf4 = Float.valueOf(f6);
            boolean purchase7 = c13770e.purchase(startapp3);
            Object m3681throw4 = c13770e.m3681throw();
            if (purchase7 || m3681throw4 == obj) {
                m3681throw4 = AbstractC14533e.purchase(new C2000e(startapp3, 11));
                c13770e.m3682throws(m3681throw4);
            }
            c13770e.m3676strictfp(2839488);
            c13770e.Signature(false);
            C11117e billing4 = AbstractC0207e.billing(startapp3, valueOf3, valueOf4, interfaceC6512e, c11139e, c13770e, 0);
            boolean booleanValue5 = ((Boolean) c13770e.adcel(AbstractC13276e.ad)).booleanValue();
            boolean billing5 = c13770e.billing(booleanValue5) | c13770e.purchase(billing3) | ((i2 & 112) == 32) | c13770e.purchase(billing4);
            Object m3681throw5 = c13770e.m3681throw();
            if (billing5 || m3681throw5 == obj) {
                Object c0141e = new C0141e(booleanValue5, c0351e, interfaceC3314e, billing3, billing4);
                c13770e.m3682throws(c0141e);
                m3681throw5 = c0141e;
            }
            int i3 = i2 >> 9;
            int i4 = i2 >> 6;
            AbstractC12121e.ad(AbstractC12546e.yandex(C0115e.f1276e, (Function1) m3681throw5), interfaceC16154e, j, 0L, f, f2, null, AbstractC16653e.license(-1463404422, new C4197e(16, interfaceC12864e, c9137e, c2892e), c13770e), c13770e, (i3 & 896) | (i3 & 112) | 12582912 | (57344 & i4) | (458752 & i4) | (i4 & 3670016), 8);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C6241e(interfaceC12864e, c0351e, interfaceC3314e, c9137e, interfaceC16154e, j, f, f2, c2892e, i);
        }
    }

    public static final void vip(final Function2 function2, final Function0 function0, final InterfaceC12864e interfaceC12864e, final Function2 function22, final Function2 function23, final boolean z, final C0237e c0237e, final InterfaceC12123e interfaceC12123e, C13770e c13770e, final int i) {
        int i2;
        Function0 function02;
        c13770e.m3671package(-1325192924);
        if ((i & 6) == 0) {
            i2 = (c13770e.yandex(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            function02 = function0;
            i2 |= c13770e.yandex(function02) ? 32 : 16;
        } else {
            function02 = function0;
        }
        if ((i & 384) == 0) {
            i2 |= c13770e.purchase(interfaceC12864e) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c13770e.yandex(function22) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c13770e.yandex(function23) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= c13770e.billing(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= c13770e.purchase(c0237e) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= c13770e.purchase(interfaceC12123e) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= c13770e.purchase(null) ? 67108864 : 33554432;
        }
        if (c13770e.m3673protected(i2 & 1, (38347923 & i2) != 38347922)) {
            InterfaceC12864e adcel = AbstractC12220e.adcel(AbstractC18007e.advert(AbstractC18007e.metrica(AbstractC9546e.metrica(interfaceC12864e, null, AbstractC17052e.ad(0.0f, 6, 0L, true), z, null, function02, 24), 1.0f), purchase, vip, billing, 0.0f, 8), interfaceC12123e);
            C8587e ad2 = AbstractC6451e.ad(AbstractC16497e.ad, C5438e.f11668e, c13770e, 48);
            long j = c13770e.f27286case;
            int i3 = (int) ((j >>> 32) ^ j);
            InterfaceC3483e advert = c13770e.advert();
            InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e, adcel);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, ad2, C2721e.billing);
            AbstractC2270e.yandex(c13770e, advert, C2721e.purchase);
            AbstractC2270e.yandex(c13770e, Integer.valueOf(i3), C2721e.adcel);
            AbstractC2270e.purchase(c13770e, C2721e.mopub);
            AbstractC2270e.yandex(c13770e, purchase2, C2721e.license);
            AbstractC14489e.ad(((C7019e) c13770e.adcel(AbstractC11785e.ad)).vip.smaato, AbstractC16653e.license(865999929, new C2535e(3, function22, c0237e, function23, function2, z), c13770e), c13770e, 48);
            c13770e.Signature(true);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new Function2() { // from class: eؚۥٓ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC5711e.vip(Function2.this, function0, interfaceC12864e, function22, function23, z, c0237e, interfaceC12123e, (C13770e) obj, AbstractC5190e.advert(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
