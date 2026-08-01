package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٌؚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8557e extends ReplacementSpan {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f17380e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f17381e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public boolean f17382e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public Paint.FontMetricsInt f17383e;

    public final int ad() {
        if (!this.f17382e) {
            AbstractC5525e.vip("PlaceholderSpan is not laid out yet.");
        }
        return this.f17380e;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        this.f17382e = true;
        paint.getTextSize();
        Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
        this.f17383e = fontMetricsInt2;
        int i3 = (fontMetricsInt2 != null ? fontMetricsInt2 : null).descent;
        if (fontMetricsInt2 == null) {
            fontMetricsInt2 = null;
        }
        if (i3 <= fontMetricsInt2.ascent) {
            AbstractC5525e.ad("Invalid fontMetrics: line height can not be negative.");
        }
        this.f17381e = (int) Math.ceil(0.0f);
        this.f17380e = (int) Math.ceil(0.0f);
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f17383e;
            int i4 = (fontMetricsInt3 != null ? fontMetricsInt3 : null).ascent;
            fontMetricsInt.ascent = i4;
            fontMetricsInt.descent = (fontMetricsInt3 != null ? fontMetricsInt3 : null).descent;
            if (fontMetricsInt3 == null) {
                fontMetricsInt3 = null;
            }
            fontMetricsInt.leading = fontMetricsInt3.leading;
            if (i4 > (-ad())) {
                fontMetricsInt.ascent = -ad();
            }
            Paint.FontMetricsInt fontMetricsInt4 = this.f17383e;
            if (fontMetricsInt4 == null) {
                fontMetricsInt4 = null;
            }
            fontMetricsInt.top = Math.min(fontMetricsInt4.top, fontMetricsInt.ascent);
            Paint.FontMetricsInt fontMetricsInt5 = this.f17383e;
            fontMetricsInt.bottom = Math.max((fontMetricsInt5 != null ? fontMetricsInt5 : null).bottom, fontMetricsInt.descent);
        }
        return vip();
    }

    public final int vip() {
        if (!this.f17382e) {
            AbstractC5525e.vip("PlaceholderSpan is not laid out yet.");
        }
        return this.f17381e;
    }
}
