package defpackage;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًُٜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7863e extends ClickableSpan {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final String f15914e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f15915e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public boolean f15916e;

    public C7863e(String str) {
        int ad = AbstractC15933e.ad(R.attr.global_accent);
        this.f15915e = AbstractC3898e.startapp(ad, 40);
        AbstractC3898e.startapp(ad, 60);
        this.f15914e = str;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        C5658e.metrica(C5658e.ad, Uri.parse(this.f15914e), false, 2);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        textPaint.bgColor = this.f15916e ? this.f15915e : 0;
    }
}
