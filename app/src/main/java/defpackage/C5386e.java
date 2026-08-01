package defpackage;

import android.os.Build;
import android.text.BoringLayout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘِؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5386e {
    public final CharSequence ad;
    public boolean billing;
    public final int metrica;
    public BoringLayout.Metrics purchase;
    public final TextPaint vip;
    public CharSequence yandex;
    public float license = Float.NaN;
    public float appmetrica = Float.NaN;

    public C5386e(CharSequence charSequence, TextPaint textPaint, int i) {
        this.ad = charSequence;
        this.vip = textPaint;
        this.metrica = i;
    }

    public final BoringLayout.Metrics ad() {
        if (!this.billing) {
            TextDirectionHeuristic vip = AbstractC10080e.vip(this.metrica);
            int i = Build.VERSION.SDK_INT;
            CharSequence charSequence = this.ad;
            TextPaint textPaint = this.vip;
            this.purchase = i >= 33 ? AbstractC14380e.subscription(charSequence, textPaint, vip) : !vip.isRtl(charSequence, 0, charSequence.length()) ? BoringLayout.isBoring(charSequence, textPaint, null) : null;
            this.billing = true;
        }
        return this.purchase;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        if (defpackage.AbstractC2641e.license(r2, defpackage.C0824e.class) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        if (r3.getLetterSpacing() == 0.0f) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float metrica() {
        /*
            r6 = this;
            float r0 = r6.license
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lb
            float r0 = r6.license
            return r0
        Lb:
            android.text.BoringLayout$Metrics r0 = r6.ad()
            if (r0 == 0) goto L14
            int r0 = r0.width
            goto L15
        L14:
            r0 = -1
        L15:
            float r0 = (float) r0
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            android.text.TextPaint r3 = r6.vip
            if (r2 >= 0) goto L34
            java.lang.CharSequence r0 = r6.vip()
            int r0 = r0.length()
            java.lang.CharSequence r2 = r6.vip()
            r4 = 0
            float r0 = android.text.Layout.getDesiredWidth(r2, r4, r0, r3)
            double r4 = (double) r0
            double r4 = java.lang.Math.ceil(r4)
            float r0 = (float) r4
        L34:
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 != 0) goto L39
            goto L5d
        L39:
            java.lang.CharSequence r2 = r6.ad
            boolean r4 = r2 instanceof android.text.Spanned
            if (r4 == 0) goto L51
            android.text.Spanned r2 = (android.text.Spanned) r2
            java.lang.Class<eٓۙؔ> r4 = defpackage.C14199e.class
            boolean r4 = defpackage.AbstractC2641e.license(r2, r4)
            if (r4 != 0) goto L5a
            java.lang.Class<eۣؒؔ> r4 = defpackage.C0824e.class
            boolean r2 = defpackage.AbstractC2641e.license(r2, r4)
            if (r2 != 0) goto L5a
        L51:
            float r2 = r3.getLetterSpacing()
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 != 0) goto L5a
            goto L5d
        L5a:
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
        L5d:
            r6.license = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5386e.metrica():float");
    }

    public final CharSequence vip() {
        CharSequence charSequence = this.yandex;
        if (charSequence == null) {
            charSequence = this.ad;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (AbstractC2641e.license(spanned, CharacterStyle.class)) {
                    CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, charSequence.length(), CharacterStyle.class);
                    if (characterStyleArr != null && characterStyleArr.length != 0) {
                        SpannableString spannableString = null;
                        for (CharacterStyle characterStyle : characterStyleArr) {
                            if (!(characterStyle instanceof MetricAffectingSpan)) {
                                if (spannableString == null) {
                                    spannableString = new SpannableString(charSequence);
                                }
                                spannableString.removeSpan(characterStyle);
                            }
                        }
                        if (spannableString != null) {
                            charSequence = spannableString;
                        }
                    }
                }
            }
            this.yandex = charSequence;
        }
        return charSequence;
    }
}
