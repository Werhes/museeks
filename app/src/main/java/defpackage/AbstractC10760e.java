package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.WeakHashMap;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؓۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC10760e extends ConstraintLayout {

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public int f21181e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public final RunnableC2783e f21182e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final C11252e f21183e;

    public AbstractC10760e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        C11252e c11252e = new C11252e();
        this.f21183e = c11252e;
        C7929e c7929e = new C7929e(0.5f);
        C4568e appmetrica = c11252e.f22618e.ad.appmetrica();
        appmetrica.appmetrica = c7929e;
        appmetrica.purchase = c7929e;
        appmetrica.billing = c7929e;
        appmetrica.yandex = c7929e;
        c11252e.setShapeAppearanceModel(appmetrica.ad());
        this.f21183e.advert(ColorStateList.valueOf(-1));
        C11252e c11252e2 = this.f21183e;
        WeakHashMap weakHashMap = AbstractC2016e.ad;
        setBackground(c11252e2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC11408e.subs, R.attr.materialClockStyle, 0);
        this.f21181e = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f21182e = new RunnableC2783e(27, this);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = AbstractC2016e.ad;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC2783e runnableC2783e = this.f21182e;
            handler.removeCallbacks(runnableC2783e);
            handler.post(runnableC2783e);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        smaato();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC2783e runnableC2783e = this.f21182e;
            handler.removeCallbacks(runnableC2783e);
            handler.post(runnableC2783e);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.f21183e.advert(ColorStateList.valueOf(i));
    }

    public abstract void smaato();
}
