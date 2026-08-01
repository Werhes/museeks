package defpackage;

import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۛۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14965e {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008a  */
    /* JADX WARN: Type inference failed for: r4v0, types: [eٖؑۡ, eُۙۨ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ad(ua.itaysonlab.vkx.activity.AppActivity r7) {
        /*
            eؗ٘ٔ r0 = r7.f36547e
            java.lang.Object r0 = r0.f10511e
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            defpackage.AbstractC17680e.amazon(r0)
            eؗ٘ٔ r0 = r7.f36547e
            java.lang.Object r0 = r0.f10516e
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            defpackage.AbstractC17680e.amazon(r0)
            eَٕٝ r0 = r7.f36542e
            r1 = 1
            r0.vip(r1)
            java.lang.String r0 = r7.getPackageName()
            java.lang.String r2 = "ua.itaysonlab.vkx"
            boolean r0 = defpackage.AbstractC7890e.billing(r0, r2)
            if (r0 == 0) goto L3a
            eٖٓٗ r0 = defpackage.C14027e.ad
            r0.getClass()
            boolean r0 = defpackage.C14027e.ad()
            if (r0 == 0) goto L3a
            eًًٕ r0 = defpackage.C7947e.ad
            boolean r0 = r0.vip()
            if (r0 != 0) goto L3a
            eؚٕٔ r0 = defpackage.EnumC7173e.VKX
            goto L3c
        L3a:
            eؚٕٔ r0 = defpackage.EnumC7173e.OrbitPlayer
        L3c:
            int r0 = r0.ordinal()
            r2 = 29
            if (r0 == 0) goto L8a
            if (r0 != r1) goto L82
            eؗ٘ٔ r7 = r7.f36547e
            java.lang.Object r7 = r7.f10519e
            ua.itaysonlab.vkxreborn.ui.nextdock.NextDockView r7 = (ua.itaysonlab.vkxreborn.ui.nextdock.NextDockView) r7
            ua.itaysonlab.vkx.VKXApplication$Companion r0 = ua.itaysonlab.vkx.VKXApplication.f36531e
            boolean r0 = ua.itaysonlab.vkx.VKXApplication.Companion.metrica()
            if (r0 != 0) goto L57
            eًٗؓ r0 = defpackage.EnumC16729e.f32803e
            goto L71
        L57:
            eؘٓۨ r0 = defpackage.C14411e.f28494e
            java.lang.Object r0 = r0.f36443e
            eًٗؓ[] r0 = (defpackage.EnumC16729e[]) r0
            eًًٕ r3 = defpackage.C7947e.ad
            int r3 = r3.ad()
            eٖؑۡ r4 = new eٖؑۡ
            int r5 = r0.length
            int r5 = r5 - r1
            r6 = 0
            r4.<init>(r6, r5, r1)
            int r1 = defpackage.AbstractC3062e.license(r3, r4)
            r0 = r0[r1]
        L71:
            int r0 = r0.ordinal()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            eؚۙؔ r1 = new eؚۙؔ
            r1.<init>(r7, r0, r2)
            r7.post(r1)
            return
        L82:
            eٔٚؖ r7 = new eٔٚؖ
            r0 = 10
            r7.<init>(r0)
            throw r7
        L8a:
            eؗ٘ٔ r7 = r7.f36547e
            java.lang.Object r7 = r7.f10519e
            ua.itaysonlab.vkxreborn.ui.nextdock.NextDockView r7 = (ua.itaysonlab.vkxreborn.ui.nextdock.NextDockView) r7
            r0 = 5
            java.lang.String r0 = java.lang.String.valueOf(r0)
            eؚۙؔ r1 = new eؚۙؔ
            r1.<init>(r7, r0, r2)
            r7.post(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14965e.ad(ua.itaysonlab.vkx.activity.AppActivity):void");
    }

    public static boolean metrica() {
        C5363e c5363e = C0353e.startapp;
        return !AbstractC15792e.billing().vip.tapsense();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [eؚٖؓ, kotlin.jvm.functions.Function2] */
    public static void vip(AppActivity appActivity) {
        if (!metrica()) {
            AbstractC5336e.purchase(AbstractC4608e.metrica(appActivity.vip()), null, 0, new AbstractC7185e(2, null), 3);
            return;
        }
        AbstractC17680e.mopub((LinearLayout) appActivity.f36547e.f10511e);
        AbstractC17680e.mopub((CoordinatorLayout) appActivity.f36547e.f10516e);
        appActivity.f36542e.appmetrica(EnumC16729e.f32794e, true);
        AbstractC5336e.purchase(AbstractC4608e.metrica(appActivity.vip()), null, 0, new C14755e(appActivity, null), 3);
    }
}
