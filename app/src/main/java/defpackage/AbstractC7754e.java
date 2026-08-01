package defpackage;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.material.appbar.AppBarLayout;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؗۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7754e {
    public static final C7761e ad = new C7761e(null);
    public static final int[] vip = {R.attr.stateListAnimator};

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
    
        if (r7 == r5) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object ad(defpackage.C18046e r6, defpackage.AbstractC10731e r7) {
        /*
            boolean r0 = r7 instanceof defpackage.C9073e
            if (r0 == 0) goto L13
            r0 = r7
            eٌۣؗ r0 = (defpackage.C9073e) r0
            int r1 = r0.f18172e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18172e = r1
            goto L18
        L13:
            eٌۣؗ r0 = new eٌۣؗ
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f18170e
            int r1 = r0.f18172e
            r2 = 0
            r3 = 1
            r4 = 2
            eٟؔۙ r5 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L39
            if (r1 == r3) goto L33
            if (r1 != r4) goto L2b
            defpackage.AbstractC2003e.purchase(r7)
            return r7
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            e٘۠ؒ r6 = r0.f18171e
            defpackage.AbstractC2003e.purchase(r7)
            goto L59
        L39:
            defpackage.AbstractC2003e.purchase(r7)
            r0.f18171e = r6
            r0.f18172e = r3
            eًۛ۠ r7 = r6.purchase
            java.lang.Object r7 = r7.appmetrica
            eُْٔ r7 = (defpackage.C14688e) r7
            eٍۛٞ r1 = new eٍۛٞ
            r3 = 16
            r1.<init>(r4, r3, r2)
            java.lang.Object r7 = defpackage.AbstractC7535e.adcel(r7, r1, r0)
            if (r7 != r5) goto L54
            goto L56
        L54:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
        L56:
            if (r7 != r5) goto L59
            goto L69
        L59:
            eًۛ۠ r6 = r6.purchase
            java.lang.Object r6 = r6.yandex
            eُْٔ r6 = (defpackage.C14688e) r6
            r0.f18171e = r2
            r0.f18172e = r4
            java.lang.Object r6 = defpackage.AbstractC7535e.startapp(r6, r0)
            if (r6 != r5) goto L6a
        L69:
            return r5
        L6a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC7754e.ad(e٘۠ؒ, eُؑ۠):java.lang.Object");
    }

    public static void appmetrica(AppBarLayout appBarLayout, float f) {
        int integer = appBarLayout.getResources().getInteger(ua.itaysonlab.vkx.R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = integer;
        stateListAnimator.addState(new int[]{R.attr.state_enabled, ua.itaysonlab.vkx.R.attr.state_liftable, -2130969810}, ObjectAnimator.ofFloat(appBarLayout, "elevation", 0.0f).setDuration(j));
        stateListAnimator.addState(new int[]{R.attr.state_enabled}, ObjectAnimator.ofFloat(appBarLayout, "elevation", f).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(appBarLayout, "elevation", 0.0f).setDuration(0L));
        appBarLayout.setStateListAnimator(stateListAnimator);
    }

    public static void billing(View view, C11252e c11252e) {
        C15190e c15190e = c11252e.f22618e.vip;
        if (c15190e == null || !c15190e.ad) {
            return;
        }
        float f = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            WeakHashMap weakHashMap = AbstractC2016e.ad;
            f += ((View) parent).getElevation();
        }
        C3774e c3774e = c11252e.f22618e;
        if (c3774e.advert != f) {
            c3774e.advert = f;
            c11252e.admob();
        }
    }

    public static final void license(C18046e c18046e, VKXApplication vKXApplication, Function1 function1) {
        AbstractC5336e.purchase(vKXApplication, null, 0, new C2122e(function1, c18046e, (InterfaceC5083e) null), 3);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, eًٜؑ] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, eًٜؑ] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, eًٜؑ] */
    public static AbstractC0421e metrica(int i) {
        if (i != 0 && i == 1) {
            return new Object();
        }
        return new Object();
    }

    public static void purchase(ViewGroup viewGroup, float f) {
        Drawable background = viewGroup.getBackground();
        if (background instanceof C11252e) {
            ((C11252e) background).mopub(f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v1, types: [eٔۦٖ, eؚِؗ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.C15097e vip(android.content.Context r13) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Le
            eَٖۙ r0 = new eَٖۙ
            r1 = 27
            r0.<init>(r1)
            goto L15
        Le:
            eٍ٘ؖ r0 = new eٍ٘ؖ
            r1 = 27
            r0.<init>(r1)
        L15:
            android.content.pm.PackageManager r1 = r13.getPackageManager()
            java.lang.String r2 = "Package manager required to locate emoji font provider"
            defpackage.AbstractC4265e.billing(r1, r2)
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "androidx.content.action.LOAD_EMOJI_FONT"
            r2.<init>(r3)
            r3 = 0
            java.util.List r2 = r1.queryIntentContentProviders(r2, r3)
            java.util.Iterator r2 = r2.iterator()
        L2e:
            boolean r4 = r2.hasNext()
            r5 = 0
            if (r4 == 0) goto L4a
            java.lang.Object r4 = r2.next()
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
            android.content.pm.ProviderInfo r4 = r4.providerInfo
            if (r4 == 0) goto L2e
            android.content.pm.ApplicationInfo r6 = r4.applicationInfo
            if (r6 == 0) goto L2e
            int r6 = r6.flags
            r7 = 1
            r6 = r6 & r7
            if (r6 != r7) goto L2e
            goto L4b
        L4a:
            r4 = r5
        L4b:
            if (r4 != 0) goto L4f
        L4d:
            r6 = r5
            goto L80
        L4f:
            java.lang.String r7 = r4.authority     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L79
            java.lang.String r8 = r4.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L79
            android.content.pm.Signature[] r0 = r0.ad(r1, r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L79
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L79
            r1.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L79
            int r2 = r0.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L79
        L5d:
            if (r3 >= r2) goto L6b
            r4 = r0[r3]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L79
            byte[] r4 = r4.toByteArray()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L79
            r1.add(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L79
            int r3 = r3 + 1
            goto L5d
        L6b:
            java.util.List r10 = java.util.Collections.singletonList(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L79
            eَٚ٘ r6 = new eَٚ٘     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L79
            java.lang.String r9 = "emojicompat-emoji-font"
            r11 = 0
            r12 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L79
            goto L80
        L79:
            r0 = move-exception
            java.lang.String r1 = "emoji2.text.DefaultEmojiConfig"
            android.util.Log.wtf(r1, r0)
            goto L4d
        L80:
            if (r6 != 0) goto L83
            goto L8d
        L83:
            eٔۦٖ r5 = new eٔۦٖ
            eٔؔٚ r0 = new eٔؔٚ
            r0.<init>(r13, r6)
            r5.<init>(r0)
        L8d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC7754e.vip(android.content.Context):eٔۦٖ");
    }

    public static void yandex(ViewGroup viewGroup) {
        Drawable background = viewGroup.getBackground();
        if (background instanceof C11252e) {
            billing(viewGroup, (C11252e) background);
        }
    }
}
