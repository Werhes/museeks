package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؙؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C10056e implements ComponentCallbacks2, ViewTreeObserver.OnWindowFocusChangeListener {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ C14843e f19868e;

    public ComponentCallbacks2C10056e(C14843e c14843e) {
        this.f19868e = c14843e;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f19868e.license(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        C14843e c14843e = this.f19868e;
        c14843e.purchase.ad.clear();
        c14843e.billing.ad();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        C14843e c14843e = this.f19868e;
        c14843e.purchase.ad.clear();
        c14843e.billing.ad();
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        this.f19868e.remoteconfig.metrica.setValue(Boolean.valueOf(z));
    }
}
