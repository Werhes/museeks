package defpackage;

import android.R;
import android.content.Context;
import android.os.Build;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؒٞ */
/* loaded from: classes.dex */
public abstract class AbstractC0933e {
    public static final boolean ad;
    public static final float metrica;
    public static final float vip;

    static {
        ad = Build.VERSION.SDK_INT >= 31;
        vip = 12;
        metrica = 10;
    }

    public static final InterfaceC7189e ad(InterfaceC7189e interfaceC7189e, C13770e c13770e) {
        if (!ad) {
            c13770e.m3676strictfp(197413949);
            c13770e.Signature(false);
            return interfaceC7189e;
        }
        c13770e.m3676strictfp(197320887);
        InterfaceC7189e appmetrica = appmetrica(interfaceC7189e, R.dimen.accessibility_magnification_indicator_width, c13770e);
        c13770e.Signature(false);
        return appmetrica;
    }

    public static final InterfaceC7189e appmetrica(InterfaceC7189e interfaceC7189e, int i, C13770e c13770e) {
        if (ad) {
            c13770e.m3676strictfp(268075764);
            r2 = ((Context) c13770e.adcel(AbstractC4449e.vip)).getResources().getResourceName(i) != null ? Integer.valueOf(i) : null;
            c13770e.Signature(false);
        } else {
            c13770e.m3676strictfp(268234174);
            c13770e.Signature(false);
        }
        return r2 != null ? interfaceC7189e.purchase(new C13917e(new C17740e(r2.intValue()))) : interfaceC7189e;
    }

    public static /* synthetic */ Object license(Context context, String str, int i, int i2, boolean z, AbstractC7185e abstractC7185e, int i3) {
        boolean z2;
        Context context2;
        String str2;
        int i4;
        AbstractC7185e abstractC7185e2;
        if ((i3 & 4) != 0) {
            VKXApplication.Companion companion = VKXApplication.f36531e;
            i2 = VKXApplication.Companion.ad(8.0f);
        }
        int i5 = i2;
        boolean z3 = (i3 & 8) != 0 ? false : z;
        boolean z4 = (i3 & 16) == 0;
        if ((i3 & 64) != 0) {
            z2 = false;
            str2 = str;
            i4 = i;
            abstractC7185e2 = abstractC7185e;
            context2 = context;
        } else {
            z2 = true;
            context2 = context;
            str2 = str;
            i4 = i;
            abstractC7185e2 = abstractC7185e;
        }
        return metrica(context2, str2, i4, i5, z3, z4, z2, abstractC7185e2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object metrica(android.content.Context r4, java.lang.String r5, int r6, int r7, boolean r8, boolean r9, boolean r10, defpackage.AbstractC10731e r11) {
        /*
            boolean r0 = r11 instanceof defpackage.C5147e
            if (r0 == 0) goto L13
            r0 = r11
            eؗۚۡ r0 = (defpackage.C5147e) r0
            int r1 = r0.f11026e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11026e = r1
            goto L18
        L13:
            eؗۚۡ r0 = new eؗۚۡ
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f11027e
            int r1 = r0.f11026e
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.AbstractC2003e.purchase(r11)
            goto L90
        L25:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            defpackage.AbstractC2003e.purchase(r11)
            eؘ۟ۜ r11 = new eؘ۟ۜ
            r11.<init>(r4)
            if (r5 != 0) goto L3f
            java.lang.Integer r5 = new java.lang.Integer
            r1 = 2131230952(0x7f0800e8, float:1.8077971E38)
            r5.<init>(r1)
        L3f:
            r11.metrica = r5
            r11.license(r6)
            eؒٛؕ r5 = defpackage.AbstractC6874e.license()
            if (r8 == 0) goto L54
            eؘ۟ٙ r6 = new eؘ۟ٙ
            eًٔۤ r8 = defpackage.C7943e.startapp
            r6.<init>(r8)
            r5.add(r6)
        L54:
            boolean r6 = defpackage.AbstractC0933e.ad
            if (r9 == 0) goto L65
            if (r10 != 0) goto L5c
            if (r6 != 0) goto L65
        L5c:
            eؗۥٝ r8 = new eؗۥٝ
            float r7 = (float) r7
            r8.<init>(r7)
            r5.add(r8)
        L65:
            eؒٛؕ r5 = defpackage.AbstractC6874e.metrica(r5)
            defpackage.AbstractC2182e.vip(r11, r5)
            r5 = 0
            defpackage.AbstractC15659e.ad(r11, r5)
            eٌۢٛ r5 = r11.vip()
            eّۨؒ r6 = defpackage.AbstractC15659e.billing
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r5.ad(r6, r7)
            eّۚٞ r4 = defpackage.AbstractC16550e.ad(r4)
            eؘٔؕ r5 = r11.ad()
            r0.f11026e = r2
            eؘؑۡ r4 = (defpackage.C0624e) r4
            java.lang.Object r11 = r4.metrica(r5, r0)
            eٟؔۙ r4 = defpackage.EnumC2821e.f6782e
            if (r11 != r4) goto L90
            return r4
        L90:
            eؚٜ٘ r11 = (defpackage.InterfaceC17873e) r11
            boolean r4 = r11 instanceof defpackage.C16455e
            if (r4 == 0) goto L9f
            eٖۘ۟ r11 = (defpackage.C16455e) r11
            eْؖ۟ r4 = r11.ad
            eٍۡؖ r4 = (defpackage.C9814e) r4
            android.graphics.Bitmap r4 = r4.ad
            return r4
        L9f:
            boolean r4 = r11 instanceof defpackage.C10574e
            if (r4 == 0) goto La5
            r4 = 0
            return r4
        La5:
            eٔٚؖ r4 = new eٔٚؖ
            r5 = 10
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC0933e.metrica(android.content.Context, java.lang.String, int, int, boolean, boolean, boolean, eُؑ۠):java.lang.Object");
    }

    public static final InterfaceC7189e vip(C13770e c13770e) {
        boolean z = ad;
        C17043e c17043e = C17043e.ad;
        if (!z) {
            c13770e.m3676strictfp(1999952411);
            c13770e.Signature(false);
            return c17043e;
        }
        c13770e.m3676strictfp(1999864154);
        InterfaceC7189e appmetrica = appmetrica(c17043e, R.dimen.accessibility_touch_slop, c13770e);
        c13770e.Signature(false);
        return appmetrica;
    }
}
