package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.bottomsheet.CustomBottomSheetBehavior;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۡؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6703e {
    public final AppActivity ad;
    public boolean appmetrica;
    public CustomBottomSheetBehavior license;
    public final C2038e metrica;
    public boolean purchase;
    public final C11109e vip = new C11109e(4, this);

    public C6703e(AppActivity appActivity) {
        this.ad = appActivity;
        this.metrica = new C2038e(appActivity);
    }

    public final void ad() {
        C7838e c7838e = VKXApplication.f36530e;
        if (c7838e == null) {
            c7838e = null;
        }
        if (c7838e.purchase()) {
            return;
        }
        AbstractC6232e.billing(C13454e.ad, AbstractC4608e.metrica(this.ad.vip()));
        CustomBottomSheetBehavior customBottomSheetBehavior = this.license;
        (customBottomSheetBehavior != null ? customBottomSheetBehavior : null).crashlytics(4);
    }

    public final void appmetrica(float f) {
        AppActivity appActivity = this.ad;
        if (appActivity.f36547e != null) {
            float floatValue = ((Number) AbstractC3062e.purchase(Float.valueOf(f), new C3721e(0.0f, 1.0f))).floatValue();
            float f2 = 1.0f - floatValue;
            ((View) appActivity.f36547e.f10518e).setAlpha(Math.min(floatValue, 0.85f));
            if (floatValue > 0.0f && ((View) appActivity.f36547e.f10518e).getVisibility() == 8) {
                ((View) appActivity.f36547e.f10518e).setClickable(true);
                ((View) appActivity.f36547e.f10518e).setFocusable(true);
                ((View) appActivity.f36547e.f10518e).setVisibility(0);
            }
            if (floatValue > 0.35f) {
                if (!this.purchase) {
                    AbstractC6232e.billing(new C15007e(false), AbstractC4608e.metrica(appActivity.vip()));
                    this.purchase = true;
                }
            } else if (this.purchase) {
                AbstractC6232e.billing(new C15007e(true), AbstractC4608e.metrica(appActivity.vip()));
                this.purchase = false;
            }
            if (floatValue > 0.98f) {
                if (!this.appmetrica) {
                    AbstractC6232e.billing(new C16686e(true), AbstractC4608e.metrica(appActivity.vip()));
                    this.appmetrica = true;
                }
            } else if (this.appmetrica) {
                AbstractC6232e.billing(new C16686e(false), AbstractC4608e.metrica(appActivity.vip()));
                this.appmetrica = false;
            }
            LinearLayout linearLayout = (LinearLayout) appActivity.f36547e.f10511e;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams();
            marginLayoutParams.bottomMargin = -Math.max(0, (int) (((LinearLayout) appActivity.f36547e.f10511e).getHeight() * floatValue));
            linearLayout.setLayoutParams(marginLayoutParams);
            C2038e c2038e = this.metrica;
            c2038e.amazon.startapp(f2);
            c2038e.loadAd.setValue(Boolean.valueOf(!(f2 == 0.0f)));
        }
    }

    public final void license(boolean z) {
        if (vip()) {
            CustomBottomSheetBehavior customBottomSheetBehavior = this.license;
            if (customBottomSheetBehavior == null) {
                customBottomSheetBehavior = null;
            }
            customBottomSheetBehavior.f783extends = !z;
        }
    }

    public final void metrica() {
        CustomBottomSheetBehavior customBottomSheetBehavior = this.license;
        if (customBottomSheetBehavior == null) {
            customBottomSheetBehavior = null;
        }
        customBottomSheetBehavior.premium(true);
        CustomBottomSheetBehavior customBottomSheetBehavior2 = this.license;
        (customBottomSheetBehavior2 != null ? customBottomSheetBehavior2 : null).crashlytics(5);
    }

    public final void purchase() {
        VKXApplication.Companion companion = VKXApplication.f36531e;
        C7838e c7838e = VKXApplication.f36530e;
        if (c7838e == null) {
            c7838e = null;
        }
        if (c7838e.purchase()) {
            return;
        }
        CustomBottomSheetBehavior customBottomSheetBehavior = this.license;
        (customBottomSheetBehavior != null ? customBottomSheetBehavior : null).crashlytics(3);
    }

    public final boolean vip() {
        return this.license != null;
    }
}
