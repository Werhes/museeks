package com.werhes.museeks.activity;

import android.content.Intent;
import android.content.res.Configuration;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.CustomBottomSheetBehavior;
import defpackage.AbstractActivityC8792e;
import defpackage.AbstractC1129e;
import defpackage.AbstractC13480e;
import defpackage.AbstractC13859e;
import defpackage.AbstractC14385e;
import defpackage.AbstractC1497e;
import defpackage.AbstractC15933e;
import defpackage.AbstractC16398e;
import defpackage.AbstractC16519e;
import defpackage.AbstractC17378e;
import defpackage.AbstractC17680e;
import defpackage.AbstractC17861e;
import defpackage.AbstractC17947e;
import defpackage.AbstractC1831e;
import defpackage.AbstractC4608e;
import defpackage.AbstractC5004e;
import defpackage.AbstractC5336e;
import defpackage.AbstractC6731e;
import defpackage.AbstractC7122e;
import defpackage.AbstractC7890e;
import defpackage.AbstractC9743e;
import defpackage.C0576e;
import defpackage.C0595e;
import defpackage.C0743e;
import defpackage.C10279e;
import defpackage.C1059e;
import defpackage.C10985e;
import defpackage.C11109e;
import defpackage.C12559e;
import defpackage.C12894e;
import defpackage.C14027e;
import defpackage.C14411e;
import defpackage.C14803e;
import defpackage.C14826e;
import defpackage.C14965e;
import defpackage.C15076e;
import defpackage.C15409e;
import defpackage.C15420e;
import defpackage.C15754e;
import defpackage.C16330e;
import defpackage.C17231e;
import defpackage.C1731e;
import defpackage.C17429e;
import defpackage.C17641e;
import defpackage.C2038e;
import defpackage.C2616e;
import defpackage.C3168e;
import defpackage.C3779e;
import defpackage.C4221e;
import defpackage.C4587e;
import defpackage.C4956e;
import defpackage.C5363e;
import defpackage.C5658e;
import defpackage.C6571e;
import defpackage.C6703e;
import defpackage.C6804e;
import defpackage.C7143e;
import defpackage.C7838e;
import defpackage.C7947e;
import defpackage.C7950e;
import defpackage.C9402e;
import defpackage.C9628e;
import defpackage.EnumC12505e;
import defpackage.EnumC2631e;
import defpackage.InterfaceC13018e;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import com.werhes.museeks.R;
import com.werhes.museeks.VKXApplication;
import ua.itaysonlab.vkxreborn.ui.nextdock.NextDockView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lua/itaysonlab/vkx/activity/AppActivity;", "Leٌۣٚ;", "Leْٕؔ;", "<init>", "()V", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AppActivity extends AbstractActivityC8792e implements InterfaceC13018e {

    /* renamed from: eِۢٔ, reason: contains not printable characters */
    public static final /* synthetic */ int f36539e = 0;

    /* renamed from: eّؑۛ, reason: contains not printable characters */
    public final C17641e f36540e;

    /* renamed from: eٖؗۘ, reason: contains not printable characters */
    public final ArrayList f36541e;

    /* renamed from: eؙٚؑ, reason: contains not printable characters */
    public final C10279e f36542e;

    /* renamed from: eًؚْ, reason: contains not printable characters */
    public final C11109e f36543e;

    /* renamed from: eُِۤ, reason: contains not printable characters */
    public int f36544e;

    /* renamed from: eؚؚْ, reason: contains not printable characters */
    public final C7950e f36545e;

    /* renamed from: eَٖؑ, reason: contains not printable characters */
    public final C6703e f36546e;

    /* renamed from: eٖٕٚ, reason: contains not printable characters */
    public C4956e f36547e;

    /* renamed from: eّٖٗ, reason: contains not printable characters */
    public final C5363e f36548e;

    /* renamed from: eًٜ٘, reason: contains not printable characters */
    public final AtomicBoolean f36549e;

    public AppActivity() {
        ((C3168e) this.f31251e.f12439e).m1261e("androidx:appcompat", new C4587e(this));
        advert(new C9628e(this));
        this.f34702e = 100000;
        this.f34701e = new SparseArray();
        this.f34704e = new SparseArray();
        this.f17153e = true;
        this.f36548e = new C5363e(new C17231e(this, 0));
        this.f36540e = new C17641e(this);
        this.f36541e = new ArrayList();
        this.f36543e = new C11109e(0, this);
        this.f36542e = new C10279e(this);
        this.f36546e = new C6703e(this);
        this.f36545e = new C7950e(this);
        this.f36549e = new AtomicBoolean(false);
    }

    /* renamed from: goto, reason: not valid java name */
    public static void m4676goto(boolean z, Configuration configuration) {
        boolean z2 = AbstractC1129e.license;
        boolean z3 = (configuration.uiMode & 48) == 32;
        AbstractC1129e.license = z3;
        if (z2 != z3) {
            AbstractC15933e.vip(AbstractC17378e.ad(), new float[]{0.0f, 0.0f}, z);
        }
    }

    /* renamed from: class, reason: not valid java name */
    public final C1731e m4677class() {
        return (C1731e) this.f36548e.getValue();
    }

    public final void crashlytics() {
        AbstractC1831e.ad().ad();
        C7947e.ad.getClass();
        C7947e.purchase.applovin(C7947e.vip[1], Boolean.FALSE);
        C6703e c6703e = this.f36546e;
        c6703e.metrica();
        c6703e.metrica.yandex();
        this.f36542e.license(C14411e.f28494e);
        NextDockView.metrica((NextDockView) this.f36547e.f10519e, String.valueOf(0), 6);
        int i = C4221e.f9289e;
        AbstractC14385e.vip(this);
        if (C14965e.metrica()) {
            C14965e.vip(this);
        } else {
            AbstractC17680e.amazon((LinearLayout) this.f36547e.f10511e);
            AbstractC17680e.amazon((CoordinatorLayout) this.f36547e.f10516e);
        }
        AbstractC5336e.purchase(AbstractC4608e.metrica(vip()), null, 0, new C6804e(this, null), 3);
    }

    public final void firebase() {
        this.f36546e.ad();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: interface, reason: not valid java name */
    public final void m4678interface(int i, boolean z) {
        int i2;
        C15409e.ad.getClass();
        int i3 = 1;
        int i4 = 2;
        Object[] objArr = 0;
        if (!((Boolean) C15409e.pro.ad()).booleanValue() && z) {
            AbstractC16519e.ad(AbstractC17947e.billing(this), this, false, new C12559e(i4, i3, objArr == true ? 1 : 0));
            return;
        }
        EnumC12505e enumC12505e = (EnumC12505e) C15409e.signatures.ad();
        VKXApplication.Companion companion = VKXApplication.f36531e;
        VKXApplication vKXApplication = VKXApplication.f36528e;
        VKXApplication vKXApplication2 = vKXApplication != null ? vKXApplication : null;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        int ordinal = enumC12505e.ordinal();
        int i5 = 3;
        if (ordinal == 0) {
            i2 = R.string.hs_source_queue_templated;
        } else if (ordinal == 1) {
            i2 = R.string.hs_source_library_templated;
        } else if (ordinal == 2) {
            i2 = R.string.hs_source_mix;
        } else {
            if (ordinal != 3) {
                throw new C14803e(10);
            }
            i2 = R.string.hs_source_library_cached_templated;
        }
        String string = vKXApplication2.getString(R.string.hs_autostart_template, vKXApplication.getString(i2));
        int i6 = z ? R.drawable.ic_list_play_outline_28 : R.drawable.ic_headphones_outline_28;
        VKXApplication vKXApplication3 = VKXApplication.f36528e;
        if (vKXApplication3 == null) {
            vKXApplication3 = null;
        }
        C9402e.ad(this, new C15076e(Integer.valueOf(i6), vKXApplication3.getString(i), string, z ? new C6571e(VKXApplication.Companion.vip(R.string.cancel), new C0743e(5)) : new C6571e(VKXApplication.Companion.vip(R.string.hs_plug_act), new C17231e(this, i3)), (z || !enumC12505e.f25048e) ? null : new C10985e(Integer.valueOf(R.drawable.ic_shuffle_outline_24), VKXApplication.Companion.vip(R.string.hs_plug_act2), new C17231e(this, i4)), z ? new C17231e(this, i5) : null, z ? R.drawable.ic_cancel_outline_28 : R.drawable.player_play));
    }

    @Override // defpackage.AbstractActivityC17704e
    public final void isVip(AbstractC13859e abstractC13859e) {
        ArrayList arrayList = this.f36541e;
        if (!arrayList.isEmpty()) {
            AbstractC5004e abstractC5004e = (AbstractC5004e) AbstractC17861e.mopub(1, arrayList);
            if (abstractC5004e instanceof C3779e) {
                C1059e c1059e = ((C3779e) abstractC5004e).f8384e;
                if (c1059e != null) {
                    c1059e.smaato(abstractC13859e);
                    return;
                }
                return;
            }
        }
        this.f34700e.smaato(abstractC13859e);
    }

    @Override // defpackage.AbstractActivityC17704e, defpackage.AbstractActivityC1752e, defpackage.AbstractActivityC15824e, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        ArrayList arrayList = this.f36541e;
        if (arrayList.size() > 0) {
            ((AbstractC5004e) AbstractC13480e.m3570break(arrayList)).startapp(i, i2, intent);
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // defpackage.AbstractActivityC17704e, defpackage.AbstractActivityC1752e, defpackage.AbstractActivityC15824e, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m4676goto(true, configuration);
        int i = this.f36544e;
        int i2 = configuration.orientation;
        if (i != i2) {
            this.f36544e = i2;
            for (FrameLayout frameLayout : this.f36542e.appmetrica) {
                if (frameLayout != null) {
                    ((C1059e) frameLayout.getChildAt(0)).m461getCurrentFragment();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x054e  */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, eؗ٘ٔ] */
    @Override // defpackage.AbstractActivityC8386e, defpackage.AbstractActivityC17704e, defpackage.AbstractActivityC1752e, defpackage.AbstractActivityC15824e, defpackage.AbstractActivityC3684e, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r19) {
        /*
            Method dump skipped, instructions count: 1579
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.itaysonlab.vkx.activity.AppActivity.onCreate(android.os.Bundle):void");
    }

    @Override // defpackage.AbstractActivityC17704e, defpackage.AbstractActivityC1752e, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        FrameLayout[] frameLayoutArr = this.f36542e.appmetrica;
        int length = frameLayoutArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                C6703e c6703e = this.f36546e;
                c6703e.vip.license();
                C2038e c2038e = c6703e.metrica;
                c2038e.Signature.getClass();
                C12894e c12894e = c2038e.admob;
                AbstractC9743e.license((C14826e) c12894e.f25751e, null);
                ((C0576e) c12894e.f25752e).setValue(C0595e.ad);
                c2038e.subscription.getClass();
                C5658e.vip = null;
                VKXApplication.f36534e = false;
                this.f36543e.license();
                this.f36547e = null;
                AbstractC1831e.vip().vip = null;
                return;
            }
            FrameLayout frameLayout = frameLayoutArr[i];
            View childAt = frameLayout != null ? frameLayout.getChildAt(0) : null;
            C1059e c1059e = childAt instanceof C1059e ? (C1059e) childAt : null;
            if (c1059e != null) {
                AbstractC16398e.vip(c1059e, C7143e.f14623e);
            }
            i++;
        }
    }

    @Override // defpackage.AbstractActivityC15824e, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        ArrayList arrayList = this.f36541e;
        if (arrayList.size() > 0) {
            ((AbstractC5004e) AbstractC13480e.m3570break(arrayList)).Signature(intent);
            return;
        }
        AppActivity appActivity = this.f36540e.ad;
        C6703e c6703e = appActivity.f36546e;
        C14027e.ad.getClass();
        if (C14027e.ad()) {
            if (AbstractC7890e.billing(intent.getAction(), "ua.itaysonlab.vkx.action.OPEN_PLAYER") && c6703e.vip()) {
                C7838e c7838e = VKXApplication.f36530e;
                if (c7838e == null) {
                    c7838e = null;
                }
                if (!c7838e.purchase()) {
                    c6703e.purchase();
                    return;
                }
            }
            if (AbstractC7890e.billing(intent.getAction(), "android.intent.action.VIEW")) {
                C17641e.vip(intent);
                return;
            }
            if (AbstractC7890e.billing(intent.getAction(), "ua.itaysonlab.vkx.action.OPEN_LIBRARY")) {
                NextDockView.metrica((NextDockView) appActivity.f36547e.f10519e, "3", 6);
            } else if (AbstractC7890e.billing(intent.getAction(), "ua.itaysonlab.vkx.action.OPEN_MENU") || AbstractC7890e.billing(intent.getAction(), "android.intent.action.APPLICATION_PREFERENCES")) {
                NextDockView.metrica((NextDockView) appActivity.f36547e.f10519e, "4", 6);
            }
        }
    }

    @Override // defpackage.AbstractActivityC17704e, defpackage.AbstractActivityC1752e, android.app.Activity
    public final void onPause() {
        super.onPause();
        C7838e c7838e = VKXApplication.f36530e;
        if (c7838e == null) {
            c7838e = null;
        }
        c7838e.f15874e = false;
        VKXApplication.f36534e = false;
        AbstractC1831e.vip().vip = null;
        this.f36546e.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [eًؗۖ] */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.android.material.bottomsheet.BottomSheetBehavior] */
    /* JADX WARN: Type inference failed for: r2v2 */
    @Override // defpackage.AbstractActivityC17704e, defpackage.AbstractActivityC1752e, android.app.Activity
    public final void onResume() {
        super.onResume();
        int i = 1;
        VKXApplication.f36534e = true;
        C7838e c7838e = VKXApplication.f36530e;
        if (c7838e == null) {
            c7838e = null;
        }
        c7838e.f15874e = true;
        C7838e c7838e2 = VKXApplication.f36530e;
        if (c7838e2 == null) {
            c7838e2 = null;
        }
        if (c7838e2.f15864e != null) {
            C15420e c15420e = AbstractC6731e.ad;
            AbstractC5336e.purchase(c7838e2, AbstractC1497e.ad.f25795e, 0, new C17429e(c7838e2, r2, i), 2);
        }
        C6703e c6703e = this.f36546e;
        C2038e c2038e = c6703e.metrica;
        if (c6703e.vip()) {
            c2038e.getClass();
            C2616e c2616e = c2038e.amazon;
            C0576e c0576e = c2038e.loadAd;
            C7838e c7838e3 = VKXApplication.f36530e;
            if (c7838e3 == null) {
                c7838e3 = null;
            }
            if (!c7838e3.purchase()) {
                CustomBottomSheetBehavior customBottomSheetBehavior = c6703e.license;
                if ((customBottomSheetBehavior != null ? customBottomSheetBehavior : 0).f798throw == 3) {
                    c0576e.setValue(Boolean.FALSE);
                    c2616e.startapp(0.0f);
                }
            } else if (((C15754e) c2038e.appmetrica.getValue()) == null) {
                CustomBottomSheetBehavior customBottomSheetBehavior2 = c6703e.license;
                if (customBottomSheetBehavior2 == null) {
                    customBottomSheetBehavior2 = null;
                }
                customBottomSheetBehavior2.premium(true);
                CustomBottomSheetBehavior customBottomSheetBehavior3 = c6703e.license;
                (customBottomSheetBehavior3 != null ? customBottomSheetBehavior3 : null).crashlytics(5);
                c6703e.appmetrica(0.0f);
                C16330e c16330e = AbstractC7122e.ad;
                AbstractC7122e.ad(EnumC2631e.f6496e);
            } else {
                c0576e.setValue(Boolean.TRUE);
                c2616e.startapp(1.0f);
                CustomBottomSheetBehavior customBottomSheetBehavior4 = c6703e.license;
                (customBottomSheetBehavior4 != null ? customBottomSheetBehavior4 : null).crashlytics(4);
                c6703e.appmetrica(0.0f);
                C16330e c16330e2 = AbstractC7122e.ad;
                AbstractC7122e.ad(EnumC2631e.f6497e);
            }
        }
        AbstractC1831e.vip().vip = new C17641e(this);
    }
}
