package defpackage;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓ٘ۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14054e extends CharacterStyle implements UpdateAppearance {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final float f27794e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final AbstractC9876e f27796e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C0576e f27793e = AbstractC14533e.startapp(new C2108e(9205357640488583168L));

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C6656e f27795e = AbstractC14533e.purchase(new C5671e(3, this));

    public C14054e(AbstractC9876e abstractC9876e, float f) {
        this.f27796e = abstractC9876e;
        this.f27794e = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        AbstractC5729e.license(textPaint, this.f27794e);
        textPaint.setShader((Shader) this.f27795e.getValue());
    }
}
