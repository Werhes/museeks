package defpackage;

import androidx.car.app.model.Alert;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّ٘ٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC12547e {
    public static final C2892e ad = new C2892e(263107239, false, new C13060e(2));
    public static final C2892e vip = new C2892e(1930504614, false, new C13060e(3));
    public static final C2892e metrica = new C2892e(2120573168, false, new C13060e(4));
    public static final C2892e license = new C2892e(1030923805, false, new C13060e(5));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r0v34 */
    public static final void ad(final float f, final Function1 function1, InterfaceC12864e interfaceC12864e, C15274e c15274e, boolean z, final Function0 function0, final C2892e c2892e, final C2892e c2892e2, C12235e c12235e, float f2, final int i, final C3721e c3721e, C13770e c13770e, final int i2) {
        InterfaceC12864e interfaceC12864e2;
        final C15274e c15274e2;
        final boolean z2;
        final C12235e c12235e2;
        final float f3;
        boolean z3;
        int i3;
        C15274e c15274e3;
        float f4;
        C12235e c12235e3;
        boolean z4;
        boolean z5;
        Object startapp;
        C13119e c13119e;
        long j;
        ?? r0;
        Object startapp2;
        boolean z6;
        float f5;
        c13770e.m3671package(-1827031971);
        int i4 = i2 | (c13770e.metrica(f) ? 4 : 2) | (c13770e.yandex(function1) ? 32 : 16) | 27648 | (c13770e.yandex(function0) ? 131072 : 65536) | 838860800;
        int i5 = 6 | (c13770e.purchase(c3721e) ? 32 : 16);
        if (c13770e.m3673protected(i4 & 1, ((306783379 & i4) == 306783378 && (i5 & 19) == 18) ? false : true)) {
            c13770e.m3655case();
            int i6 = i2 & 1;
            Object obj = C2987e.ad;
            if (i6 == 0 || c13770e.isPro()) {
                Object m3681throw = c13770e.m3681throw();
                Object obj2 = m3681throw;
                if (m3681throw == obj) {
                    obj2 = AbstractC17861e.adcel(c13770e);
                }
                C15492e c15492e = AbstractC11785e.ad;
                z3 = true;
                i3 = i4 & (-234881025);
                c15274e3 = (C15274e) obj2;
                f4 = 12;
                c12235e3 = new C12235e(((C7019e) c13770e.adcel(c15492e)).ad.Signature, ((C7019e) c13770e.adcel(c15492e)).ad.subscription, C3618e.vip(0.25f, ((C7019e) c13770e.adcel(c15492e)).ad.ad), ((C7019e) c13770e.adcel(c15492e)).ad.admob, ((C7019e) c13770e.adcel(c15492e)).ad.remoteconfig, ((C7019e) c13770e.adcel(c15492e)).ad.subscription);
                z4 = true;
            } else {
                c13770e.m3659default();
                i3 = i4 & (-234881025);
                c15274e3 = c15274e;
                c12235e3 = c12235e;
                f4 = f2;
                z3 = true;
                z4 = z;
            }
            int i7 = i3;
            c13770e.admob();
            C13119e advert = AbstractC0207e.advert(Boolean.valueOf(!(f == 0.0f ? z3 : false)), "[MiuiSliderBorder] isActive (value != 0)", c13770e, 48, 0);
            boolean booleanValue = ((Boolean) advert.license.getValue()).booleanValue();
            c13770e.m3676strictfp(-12729877);
            long j2 = booleanValue ? c12235e3.vip : c12235e3.ad;
            c13770e.Signature(false);
            AbstractC14213e purchase = C3618e.purchase(j2);
            boolean purchase2 = c13770e.purchase(purchase);
            Object m3681throw2 = c13770e.m3681throw();
            if (purchase2 || m3681throw2 == obj) {
                Object c11139e = new C11139e(C5430e.f11635e, new C17097e(10, purchase));
                c13770e.m3682throws(c11139e);
                m3681throw2 = c11139e;
            }
            C11139e c11139e2 = (C11139e) m3681throw2;
            if (advert.billing()) {
                z5 = false;
                startapp = AbstractC13501e.startapp(c13770e, 1666827533, false, advert);
            } else {
                c13770e.m3676strictfp(1666573488);
                boolean purchase3 = c13770e.purchase(advert);
                startapp = c13770e.m3681throw();
                if (purchase3 || startapp == obj) {
                    AbstractC13717e adcel = AbstractC12640e.adcel();
                    Function1 appmetrica = adcel != null ? adcel.appmetrica() : null;
                    AbstractC13717e smaato = AbstractC12640e.smaato(adcel);
                    try {
                        Object metrica2 = advert.metrica();
                        AbstractC12640e.Signature(adcel, smaato, appmetrica);
                        c13770e.m3682throws(metrica2);
                        startapp = metrica2;
                    } finally {
                    }
                }
                z5 = false;
                c13770e.Signature(false);
            }
            boolean booleanValue2 = ((Boolean) startapp).booleanValue();
            c13770e.m3676strictfp(-12729877);
            if (booleanValue2) {
                c13119e = advert;
                j = c12235e3.vip;
            } else {
                c13119e = advert;
                j = c12235e3.ad;
            }
            c13770e.Signature(z5);
            C3618e c3618e = new C3618e(j);
            C13119e c13119e2 = c13119e;
            boolean purchase4 = c13770e.purchase(c13119e2);
            Object m3681throw3 = c13770e.m3681throw();
            Object obj3 = m3681throw3;
            if (purchase4 || m3681throw3 == obj) {
                Object purchase5 = AbstractC14533e.purchase(new C2000e(c13119e2, 12));
                c13770e.m3682throws(purchase5);
                obj3 = purchase5;
            }
            boolean booleanValue3 = ((Boolean) ((InterfaceC16132e) obj3).getValue()).booleanValue();
            c13770e.m3676strictfp(-12729877);
            long j3 = booleanValue3 ? c12235e3.vip : c12235e3.ad;
            c13770e.Signature(false);
            C3618e c3618e2 = new C3618e(j3);
            boolean purchase6 = c13770e.purchase(c13119e2);
            Object m3681throw4 = c13770e.m3681throw();
            Object obj4 = m3681throw4;
            if (purchase6 || m3681throw4 == obj) {
                Object purchase7 = AbstractC14533e.purchase(new C2000e(c13119e2, 13));
                c13770e.m3682throws(purchase7);
                obj4 = purchase7;
            }
            c13770e.m3676strictfp(-781456724);
            C15274e c15274e4 = c15274e3;
            C13540e purchase8 = AbstractC12696e.purchase(0.0f, 0.0f, null, 7);
            c13770e.Signature(false);
            C11117e billing = AbstractC0207e.billing(c13119e2, c3618e, c3618e2, purchase8, c11139e2, c13770e, 196608);
            if (c13119e2.billing()) {
                r0 = 0;
                startapp2 = AbstractC13501e.startapp(c13770e, 1666827533, false, c13119e2);
            } else {
                c13770e.m3676strictfp(1666573488);
                boolean purchase9 = c13770e.purchase(c13119e2);
                startapp2 = c13770e.m3681throw();
                if (purchase9 || startapp2 == obj) {
                    AbstractC13717e adcel2 = AbstractC12640e.adcel();
                    Function1 appmetrica2 = adcel2 != null ? adcel2.appmetrica() : null;
                    AbstractC13717e smaato2 = AbstractC12640e.smaato(adcel2);
                    try {
                        Object metrica3 = c13119e2.metrica();
                        AbstractC12640e.Signature(adcel2, smaato2, appmetrica2);
                        c13770e.m3682throws(metrica3);
                        startapp2 = metrica3;
                    } finally {
                    }
                }
                r0 = 0;
                c13770e.Signature(false);
            }
            boolean booleanValue4 = ((Boolean) startapp2).booleanValue();
            c13770e.m3676strictfp(-284937224);
            float f6 = booleanValue4 ? (float) r0 : z3 ? 1.0f : 0.0f;
            c13770e.Signature(r0);
            C15765e c15765e = new C15765e(f6);
            boolean purchase10 = c13770e.purchase(c13119e2);
            Object m3681throw5 = c13770e.m3681throw();
            Object obj5 = m3681throw5;
            if (purchase10 || m3681throw5 == obj) {
                Object purchase11 = AbstractC14533e.purchase(new C2000e(c13119e2, 14));
                c13770e.m3682throws(purchase11);
                obj5 = purchase11;
            }
            boolean booleanValue5 = ((Boolean) ((InterfaceC16132e) obj5).getValue()).booleanValue();
            c13770e.m3676strictfp(-284937224);
            if (booleanValue5) {
                z6 = false;
                f5 = 0;
            } else {
                z6 = false;
                f5 = 1;
            }
            c13770e.Signature(z6);
            C15765e c15765e2 = new C15765e(f5);
            boolean purchase12 = c13770e.purchase(c13119e2);
            Object m3681throw6 = c13770e.m3681throw();
            Object obj6 = m3681throw6;
            if (purchase12 || m3681throw6 == obj) {
                Object purchase13 = AbstractC14533e.purchase(new C2000e(c13119e2, 15));
                c13770e.m3682throws(purchase13);
                obj6 = purchase13;
            }
            c13770e.m3676strictfp(-1953972046);
            C0763e c0763e = AbstractC5392e.ad;
            C13540e purchase14 = AbstractC12696e.purchase(0.0f, 0.0f, new C15765e(0.4f), 3);
            c13770e.Signature(false);
            interfaceC12864e2 = interfaceC12864e;
            boolean z7 = z4;
            float f7 = f4;
            vip(f, function1, AbstractC13201e.ad(interfaceC12864e2, ((C15765e) AbstractC0207e.billing(c13119e2, c15765e, c15765e2, purchase14, AbstractC9546e.metrica, c13770e, 196608).f22034e.getValue()).f31051e, c12235e3.purchase, ((C7019e) c13770e.adcel(AbstractC11785e.ad)).metrica.metrica), c15274e4, z7, f7, i, c3721e, function0, c2892e, c2892e2, new C12235e(c12235e3.ad, ((C3618e) billing.f22034e.getValue()).ad, c12235e3.metrica, c12235e3.license, c12235e3.appmetrica, c12235e3.purchase), c13770e, (64638 & i7) | 1769472 | ((i5 << 18) & 29360128) | ((i7 << 9) & 234881024) | 805306368, 6);
            f3 = f7;
            c12235e2 = c12235e3;
            z2 = z7;
            c15274e2 = c15274e4;
        } else {
            interfaceC12864e2 = interfaceC12864e;
            c13770e.m3659default();
            c15274e2 = c15274e;
            z2 = z;
            c12235e2 = c12235e;
            f3 = f2;
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            final InterfaceC12864e interfaceC12864e3 = interfaceC12864e2;
            subscription.license = new Function2(f, function1, interfaceC12864e3, c15274e2, z2, function0, c2892e, c2892e2, c12235e2, f3, i, c3721e, i2) { // from class: eؘؑۨ

                /* renamed from: eّؑؑ, reason: contains not printable characters */
                public final /* synthetic */ boolean f11482e;

                /* renamed from: eٕؓۥ, reason: contains not printable characters */
                public final /* synthetic */ C3721e f11483e;

                /* renamed from: eًؔؐ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC12864e f11484e;

                /* renamed from: eؙؔٞ, reason: contains not printable characters */
                public final /* synthetic */ float f11485e;

                /* renamed from: eؘٙؓ, reason: contains not printable characters */
                public final /* synthetic */ Function1 f11486e;

                /* renamed from: eٌٍٚ, reason: contains not printable characters */
                public final /* synthetic */ C2892e f11487e;

                /* renamed from: eٍۗۛ, reason: contains not printable characters */
                public final /* synthetic */ int f11488e;

                /* renamed from: eؙِٖ, reason: contains not printable characters */
                public final /* synthetic */ C15274e f11489e;

                /* renamed from: eّٕۜ, reason: contains not printable characters */
                public final /* synthetic */ C12235e f11490e;

                /* renamed from: eّٖۦ, reason: contains not printable characters */
                public final /* synthetic */ float f11491e;

                /* renamed from: eؘَٗ, reason: contains not printable characters */
                public final /* synthetic */ C2892e f11492e;

                /* renamed from: eٗۚۖ, reason: contains not printable characters */
                public final /* synthetic */ Function0 f11493e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj7, Object obj8) {
                    ((Integer) obj8).getClass();
                    AbstractC12547e.ad(this.f11491e, this.f11486e, this.f11484e, this.f11489e, this.f11482e, this.f11493e, this.f11492e, this.f11487e, this.f11490e, this.f11485e, this.f11488e, this.f11483e, (C13770e) obj7, AbstractC5190e.advert(14156161));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final InterfaceC3314e appmetrica(C15274e c15274e, C13770e c13770e, int i) {
        Object m3681throw = c13770e.m3681throw();
        C5170e c5170e = C2987e.ad;
        if (m3681throw == c5170e) {
            m3681throw = AbstractC14533e.startapp(Boolean.FALSE);
            c13770e.m3682throws(m3681throw);
        }
        InterfaceC3314e interfaceC3314e = (InterfaceC3314e) m3681throw;
        boolean z = (((i & 14) ^ 6) > 4 && c13770e.purchase(c15274e)) || (i & 6) == 4;
        Object m3681throw2 = c13770e.m3681throw();
        if (z || m3681throw2 == c5170e) {
            m3681throw2 = new C1030e(c15274e, interfaceC3314e, null, 1);
            c13770e.m3682throws(m3681throw2);
        }
        AbstractC17680e.license(c13770e, c15274e, (Function2) m3681throw2);
        return interfaceC3314e;
    }

    public static final long billing(String str, long j, long j2, long j3) {
        String str2;
        int i = AbstractC9861e.ad;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j;
        }
        Long tapsense = AbstractC6507e.tapsense(str2);
        if (tapsense == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
        }
        long longValue = tapsense.longValue();
        if (j2 <= longValue && longValue <= j3) {
            return longValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + longValue + '\'').toString());
    }

    public static final float license(float f, float f2, float f3, float[] fArr) {
        Float valueOf;
        if (fArr.length == 0) {
            valueOf = null;
        } else {
            float f4 = fArr[0];
            int i = 1;
            int length = fArr.length - 1;
            if (length == 0) {
                valueOf = Float.valueOf(f4);
            } else {
                float abs = Math.abs(AbstractC15842e.startapp(f2, f3, f4) - f);
                if (1 <= length) {
                    while (true) {
                        float f5 = fArr[i];
                        float abs2 = Math.abs(AbstractC15842e.startapp(f2, f3, f5) - f);
                        if (Float.compare(abs, abs2) > 0) {
                            f4 = f5;
                            abs = abs2;
                        }
                        if (i == length) {
                            break;
                        }
                        i++;
                    }
                }
                valueOf = Float.valueOf(f4);
            }
        }
        return valueOf != null ? AbstractC15842e.startapp(f2, f3, valueOf.floatValue()) : f;
    }

    public static final void metrica(final InterfaceC12864e interfaceC12864e, final C12339e c12339e, final boolean z, final C15274e c15274e, final float f, final C2892e c2892e, final C2892e c2892e2, final C12235e c12235e, C13770e c13770e, final int i) {
        int i2;
        C12339e c12339e2;
        boolean z2;
        InterfaceC12864e interfaceC12864e2;
        boolean z3;
        C13770e c13770e2 = c13770e;
        c13770e2.m3671package(-81540261);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (c13770e2.purchase(interfaceC12864e) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e2.purchase(c12339e) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c13770e2.billing(z) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c13770e2.purchase(c15274e) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c13770e2.metrica(f) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= c13770e2.yandex(c2892e) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= c13770e2.yandex(c2892e2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= c13770e2.purchase(c12235e) ? 8388608 : 4194304;
        }
        int i4 = i2;
        if (c13770e2.m3673protected(i4 & 1, (i4 & 4793491) != 4793490)) {
            c12339e.yandex = c13770e2.adcel(AbstractC11473e.amazon) == EnumC7792e.f15793e;
            C0115e c0115e = C0115e.f1276e;
            if (z) {
                C3169e c3169e = new C3169e(i3, c12339e);
                C2561e c2561e = AbstractC0845e.ad;
                c12339e2 = c12339e;
                z2 = true;
                interfaceC12864e2 = new C8128e(c12339e2, c15274e, null, c3169e, 4);
            } else {
                c12339e2 = c12339e;
                z2 = true;
                interfaceC12864e2 = c0115e;
            }
            boolean z4 = c12339e2.yandex;
            boolean booleanValue = ((Boolean) c12339e2.adcel.getValue()).booleanValue();
            int i5 = i4 & 112;
            boolean z5 = i5 == 32 ? z2 : false;
            Object m3681throw = c13770e2.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (z5 || m3681throw == c5170e) {
                m3681throw = new C11864e(c12339e2, (InterfaceC5083e) null, 3);
                c13770e2.m3682throws(m3681throw);
            }
            C12339e c12339e3 = c12339e2;
            InterfaceC12864e ad2 = AbstractC6367e.ad(c12339e3, z, c15274e, booleanValue, (Function3) m3681throw, z4);
            C4782e c4782e = AbstractC7562e.ad;
            InterfaceC12864e ad3 = AbstractC1147e.ad(AbstractC6022e.appmetrica(interfaceC12864e.premium(C10623e.f20937e), z, c15274e), false, new C7144e(z, c12339e3, 2));
            float purchase = c12339e3.license.purchase();
            C3721e c3721e = c12339e3.vip;
            InterfaceC12864e premium = AbstractC1147e.ad(ad3, true, new C12337e(purchase, new C3721e(c3721e.ad, c3721e.vip), c12339e3.ad)).premium(interfaceC12864e2).premium(ad2);
            boolean z6 = i5 == 32;
            Object m3681throw2 = c13770e2.m3681throw();
            if (z6 || m3681throw2 == c5170e) {
                z3 = true;
                m3681throw2 = new C9346e(1 == true ? 1 : 0, c12339e3);
                c13770e2.m3682throws(m3681throw2);
            } else {
                z3 = true;
            }
            InterfaceC2747e interfaceC2747e = (InterfaceC2747e) m3681throw2;
            long j = c13770e2.f27286case;
            int i6 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e2.advert();
            InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e2, premium);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e2.m3666import();
            if (c13770e2.f27292implements) {
                c13770e2.mopub(c7309e);
            } else {
                c13770e2.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e2, interfaceC2747e, C2721e.billing);
            AbstractC2270e.yandex(c13770e2, advert, C2721e.purchase);
            AbstractC2270e.yandex(c13770e2, Integer.valueOf(i6), C2721e.adcel);
            AbstractC2270e.purchase(c13770e2, C2721e.mopub);
            AbstractC2270e.yandex(c13770e2, purchase2, C2721e.license);
            AbstractC0865e.ad(c0115e, null, AbstractC12322e.vip(c12235e.vip, c12235e.appmetrica, 0L, 0L, c13770e, 0, 12), null, null, AbstractC16653e.license(1377504786, new Function3() { // from class: eؙٜٜ
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    C13770e c13770e3 = (C13770e) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    final int i7 = 0;
                    final int i8 = 1;
                    if (c13770e3.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                        final C12339e c12339e4 = C12339e.this;
                        boolean purchase3 = c13770e3.purchase(c12339e4);
                        C12235e c12235e2 = c12235e;
                        boolean purchase4 = purchase3 | c13770e3.purchase(c12235e2);
                        float f2 = f;
                        boolean metrica2 = purchase4 | c13770e3.metrica(f2);
                        Object m3681throw3 = c13770e3.m3681throw();
                        int i9 = 2;
                        if (metrica2 || m3681throw3 == C2987e.ad) {
                            m3681throw3 = new C1893e(c12339e4, c12235e2, f2, i9);
                            c13770e3.m3682throws(m3681throw3);
                        }
                        InterfaceC12864e mopub = AbstractC12220e.mopub(AbstractC18007e.metrica(AbstractC5750e.license(C0115e.f1276e, (Function1) m3681throw3), 1.0f), 16);
                        C8587e ad4 = AbstractC6451e.ad(AbstractC16497e.ad, C5438e.f11668e, c13770e3, 48);
                        long j2 = c13770e3.f27286case;
                        int i10 = (int) (j2 ^ (j2 >>> 32));
                        InterfaceC3483e advert2 = c13770e3.advert();
                        InterfaceC12864e purchase5 = AbstractC5679e.purchase(c13770e3, mopub);
                        InterfaceC5685e.mopub.getClass();
                        C7309e c7309e2 = C2721e.vip;
                        c13770e3.m3666import();
                        if (c13770e3.f27292implements) {
                            c13770e3.mopub(c7309e2);
                        } else {
                            c13770e3.m3684volatile();
                        }
                        AbstractC2270e.yandex(c13770e3, ad4, C2721e.billing);
                        AbstractC2270e.yandex(c13770e3, advert2, C2721e.purchase);
                        AbstractC2270e.yandex(c13770e3, Integer.valueOf(i10), C2721e.adcel);
                        AbstractC2270e.purchase(c13770e3, C2721e.mopub);
                        AbstractC2270e.yandex(c13770e3, purchase5, C2721e.license);
                        C5015e c5015e = AbstractC0608e.ad;
                        C14815e loadAd = AbstractC8703e.loadAd(c12235e2.license, c5015e);
                        C5015e c5015e2 = AbstractC14489e.ad;
                        C1839e c1839e = (C1839e) c13770e3.adcel(c5015e2);
                        C15492e c15492e = AbstractC11785e.ad;
                        C14815e[] c14815eArr = {loadAd, c5015e2.ad(c1839e.appmetrica(((C7019e) c13770e3.adcel(c15492e)).vip.yandex))};
                        final C2892e c2892e3 = c2892e;
                        AbstractC1101e.vip(c14815eArr, AbstractC16653e.license(-1968840082, new Function2() { // from class: eِْۦ
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                int i11 = i7;
                                C13770e c13770e4 = (C13770e) obj4;
                                int intValue2 = ((Integer) obj5).intValue();
                                switch (i11) {
                                    case 0:
                                        if (c13770e4.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                                            c2892e3.invoke(c12339e4, c13770e4, 0);
                                        } else {
                                            c13770e4.m3659default();
                                        }
                                        return Unit.INSTANCE;
                                    default:
                                        if (c13770e4.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                                            c2892e3.invoke(c12339e4, c13770e4, 0);
                                        } else {
                                            c13770e4.m3659default();
                                        }
                                        return Unit.INSTANCE;
                                }
                            }
                        }, c13770e3), c13770e3, 56);
                        if (1.0f <= 0.0d) {
                            AbstractC9534e.ad("invalid weight; must be greater than zero");
                        }
                        AbstractC12534e.ad(c13770e3, new C5228e(1.0f, true));
                        C14815e[] c14815eArr2 = {AbstractC8703e.loadAd(c12235e2.appmetrica, c5015e), c5015e2.ad(((C1839e) c13770e3.adcel(c5015e2)).appmetrica(((C7019e) c13770e3.adcel(c15492e)).vip.mopub))};
                        final C2892e c2892e4 = c2892e2;
                        AbstractC1101e.vip(c14815eArr2, AbstractC16653e.license(-1865829993, new Function2() { // from class: eِْۦ
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                int i11 = i8;
                                C13770e c13770e4 = (C13770e) obj4;
                                int intValue2 = ((Integer) obj5).intValue();
                                switch (i11) {
                                    case 0:
                                        if (c13770e4.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                                            c2892e4.invoke(c12339e4, c13770e4, 0);
                                        } else {
                                            c13770e4.m3659default();
                                        }
                                        return Unit.INSTANCE;
                                    default:
                                        if (c13770e4.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                                            c2892e4.invoke(c12339e4, c13770e4, 0);
                                        } else {
                                            c13770e4.m3659default();
                                        }
                                        return Unit.INSTANCE;
                                }
                            }
                        }, c13770e3), c13770e3, 56);
                        c13770e3.Signature(true);
                    } else {
                        c13770e3.m3659default();
                    }
                    return Unit.INSTANCE;
                }
            }, c13770e), c13770e, 196614, 26);
            c13770e2 = c13770e;
            c13770e2.Signature(z3);
        } else {
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new Function2() { // from class: eٍۡؓ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC12547e.metrica(InterfaceC12864e.this, c12339e, z, c15274e, f, c2892e, c2892e2, c12235e, (C13770e) obj, AbstractC5190e.advert(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static C6798e purchase(AbstractC7919e abstractC7919e, boolean z, boolean z2, Boolean bool, boolean z3, C7850e c7850e, C16308e c16308e) {
        C15447e c15447e;
        EnumC3253e enumC3253e;
        InterfaceC3054e interfaceC3054e = (InterfaceC3054e) abstractC7919e.f16036e;
        EnumC3253e enumC3253e2 = EnumC3253e.INTERFACE;
        if (z) {
            if (bool == null) {
                throw new IllegalStateException(("isConst should not be null for property (container=" + abstractC7919e + ')').toString());
            }
            if (abstractC7919e instanceof C15447e) {
                C15447e c15447e2 = (C15447e) abstractC7919e;
                if (c15447e2.f30529e == enumC3253e2) {
                    return AbstractC12511e.purchase(c7850e, c15447e2.f30531e.license(C0520e.appmetrica("DefaultImpls")), c16308e);
                }
            }
            if (bool.booleanValue() && (abstractC7919e instanceof C15385e)) {
                C11761e c11761e = interfaceC3054e instanceof C11761e ? (C11761e) interfaceC3054e : null;
                C1553e c1553e = c11761e != null ? c11761e.f23634e : null;
                if (c1553e != null) {
                    C12816e c12816e = new C12816e(c1553e.license().replace('/', '.'));
                    C12816e vip2 = c12816e.vip();
                    C0520e billing = c12816e.ad.billing();
                    C12816e c12816e2 = C12816e.metrica;
                    C13579e c13579e = AbstractC18453e.billing(billing).ad;
                    c13579e.metrica();
                    String replace = c13579e.ad.replace('.', '$');
                    if (!vip2.ad.metrica()) {
                        replace = vip2 + '.' + replace;
                    }
                    C2691e signatures = c7850e.signatures(replace);
                    if (signatures != null) {
                        return (C6798e) signatures.f6570e;
                    }
                    return null;
                }
            }
        }
        if (z2 && (abstractC7919e instanceof C15447e)) {
            C15447e c15447e3 = (C15447e) abstractC7919e;
            if (c15447e3.f30529e == EnumC3253e.COMPANION_OBJECT && (c15447e = c15447e3.f30532e) != null && ((enumC3253e = c15447e.f30529e) == EnumC3253e.CLASS || enumC3253e == EnumC3253e.ENUM_CLASS || (z3 && (enumC3253e == enumC3253e2 || enumC3253e == EnumC3253e.ANNOTATION_CLASS)))) {
                InterfaceC3054e interfaceC3054e2 = (InterfaceC3054e) c15447e.f16036e;
                C16835e c16835e = interfaceC3054e2 instanceof C16835e ? (C16835e) interfaceC3054e2 : null;
                if (c16835e != null) {
                    return c16835e.f32984e;
                }
                return null;
            }
        }
        if ((abstractC7919e instanceof C15385e) && (interfaceC3054e instanceof C11761e)) {
            C11761e c11761e2 = (C11761e) interfaceC3054e;
            C6798e c6798e = c11761e2.f23633e;
            return c6798e == null ? AbstractC12511e.purchase(c7850e, c11761e2.ad(), c16308e) : c6798e;
        }
        return null;
    }

    public static final void vip(float f, final Function1 function1, final InterfaceC12864e interfaceC12864e, final C15274e c15274e, final boolean z, final float f2, final int i, final C3721e c3721e, final Function0 function0, final C2892e c2892e, final C2892e c2892e2, final C12235e c12235e, C13770e c13770e, final int i2, final int i3) {
        int i4;
        C15274e c15274e2;
        boolean z2;
        float f3;
        int i5;
        C3721e c3721e2;
        int i6;
        float f4;
        Function1 function12;
        Function0 function02;
        int i7;
        c13770e.m3671package(963818248);
        if ((i2 & 6) == 0) {
            i4 = (c13770e.metrica(f) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c13770e.yandex(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= c13770e.purchase(interfaceC12864e) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i2 & 3072) == 0) {
            c15274e2 = c15274e;
            i4 |= c13770e.purchase(c15274e2) ? 2048 : 1024;
        } else {
            c15274e2 = c15274e;
        }
        if ((i2 & 24576) == 0) {
            z2 = z;
            i4 |= c13770e.billing(z2) ? 16384 : 8192;
        } else {
            z2 = z;
        }
        if ((196608 & i2) == 0) {
            f3 = f2;
            i4 |= c13770e.metrica(f3) ? 131072 : 65536;
        } else {
            f3 = f2;
        }
        if ((1572864 & i2) == 0) {
            i5 = i;
            i4 |= c13770e.license(i5) ? 1048576 : 524288;
        } else {
            i5 = i;
        }
        if ((12582912 & i2) == 0) {
            c3721e2 = c3721e;
            i4 |= c13770e.purchase(c3721e2) ? 8388608 : 4194304;
        } else {
            c3721e2 = c3721e;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= c13770e.yandex(function0) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= c13770e.yandex(c2892e) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i6 = i3 | (c13770e.yandex(c2892e2) ? 4 : 2);
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= c13770e.purchase(c12235e) ? 32 : 16;
        }
        int i8 = i6;
        int i9 = i4;
        if (c13770e.m3673protected(i9 & 1, ((306783379 & i4) == 306783378 && (i8 & 19) == 18) ? false : true)) {
            c13770e.m3655case();
            if ((i2 & 1) != 0 && !c13770e.isPro()) {
                c13770e.m3659default();
            }
            c13770e.admob();
            Object m3681throw = c13770e.m3681throw();
            if (m3681throw == C2987e.ad) {
                i7 = i9;
                m3681throw = new C12339e(f, i5, c3721e2, function0, function1);
                f4 = f;
                function02 = function0;
                function12 = function1;
                c13770e.m3682throws(m3681throw);
            } else {
                f4 = f;
                function12 = function1;
                function02 = function0;
                i7 = i9;
            }
            C12339e c12339e = (C12339e) m3681throw;
            c12339e.license(f4);
            c12339e.appmetrica = function12;
            c12339e.metrica = function02;
            int i10 = i7 >> 6;
            int i11 = i8 << 18;
            metrica(interfaceC12864e, c12339e, z2, c15274e2, f3, c2892e, c2892e2, c12235e, c13770e, (i10 & 896) | (i10 & 14) | 48 | (i7 & 7168) | ((i7 >> 3) & 57344) | ((i7 >> 12) & 458752) | (3670016 & i11) | (i11 & 29360128));
        } else {
            f4 = f;
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            final float f5 = f4;
            subscription.license = new Function2() { // from class: eٍؚ٘
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int advert = AbstractC5190e.advert(i2 | 1);
                    int advert2 = AbstractC5190e.advert(i3);
                    AbstractC12547e.vip(f5, function1, interfaceC12864e, c15274e, z, f2, i, c3721e, function0, c2892e, c2892e2, c12235e, (C13770e) obj, advert, advert2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static int yandex(int i, int i2, String str) {
        return (int) billing(str, i, 1, (i2 & 8) != 0 ? Alert.DURATION_SHOW_INDEFINITELY : 2097150);
    }
}
