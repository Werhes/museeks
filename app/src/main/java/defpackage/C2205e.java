package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜؓۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2205e extends ReplacementSpan {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public TextPaint f5594e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C17115e f5596e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Paint.FontMetricsInt f5598e = new Paint.FontMetricsInt();

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public short f5595e = -1;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public float f5597e = 1.0f;

    public C2205e(C17115e c17115e) {
        AbstractC4265e.billing(c17115e, "rasterizer cannot be null");
        this.f5596e = c17115e;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i2, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.f5594e;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.f5594e = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            characterStyle.updateDrawState(textPaint);
                        }
                    }
                }
            }
            if (paint instanceof TextPaint) {
                textPaint = (TextPaint) paint;
            }
        } else if (paint instanceof TextPaint) {
            textPaint = (TextPaint) paint;
        }
        TextPaint textPaint3 = textPaint;
        if (textPaint3 != null && textPaint3.bgColor != 0) {
            int color = textPaint3.getColor();
            Paint.Style style = textPaint3.getStyle();
            textPaint3.setColor(textPaint3.bgColor);
            textPaint3.setStyle(Paint.Style.FILL);
            canvas.drawRect(f, i3, f + this.f5595e, i5, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        C5188e.ad().getClass();
        float f2 = i4;
        Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        C17115e c17115e = this.f5596e;
        C11980e c11980e = c17115e.vip;
        Typeface typeface = (Typeface) c11980e.f23948e;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) c11980e.f23949e, c17115e.ad * 2, 2, f, f2, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f5598e;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        C17115e c17115e = this.f5596e;
        this.f5597e = abs / (c17115e.vip().ad(14) != 0 ? ((ByteBuffer) r8.f8352e).getShort(r1 + r8.f8353e) : (short) 0);
        C4751e vip = c17115e.vip();
        int ad = vip.ad(14);
        if (ad != 0) {
            ((ByteBuffer) vip.f8352e).getShort(ad + vip.f8353e);
        }
        short s = (short) ((c17115e.vip().ad(12) != 0 ? ((ByteBuffer) r5.f8352e).getShort(r7 + r5.f8353e) : (short) 0) * this.f5597e);
        this.f5595e = s;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s;
    }
}
