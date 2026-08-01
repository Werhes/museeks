package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍُؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10738e extends AbstractC18292e {
    public final /* synthetic */ TextPaint appmetrica;
    public final /* synthetic */ C4026e billing;
    public final /* synthetic */ Context license;
    public final /* synthetic */ AbstractC18292e purchase;

    public C10738e(C4026e c4026e, Context context, TextPaint textPaint, AbstractC18292e abstractC18292e) {
        super(5);
        this.billing = c4026e;
        this.license = context;
        this.appmetrica = textPaint;
        this.purchase = abstractC18292e;
    }

    @Override // defpackage.AbstractC18292e
    public final void billing(Typeface typeface, boolean z) {
        this.billing.billing(this.license, this.appmetrica, typeface);
        this.purchase.billing(typeface, z);
    }

    @Override // defpackage.AbstractC18292e
    public final void purchase(int i) {
        this.purchase.purchase(i);
    }
}
