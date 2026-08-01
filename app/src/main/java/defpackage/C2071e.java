package defpackage;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓۚؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2071e {
    public final TextView ad;
    public final C2362e vip;

    public C2071e(TextView textView) {
        this.ad = textView;
        this.vip = new C2362e(textView);
    }

    public final InputFilter[] ad(InputFilter[] inputFilterArr) {
        return ((AbstractC15946e) this.vip.f5914e).purchase(inputFilterArr);
    }

    public final void license(boolean z) {
        ((AbstractC15946e) this.vip.f5914e).startapp(z);
    }

    public final void metrica(boolean z) {
        ((AbstractC15946e) this.vip.f5914e).yandex(z);
    }

    public final void vip(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.ad.getContext().obtainStyledAttributes(attributeSet, AbstractC6062e.startapp, i, 0);
        try {
            boolean z = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            license(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
