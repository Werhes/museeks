package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؔۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2434e extends C14271e implements InterfaceC3608e {

    /* renamed from: eَۦۥ, reason: contains not printable characters */
    public static final Method f6246e;

    /* renamed from: eؘؖؑ, reason: contains not printable characters */
    public C12916e f6247e;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f6246e = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // defpackage.C14271e
    public final C15703e admob(Context context, boolean z) {
        C11819e c11819e = new C11819e(context, z);
        c11819e.setHoverListener(this);
        return c11819e;
    }

    @Override // defpackage.InterfaceC3608e
    public final void license(MenuC8939e menuC8939e, MenuItem menuItem) {
        C12916e c12916e = this.f6247e;
        if (c12916e != null) {
            c12916e.license(menuC8939e, menuItem);
        }
    }

    @Override // defpackage.InterfaceC3608e
    public final void mopub(MenuC8939e menuC8939e, C9995e c9995e) {
        C12916e c12916e = this.f6247e;
        if (c12916e != null) {
            c12916e.mopub(menuC8939e, c9995e);
        }
    }
}
