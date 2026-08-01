package defpackage;

import android.app.Activity;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.view.WindowManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًًۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8123e implements InterfaceC9274e, InterfaceC17801e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final C8123e f16497e = new Object();

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C8123e f16496e = new Object();

    @Override // defpackage.InterfaceC17801e
    public C14191e appmetrica(Activity activity, InterfaceC3971e interfaceC3971e) {
        InterfaceC9274e.vip.getClass();
        return new C14191e(new C16466e(C7673e.ad().isVip(activity)), interfaceC3971e.vip(activity));
    }

    @Override // defpackage.InterfaceC17801e
    /* renamed from: final */
    public C14191e mo2040final(ContextWrapper contextWrapper, InterfaceC3971e interfaceC3971e) {
        WindowManager windowManager = (WindowManager) contextWrapper.getSystemService(WindowManager.class);
        return new C14191e(windowManager.getCurrentWindowMetrics().getBounds(), contextWrapper.getResources().getDisplayMetrics().density);
    }

    @Override // defpackage.InterfaceC9274e
    public Rect isVip(Activity activity) {
        return ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
    }
}
