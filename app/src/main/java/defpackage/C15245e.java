package defpackage;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؖۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15245e extends MetricAffectingSpan {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final float f30163e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f30164e;

    public /* synthetic */ C15245e(int i, float f) {
        this.f30164e = i;
        this.f30163e = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f30164e) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f30163e);
                return;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f30163e);
                return;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f30164e) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f30163e);
                return;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f30163e);
                return;
        }
    }
}
