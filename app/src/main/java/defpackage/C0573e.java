package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۜٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0573e extends AbstractC17487e implements InterfaceC15646e {
    public C5999e ads;
    public C5999e applovin;

    /* renamed from: class, reason: not valid java name */
    public boolean f2755class;
    public final ArrayList crashlytics;

    /* renamed from: extends, reason: not valid java name */
    public boolean f2756extends;
    public int firebase;

    /* renamed from: goto, reason: not valid java name */
    public boolean f2757goto;
    public final View inmobi;

    /* renamed from: interface, reason: not valid java name */
    public boolean f2758interface;
    public boolean isPro;
    public ActionBarContextView isVip;

    /* renamed from: native, reason: not valid java name */
    public C17679e f2759native;
    public C18540e premium;
    public ActionBarOverlayLayout pro;

    /* renamed from: protected, reason: not valid java name */
    public final C8167e f2760protected;
    public Context remoteconfig;
    public ActionBarContainer signatures;
    public boolean subs;
    public Context subscription;
    public InterfaceC1322e tapsense;

    /* renamed from: this, reason: not valid java name */
    public boolean f2761this;

    /* renamed from: throw, reason: not valid java name */
    public boolean f2762throw;

    /* renamed from: try, reason: not valid java name */
    public final C2811e f2763try;

    /* renamed from: while, reason: not valid java name */
    public final C2811e f2764while;

    /* renamed from: break, reason: not valid java name */
    public static final AccelerateInterpolator f2754break = new AccelerateInterpolator();

    /* renamed from: abstract, reason: not valid java name */
    public static final DecelerateInterpolator f2753abstract = new DecelerateInterpolator();

    public C0573e(Activity activity, boolean z) {
        new ArrayList();
        this.crashlytics = new ArrayList();
        this.firebase = 0;
        this.f2755class = true;
        this.f2761this = true;
        this.f2764while = new C2811e(this, 0);
        int i = 1;
        this.f2763try = new C2811e(this, i);
        this.f2760protected = new C8167e(i, this);
        View decorView = activity.getWindow().getDecorView();
        billing(decorView);
        if (z) {
            return;
        }
        this.inmobi = decorView.findViewById(R.id.content);
    }

    public C0573e(Dialog dialog) {
        new ArrayList();
        this.crashlytics = new ArrayList();
        this.firebase = 0;
        this.f2755class = true;
        this.f2761this = true;
        this.f2764while = new C2811e(this, 0);
        int i = 1;
        this.f2763try = new C2811e(this, i);
        this.f2760protected = new C8167e(i, this);
        billing(dialog.getWindow().getDecorView());
    }

    public final void adcel(boolean z) {
        boolean z2 = this.f2758interface;
        boolean z3 = this.f2757goto;
        C8167e c8167e = this.f2760protected;
        View view = this.inmobi;
        if (!z3 && z2) {
            if (this.f2761this) {
                this.f2761this = false;
                C17679e c17679e = this.f2759native;
                if (c17679e != null) {
                    c17679e.ad();
                }
                int i = this.firebase;
                C2811e c2811e = this.f2764while;
                if (i != 0 || (!this.f2756extends && !z)) {
                    c2811e.metrica();
                    return;
                }
                this.signatures.setAlpha(1.0f);
                this.signatures.setTransitioning(true);
                C17679e c17679e2 = new C17679e();
                float f = -this.signatures.getHeight();
                if (z) {
                    this.signatures.getLocationInWindow(new int[]{0, 0});
                    f -= r12[1];
                }
                C14712e vip = AbstractC2016e.vip(this.signatures);
                vip.appmetrica(f);
                View view2 = (View) vip.ad.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(c8167e != null ? new C1498e(c8167e, view2) : null);
                }
                boolean z4 = c17679e2.appmetrica;
                ArrayList arrayList = c17679e2.ad;
                if (!z4) {
                    arrayList.add(vip);
                }
                if (this.f2755class && view != null) {
                    C14712e vip2 = AbstractC2016e.vip(view);
                    vip2.appmetrica(f);
                    if (!c17679e2.appmetrica) {
                        arrayList.add(vip2);
                    }
                }
                boolean z5 = c17679e2.appmetrica;
                if (!z5) {
                    c17679e2.metrica = f2754break;
                }
                if (!z5) {
                    c17679e2.vip = 250L;
                }
                if (!z5) {
                    c17679e2.license = c2811e;
                }
                this.f2759native = c17679e2;
                c17679e2.vip();
                return;
            }
            return;
        }
        if (this.f2761this) {
            return;
        }
        this.f2761this = true;
        C17679e c17679e3 = this.f2759native;
        if (c17679e3 != null) {
            c17679e3.ad();
        }
        this.signatures.setVisibility(0);
        int i2 = this.firebase;
        C2811e c2811e2 = this.f2763try;
        if (i2 == 0 && (this.f2756extends || z)) {
            this.signatures.setTranslationY(0.0f);
            float f2 = -this.signatures.getHeight();
            if (z) {
                this.signatures.getLocationInWindow(new int[]{0, 0});
                f2 -= r12[1];
            }
            this.signatures.setTranslationY(f2);
            C17679e c17679e4 = new C17679e();
            C14712e vip3 = AbstractC2016e.vip(this.signatures);
            vip3.appmetrica(0.0f);
            View view3 = (View) vip3.ad.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(c8167e != null ? new C1498e(c8167e, view3) : null);
            }
            boolean z6 = c17679e4.appmetrica;
            ArrayList arrayList2 = c17679e4.ad;
            if (!z6) {
                arrayList2.add(vip3);
            }
            if (this.f2755class && view != null) {
                view.setTranslationY(f2);
                C14712e vip4 = AbstractC2016e.vip(view);
                vip4.appmetrica(0.0f);
                if (!c17679e4.appmetrica) {
                    arrayList2.add(vip4);
                }
            }
            boolean z7 = c17679e4.appmetrica;
            if (!z7) {
                c17679e4.metrica = f2753abstract;
            }
            if (!z7) {
                c17679e4.vip = 250L;
            }
            if (!z7) {
                c17679e4.license = c2811e2;
            }
            this.f2759native = c17679e4;
            c17679e4.vip();
        } else {
            this.signatures.setAlpha(1.0f);
            this.signatures.setTranslationY(0.0f);
            if (this.f2755class && view != null) {
                view.setTranslationY(0.0f);
            }
            c2811e2.metrica();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.pro;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = AbstractC2016e.ad;
            actionBarOverlayLayout.requestApplyInsets();
        }
    }

    public final void appmetrica(boolean z) {
        C14712e startapp;
        C14712e c14712e;
        if (z) {
            if (!this.f2757goto) {
                this.f2757goto = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.pro;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                adcel(false);
            }
        } else if (this.f2757goto) {
            this.f2757goto = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.pro;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            adcel(false);
        }
        if (!this.signatures.isLaidOut()) {
            if (z) {
                ((C5286e) this.tapsense).ad.setVisibility(4);
                this.isVip.setVisibility(0);
                return;
            } else {
                ((C5286e) this.tapsense).ad.setVisibility(0);
                this.isVip.setVisibility(8);
                return;
            }
        }
        if (z) {
            C5286e c5286e = (C5286e) this.tapsense;
            startapp = AbstractC2016e.vip(c5286e.ad);
            startapp.ad(0.0f);
            startapp.metrica(100L);
            startapp.license(new C10374e(c5286e, 4));
            c14712e = this.isVip.startapp(0, 200L);
        } else {
            C5286e c5286e2 = (C5286e) this.tapsense;
            C14712e vip = AbstractC2016e.vip(c5286e2.ad);
            vip.ad(1.0f);
            vip.metrica(200L);
            vip.license(new C10374e(c5286e2, 0));
            startapp = this.isVip.startapp(8, 100L);
            c14712e = vip;
        }
        C17679e c17679e = new C17679e();
        ArrayList arrayList = c17679e.ad;
        arrayList.add(startapp);
        View view = (View) startapp.ad.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) c14712e.ad.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(c14712e);
        c17679e.vip();
    }

    public final void billing(View view) {
        InterfaceC1322e wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(ua.itaysonlab.vkx.R.id.decor_content_parent);
        this.pro = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(ua.itaysonlab.vkx.R.id.action_bar);
        if (findViewById instanceof InterfaceC1322e) {
            wrapper = (InterfaceC1322e) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.tapsense = wrapper;
        this.isVip = (ActionBarContextView) view.findViewById(ua.itaysonlab.vkx.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(ua.itaysonlab.vkx.R.id.action_bar_container);
        this.signatures = actionBarContainer;
        InterfaceC1322e interfaceC1322e = this.tapsense;
        if (interfaceC1322e == null || this.isVip == null || actionBarContainer == null) {
            throw new IllegalStateException(C0573e.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((C5286e) interfaceC1322e).ad.getContext();
        this.subscription = context;
        if ((((C5286e) this.tapsense).vip & 4) != 0) {
            this.isPro = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.tapsense.getClass();
        startapp(context.getResources().getBoolean(ua.itaysonlab.vkx.R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.subscription.obtainStyledAttributes(null, AbstractC6062e.ad, ua.itaysonlab.vkx.R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.pro;
            if (!actionBarOverlayLayout2.f148e) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f2762throw = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.signatures;
            WeakHashMap weakHashMap = AbstractC2016e.ad;
            actionBarContainer2.setElevation(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final Context purchase() {
        if (this.remoteconfig == null) {
            TypedValue typedValue = new TypedValue();
            this.subscription.getTheme().resolveAttribute(ua.itaysonlab.vkx.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.remoteconfig = new ContextThemeWrapper(this.subscription, i);
            } else {
                this.remoteconfig = this.subscription;
            }
        }
        return this.remoteconfig;
    }

    public final void startapp(boolean z) {
        if (z) {
            this.signatures.setTabContainer(null);
            ((C5286e) this.tapsense).getClass();
        } else {
            ((C5286e) this.tapsense).getClass();
            this.signatures.setTabContainer(null);
        }
        this.tapsense.getClass();
        ((C5286e) this.tapsense).ad.setCollapsible(false);
        this.pro.setHasNonEmbeddedTabs(false);
    }

    public final void yandex(boolean z) {
        if (this.isPro) {
            return;
        }
        int i = z ? 4 : 0;
        C5286e c5286e = (C5286e) this.tapsense;
        int i2 = c5286e.vip;
        this.isPro = true;
        c5286e.ad((i & 4) | (i2 & (-5)));
    }
}
