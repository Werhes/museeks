package defpackage;

import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؔٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2754e {
    public static final float ad;
    public static final float appmetrica;
    public static final float purchase;
    public static final float vip = 4;
    public static final float metrica = 2;
    public static final float license = 24;

    static {
        float f = 16;
        ad = f;
        appmetrica = f;
        purchase = f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:389:0x0462, code lost:
    
        if (r37 != false) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x0418, code lost:
    
        if (r37 != false) goto L249;
     */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x031b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0479 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0308  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ad(final int r43, final java.lang.CharSequence r44, final kotlin.jvm.functions.Function2 r45, final defpackage.C8651e r46, final kotlin.jvm.functions.Function3 r47, final kotlin.jvm.functions.Function2 r48, final kotlin.jvm.functions.Function2 r49, final kotlin.jvm.functions.Function2 r50, final kotlin.jvm.functions.Function2 r51, final kotlin.jvm.functions.Function2 r52, final boolean r53, final boolean r54, final boolean r55, final defpackage.C15274e r56, final defpackage.InterfaceC12123e r57, final defpackage.C17085e r58, final defpackage.C2892e r59, defpackage.C13770e r60, final int r61, final int r62) {
        /*
            Method dump skipped, instructions count: 2440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC2754e.ad(int, java.lang.CharSequence, kotlin.jvm.functions.Function2, eٌّۣ, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, boolean, boolean, eؘٕؕ, eِۦۦ, eٗٙٓ, eؔ۟ٓ, eٓؕۥ, int, int):void");
    }

    public static final InterfaceC12864e appmetrica(InterfaceC12864e interfaceC12864e, boolean z, String str) {
        return z ? AbstractC1147e.ad(interfaceC12864e, false, new C18513e(str, 14)) : interfaceC12864e;
    }

    public static final float billing(C13770e c13770e) {
        long j = ((C7019e) c13770e.adcel(AbstractC11785e.ad)).vip.advert.vip.metrica;
        long j2 = AbstractC3855e.advert;
        if ((1095216660480L & j) != 4294967296L) {
            j = j2;
        }
        return ((InterfaceC14388e) c13770e.adcel(AbstractC11473e.yandex)).firebase(j) / 2;
    }

    public static final void license(long j, Function2 function2, C13770e c13770e, int i) {
        c13770e.m3671package(590397809);
        int i2 = (c13770e.appmetrica(j) ? 4 : 2) | i | (c13770e.yandex(function2) ? 32 : 16);
        if (c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            AbstractC1101e.ad(AbstractC8703e.loadAd(j, AbstractC0608e.ad), function2, c13770e, (i2 & 112) | 8);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C15916e(j, function2, i);
        }
    }

    public static final void metrica(long j, C1839e c1839e, Function2 function2, C13770e c13770e, int i) {
        long j2;
        C1839e c1839e2;
        Function2 function22;
        C13770e c13770e2;
        c13770e.m3671package(396611577);
        int i2 = (c13770e.appmetrica(j) ? 4 : 2) | i | (c13770e.purchase(c1839e) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= c13770e.yandex(function2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if (c13770e.m3673protected(i2 & 1, (i2 & 147) != 146)) {
            c13770e2 = c13770e;
            AbstractC5750e.ad(j, c1839e, function2, c13770e2, i2 & 1022);
            j2 = j;
            c1839e2 = c1839e;
            function22 = function2;
        } else {
            j2 = j;
            c1839e2 = c1839e;
            function22 = function2;
            c13770e2 = c13770e;
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C15121e(j2, c1839e2, function22, i, 1);
        }
    }

    public static final InterfaceC3886e purchase(C8651e c8651e) {
        if (c8651e instanceof C8651e) {
            return c8651e.ad;
        }
        throw new IllegalArgumentException("Unknown position: " + c8651e);
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x051b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0571 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x05fd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0606  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0613  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x021e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void vip(defpackage.InterfaceC16132e r58, defpackage.C17085e r59, boolean r60, boolean r61, boolean r62, boolean r63, defpackage.C13119e r64, defpackage.C1839e r65, defpackage.C1839e r66, kotlin.jvm.functions.Function3 r67, defpackage.C13770e r68, int r69) {
        /*
            Method dump skipped, instructions count: 1801
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC2754e.vip(eُٖۡ, eٗٙٓ, boolean, boolean, boolean, boolean, eًؚْ, eٕؓۧ, eٕؓۧ, kotlin.jvm.functions.Function3, eٓؕۥ, int):void");
    }

    public static final float yandex(C13770e c13770e) {
        float f = ((C15765e) c13770e.adcel(AbstractC7562e.metrica)).f31051e;
        if (Float.isNaN(f)) {
            f = 0;
        }
        float f2 = (f - AbstractC6957e.metrica) / 2;
        float f3 = 0;
        return f2 < f3 ? f3 : f2;
    }
}
