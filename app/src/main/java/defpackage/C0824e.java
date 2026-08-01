package defpackage;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣؒؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0824e extends MetricAffectingSpan {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final float f3210e;

    public C0824e(float f) {
        this.f3210e = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.f3210e);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.f3210e);
    }
}
