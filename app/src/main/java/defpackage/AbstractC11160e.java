package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٞۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC11160e {
    public static final C2892e ad = new C2892e(112755414, false, new C14234e(16));
    public static final C2892e vip = new C2892e(-1658786954, false, new C14234e(17));
    public static final C2892e metrica = new C2892e(-1422782481, false, new C14234e(18));
    public static final C2892e license = new C2892e(-163961305, false, new C14234e(19));
    public static final C2892e appmetrica = new C2892e(1584452801, false, new C17240e(24));
    public static final C2892e purchase = new C2892e(924848592, false, new C17240e(25));

    public static final long ad(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static String appmetrica(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        boolean z = false;
        String str = null;
        while (it.hasNext()) {
            String str2 = ((C5085e) it.next()).ad.billing.loadAd;
            if (AbstractC8542e.smaato(str2)) {
                return "video/mp4";
            }
            if (AbstractC8542e.startapp(str2)) {
                z = true;
            } else if (AbstractC8542e.mopub(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        return z ? "audio/mp4" : str != null ? str : "application/mp4";
    }

    public static final void license(final boolean z, final Function0 function0, final InterfaceC12864e interfaceC12864e, final boolean z2, float f, final C4100e c4100e, final C3027e c3027e, final C7528e c7528e, C10219e c10219e, C8126e c8126e, final C2892e c2892e, C13770e c13770e, final int i, final int i2, final int i3) {
        int i4;
        float f2;
        C10219e c10219e2;
        int i5;
        final C8126e c8126e2;
        final float f3;
        final C10219e c10219e3;
        C10219e c10219e4;
        int i6;
        C8126e c8126e3;
        int i7;
        C8126e c8126e4;
        int i8;
        C10219e c10219e5;
        long j;
        long j2;
        float f4;
        int i9;
        int i10;
        c13770e.m3671package(-1686649872);
        if ((i & 6) == 0) {
            i4 = (c13770e.billing(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= c13770e.yandex(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= c13770e.purchase(interfaceC12864e) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= c13770e.billing(z2) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            i4 |= c13770e.yandex(null) ? 16384 : 8192;
        }
        int i11 = i3 & 32;
        if (i11 != 0) {
            i4 |= 196608;
            f2 = f;
        } else {
            f2 = f;
            if ((i & 196608) == 0) {
                i4 |= c13770e.metrica(f2) ? 131072 : 65536;
            }
        }
        if ((i & 1572864) == 0) {
            i4 |= c13770e.purchase(c4100e) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= c13770e.purchase(c3027e) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= c13770e.purchase(c7528e) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            if ((i3 & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) == 0) {
                c10219e2 = c10219e;
                if (c13770e.purchase(c10219e2)) {
                    i10 = 536870912;
                    i4 |= i10;
                }
            } else {
                c10219e2 = c10219e;
            }
            i10 = 268435456;
            i4 |= i10;
        } else {
            c10219e2 = c10219e;
        }
        if ((i2 & 6) == 0) {
            if ((i3 & 1024) == 0 && c13770e.purchase(c8126e)) {
                i9 = 4;
                i5 = i2 | i9;
            }
            i9 = 2;
            i5 = i2 | i9;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= c13770e.purchase(null) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= c13770e.yandex(c2892e) ? 256 : 128;
        }
        int i12 = i5;
        int i13 = i4;
        if (c13770e.m3673protected(i13 & 1, ((i4 & 306783379) == 306783378 && (i12 & 147) == 146) ? false : true)) {
            c13770e.m3655case();
            if ((i & 1) == 0 || c13770e.isPro()) {
                float f5 = i11 != 0 ? AbstractC18458e.ad : f2;
                if ((i3 & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) != 0) {
                    C9630e c9630e = C9630e.license;
                    c10219e4 = new C10219e(c9630e, c9630e, c9630e, c9630e, c9630e, c9630e, c9630e, c9630e, c9630e, c9630e);
                    i6 = i13 & (-1879048193);
                } else {
                    c10219e4 = c10219e2;
                    i6 = i13;
                }
                if ((i3 & 1024) != 0) {
                    C14878e c14878e = C14878e.metrica;
                    c8126e3 = new C8126e(c14878e, c14878e, c14878e, c14878e, c14878e, c14878e);
                    i12 &= -15;
                } else {
                    c8126e3 = c8126e;
                }
                f2 = f5;
                i7 = i6;
                c8126e4 = c8126e3;
                i8 = i12;
                c10219e5 = c10219e4;
            } else {
                c13770e.m3659default();
                int i14 = (i3 & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) != 0 ? i13 & (-1879048193) : i13;
                if ((i3 & 1024) != 0) {
                    i12 &= -15;
                }
                c8126e4 = c8126e;
                i7 = i14;
                i8 = i12;
                c10219e5 = c10219e2;
            }
            c13770e.admob();
            c13770e.m3676strictfp(-163190677);
            Object m3681throw = c13770e.m3681throw();
            if (m3681throw == C2987e.ad) {
                m3681throw = AbstractC17861e.adcel(c13770e);
            }
            C15274e c15274e = (C15274e) m3681throw;
            c13770e.Signature(false);
            InterfaceC3314e metrica2 = AbstractC13281e.metrica(c15274e, c13770e, 0);
            InterfaceC3314e vip2 = AbstractC13083e.vip(c15274e, c13770e, 0);
            int[] iArr = AbstractC9751e.ad;
            int i15 = i8;
            InterfaceC12864e ad2 = AbstractC1147e.ad(AbstractC6022e.purchase(AbstractC5679e.metrica(interfaceC12864e, new C16930e(z2, c15274e, function0, 1)), c15274e, 1), true, new C18084e(z, z2, function0));
            boolean booleanValue = ((Boolean) metrica2.getValue()).booleanValue();
            boolean booleanValue2 = ((Boolean) vip2.getValue()).booleanValue();
            InterfaceC16154e interfaceC16154e = (z2 && z && booleanValue2) ? c4100e.yandex : (z2 && z && booleanValue) ? c4100e.purchase : (z2 && z) ? c4100e.license : (z2 && booleanValue2) ? c4100e.metrica : (z2 && booleanValue) ? c4100e.vip : z2 ? c4100e.ad : (!z2 && z && booleanValue) ? c4100e.adcel : (z2 || !z) ? (z2 || !booleanValue) ? c4100e.appmetrica : c4100e.billing : c4100e.startapp;
            boolean booleanValue3 = ((Boolean) metrica2.getValue()).booleanValue();
            boolean booleanValue4 = ((Boolean) vip2.getValue()).booleanValue();
            long j3 = (z2 && z && booleanValue4) ? c3027e.smaato : (z2 && z && booleanValue3) ? c3027e.mopub : (z2 && z) ? c3027e.billing : (z2 && booleanValue4) ? c3027e.appmetrica : (z2 && booleanValue3) ? c3027e.metrica : z2 ? c3027e.ad : c3027e.startapp;
            boolean booleanValue5 = ((Boolean) metrica2.getValue()).booleanValue();
            boolean booleanValue6 = ((Boolean) vip2.getValue()).booleanValue();
            if (z2 && z && booleanValue6) {
                j = j3;
                j2 = c3027e.amazon;
            } else {
                j = j3;
                j2 = (z2 && z && booleanValue5) ? c3027e.advert : (z2 && z) ? c3027e.yandex : (z2 && booleanValue6) ? c3027e.purchase : (z2 && booleanValue5) ? c3027e.license : z2 ? c3027e.vip : c3027e.adcel;
            }
            boolean booleanValue7 = ((Boolean) metrica2.getValue()).booleanValue();
            boolean booleanValue8 = ((Boolean) vip2.getValue()).booleanValue();
            float f6 = 1.0f;
            if (!z2 || !z || !booleanValue8) {
                if (z2 && z && booleanValue7) {
                    f4 = c7528e.vip;
                } else if ((!z2 || !z) && ((!z2 || !booleanValue8) && z2 && booleanValue7)) {
                    f4 = c7528e.ad;
                }
                f6 = f4;
            }
            boolean booleanValue9 = ((Boolean) metrica2.getValue()).booleanValue();
            boolean booleanValue10 = ((Boolean) vip2.getValue()).booleanValue();
            C9630e c9630e2 = (z2 && z && booleanValue10) ? c10219e5.yandex : (z2 && z && booleanValue9) ? c10219e5.purchase : (z2 && z) ? c10219e5.license : (z2 && booleanValue10) ? c10219e5.metrica : (z2 && booleanValue9) ? c10219e5.vip : z2 ? c10219e5.ad : (!z2 && z && booleanValue9) ? c10219e5.adcel : (z2 || !z) ? (z2 || !booleanValue9) ? c10219e5.appmetrica : c10219e5.billing : c10219e5.startapp;
            boolean booleanValue11 = ((Boolean) metrica2.getValue()).booleanValue();
            boolean booleanValue12 = ((Boolean) vip2.getValue()).booleanValue();
            InterfaceC16154e interfaceC16154e2 = interfaceC16154e;
            C9630e c9630e3 = c9630e2;
            C14878e c14878e2 = (z2 && z && booleanValue12) ? c8126e4.purchase : (z2 && z && booleanValue11) ? c8126e4.appmetrica : (z2 && z) ? c8126e4.license : (z2 && booleanValue12) ? c8126e4.metrica : (z2 && booleanValue11) ? c8126e4.vip : z2 ? c8126e4.ad : C14878e.metrica;
            float f7 = f2;
            AbstractC9751e.ad(ad2, z, z2, interfaceC16154e2, j, j2, f6, c9630e3, c14878e2, f7, c15274e, c2892e, c13770e, ((i7 << 3) & 112) | ((i7 >> 3) & 896) | ((i7 << 12) & 1879048192), (i15 >> 3) & 112);
            f3 = f7;
            c10219e3 = c10219e5;
            c8126e2 = c8126e4;
        } else {
            c13770e.m3659default();
            c8126e2 = c8126e;
            f3 = f2;
            c10219e3 = c10219e2;
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new Function2() { // from class: eٟؗ٘
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int advert = AbstractC5190e.advert(i | 1);
                    int advert2 = AbstractC5190e.advert(i2);
                    AbstractC11160e.license(z, function0, interfaceC12864e, z2, f3, c4100e, c3027e, c7528e, c10219e3, c8126e2, c2892e, (C13770e) obj, advert, advert2, i3);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void metrica(InterfaceC12864e interfaceC12864e, InterfaceC16154e interfaceC16154e, C14258e c14258e, C2892e c2892e, C13770e c13770e, int i) {
        C13770e c13770e2;
        C14258e c14258e2;
        if ((i & 1) != 0) {
            interfaceC12864e = C0115e.f1276e;
        }
        float f = 0;
        if ((i & 4) != 0) {
            C9630e c9630e = AbstractC6271e.ad;
            interfaceC16154e = AbstractC10432e.ad;
        }
        if ((i & 8) != 0) {
            c13770e2 = c13770e;
            c14258e2 = AbstractC6271e.ad(0L, 0L, c13770e, 384, 3);
        } else {
            c13770e2 = c13770e;
            c14258e2 = c14258e;
        }
        C9630e c9630e2 = AbstractC6271e.ad;
        C14878e c14878e = AbstractC6271e.vip;
        C5015e c5015e = AbstractC9751e.vip;
        AbstractC1101e.vip(new C14815e[]{AbstractC8703e.loadAd(c14258e2.vip, AbstractC15705e.ad), c5015e.ad(new C15765e(((C15765e) c13770e2.adcel(c5015e)).f31051e + f))}, AbstractC16653e.license(2067745999, new C2779e(c14258e2, interfaceC12864e, interfaceC16154e, c14878e, c9630e2, c2892e), c13770e2), c13770e2, 56);
    }

    public static final int purchase(C13324e c13324e, int i) {
        int i2;
        int[] iArr = c13324e.f26580e;
        int i3 = i + 1;
        int length = c13324e.f26579e.length - 1;
        int i4 = 0;
        while (true) {
            if (i4 <= length) {
                i2 = (i4 + length) >>> 1;
                int i5 = iArr[i2];
                if (i5 >= i3) {
                    if (i5 <= i3) {
                        break;
                    }
                    length = i2 - 1;
                } else {
                    i4 = i2 + 1;
                }
            } else {
                i2 = (-i4) - 1;
                break;
            }
        }
        return i2 >= 0 ? i2 : ~i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0160  */
    /* JADX WARN: Type inference failed for: r15v12, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v27 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void vip(final kotlin.jvm.functions.Function0 r32, final defpackage.InterfaceC12864e r33, boolean r34, float r35, defpackage.C2932e r36, defpackage.C18136e r37, defpackage.C0095e r38, defpackage.C15850e r39, defpackage.C12586e r40, final defpackage.C15274e r41, final defpackage.C2892e r42, defpackage.C13770e r43, final int r44, final int r45, final int r46) {
        /*
            Method dump skipped, instructions count: 1031
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC11160e.vip(kotlin.jvm.functions.Function0, eّۤۧ, boolean, float, eَؔۢ, e٘ۦً, eَؑؖ, eٕۦُ, eّٛٔ, eؘٕؕ, eؔ۟ٓ, eٓؕۥ, int, int, int):void");
    }
}
