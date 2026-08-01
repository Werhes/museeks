package defpackage;

import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.catalogkit.objects.banner.Catalog2Banner;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٟٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8116e {
    public static Method ad;
    public static boolean metrica;
    public static Method vip;

    public static final void ad(Catalog2Banner catalog2Banner, Function0 function0, C13770e c13770e, int i) {
        int i2;
        Function0 function02 = function0;
        C13770e c13770e2 = c13770e;
        c13770e2.m3671package(-1665376595);
        if ((i & 6) == 0) {
            i2 = i | (c13770e2.yandex(catalog2Banner) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e2.yandex(function02) ? 32 : 16;
        }
        int i3 = i2;
        if (c13770e2.m3673protected(i3 & 1, (i3 & 19) != 18)) {
            C0115e c0115e = C0115e.f1276e;
            float f = 8;
            InterfaceC12864e loadAd = AbstractC12220e.loadAd(AbstractC12220e.smaato(c0115e, 16, 0.0f, 2), 0.0f, f, 0.0f, 4, 5);
            C4789e ad2 = AbstractC14801e.ad(AbstractC16497e.metrica, C5438e.f11672e, c13770e2, 0);
            long j = c13770e2.f27286case;
            int i4 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e2.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e2, loadAd);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e2.m3666import();
            if (c13770e2.f27292implements) {
                c13770e2.mopub(c7309e);
            } else {
                c13770e2.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e2, ad2, C2721e.billing);
            AbstractC2270e.yandex(c13770e2, advert, C2721e.purchase);
            AbstractC2270e.yandex(c13770e2, Integer.valueOf(i4), C2721e.adcel);
            AbstractC2270e.purchase(c13770e2, C2721e.mopub);
            AbstractC2270e.yandex(c13770e2, purchase, C2721e.license);
            String str = catalog2Banner.purchase;
            if (str == null) {
                str = BuildConfig.FLAVOR;
            }
            AbstractC14489e.vip(str, null, AbstractC0903e.license(c13770e2).admob, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, AbstractC0903e.billing(c13770e2).purchase, c13770e, 0, 0, 131066);
            String str2 = catalog2Banner.appmetrica;
            if (str2 == null) {
                str2 = BuildConfig.FLAVOR;
            }
            AbstractC14489e.vip(str2, null, AbstractC0903e.license(c13770e).remoteconfig, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, AbstractC0903e.billing(c13770e).mopub, c13770e, 0, 0, 131066);
            float f2 = 12;
            AbstractC12534e.ad(c13770e, AbstractC18007e.license(c0115e, f2));
            C3924e c3924e = AbstractC0903e.purchase(c13770e).metrica;
            C16005e c16005e = AbstractC10244e.ad;
            c13770e2 = c13770e;
            function02 = function0;
            AbstractC1513e.ad(function02, c0115e, false, c3924e, AbstractC10244e.ad(AbstractC0903e.license(c13770e).admob, AbstractC0903e.license(c13770e).tapsense, 0L, 0L, c13770e, 12), null, null, new C16005e(f2, f, f2, f), AbstractC16275e.ad, c13770e2, ((i3 >> 3) & 14) | 805306416, 356);
            c13770e2.Signature(true);
        } else {
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C0205e(catalog2Banner, function02, i, 25);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0054, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean appmetrica(defpackage.C11795e r10) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC8116e.appmetrica(eِ٘ؔ):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x002e, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean billing(defpackage.C11795e r10) {
        /*
            eٖۚۡ r0 = r10.m3239e()
            boolean r0 = r0.ad()
            r1 = 0
            if (r0 != 0) goto Ld
            goto Ld4
        Ld:
            eْۤۡ r0 = r10.f27022e
            boolean r0 = r0.f27016e
            if (r0 != 0) goto L18
            java.lang.String r0 = "visitChildren called on an unattached node"
            defpackage.AbstractC14070e.metrica(r0)
        L18:
            eّّؔ r0 = new eّّؔ
            r2 = 16
            eْۤۡ[] r3 = new defpackage.AbstractC13616e[r2]
            r0.<init>(r1, r3)
            eْۤۡ r3 = r10.f27022e
            eْۤۡ r4 = r3.f27024e
            if (r4 != 0) goto L2b
            defpackage.AbstractC5851e.ad(r0, r3)
            goto L2e
        L2b:
            r0.license(r4)
        L2e:
            int r3 = r0.f24868e
            if (r3 == 0) goto Ld4
            int r3 = r3 + (-1)
            java.lang.Object r3 = r0.amazon(r3)
            eْۤۡ r3 = (defpackage.AbstractC13616e) r3
            int r4 = r3.f27020e
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 != 0) goto L44
            defpackage.AbstractC5851e.ad(r0, r3)
            goto L2e
        L44:
            if (r3 == 0) goto L2e
            int r4 = r3.f27014e
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto Ld0
            r4 = 0
            r5 = r4
        L4e:
            if (r3 == 0) goto L2e
            boolean r6 = r3 instanceof defpackage.C11795e
            r7 = 1
            if (r6 == 0) goto L94
            eِ٘ؔ r3 = (defpackage.C11795e) r3
            eٖۚۡ r6 = r3.m3239e()
            boolean r6 = r6.ad()
            if (r6 == 0) goto Lca
            eِٓؔ r0 = defpackage.AbstractC5851e.mopub(r3)
            int r0 = r0.f27602e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r10.f23674e = r1
            eٕٕۦ r1 = defpackage.AbstractC5991e.ad
            java.lang.Object r1 = defpackage.AbstractC10432e.vip(r10, r1)
            eؗٝ٘ r1 = (defpackage.InterfaceC5039e) r1
            if (r1 == 0) goto L93
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "pfc"
            r2.<init>(r3)
            eِٓؔ r10 = defpackage.AbstractC5851e.mopub(r10)
            int r10 = r10.f27602e
            r2.append(r10)
            java.lang.String r10 = r2.toString()
            eؖۥٕ r2 = new eؖۥٕ
            r2.<init>(r0)
            r1.purchase(r10, r2)
        L93:
            return r7
        L94:
            int r6 = r3.f27014e
            r6 = r6 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto Lca
            boolean r6 = r3 instanceof defpackage.AbstractC6126e
            if (r6 == 0) goto Lca
            r6 = r3
            eؙؒؐ r6 = (defpackage.AbstractC6126e) r6
            eْۤۡ r6 = r6.f12873e
            r8 = r1
        La4:
            if (r6 == 0) goto Lc7
            int r9 = r6.f27014e
            r9 = r9 & 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto Lc4
            int r8 = r8 + 1
            if (r8 != r7) goto Lb2
            r3 = r6
            goto Lc4
        Lb2:
            if (r5 != 0) goto Lbb
            eّّؔ r5 = new eّّؔ
            eْۤۡ[] r9 = new defpackage.AbstractC13616e[r2]
            r5.<init>(r1, r9)
        Lbb:
            if (r3 == 0) goto Lc1
            r5.license(r3)
            r3 = r4
        Lc1:
            r5.license(r6)
        Lc4:
            eْۤۡ r6 = r6.f27024e
            goto La4
        Lc7:
            if (r8 != r7) goto Lca
            goto L4e
        Lca:
            eْۤۡ r3 = defpackage.AbstractC5851e.vip(r5)
            goto L4e
        Ld0:
            eْۤۡ r3 = r3.f27024e
            goto L44
        Ld4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC8116e.billing(eِ٘ؔ):boolean");
    }

    public static final C0661e license(Object... objArr) {
        if (objArr.length == 0) {
            return new C0661e();
        }
        C0661e c0661e = new C0661e();
        AbstractC13480e.isPro(c0661e, objArr);
        return c0661e;
    }

    public static final InterfaceC12864e metrica(InterfaceC12864e interfaceC12864e, C6260e c6260e) {
        return interfaceC12864e.premium(new C15706e(c6260e));
    }

    public static final long purchase(long j) {
        return (Math.round(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (j >> 32))) << 32);
    }

    public static final long startapp(long j) {
        return (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
    }

    public static void vip(Canvas canvas, boolean z) {
        Method method;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            AbstractC14204e.amazon(canvas, z);
            return;
        }
        if (!metrica) {
            try {
                if (i == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    ad = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    vip = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    ad = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    vip = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = ad;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = vip;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            metrica = true;
        }
        if (z) {
            try {
                Method method4 = ad;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z || (method = vip) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    public static final long yandex(long j) {
        return (((int) Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (((int) Float.intBitsToFloat((int) (j >> 32))) << 32);
    }
}
