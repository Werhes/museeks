package defpackage;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۚٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15707e {
    public final TextPaint ad;
    public final int license;
    public final int metrica;
    public final TextDirectionHeuristic vip;

    public C15707e(PrecomputedText.Params params) {
        this.ad = params.getTextPaint();
        this.vip = params.getTextDirection();
        this.metrica = params.getBreakStrategy();
        this.license = params.getHyphenationFrequency();
    }

    public C15707e(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
        }
        this.ad = textPaint;
        this.vip = textDirectionHeuristic;
        this.metrica = i;
        this.license = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C15707e)) {
            return false;
        }
        C15707e c15707e = (C15707e) obj;
        int i = c15707e.metrica;
        TextPaint textPaint = c15707e.ad;
        if (this.metrica != i || this.license != c15707e.license) {
            return false;
        }
        TextPaint textPaint2 = this.ad;
        if (textPaint2.getTextSize() != textPaint.getTextSize() || textPaint2.getTextScaleX() != textPaint.getTextScaleX() || textPaint2.getTextSkewX() != textPaint.getTextSkewX() || textPaint2.getLetterSpacing() != textPaint.getLetterSpacing() || !TextUtils.equals(textPaint2.getFontFeatureSettings(), textPaint.getFontFeatureSettings()) || textPaint2.getFlags() != textPaint.getFlags()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            if (!textPaint2.getTextLocales().equals(textPaint.getTextLocales())) {
                return false;
            }
        } else if (!textPaint2.getTextLocale().equals(textPaint.getTextLocale())) {
            return false;
        }
        if (textPaint2.getTypeface() == null) {
            if (textPaint.getTypeface() != null) {
                return false;
            }
        } else if (!textPaint2.getTypeface().equals(textPaint.getTypeface())) {
            return false;
        }
        return this.vip == c15707e.vip;
    }

    public final int hashCode() {
        int i = Build.VERSION.SDK_INT;
        TextDirectionHeuristic textDirectionHeuristic = this.vip;
        int i2 = this.license;
        int i3 = this.metrica;
        TextPaint textPaint = this.ad;
        return i >= 24 ? Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i3), Integer.valueOf(i2)) : Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocale(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i3), Integer.valueOf(i2));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.ad;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            sb.append(", textLocale=" + textPaint.getTextLocales());
        } else {
            sb.append(", textLocale=" + textPaint.getTextLocale());
        }
        sb.append(", typeface=" + textPaint.getTypeface());
        if (i >= 26) {
            sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
        }
        sb.append(", textDir=" + this.vip);
        sb.append(", breakStrategy=" + this.metrica);
        sb.append(", hyphenationFrequency=" + this.license);
        sb.append("}");
        return sb.toString();
    }
}
