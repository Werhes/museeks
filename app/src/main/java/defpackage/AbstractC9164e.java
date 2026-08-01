package defpackage;

import android.opengl.Matrix;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؐۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC9164e {
    public static final C2892e ad = new C2892e(-464415949, false, new C16015e(1));
    public static final C2892e vip = new C2892e(1635322481, false, new C16015e(4));
    public static final C2892e metrica = new C2892e(1835636748, false, new C5029e(11));
    public static final C2892e license = new C2892e(-1409461333, false, new C5029e(0));
    public static final C2892e appmetrica = new C2892e(-1032213654, false, new C16015e(2));
    public static final C2892e purchase = new C2892e(-1818211544, false, new C16015e(3));
    public static final C2892e billing = new C2892e(1705238019, false, new C5029e(1));
    public static final C2892e yandex = new C2892e(1312239074, false, new C5029e(2));
    public static final C2892e startapp = new C2892e(2105355183, false, new C5029e(3));
    public static final C2892e adcel = new C2892e(-2093518000, false, new C5029e(4));
    public static final C2892e mopub = new C2892e(-1420667582, false, new C5029e(5));
    public static final C2892e advert = new C2892e(-519010109, false, new C5029e(6));
    public static final C2892e smaato = new C2892e(-222440416, false, new C5029e(7));
    public static final C2892e amazon = new C2892e(62257739, false, new C9868e(0));
    public static final C2892e loadAd = new C2892e(866250106, false, new C5029e(8));
    public static final C2892e Signature = new C2892e(-760339127, false, new C5029e(9));
    public static final C2892e admob = new C2892e(751562240, false, new C5029e(10));
    public static final C5431e subscription = new C5431e(13);
    public static final C9938e remoteconfig = new C9938e(C7131e.class, InterfaceC6830e.class, new C2864e(6));

    public static final void ad(String str, EnumC10044e enumC10044e, Function0 function0, InterfaceC12864e interfaceC12864e, long j, long j2, long j3, long j4, C13770e c13770e, int i) {
        long j5;
        long j6;
        long j7;
        long j8;
        int i2;
        long j9;
        long j10;
        long j11;
        long j12;
        c13770e.m3671package(-45557092);
        int i3 = i | (c13770e.purchase(str) ? 4 : 2) | (c13770e.license(enumC10044e.ordinal()) ? 32 : 16) | (c13770e.yandex(function0) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | 4792320;
        if (c13770e.m3673protected(i3 & 1, (4793491 & i3) != 4793490)) {
            c13770e.m3655case();
            if ((i & 1) == 0 || c13770e.isPro()) {
                AbstractC4455e abstractC4455e = AbstractC11785e.ad;
                long vip2 = C3618e.vip(0.12f, ((C7019e) c13770e.adcel(abstractC4455e)).ad.admob);
                long j13 = ((C7019e) c13770e.adcel(abstractC4455e)).ad.ad;
                long vip3 = C3618e.vip(0.38f, ((C7019e) c13770e.adcel(abstractC4455e)).ad.admob);
                i2 = i3 & (-33546241);
                j9 = ((C7019e) c13770e.adcel(abstractC4455e)).ad.vip;
                j10 = j13;
                j11 = vip3;
                j12 = vip2;
            } else {
                c13770e.m3659default();
                i2 = i3 & (-33546241);
                j12 = j;
                j10 = j2;
                j11 = j3;
                j9 = j4;
            }
            c13770e.admob();
            int startapp2 = AbstractC4533e.startapp(0.0f, c13770e, 0, 1);
            EnumC10044e enumC10044e2 = EnumC10044e.f19843e;
            InterfaceC16132e ad2 = AbstractC3145e.ad(enumC10044e == enumC10044e2 ? j12 : j10, null, BuildConfig.FLAVOR, null, c13770e, 384, 10);
            InterfaceC16132e ad3 = AbstractC3145e.ad(enumC10044e == enumC10044e2 ? j11 : j9, null, BuildConfig.FLAVOR, null, c13770e, 384, 10);
            AbstractC4455e abstractC4455e2 = AbstractC11785e.ad;
            InterfaceC12864e vip4 = AbstractC12447e.vip(interfaceC12864e, ((C7019e) c13770e.adcel(abstractC4455e2)).metrica.metrica);
            boolean purchase2 = c13770e.purchase(ad2);
            Object m3681throw = c13770e.m3681throw();
            if (purchase2 || m3681throw == C2987e.ad) {
                m3681throw = new C17652e(ad2, 7);
                c13770e.m3682throws(m3681throw);
            }
            InterfaceC12864e metrica2 = AbstractC5750e.metrica(vip4, (Function1) m3681throw);
            C16005e c16005e = AbstractC10244e.ad;
            long j14 = C3618e.startapp;
            float f = 16;
            AbstractC1513e.ad(function0, metrica2, enumC10044e == EnumC10044e.f19841e, ((C7019e) c13770e.adcel(abstractC4455e2)).metrica.metrica, AbstractC10244e.ad(j14, 0L, j14, 0L, c13770e, 10), null, null, new C16005e(f, f, f, f), AbstractC16653e.license(-523548500, new C2329e(str, enumC10044e, startapp2, ad3, 4), c13770e), c13770e, ((i2 >> 6) & 14) | 817889280, 352);
            j5 = j12;
            j6 = j10;
            j7 = j11;
            j8 = j9;
        } else {
            c13770e.m3659default();
            j5 = j;
            j6 = j2;
            j7 = j3;
            j8 = j4;
        }
        C2846e subscription2 = c13770e.subscription();
        if (subscription2 != null) {
            subscription2.license = new C6680e(str, enumC10044e, function0, interfaceC12864e, j5, j6, j7, j8, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0208  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object appmetrica(defpackage.AbstractC1186e r18, defpackage.C11534e r19, kotlin.jvm.functions.Function3 r20) {
        /*
            Method dump skipped, instructions count: 976
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC9164e.appmetrica(eٜؒؒ, eِؖۥ, kotlin.jvm.functions.Function3):java.lang.Object");
    }

    public static void billing(float[] fArr) {
        Matrix.translateM(fArr, 0, 0.0f, 0.5f, 0.0f);
        Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.0f, -0.5f, 0.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r1.f2666e == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String license(defpackage.InterfaceC5052e r3, defpackage.C17354e r4) {
        /*
            eِٕٖ r0 = r3.mo1351switch()
            eؑۘٛ r1 = r3.getName()
            if (r1 == 0) goto L11
            eؑۘٛ r2 = defpackage.AbstractC13893e.ad
            boolean r2 = r1.f2666e
            if (r2 != 0) goto L11
            goto L13
        L11:
            eؑۘٛ r1 = defpackage.AbstractC13893e.metrica
        L13:
            java.lang.String r1 = r1.metrica()
            boolean r2 = r0 instanceof defpackage.InterfaceC9646e
            if (r2 == 0) goto L49
            eٍؚٟ r0 = (defpackage.InterfaceC9646e) r0
            eۣٔۙ r0 = (defpackage.AbstractC14941e) r0
            eّۡۜ r3 = r0.f29618e
            eْۢٙ r4 = r3.ad
            boolean r4 = r4.metrica()
            if (r4 == 0) goto L2a
            return r1
        L2a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            eْۢٙ r3 = r3.ad
            java.lang.String r3 = r3.ad
            r0 = 46
            r2 = 47
            java.lang.String r3 = r3.replace(r0, r2)
            r4.append(r3)
            r4.append(r2)
            r4.append(r1)
            java.lang.String r3 = r4.toString()
            return r3
        L49:
            boolean r2 = r0 instanceof defpackage.InterfaceC5052e
            if (r2 == 0) goto L51
            r2 = r0
            eؗٞؓ r2 = (defpackage.InterfaceC5052e) r2
            goto L52
        L51:
            r2 = 0
        L52:
            if (r2 == 0) goto L5f
            java.lang.String r3 = license(r2, r4)
            r4 = 36
            java.lang.String r3 = defpackage.AbstractC0869e.tapsense(r4, r3, r1)
            return r3
        L5f:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected container: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = " for "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r4.<init>(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC9164e.license(eؗٞؓ, eۣٗۢ):java.lang.String");
    }

    public static final void metrica(Function0 function0, boolean z, InterfaceC12864e interfaceC12864e, InterfaceC16154e interfaceC16154e, boolean z2, C13770e c13770e, int i) {
        InterfaceC12864e interfaceC12864e2;
        InterfaceC16154e interfaceC16154e2;
        InterfaceC16154e interfaceC16154e3;
        int i2;
        c13770e.m3671package(849069330);
        int i3 = i | (c13770e.yandex(function0) ? 4 : 2) | (c13770e.billing(z) ? 32 : 16) | 1408 | (c13770e.billing(z2) ? 16384 : 8192);
        if (c13770e.m3673protected(i3 & 1, (74899 & i3) != 74898)) {
            c13770e.m3655case();
            if ((i & 1) == 0 || c13770e.isPro()) {
                int i4 = i3 & (-7169);
                interfaceC16154e3 = ((C7019e) c13770e.adcel(AbstractC11785e.ad)).metrica.appmetrica;
                interfaceC12864e = C0115e.f1276e;
                i2 = i4;
            } else {
                c13770e.m3659default();
                i2 = i3 & (-7169);
                interfaceC16154e3 = interfaceC16154e;
            }
            c13770e.admob();
            boolean z3 = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object m3681throw = c13770e.m3681throw();
            if (z3 || m3681throw == C2987e.ad) {
                m3681throw = new C1411e(z, function0, 1);
                c13770e.m3682throws(m3681throw);
            }
            InterfaceC16154e interfaceC16154e4 = interfaceC16154e3;
            InterfaceC12864e interfaceC12864e3 = interfaceC12864e;
            AbstractC1513e.license((Function0) m3681throw, interfaceC12864e3, z2, interfaceC16154e4, null, null, AbstractC16653e.license(-495626865, new C3878e(z, 2), c13770e), c13770e, 805306416 | ((i2 >> 6) & 896), 496);
            interfaceC12864e2 = interfaceC12864e3;
            interfaceC16154e2 = interfaceC16154e4;
        } else {
            c13770e.m3659default();
            interfaceC12864e2 = interfaceC12864e;
            interfaceC16154e2 = interfaceC16154e;
        }
        C2846e subscription2 = c13770e.subscription();
        if (subscription2 != null) {
            subscription2.license = new C14492e(function0, z, interfaceC12864e2, interfaceC16154e2, z2, i);
        }
    }

    public static void purchase(float[] fArr, float f) {
        Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
        Matrix.rotateM(fArr, 0, f, 0.0f, 0.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.5f, -0.5f, 0.0f);
    }

    public static final void vip(int i, C13770e c13770e, boolean z) {
        c13770e.m3671package(-1694957548);
        int i2 = (c13770e.billing(z) ? 4 : 2) | i;
        C2892e c2892e = AbstractC7255e.adcel;
        int i3 = i2 | (c13770e.yandex(c2892e) ? 32 : 16);
        if (c13770e.m3673protected(i3 & 1, (i3 & 19) != 18)) {
            C0115e c0115e = C0115e.f1276e;
            InterfaceC12864e ad2 = AbstractC2999e.ad(c0115e, null, 3);
            InterfaceC2747e license2 = AbstractC17074e.license(C5438e.f11676e, false);
            long j = c13770e.f27286case;
            int i4 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert2 = c13770e.advert();
            InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e, ad2);
            InterfaceC5685e.mopub.getClass();
            Function0 function0 = C2721e.vip;
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(function0);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, license2, C2721e.billing);
            AbstractC2270e.yandex(c13770e, advert2, C2721e.purchase);
            AbstractC2270e.yandex(c13770e, Integer.valueOf(i4), C2721e.adcel);
            AbstractC2270e.purchase(c13770e, C2721e.mopub);
            AbstractC2270e.yandex(c13770e, purchase2, C2721e.license);
            if (z) {
                c13770e.m3676strictfp(2024016229);
                AbstractC6685e.ad(c0115e, ((C3618e) c13770e.adcel(AbstractC0608e.ad)).ad, 2, 24, c13770e, 3462, 0);
                c13770e.Signature(false);
            } else {
                c13770e.m3676strictfp(2024241351);
                c2892e.invoke(c13770e, Integer.valueOf((i3 >> 3) & 14));
                c13770e.Signature(false);
            }
            c13770e.Signature(true);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription2 = c13770e.subscription();
        if (subscription2 != null) {
            subscription2.license = new C16027e(i, 7, z);
        }
    }
}
