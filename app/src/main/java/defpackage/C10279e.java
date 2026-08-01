package defpackage;

import android.content.SharedPreferences;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Stack;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;
import ua.itaysonlab.vkxreborn.ui.nextdock.NextDockView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٕٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10279e {
    public final AppActivity ad;
    public final FrameLayout[] appmetrica;
    public C9142e billing;
    public final LinkedHashMap license;
    public boolean metrica;
    public C9142e purchase;
    public int startapp;
    public Cpackage vip;
    public Celse yandex;

    public C10279e(AppActivity appActivity) {
        this.ad = appActivity;
        EnumC7173e enumC7173e = EnumC7173e.OrbitPlayer;
        this.vip = C14411e.f28494e;
        this.license = new LinkedHashMap();
        this.appmetrica = new FrameLayout[EnumC16729e.f32797e.subs()];
        this.startapp = -1;
    }

    public final void ad() {
        FrameLayout frameLayout = this.appmetrica[this.startapp];
        View childAt = frameLayout != null ? frameLayout.getChildAt(0) : null;
        C1059e c1059e = childAt instanceof C1059e ? (C1059e) childAt : null;
        if (c1059e == null) {
            return;
        }
        if (c1059e.getFragmentStack().size() == 1) {
            InterfaceC16400e interfaceC16400e = c1059e.getFragmentStack().get(0);
            InterfaceC9758e interfaceC9758e = interfaceC16400e instanceof InterfaceC9758e ? (InterfaceC9758e) interfaceC16400e : null;
            if (interfaceC9758e != null) {
                interfaceC9758e.purchase();
                return;
            }
            return;
        }
        if (c1059e.getFragmentStack().size() == 2) {
            c1059e.purchase(true, true);
            return;
        }
        if (c1059e.getFragmentStack().size() > 2) {
            for (int billing = AbstractC6874e.billing(c1059e.getFragmentStack()) - 1; billing > 0; billing--) {
                Stack stack = c1059e.f3586e;
                if (billing >= c1059e.f3585e.size() - 2) {
                    if (billing == c1059e.f3585e.size() - 1) {
                        c1059e.removeViewAt(c1059e.getChildCount() - 1);
                    } else {
                        c1059e.removeViewAt(0);
                    }
                } else if (billing > 2 && !stack.isEmpty()) {
                    stack.remove(billing - 2);
                }
                if (c1059e.f3585e.size() > 2 && c1059e.getChildCount() < 2) {
                    View view = (View) stack.pop();
                    view.setVisibility(8);
                    c1059e.addView(view, 0);
                    Stack stack2 = c1059e.f3585e;
                    ((AbstractC13859e) stack2.get(stack2.size() - 2)).crashlytics();
                }
                AbstractC13859e abstractC13859e = (AbstractC13859e) c1059e.f3585e.remove(billing);
                c1059e.f3572e.remove(billing);
                abstractC13859e.applovin();
                int size = c1059e.f3585e.size();
                AbstractC13859e abstractC13859e2 = size > 0 ? (AbstractC13859e) c1059e.f3585e.peek() : null;
                AbstractC13859e abstractC13859e3 = size > 1 ? (AbstractC13859e) c1059e.f3585e.get(size - 2) : null;
                Iterator it = c1059e.f3561e.iterator();
                while (it.hasNext()) {
                    C16779e c16779e = (C16779e) ((InterfaceC5259e) it.next());
                    c16779e.vip(abstractC13859e3, abstractC13859e2);
                    c16779e.metrica(null, abstractC13859e3, abstractC13859e2, 1.0f);
                }
            }
            c1059e.purchase(true, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0094 A[Catch: all -> 0x009f, TryCatch #2 {all -> 0x009f, blocks: (B:27:0x0064, B:29:0x0068, B:30:0x006e, B:32:0x0072, B:34:0x0078, B:36:0x007e, B:40:0x0088, B:41:0x0090, B:43:0x0094, B:45:0x009a), top: B:26:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009a A[Catch: all -> 0x009f, TRY_LEAVE, TryCatch #2 {all -> 0x009f, blocks: (B:27:0x0064, B:29:0x0068, B:30:0x006e, B:32:0x0072, B:34:0x0078, B:36:0x007e, B:40:0x0088, B:41:0x0090, B:43:0x0094, B:45:0x009a), top: B:26:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0097  */
    /* JADX WARN: Type inference failed for: r0v16, types: [eؗۢۢ, eًَؓ] */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.lang.Object, eّٓۢ] */
    /* JADX WARN: Type inference failed for: r6v7, types: [android.widget.FrameLayout, android.view.View, eٗؖؐ, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean appmetrica(defpackage.EnumC16729e r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 1112
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10279e.appmetrica(eًٗؓ, boolean):boolean");
    }

    public final void license(Cpackage cpackage) {
        if (AbstractC7890e.billing(this.vip, cpackage)) {
            return;
        }
        this.vip = cpackage;
        this.startapp = -1;
        vip(true);
        ((NextDockView) this.ad.f36547e.f10519e).refreshTheme();
    }

    public final void metrica(Function2 function2) {
        FrameLayout[] frameLayoutArr = this.appmetrica;
        int length = frameLayoutArr.length;
        for (int i = 0; i < length; i++) {
            FrameLayout frameLayout = frameLayoutArr[i];
            C16779e c16779e = null;
            View childAt = frameLayout != null ? frameLayout.getChildAt(0) : null;
            C1059e c1059e = childAt instanceof C1059e ? (C1059e) childAt : null;
            View childAt2 = frameLayout != null ? frameLayout.getChildAt(1) : null;
            if (childAt2 instanceof C16779e) {
                c16779e = (C16779e) childAt2;
            }
            function2.invoke(c1059e, c16779e);
        }
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [eٖؑۡ, eُۙۨ] */
    public final void vip(boolean z) {
        EnumC7173e enumC7173e;
        if (!z) {
            VKXApplication vKXApplication = VKXApplication.f36528e;
            if (vKXApplication == null) {
                vKXApplication = null;
            }
            if (AbstractC7890e.billing(vKXApplication.getApplicationContext().getPackageName(), "ua.itaysonlab.vkx")) {
                C14027e.ad.getClass();
                if (C14027e.ad() && !C7947e.ad.vip()) {
                    enumC7173e = EnumC7173e.VKX;
                    this.vip = enumC7173e.f14665e;
                }
            }
            enumC7173e = EnumC7173e.OrbitPlayer;
            this.vip = enumC7173e.f14665e;
        }
        AppActivity appActivity = this.ad;
        NextDockView nextDockView = (NextDockView) appActivity.f36547e.f10519e;
        ArrayList arrayList = nextDockView.f36761e;
        if (!arrayList.isEmpty()) {
            while (!arrayList.isEmpty()) {
                int billing = AbstractC6874e.billing(arrayList);
                nextDockView.removeViewAt(billing);
                arrayList.remove(billing);
                nextDockView.setWeightSum(arrayList.size());
            }
        }
        EnumC16729e[] enumC16729eArr = (EnumC16729e[]) this.vip.f36443e;
        ArrayList arrayList2 = new ArrayList(enumC16729eArr.length);
        int i = 0;
        for (EnumC16729e enumC16729e : enumC16729eArr) {
            arrayList2.add(new C16616e(String.valueOf(enumC16729e.ordinal()), enumC16729e.f32804e, enumC16729e.f32805e));
        }
        nextDockView.ad(arrayList2);
        if (!this.metrica) {
            SharedPreferences sharedPreferences = AbstractC6181e.ad;
            nextDockView.setLegacyMode(AbstractC6181e.ad(EnumC7437e.f15206e));
            this.metrica = true;
        }
        nextDockView.setOnItemClickListener(new C17879e(this, i));
        nextDockView.setOnLongItemClickListener(new C11213e(8, this));
        Cpackage cpackage = this.vip;
        boolean z2 = cpackage instanceof C14411e;
        LinkedHashMap linkedHashMap = this.license;
        EnumC16729e enumC16729e2 = EnumC16729e.f32799e;
        if (z2) {
            C14027e.ad.getClass();
            if (C14027e.ad()) {
                AbstractC17680e.amazon((NextDockView) appActivity.f36547e.f10519e);
                NextDockView nextDockView2 = (NextDockView) appActivity.f36547e.f10519e;
                C14411e c14411e = C14411e.f28494e;
                EnumC16729e[] enumC16729eArr2 = (EnumC16729e[]) c14411e.f36443e;
                EnumC16729e enumC16729e3 = (EnumC16729e) linkedHashMap.get(c14411e);
                if (enumC16729e3 == null) {
                    VKXApplication.Companion companion = VKXApplication.f36531e;
                    enumC16729e3 = !VKXApplication.Companion.metrica() ? EnumC16729e.f32803e : enumC16729eArr2[AbstractC3062e.license(C7947e.ad.ad(), new C11241e(0, enumC16729eArr2.length - 1, 1))];
                }
                NextDockView.metrica(nextDockView2, String.valueOf(enumC16729e3.ordinal()), 4);
                C16251e.ad.ad(((NextDockView) appActivity.f36547e.f10519e).getCurrentFrameView(), EnumC14893e.f29509e);
            } else {
                AbstractC17680e.mopub((LinearLayout) appActivity.f36547e.f10511e);
                AbstractC17680e.mopub((CoordinatorLayout) appActivity.f36547e.f10516e);
                appmetrica(enumC16729e2, false);
            }
        } else {
            if (!(cpackage instanceof C2576e)) {
                throw new C14803e(10);
            }
            C14027e.ad.getClass();
            if (C14027e.ad() || !AbstractC7890e.billing(appActivity.getPackageName(), "ua.itaysonlab.vkx") || C7947e.ad.vip()) {
                AbstractC17680e.amazon((NextDockView) appActivity.f36547e.f10519e);
                NextDockView nextDockView3 = (NextDockView) appActivity.f36547e.f10519e;
                EnumC16729e enumC16729e4 = (EnumC16729e) linkedHashMap.get(C2576e.f6436e);
                if (enumC16729e4 == null) {
                    enumC16729e4 = EnumC16729e.f32798e;
                }
                NextDockView.metrica(nextDockView3, String.valueOf(enumC16729e4.ordinal()), 4);
            } else {
                AbstractC17680e.mopub((LinearLayout) appActivity.f36547e.f10511e);
                AbstractC17680e.mopub((CoordinatorLayout) appActivity.f36547e.f10516e);
                appmetrica(enumC16729e2, false);
            }
        }
        C4956e c4956e = appActivity.f36547e;
        if (c4956e != null) {
            ((LinearLayout) c4956e.f10511e).setBackgroundColor(AbstractC15933e.ad(R.attr.nextdock_background));
        }
    }
}
