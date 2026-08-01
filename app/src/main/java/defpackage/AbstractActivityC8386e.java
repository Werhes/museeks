package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؐؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractActivityC8386e extends AbstractActivityC17704e {

    /* renamed from: eؚۚۦ, reason: contains not printable characters */
    public boolean f17152e;

    /* renamed from: eُِٔ, reason: contains not printable characters */
    public boolean f17153e;

    /* renamed from: eَٔٞ, reason: contains not printable characters */
    public int f17154e;

    public static void subs(AbstractActivityC8386e abstractActivityC8386e, WindowInsets windowInsets) {
        boolean z = abstractActivityC8386e.f17153e;
        abstractActivityC8386e.f34700e.license(windowInsets.getSystemWindowInsetTop());
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 && z) {
            int i2 = windowInsets.getInsetsIgnoringVisibility(WindowInsets.Type.navigationBars()).bottom;
            if (abstractActivityC8386e.f17154e == 0 && i2 > 0) {
                abstractActivityC8386e.f17154e = i2;
                abstractActivityC8386e.f34700e.metrica(i2);
                abstractActivityC8386e.f34700e.setPadding(0, 0, 0, i2);
            }
        }
        if (i < 30 || !z || !abstractActivityC8386e.f17152e) {
            int systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
            abstractActivityC8386e.f34700e.metrica(systemWindowInsetBottom);
            abstractActivityC8386e.f34700e.setPadding(0, 0, 0, systemWindowInsetBottom);
        }
        int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
        int systemWindowInsetRight = windowInsets.getSystemWindowInsetRight();
        C1059e c1059e = abstractActivityC8386e.f34700e;
        c1059e.setPadding(systemWindowInsetLeft, c1059e.getPaddingTop(), systemWindowInsetRight, c1059e.getPaddingBottom());
        if (i >= 28) {
            windowInsets.getDisplayCutout();
        }
    }

    @Override // defpackage.AbstractActivityC17704e, defpackage.AbstractActivityC1752e, defpackage.AbstractActivityC15824e, defpackage.AbstractActivityC3684e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = Build.VERSION.SDK_INT;
        Window window = getWindow();
        if (i >= 30) {
            window.setNavigationBarColor(0);
            this.f34700e.setWindowInsetsAnimationCallback(new C15864e(this));
        }
        this.f34700e.setSystemUiVisibility(1024);
        this.f34700e.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: eَؐۨ
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                AbstractActivityC8386e.subs(AbstractActivityC8386e.this, windowInsets);
                return windowInsets;
            }
        });
        window.setStatusBarColor(0);
    }
}
