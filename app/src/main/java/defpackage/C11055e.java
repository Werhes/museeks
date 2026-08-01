package defpackage;

import android.text.TextPaint;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُ٘ؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11055e extends AbstractC1798e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final TextPaint f21929e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final CharSequence f21930e;

    public C11055e(CharSequence charSequence, TextPaint textPaint) {
        this.f21930e = charSequence;
        this.f21929e = textPaint;
    }

    @Override // defpackage.AbstractC1798e
    public final int amazon(int i) {
        CharSequence charSequence = this.f21930e;
        return this.f21929e.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
    }

    @Override // defpackage.AbstractC1798e
    public final int mopub(int i) {
        CharSequence charSequence = this.f21930e;
        return this.f21929e.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
    }
}
