package defpackage;

import android.app.Activity;
import android.content.ContextWrapper;
import android.view.WindowManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚّۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12336e implements InterfaceC3971e, InterfaceC17801e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final C12336e f24728e = new Object();

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C12336e f24727e = new Object();

    @Override // defpackage.InterfaceC17801e
    public C14191e appmetrica(Activity activity, InterfaceC3971e interfaceC3971e) {
        InterfaceC9274e.vip.getClass();
        return new C14191e(new C16466e(C7673e.ad().isVip(activity)), interfaceC3971e.vip(activity));
    }

    @Override // defpackage.InterfaceC17801e
    /* renamed from: final */
    public C14191e mo2040final(ContextWrapper contextWrapper, InterfaceC3971e interfaceC3971e) {
        WindowManager windowManager = contextWrapper.isUiContext() ? (WindowManager) contextWrapper.getSystemService(WindowManager.class) : (WindowManager) contextWrapper.getApplicationContext().getSystemService(WindowManager.class);
        return new C14191e(windowManager.getCurrentWindowMetrics().getBounds(), windowManager.getCurrentWindowMetrics().getDensity());
    }

    @Override // defpackage.InterfaceC3971e
    public float vip(ContextWrapper contextWrapper) {
        return ((WindowManager) contextWrapper.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getDensity();
    }
}
