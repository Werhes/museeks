package defpackage;

import android.util.Base64;
import java.lang.annotation.Annotation;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑؑؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0014e {
    public static final void ad(Function0 function0, InterfaceC12864e interfaceC12864e, boolean z, InterfaceC16154e interfaceC16154e, C14602e c14602e, C2892e c2892e, C13770e c13770e, int i) {
        boolean z2;
        InterfaceC16154e interfaceC16154e2;
        int i2;
        InterfaceC16154e ad;
        boolean z3;
        c13770e.m3671package(-399178234);
        int i3 = i | (c13770e.yandex(function0) ? 4 : 2) | 1408 | (c13770e.purchase(c14602e) ? 16384 : 8192) | 196608;
        if (c13770e.m3673protected(i3 & 1, (599187 & i3) != 599186)) {
            c13770e.m3655case();
            if ((i & 1) == 0 || c13770e.isPro()) {
                int i4 = C12563e.ad;
                float f = AbstractC6957e.ad;
                i2 = i3 & (-7169);
                ad = AbstractC8949e.ad(c13770e, 7);
                z3 = true;
            } else {
                c13770e.m3659default();
                i2 = i3 & (-7169);
                z3 = z;
                ad = interfaceC16154e;
            }
            c13770e.admob();
            appmetrica(function0, interfaceC12864e, z3, ad, c14602e, c2892e, c13770e, (i2 & 57344) | (i2 & 14) | 197040 | 14155776);
            z2 = z3;
            interfaceC16154e2 = ad;
        } else {
            c13770e.m3659default();
            z2 = z;
            interfaceC16154e2 = interfaceC16154e;
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C5576e(function0, interfaceC12864e, z2, interfaceC16154e2, c14602e, c2892e, i);
        }
    }

    public static final boolean adcel(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[11];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[14];
        float f16 = fArr[15];
        float f17 = (f * f6) - (f2 * f5);
        float f18 = (f * f7) - (f3 * f5);
        float f19 = (f * f8) - (f4 * f5);
        float f20 = (f2 * f7) - (f3 * f6);
        float f21 = (f2 * f8) - (f4 * f6);
        float f22 = (f3 * f8) - (f4 * f7);
        float f23 = (f9 * f14) - (f10 * f13);
        float f24 = (f9 * f15) - (f11 * f13);
        float f25 = (f9 * f16) - (f12 * f13);
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f11 * f16) - (f12 * f15);
        float f29 = (f22 * f23) + (((f20 * f25) + ((f19 * f26) + ((f17 * f28) - (f18 * f27)))) - (f21 * f24));
        if (f29 != 0.0f) {
            float f30 = 1.0f / f29;
            fArr2[0] = ((f8 * f26) + ((f6 * f28) - (f7 * f27))) * f30;
            fArr2[1] = (((f3 * f27) + ((-f2) * f28)) - (f4 * f26)) * f30;
            fArr2[2] = ((f16 * f20) + ((f14 * f22) - (f15 * f21))) * f30;
            fArr2[3] = (((f11 * f21) + ((-f10) * f22)) - (f12 * f20)) * f30;
            float f31 = -f5;
            fArr2[4] = (((f7 * f25) + (f31 * f28)) - (f8 * f24)) * f30;
            fArr2[5] = ((f4 * f24) + ((f28 * f) - (f3 * f25))) * f30;
            float f32 = -f13;
            fArr2[6] = (((f15 * f19) + (f32 * f22)) - (f16 * f18)) * f30;
            fArr2[7] = ((f12 * f18) + ((f22 * f9) - (f11 * f19))) * f30;
            fArr2[8] = ((f8 * f23) + ((f5 * f27) - (f6 * f25))) * f30;
            fArr2[9] = (((f25 * f2) + ((-f) * f27)) - (f4 * f23)) * f30;
            fArr2[10] = ((f16 * f17) + ((f13 * f21) - (f14 * f19))) * f30;
            fArr2[11] = (((f19 * f10) + ((-f9) * f21)) - (f12 * f17)) * f30;
            fArr2[12] = (((f6 * f24) + (f31 * f26)) - (f7 * f23)) * f30;
            fArr2[13] = ((f3 * f23) + ((f * f26) - (f2 * f24))) * f30;
            fArr2[14] = (((f14 * f18) + (f32 * f20)) - (f15 * f17)) * f30;
            fArr2[15] = ((f11 * f17) + ((f9 * f20) - (f10 * f18))) * f30;
        }
        return !(f29 == 0.0f);
    }

    public static C10182e advert(C1292e c1292e, boolean z, boolean z2) {
        if (z) {
            smaato(3, c1292e, false);
        }
        c1292e.isPro((int) c1292e.subscription(), StandardCharsets.UTF_8);
        long subscription = c1292e.subscription();
        String[] strArr = new String[(int) subscription];
        for (int i = 0; i < subscription; i++) {
            strArr[i] = c1292e.isPro((int) c1292e.subscription(), StandardCharsets.UTF_8);
        }
        if (z2 && (c1292e.ads() & 1) == 0) {
            throw C15125e.ad(null, "framing bit expected to be set");
        }
        return new C10182e(strArr);
    }

    public static final void appmetrica(Function0 function0, InterfaceC12864e interfaceC12864e, boolean z, InterfaceC16154e interfaceC16154e, C14602e c14602e, C2892e c2892e, C13770e c13770e, int i) {
        Function0 function02;
        int i2;
        c13770e.m3671package(-171935091);
        if ((i & 6) == 0) {
            function02 = function0;
            i2 = (c13770e.yandex(function02) ? 4 : 2) | i;
        } else {
            function02 = function0;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e.purchase(interfaceC12864e) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c13770e.billing(z) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c13770e.purchase(interfaceC16154e) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c13770e.purchase(c14602e) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= c13770e.purchase(null) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= c13770e.purchase(null) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= c13770e.yandex(c2892e) ? 8388608 : 4194304;
        }
        if (c13770e.m3673protected(i2 & 1, (4793491 & i2) != 4793490)) {
            Object m3681throw = c13770e.m3681throw();
            if (m3681throw == C2987e.ad) {
                m3681throw = new C14407e(21);
                c13770e.m3682throws(m3681throw);
            }
            int i3 = i2 & 8078;
            int i4 = i2 << 9;
            AbstractC12121e.metrica(function02, AbstractC1147e.ad(interfaceC12864e, false, (Function1) m3681throw), z, interfaceC16154e, z ? c14602e.ad : c14602e.metrica, z ? c14602e.vip : c14602e.license, 0.0f, 0.0f, null, null, AbstractC16653e.license(669231714, new C7099e(c2892e, 0), c13770e), c13770e, (i4 & 1879048192) | i3 | (i4 & 234881024), 192);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C4982e(function0, interfaceC12864e, z, interfaceC16154e, c14602e, c2892e, i);
        }
    }

    public static final void license(InterfaceC12864e interfaceC12864e, Function0 function0, boolean z, InterfaceC16154e interfaceC16154e, C14602e c14602e, C15274e c15274e, Function2 function2, C13770e c13770e, int i) {
        int i2;
        C15274e c15274e2;
        int i3;
        char c;
        long j;
        c13770e.m3671package(-1134296466);
        if ((i & 6) == 0) {
            i2 = (c13770e.purchase(interfaceC12864e) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e.yandex(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c13770e.billing(z) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c13770e.purchase(interfaceC16154e) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c13770e.purchase(c14602e) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= c13770e.purchase(c15274e) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= c13770e.yandex(function2) ? 1048576 : 524288;
        }
        int i4 = i2;
        if (c13770e.m3673protected(i4 & 1, (599187 & i4) != 599186)) {
            if (c15274e == null) {
                c13770e.m3676strictfp(976976045);
                Object m3681throw = c13770e.m3681throw();
                if (m3681throw == C2987e.ad) {
                    m3681throw = AbstractC17861e.adcel(c13770e);
                }
                c15274e2 = (C15274e) m3681throw;
                c13770e.Signature(false);
            } else {
                c13770e.m3676strictfp(862798698);
                c13770e.Signature(false);
                c15274e2 = c15274e;
            }
            C4782e c4782e = AbstractC7562e.ad;
            InterfaceC12864e premium = interfaceC12864e.premium(C10623e.f20937e);
            long billing = C12563e.billing();
            C7913e c7913e = AbstractC18007e.ad;
            InterfaceC12864e vip = AbstractC12447e.vip(AbstractC18007e.adcel(premium, C16109e.vip(billing), C16109e.ad(billing)), interfaceC16154e);
            if (z) {
                i3 = i4;
                c = ' ';
                j = c14602e.ad;
            } else {
                i3 = i4;
                c = ' ';
                j = c14602e.metrica;
            }
            InterfaceC12864e ad = AbstractC6261e.ad(AbstractC9546e.metrica(AbstractC16136e.metrica(vip, j, interfaceC16154e), c15274e2, AbstractC17052e.ad(0.0f, 7, 0L, false), z, new C11796e(0), function0, 8));
            InterfaceC2747e license = AbstractC17074e.license(C5438e.f11700e, false);
            long j2 = c13770e.f27286case;
            int i5 = (int) (j2 ^ (j2 >>> c));
            InterfaceC3483e advert = c13770e.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, ad);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, license, C2721e.billing);
            AbstractC2270e.yandex(c13770e, advert, C2721e.purchase);
            AbstractC2270e.yandex(c13770e, Integer.valueOf(i5), C2721e.adcel);
            AbstractC2270e.purchase(c13770e, C2721e.mopub);
            AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
            AbstractC1101e.ad(AbstractC8703e.loadAd(z ? c14602e.vip : c14602e.license, AbstractC0608e.ad), function2, c13770e, ((i3 >> 15) & 112) | 8);
            c13770e.Signature(true);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C2959e(interfaceC12864e, function0, z, interfaceC16154e, c14602e, c15274e, function2, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void metrica(kotlin.jvm.functions.Function0 r25, defpackage.InterfaceC12864e r26, boolean r27, defpackage.C14602e r28, defpackage.C15274e r29, defpackage.InterfaceC16154e r30, kotlin.jvm.functions.Function2 r31, defpackage.C13770e r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC0014e.metrica(kotlin.jvm.functions.Function0, eّۤۧ, boolean, eٌِٔ, eؘٕؕ, eّٖؖ, kotlin.jvm.functions.Function2, eٓؕۥ, int, int):void");
    }

    public static C17750e mopub(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            String str2 = AbstractC9413e.ad;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                AbstractC2803e.smaato("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(C6083e.license(new C1292e(Base64.decode(split[1], 0))));
                } catch (RuntimeException e) {
                    AbstractC2803e.amazon("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new C2421e(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C17750e(arrayList);
    }

    public static final void purchase(final boolean z, final Function1 function1, InterfaceC12864e interfaceC12864e, final boolean z2, final InterfaceC16154e interfaceC16154e, C16171e c16171e, C15274e c15274e, C2892e c2892e, C13770e c13770e, int i) {
        int i2;
        C13770e c13770e2;
        C5170e c5170e;
        long j;
        float f;
        final C15274e c15274e2;
        c13770e.m3671package(-1118363928);
        if ((i & 6) == 0) {
            i2 = (c13770e.billing(z) ? 4 : 2) | i;
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
            i2 |= c13770e.billing(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c13770e.purchase(interfaceC16154e) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= c13770e.purchase(c16171e) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= c13770e.purchase(null) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= c13770e.purchase(c15274e) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= c13770e.yandex(c2892e) ? 67108864 : 33554432;
        }
        if (c13770e.m3673protected(i2 & 1, (38347923 & i2) != 38347922)) {
            Object m3681throw = c13770e.m3681throw();
            C5170e c5170e2 = C2987e.ad;
            if (m3681throw == c5170e2) {
                m3681throw = new C14407e(22);
                c13770e.m3682throws(m3681throw);
            }
            final InterfaceC12864e ad = AbstractC1147e.ad(interfaceC12864e, false, (Function1) m3681throw);
            if (z2) {
                c5170e = c5170e2;
                j = !z ? c16171e.ad : c16171e.appmetrica;
            } else {
                c5170e = c5170e2;
                j = c16171e.metrica;
            }
            final long j2 = ((C3618e) AbstractC14533e.mopub(new C3618e(j), c13770e).getValue()).ad;
            long j3 = ((C3618e) AbstractC14533e.mopub(new C3618e(!z2 ? c16171e.license : !z ? c16171e.vip : c16171e.purchase), c13770e).getValue()).ad;
            final C2892e license = AbstractC16653e.license(1492028158, new C7099e(c2892e, 1), c13770e);
            C5015e c5015e = AbstractC12121e.ad;
            float f2 = 0;
            if (c15274e == null) {
                c13770e.m3676strictfp(643383721);
                Object m3681throw2 = c13770e.m3681throw();
                f = f2;
                if (m3681throw2 == c5170e) {
                    m3681throw2 = AbstractC17861e.adcel(c13770e);
                }
                c15274e2 = (C15274e) m3681throw2;
                c13770e.Signature(false);
            } else {
                f = f2;
                c13770e.m3676strictfp(-533435666);
                c13770e.Signature(false);
                c15274e2 = c15274e;
            }
            C5015e c5015e2 = AbstractC12121e.ad;
            final float f3 = ((C15765e) c13770e.adcel(c5015e2)).f31051e + f;
            C14815e[] c14815eArr = {AbstractC8703e.loadAd(j3, AbstractC0608e.ad), c5015e2.ad(new C15765e(f3))};
            c13770e2 = c13770e;
            final float f4 = f;
            AbstractC1101e.vip(c14815eArr, AbstractC16653e.license(-1839065134, new Function2() { // from class: eُ۠ۤ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    C13770e c13770e3 = (C13770e) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (c13770e3.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                        C4782e c4782e = AbstractC7562e.ad;
                        InterfaceC12864e ad2 = AbstractC6261e.ad(AbstractC12534e.purchase(AbstractC12121e.license(InterfaceC12864e.this.premium(C10623e.f20937e), interfaceC16154e, AbstractC12121e.appmetrica(j2, f3, c13770e3), null, ((InterfaceC14388e) c13770e3.adcel(AbstractC11473e.yandex)).mo497instanceof(f4)), z, c15274e2, AbstractC17052e.ad(0.0f, 7, 0L, false), z2, null, function1));
                        InterfaceC2747e license2 = AbstractC17074e.license(C5438e.f11676e, true);
                        long j4 = c13770e3.f27286case;
                        int i3 = (int) (j4 ^ (j4 >>> 32));
                        InterfaceC3483e advert = c13770e3.advert();
                        InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e3, ad2);
                        InterfaceC5685e.mopub.getClass();
                        C7309e c7309e = C2721e.vip;
                        c13770e3.m3666import();
                        if (c13770e3.f27292implements) {
                            c13770e3.mopub(c7309e);
                        } else {
                            c13770e3.m3684volatile();
                        }
                        AbstractC2270e.yandex(c13770e3, license2, C2721e.billing);
                        AbstractC2270e.yandex(c13770e3, advert, C2721e.purchase);
                        AbstractC2270e.yandex(c13770e3, Integer.valueOf(i3), C2721e.adcel);
                        AbstractC2270e.purchase(c13770e3, C2721e.mopub);
                        AbstractC2270e.yandex(c13770e3, purchase, C2721e.license);
                        license.invoke(c13770e3, 0);
                        c13770e3.Signature(true);
                    } else {
                        c13770e3.m3659default();
                    }
                    return Unit.INSTANCE;
                }
            }, c13770e2), c13770e2, 56);
        } else {
            c13770e2 = c13770e;
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C1004e(z, function1, interfaceC12864e, z2, interfaceC16154e, c16171e, c15274e, c2892e, i);
        }
    }

    public static boolean smaato(int i, C1292e c1292e, boolean z) {
        if (c1292e.ad() < 7) {
            if (z) {
                return false;
            }
            throw C15125e.ad(null, "too short header: " + c1292e.ad());
        }
        if (c1292e.ads() != i) {
            if (z) {
                return false;
            }
            throw C15125e.ad(null, "expected header type " + Integer.toHexString(i));
        }
        if (c1292e.ads() == 118 && c1292e.ads() == 111 && c1292e.ads() == 114 && c1292e.ads() == 98 && c1292e.ads() == 105 && c1292e.ads() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw C15125e.ad(null, "expected characters 'vorbis'");
    }

    public static final ArrayList startapp(Annotation[] annotationArr) {
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation annotation : annotationArr) {
            arrayList.add(new C2430e(annotation));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void vip(final boolean r16, final kotlin.jvm.functions.Function1 r17, defpackage.InterfaceC12864e r18, boolean r19, final defpackage.InterfaceC16154e r20, final defpackage.C16171e r21, final defpackage.C15274e r22, final defpackage.C2892e r23, defpackage.C13770e r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC0014e.vip(boolean, kotlin.jvm.functions.Function1, eّۤۧ, boolean, eّٖؖ, eْٖٔ, eؘٕؕ, eؔ۟ٓ, eٓؕۥ, int, int):void");
    }

    public static final C2430e yandex(Annotation[] annotationArr, C12816e c12816e) {
        Annotation annotation;
        int length = annotationArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                annotation = null;
                break;
            }
            annotation = annotationArr[i];
            if (AbstractC7890e.billing(AbstractC2677e.ad(((InterfaceC18155e) AbstractC14437e.appmetrica(annotation)).subs()).ad(), c12816e)) {
                break;
            }
            i++;
        }
        if (annotation != null) {
            return new C2430e(annotation);
        }
        return null;
    }

    public abstract List billing(String str, List list);
}
