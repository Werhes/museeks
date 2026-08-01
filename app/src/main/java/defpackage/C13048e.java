package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍْؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C13048e {
    public final Context ad;
    public PopupWindow.OnDismissListener adcel;
    public View appmetrica;
    public boolean billing;
    public final int license;
    public final boolean metrica;
    public AbstractC7413e startapp;
    public final MenuC8939e vip;
    public InterfaceC17386e yandex;
    public int purchase = 8388611;
    public final C4262e mopub = new C4262e(this);

    public C13048e(Context context, MenuC8939e menuC8939e, View view, boolean z, int i, int i2) {
        this.ad = context;
        this.vip = menuC8939e;
        this.appmetrica = view;
        this.metrica = z;
        this.license = i;
    }

    public final AbstractC7413e ad() {
        AbstractC7413e viewOnKeyListenerC14494e;
        if (this.startapp == null) {
            Context context = this.ad;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                viewOnKeyListenerC14494e = new ViewOnKeyListenerC8330e(context, this.appmetrica, this.license, this.metrica);
            } else {
                viewOnKeyListenerC14494e = new ViewOnKeyListenerC14494e(this.ad, this.vip, this.appmetrica, this.license, this.metrica);
            }
            viewOnKeyListenerC14494e.advert(this.vip);
            viewOnKeyListenerC14494e.subscription(this.mopub);
            viewOnKeyListenerC14494e.amazon(this.appmetrica);
            viewOnKeyListenerC14494e.billing(this.yandex);
            viewOnKeyListenerC14494e.loadAd(this.billing);
            viewOnKeyListenerC14494e.Signature(this.purchase);
            this.startapp = viewOnKeyListenerC14494e;
        }
        return this.startapp;
    }

    public final void license(int i, int i2, boolean z, boolean z2) {
        AbstractC7413e ad = ad();
        ad.remoteconfig(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.purchase, this.appmetrica.getLayoutDirection()) & 7) == 5) {
                i -= this.appmetrica.getWidth();
            }
            ad.admob(i);
            ad.pro(i2);
            int i3 = (int) ((this.ad.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            ad.f15178e = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        ad.purchase();
    }

    public void metrica() {
        this.startapp = null;
        PopupWindow.OnDismissListener onDismissListener = this.adcel;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final boolean vip() {
        AbstractC7413e abstractC7413e = this.startapp;
        return abstractC7413e != null && abstractC7413e.ad();
    }
}
