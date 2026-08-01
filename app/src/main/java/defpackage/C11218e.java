package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۘۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11218e extends CharacterStyle implements UpdateAppearance {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final AbstractC4970e f22478e;

    public C11218e(AbstractC4970e abstractC4970e) {
        this.f22478e = abstractC4970e;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            C6590e c6590e = C6590e.ad;
            AbstractC4970e abstractC4970e = this.f22478e;
            if (AbstractC7890e.billing(abstractC4970e, c6590e)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(abstractC4970e instanceof C13121e)) {
                throw new C14803e(10);
            }
            textPaint.setStyle(Paint.Style.STROKE);
            C13121e c13121e = (C13121e) abstractC4970e;
            textPaint.setStrokeWidth(c13121e.ad);
            textPaint.setStrokeMiter(c13121e.vip);
            int i = c13121e.license;
            textPaint.setStrokeJoin(i == 0 ? Paint.Join.MITER : i == 1 ? Paint.Join.ROUND : i == 2 ? Paint.Join.BEVEL : Paint.Join.MITER);
            int i2 = c13121e.metrica;
            textPaint.setStrokeCap(i2 == 0 ? Paint.Cap.BUTT : i2 == 1 ? Paint.Cap.ROUND : i2 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
            C1667e c1667e = c13121e.appmetrica;
            textPaint.setPathEffect(c1667e != null ? c1667e.ad : null);
        }
    }
}
