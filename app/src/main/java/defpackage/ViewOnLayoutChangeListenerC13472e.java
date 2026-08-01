package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.bottomsheet.CustomBottomSheetBehavior;
import com.google.android.material.carousel.CarouselLayoutManager;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۙٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class ViewOnLayoutChangeListenerC13472e implements View.OnLayoutChangeListener {
    public final /* synthetic */ int ad;
    public final /* synthetic */ Object vip;

    public /* synthetic */ ViewOnLayoutChangeListenerC13472e(int i, Object obj) {
        this.ad = i;
        this.vip = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.ad;
        Object obj = this.vip;
        switch (i9) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) obj;
                if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
                    return;
                }
                view.post(new RunnableC17584e(16, carouselLayoutManager));
                return;
            case 1:
                C6703e c6703e = (C6703e) obj;
                CustomBottomSheetBehavior customBottomSheetBehavior = c6703e.license;
                if (customBottomSheetBehavior == null) {
                    customBottomSheetBehavior = null;
                }
                int height = ((LinearLayout) c6703e.ad.f36547e.f10511e).getHeight();
                VKXApplication.Companion companion = VKXApplication.f36531e;
                customBottomSheetBehavior.subs(VKXApplication.Companion.ad(61.0f) + height);
                return;
            default:
                C8356e c8356e = (C8356e) obj;
                c8356e.getClass();
                if (i3 - i == i7 - i5 && i4 - i2 == i8 - i6) {
                    return;
                }
                c8356e.vip();
                c8356e.ad(true);
                return;
        }
    }
}
