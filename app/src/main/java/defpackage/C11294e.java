package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.loadAd;
import java.util.WeakHashMap;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًُ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11294e {
    public static final InterpolatorC9032e billing = new InterpolatorC9032e(0);
    public static final InterpolatorC9032e yandex = new InterpolatorC9032e(1);
    public final C5389e metrica;
    public int ad = -1;
    public int vip = 3;
    public int license = -1;
    public int appmetrica = -1;
    public int purchase = -1;

    public C11294e(C5389e c5389e) {
        this.metrica = c5389e;
    }

    public static int metrica(int i, int i2) {
        int i3;
        int i4 = i & 789516;
        if (i4 == 0) {
            return i;
        }
        int i5 = i & (~i4);
        if (i2 == 0) {
            i3 = i4 << 2;
        } else {
            int i6 = i4 << 1;
            i5 |= (-789517) & i6;
            i3 = (i6 & 789516) << 2;
        }
        return i5 | i3;
    }

    public static void purchase(RecyclerView recyclerView, loadAd loadad, float f, float f2, boolean z) {
        View view = loadad.ad;
        if (z && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
            WeakHashMap weakHashMap = AbstractC2016e.ad;
            Float valueOf = Float.valueOf(view.getElevation());
            int childCount = recyclerView.getChildCount();
            float f3 = 0.0f;
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (childAt != view) {
                    WeakHashMap weakHashMap2 = AbstractC2016e.ad;
                    float elevation = childAt.getElevation();
                    if (elevation > f3) {
                        f3 = elevation;
                    }
                }
            }
            view.setElevation(f3 + 1.0f);
            view.setTag(R.id.item_touch_helper_previous_elevation, valueOf);
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }

    public static int vip(int i, int i2) {
        int i3;
        int i4 = i & 3158064;
        if (i4 == 0) {
            return i;
        }
        int i5 = i & (~i4);
        if (i2 == 0) {
            i3 = i4 >> 2;
        } else {
            int i6 = i4 >> 1;
            i5 |= (-3158065) & i6;
            i3 = (i6 & 3158064) >> 2;
        }
        return i5 | i3;
    }

    public final void ad(loadAd loadad) {
        int i;
        View view = loadad.ad;
        Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
        if (tag instanceof Float) {
            float floatValue = ((Float) tag).floatValue();
            WeakHashMap weakHashMap = AbstractC2016e.ad;
            view.setElevation(floatValue);
        }
        view.setTag(R.id.item_touch_helper_previous_elevation, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        int i2 = this.appmetrica;
        if (i2 != -1 && (i = this.purchase) != -1 && i2 != i) {
            ((InterfaceC9392e) loadad.remoteconfig).ad(i);
        }
        this.license = -1;
        this.appmetrica = -1;
        this.purchase = -1;
    }

    public final int appmetrica(RecyclerView recyclerView, int i, int i2, long j) {
        if (this.ad == -1) {
            this.ad = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
        }
        int interpolation = (int) (billing.getInterpolation(j <= 2000 ? ((float) j) / 2000.0f : 1.0f) * ((int) (yandex.getInterpolation(Math.min(1.0f, (Math.abs(i2) * 1.0f) / i)) * ((int) Math.signum(i2)) * this.ad)));
        return interpolation == 0 ? i2 > 0 ? 1 : -1 : interpolation;
    }

    public final int license(loadAd loadad) {
        Object obj = loadad.remoteconfig;
        int i = 0;
        if ((obj instanceof InterfaceC9392e) && ((InterfaceC9392e) obj).metrica()) {
            i = this.vip;
        }
        return (i << 16) | i;
    }
}
