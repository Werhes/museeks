package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔٛۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2705e {
    public static final float ad;
    public static final float metrica;
    public static final float vip = 20;

    static {
        float f = 2;
        ad = f;
        metrica = f;
    }

    public static final void ad(boolean z, Function1 function1, InterfaceC12864e interfaceC12864e, boolean z2, C4835e c4835e, C13770e c13770e, int i) {
        InterfaceC12864e interfaceC12864e2;
        boolean z3;
        C4835e c4835e2;
        int i2;
        InterfaceC12864e interfaceC12864e3;
        C4835e c4835e3;
        boolean z4;
        Function0 function0;
        c13770e.m3671package(-1406741137);
        int i3 = i | (c13770e.billing(z) ? 4 : 2) | (c13770e.yandex(function1) ? 32 : 16) | 208256;
        boolean z5 = true;
        if (c13770e.m3673protected(i3 & 1, (74899 & i3) != 74898)) {
            c13770e.m3655case();
            if ((i & 1) == 0 || c13770e.isPro()) {
                C4835e ad2 = AbstractC8188e.ad(c13770e);
                i2 = i3 & (-57345);
                interfaceC12864e3 = C0115e.f1276e;
                c4835e3 = ad2;
                z4 = true;
            } else {
                c13770e.m3659default();
                i2 = i3 & (-57345);
                interfaceC12864e3 = interfaceC12864e;
                c4835e3 = c4835e;
                z4 = true;
                z5 = z2;
            }
            c13770e.admob();
            float floor = (float) Math.floor(((InterfaceC14388e) c13770e.adcel(AbstractC11473e.yandex)).mo497instanceof(AbstractC8188e.ad));
            EnumC9470e enumC9470e = z ? EnumC9470e.f18811e : EnumC9470e.f18809e;
            if (function1 != null) {
                c13770e.m3676strictfp(2066141046);
                boolean z6 = (i2 & 112) == 32 ? z4 : false;
                if ((i2 & 14) != 4) {
                    z4 = false;
                }
                boolean z7 = z6 | z4;
                Object m3681throw = c13770e.m3681throw();
                if (z7 || m3681throw == C2987e.ad) {
                    m3681throw = new C2221e(0, function1, z);
                    c13770e.m3682throws(m3681throw);
                }
                function0 = (Function0) m3681throw;
                c13770e.Signature(false);
            } else {
                c13770e.m3676strictfp(2066206735);
                c13770e.Signature(false);
                function0 = null;
            }
            InterfaceC12864e interfaceC12864e4 = interfaceC12864e3;
            metrica(enumC9470e, function0, new C13121e(floor, 0.0f, 2, 0, null, 26), new C13121e(floor, 0.0f, 0, 0, null, 30), interfaceC12864e4, z5, c4835e3, c13770e, 12808704);
            interfaceC12864e2 = interfaceC12864e4;
            z3 = z5;
            c4835e2 = c4835e3;
        } else {
            c13770e.m3659default();
            interfaceC12864e2 = interfaceC12864e;
            z3 = z2;
            c4835e2 = c4835e;
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C14492e(z, function1, interfaceC12864e2, z3, c4835e2, i, 0);
        }
    }

    public static final void metrica(EnumC9470e enumC9470e, Function0 function0, C13121e c13121e, C13121e c13121e2, InterfaceC12864e interfaceC12864e, boolean z, C4835e c4835e, C13770e c13770e, int i) {
        int i2;
        InterfaceC12864e interfaceC12864e2;
        InterfaceC12864e interfaceC12864e3;
        c13770e.m3671package(-406243761);
        if ((i & 6) == 0) {
            i2 = (c13770e.license(enumC9470e.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e.yandex(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) == 0 ? c13770e.purchase(c13121e) : c13770e.yandex(c13121e) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? c13770e.purchase(c13121e2) : c13770e.yandex(c13121e2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c13770e.purchase(interfaceC12864e) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= c13770e.billing(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= c13770e.purchase(c4835e) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= c13770e.purchase(null) ? 8388608 : 4194304;
        }
        int i3 = i2;
        if (c13770e.m3673protected(i3 & 1, (4793491 & i3) != 4793490)) {
            c13770e.m3655case();
            if ((i & 1) != 0 && !c13770e.isPro()) {
                c13770e.m3659default();
            }
            c13770e.admob();
            C13822e ad2 = AbstractC17052e.ad(AbstractC0720e.vip / 2, 4, 0L, false);
            C0115e c0115e = C0115e.f1276e;
            if (function0 != null) {
                C11796e c11796e = new C11796e(1);
                interfaceC12864e2 = AbstractC0869e.premium(ad2) ? new C12542e(enumC9470e, null, ad2, z, c11796e, function0) : ad2 == null ? new C12542e(enumC9470e, null, null, z, c11796e, function0) : new C2064e(new C11088e(ad2, enumC9470e, z, c11796e, function0));
            } else {
                interfaceC12864e2 = c0115e;
            }
            if (function0 != null) {
                C4782e c4782e = AbstractC7562e.ad;
                interfaceC12864e3 = C10623e.f20937e;
            } else {
                interfaceC12864e3 = c0115e;
            }
            int i4 = i3 << 6;
            vip(z, enumC9470e, interfaceC12864e.premium(interfaceC12864e3).premium(interfaceC12864e2).premium(AbstractC12220e.mopub(c0115e, ad)), c4835e, c13121e, c13121e2, c13770e, ((i3 >> 15) & 14) | ((i3 << 3) & 112) | ((i3 >> 9) & 7168) | 32768 | (57344 & i4) | 262144 | (i4 & 458752));
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C2959e(enumC9470e, function0, c13121e, c13121e2, interfaceC12864e, z, c4835e, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0249 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x028c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0467 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x017a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0223  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void vip(boolean r28, defpackage.EnumC9470e r29, defpackage.InterfaceC12864e r30, defpackage.C4835e r31, final defpackage.C13121e r32, final defpackage.C13121e r33, defpackage.C13770e r34, int r35) {
        /*
            Method dump skipped, instructions count: 1179
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC2705e.vip(boolean, eٌٍٔ, eّۤۧ, eّؗؔ, eؚْٓ, eؚْٓ, eٓؕۥ, int):void");
    }
}
