package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؔؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC2376e implements View.OnApplyWindowInsetsListener {
    public C12948e ad = null;
    public final /* synthetic */ InterfaceC0569e metrica;
    public final /* synthetic */ View vip;

    public ViewOnApplyWindowInsetsListenerC2376e(View view, InterfaceC0569e interfaceC0569e) {
        this.vip = view;
        this.metrica = interfaceC0569e;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C12948e yandex = C12948e.yandex(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        InterfaceC0569e interfaceC0569e = this.metrica;
        if (i < 30) {
            AbstractC4387e.ad(windowInsets, this.vip);
            if (yandex.equals(this.ad)) {
                return interfaceC0569e.mo378extends(view, yandex).billing();
            }
        }
        this.ad = yandex;
        C12948e mo378extends = interfaceC0569e.mo378extends(view, yandex);
        if (i >= 30) {
            return mo378extends.billing();
        }
        WeakHashMap weakHashMap = AbstractC2016e.ad;
        view.requestApplyInsets();
        return mo378extends.billing();
    }
}
