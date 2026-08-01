package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.appmetrica;
import com.google.android.material.carousel.CarouselLayoutManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؑؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8413e extends appmetrica {
    public final /* synthetic */ int admob = 1;

    public /* synthetic */ C8413e(Context context) {
        super(context);
    }

    public C8413e(CarouselLayoutManager carouselLayoutManager, Context context) {
        super(context);
    }

    @Override // androidx.recyclerview.widget.appmetrica
    public float license(DisplayMetrics displayMetrics) {
        switch (this.admob) {
            case 1:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.license(displayMetrics);
        }
    }

    @Override // androidx.recyclerview.widget.appmetrica
    public int metrica(View view, int i) {
        switch (this.admob) {
            case 0:
                return 0;
            default:
                return super.metrica(view, i);
        }
    }

    @Override // androidx.recyclerview.widget.appmetrica
    public PointF purchase(int i) {
        switch (this.admob) {
            case 0:
                return null;
            default:
                return super.purchase(i);
        }
    }

    @Override // androidx.recyclerview.widget.appmetrica
    public int vip(View view, int i) {
        switch (this.admob) {
            case 0:
                return 0;
            default:
                return super.vip(view, i);
        }
    }
}
