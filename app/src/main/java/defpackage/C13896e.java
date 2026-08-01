package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٓ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13896e extends CharacterStyle {
    public final int ad;
    public final float license;
    public final float metrica;
    public final float vip;

    public C13896e(float f, float f2, float f3, int i) {
        this.ad = i;
        this.vip = f;
        this.metrica = f2;
        this.license = f3;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.license, this.vip, this.metrica, this.ad);
    }
}
