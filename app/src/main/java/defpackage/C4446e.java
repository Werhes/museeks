package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Unit;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۢٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4446e implements InterfaceC2661e {
    public static boolean billing = true;
    public final ViewTreeObserverOnGlobalLayoutListenerC5014e ad;
    public C0909e appmetrica;
    public boolean license;
    public C10066e metrica;
    public final ComponentCallbacks2C15499e purchase;
    public final Object vip = new Object();

    public C4446e(ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e) {
        this.ad = viewTreeObserverOnGlobalLayoutListenerC5014e;
        ComponentCallbacks2C15499e componentCallbacks2C15499e = new ComponentCallbacks2C15499e(0, this);
        this.purchase = componentCallbacks2C15499e;
        if (viewTreeObserverOnGlobalLayoutListenerC5014e.isAttachedToWindow()) {
            Context context = viewTreeObserverOnGlobalLayoutListenerC5014e.getContext();
            if (!this.license) {
                context.getApplicationContext().registerComponentCallbacks(componentCallbacks2C15499e);
                this.license = true;
            }
        }
        viewTreeObserverOnGlobalLayoutListenerC5014e.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0544e(0, this));
    }

    public static final void license(C4446e c4446e) {
        C0909e c0909e = c4446e.appmetrica;
        if (c0909e != null) {
            synchronized (c0909e) {
                try {
                    C0583e c0583e = (C0583e) c0909e.f3323e;
                    if (c0583e != null) {
                        c0583e.ad();
                    }
                    C0583e c0583e2 = (C0583e) c0909e.f3322e;
                    if (c0583e2 != null) {
                        c0583e2.ad();
                    }
                    c0909e.f3321e = null;
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        c4446e.appmetrica = null;
    }

    @Override // defpackage.InterfaceC2661e
    public final void ad(C16446e c16446e) {
        synchronized (this.vip) {
            if (!c16446e.remoteconfig) {
                c16446e.remoteconfig = true;
                c16446e.vip();
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [eَؖ۟, android.view.View, android.view.ViewGroup, eؚْ۟] */
    public final AbstractC13533e appmetrica(ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e) {
        C10066e c10066e = this.metrica;
        if (c10066e != null) {
            return c10066e;
        }
        ?? viewGroup = new ViewGroup(viewTreeObserverOnGlobalLayoutListenerC5014e.getContext());
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        viewGroup.setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
        viewTreeObserverOnGlobalLayoutListenerC5014e.addView((View) viewGroup, -1);
        this.metrica = viewGroup;
        return viewGroup;
    }

    @Override // defpackage.InterfaceC2661e
    public final C16446e metrica() {
        InterfaceC3828e c1288e;
        C16446e c16446e;
        synchronized (this.vip) {
            try {
                ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e = this.ad;
                int i = Build.VERSION.SDK_INT;
                if (i >= 29) {
                    AbstractC14204e.applovin(viewTreeObserverOnGlobalLayoutListenerC5014e);
                }
                if (i >= 29) {
                    c1288e = new C12037e();
                } else if (billing) {
                    try {
                        c1288e = new C0289e(this.ad, new C16125e(), new C14434e());
                    } catch (Throwable unused) {
                        billing = false;
                        c1288e = new C1288e(appmetrica(this.ad));
                    }
                } else {
                    c1288e = new C1288e(appmetrica(this.ad));
                }
                c16446e = new C16446e(c1288e);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c16446e;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [eٍؚؒ, java.lang.Object] */
    @Override // defpackage.InterfaceC2661e
    public final C0909e vip() {
        C0909e c0909e = this.appmetrica;
        if (c0909e != null) {
            return c0909e;
        }
        ?? obj = new Object();
        this.appmetrica = obj;
        return obj;
    }
}
