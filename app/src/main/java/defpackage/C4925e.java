package defpackage;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٖؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4925e {
    public C4026e billing;
    public float license;
    public float metrica;
    public final WeakReference purchase;
    public final TextPaint ad = new TextPaint(1);
    public final C14639e vip = new C14639e(1, this);
    public boolean appmetrica = true;

    public C4925e(InterfaceC6586e interfaceC6586e) {
        this.purchase = new WeakReference(null);
        this.purchase = new WeakReference(interfaceC6586e);
    }

    public final void ad(String str) {
        TextPaint textPaint = this.ad;
        this.metrica = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        this.license = str != null ? Math.abs(textPaint.getFontMetrics().ascent) : 0.0f;
        this.appmetrica = false;
    }

    public final void vip(C4026e c4026e, Context context) {
        if (this.billing != c4026e) {
            this.billing = c4026e;
            if (c4026e != null) {
                TextPaint textPaint = this.ad;
                C14639e c14639e = this.vip;
                c4026e.purchase(context, textPaint, c14639e);
                InterfaceC6586e interfaceC6586e = (InterfaceC6586e) this.purchase.get();
                if (interfaceC6586e != null) {
                    textPaint.drawableState = interfaceC6586e.getState();
                }
                c4026e.appmetrica(context, textPaint, c14639e);
                this.appmetrica = true;
            }
            InterfaceC6586e interfaceC6586e2 = (InterfaceC6586e) this.purchase.get();
            if (interfaceC6586e2 != null) {
                interfaceC6586e2.ad();
                interfaceC6586e2.onStateChange(interfaceC6586e2.getState());
            }
        }
    }
}
