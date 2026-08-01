package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۙۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10504e extends View {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public boolean f20721e;

    public C10504e(Context context) {
        super(context);
        this.f20721e = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z) {
        this.f20721e = z;
    }

    public void setGuidelineBegin(int i) {
        C3579e c3579e = (C3579e) getLayoutParams();
        if (this.f20721e && c3579e.ad == i) {
            return;
        }
        c3579e.ad = i;
        setLayoutParams(c3579e);
    }

    public void setGuidelineEnd(int i) {
        C3579e c3579e = (C3579e) getLayoutParams();
        if (this.f20721e && c3579e.vip == i) {
            return;
        }
        c3579e.vip = i;
        setLayoutParams(c3579e);
    }

    public void setGuidelinePercent(float f) {
        C3579e c3579e = (C3579e) getLayoutParams();
        if (this.f20721e && c3579e.metrica == f) {
            return;
        }
        c3579e.metrica = f;
        setLayoutParams(c3579e);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
