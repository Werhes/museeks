package defpackage;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؔۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3034e extends MetricAffectingSpan {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f7100e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f7101e;

    public /* synthetic */ C3034e(int i, Object obj) {
        this.f7101e = i;
        this.f7100e = obj;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f7101e) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.f7100e);
                return;
            default:
                textPaint.setTypeface((Typeface) this.f7100e);
                return;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f7101e) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.f7100e);
                return;
            default:
                textPaint.setTypeface((Typeface) this.f7100e);
                return;
        }
    }
}
