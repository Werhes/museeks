package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.RemoteViews;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۙؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC13461e {
    public static final C2892e ad = new C2892e(1454869401, false, new C11402e(0));
    public static final C2892e vip = new C2892e(-1816479558, false, new C11402e(1));
    public static final C2892e metrica = new C2892e(-1014214301, false, new C11402e(4));
    public static final C2892e license = new C2892e(253241804, false, new C11402e(5));
    public static final C2892e appmetrica = new C2892e(692431354, false, new C16627e(11));
    public static final C2892e purchase = new C2892e(2132768427, false, new C11402e(6));
    public static final C2892e billing = new C2892e(-626565432, false, new C11402e(7));
    public static final C2892e yandex = new C2892e(-1555927354, false, new C16627e(12));
    public static final C2892e startapp = new C2892e(870331985, false, new C11402e(8));
    public static final C2892e adcel = new C2892e(848191022, false, new C11402e(9));
    public static final C2892e mopub = new C2892e(822518568, false, new C16627e(13));
    public static final C2892e advert = new C2892e(-1592922105, false, new C16627e(14));
    public static final C2892e smaato = new C2892e(286604518, false, new C16627e(15));
    public static final C2892e amazon = new C2892e(-2128836155, false, new C16627e(16));
    public static final C2892e loadAd = new C2892e(-249309532, false, new C16627e(17));
    public static final C2892e Signature = new C2892e(1295274695, false, new C16627e(18));
    public static final C2892e admob = new C2892e(759360645, false, new C16627e(19));
    public static final C2892e subscription = new C2892e(-1656080028, false, new C16627e(20));
    public static final C2892e remoteconfig = new C2892e(1640559449, false, new C16627e(21));
    public static final C2892e pro = new C2892e(809905815, false, new C16627e(10));
    public static final C2892e signatures = new C2892e(-619214701, false, new C11402e(2));
    public static final C2892e tapsense = new C2892e(-1034541518, false, new C11402e(3));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object ad(defpackage.C3706e r4, kotlin.jvm.functions.Function3 r5, java.lang.Throwable r6, defpackage.AbstractC10731e r7) {
        /*
            boolean r0 = r7 instanceof defpackage.C4378e
            if (r0 == 0) goto L13
            r0 = r7
            eٍؖۛ r0 = (defpackage.C4378e) r0
            int r1 = r0.f9539e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9539e = r1
            goto L18
        L13:
            eٍؖۛ r0 = new eٍؖۛ
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f9537e
            int r1 = r0.f9539e
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            java.lang.Throwable r6 = r0.f9538e
            defpackage.AbstractC2003e.purchase(r7)     // Catch: java.lang.Throwable -> L27
            goto L41
        L27:
            r4 = move-exception
            goto L44
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.AbstractC2003e.purchase(r7)
            r0.f9538e = r6     // Catch: java.lang.Throwable -> L27
            r0.f9539e = r2     // Catch: java.lang.Throwable -> L27
            java.lang.Object r4 = r5.invoke(r4, r6, r0)     // Catch: java.lang.Throwable -> L27
            eٟؔۙ r5 = defpackage.EnumC2821e.f6782e
            if (r4 != r5) goto L41
            return r5
        L41:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L44:
            if (r6 == 0) goto L4b
            if (r6 == r4) goto L4b
            defpackage.AbstractC13362e.license(r4, r6)
        L4b:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC13461e.ad(eؕۢۗ, kotlin.jvm.functions.Function3, java.lang.Throwable, eُؑ۠):java.lang.Object");
    }

    public static final boolean appmetrica(AbstractC7107e abstractC7107e) {
        if ((abstractC7107e instanceof C7191e) || (abstractC7107e instanceof C17740e)) {
            return true;
        }
        if (AbstractC7890e.billing(abstractC7107e, C9361e.ad) || AbstractC7890e.billing(abstractC7107e, C6705e.ad) || AbstractC7890e.billing(abstractC7107e, C9133e.ad) || abstractC7107e == null) {
            return false;
        }
        throw new C14803e(10);
    }

    public static long billing(C1292e c1292e, int i, int i2) {
        c1292e.m571try(i);
        if (c1292e.ad() < 5) {
            return -9223372036854775807L;
        }
        int smaato2 = c1292e.smaato();
        if ((8388608 & smaato2) != 0 || ((2096896 & smaato2) >> 8) != i2 || (smaato2 & 32) == 0 || c1292e.ads() < 7 || c1292e.ad() < 7 || (c1292e.ads() & 16) != 16) {
            return -9223372036854775807L;
        }
        c1292e.mopub(0, 6, new byte[6]);
        return ((r0[0] & 255) << 25) | ((r0[1] & 255) << 17) | ((r0[2] & 255) << 9) | ((r0[3] & 255) << 1) | ((255 & r0[4]) >> 7);
    }

    public static final void license(Context context, RemoteViews remoteViews, C12005e c12005e, int i) {
        AbstractC7107e abstractC7107e = c12005e.ad;
        int i2 = Build.VERSION.SDK_INT;
        C9361e c9361e = C9361e.ad;
        C9133e c9133e = C9133e.ad;
        if (i2 >= 31) {
            if (i2 >= 33 || !AbstractC6874e.startapp(c9133e, c9361e).contains(abstractC7107e)) {
                C4693e.metrica(remoteViews, i, abstractC7107e);
                return;
            }
            return;
        }
        if (AbstractC6874e.startapp(c9133e, C6705e.ad, c9361e).contains(AbstractC5111e.appmetrica(abstractC7107e, context))) {
            return;
        }
        throw new IllegalArgumentException("Using a width of " + abstractC7107e + " requires a complex layout before API 31");
    }

    public static final void metrica(Context context, RemoteViews remoteViews, C8851e c8851e, int i) {
        AbstractC7107e abstractC7107e = c8851e.ad;
        int i2 = Build.VERSION.SDK_INT;
        C9361e c9361e = C9361e.ad;
        C9133e c9133e = C9133e.ad;
        if (i2 >= 31) {
            if (i2 >= 33 || !AbstractC6874e.startapp(c9133e, c9361e).contains(abstractC7107e)) {
                C4693e.vip(remoteViews, i, abstractC7107e);
                return;
            }
            return;
        }
        if (AbstractC6874e.startapp(c9133e, C6705e.ad, c9361e).contains(AbstractC5111e.appmetrica(abstractC7107e, context))) {
            return;
        }
        throw new IllegalArgumentException("Using a height of " + abstractC7107e + " requires a complex layout before API 31");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean purchase(AbstractC16049e abstractC16049e) {
        InterfaceC11810e interfaceC11810e = abstractC16049e instanceof InterfaceC11810e ? (InterfaceC11810e) abstractC16049e : null;
        return interfaceC11810e != null && interfaceC11810e.purchase();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02b0  */
    /* JADX WARN: Type inference failed for: r11v0, types: [eّؖٝ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [eّؖٝ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [eّؖٝ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [eّؖٝ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [eّؖٝ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [eّؖٝ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [eّؖٝ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [eّؖٝ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [eّؖٝ, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x01b0 -> B:17:0x01c1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void vip(defpackage.C6555e r22, android.widget.RemoteViews r23, defpackage.InterfaceC7189e r24, defpackage.C2158e r25) {
        /*
            Method dump skipped, instructions count: 702
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC13461e.vip(eؙؙٟ, android.widget.RemoteViews, eٍؚٖ, eؓۡۚ):void");
    }
}
