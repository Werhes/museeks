package defpackage;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۧؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15859e implements InputFilter {
    public final TextView ad;
    public RunnableC11411e vip;

    public C15859e(TextView textView) {
        this.ad = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        TextView textView = this.ad;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int metrica = C5188e.ad().metrica();
        if (metrica != 0) {
            if (metrica == 1) {
                if ((i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i != 0 || i2 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return C5188e.ad().billing(0, charSequence.length(), 0, charSequence);
            }
            if (metrica != 3) {
                return charSequence;
            }
        }
        C5188e ad = C5188e.ad();
        if (this.vip == null) {
            this.vip = new RunnableC11411e(textView, this);
        }
        ad.yandex(this.vip);
        return charSequence;
    }
}
