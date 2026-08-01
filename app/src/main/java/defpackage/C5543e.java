package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؘٟ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5543e extends AbstractC14437e {
    public final /* synthetic */ C16293e appmetrica;
    public final /* synthetic */ WeakReference license;
    public final /* synthetic */ int metrica;
    public final /* synthetic */ int vip;

    public C5543e(C16293e c16293e, int i, int i2, WeakReference weakReference) {
        this.appmetrica = c16293e;
        this.vip = i;
        this.metrica = i2;
        this.license = weakReference;
    }

    @Override // defpackage.AbstractC14437e
    public final void startapp(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.vip) != -1) {
            typeface = AbstractC0146e.ad(typeface, i, (this.metrica & 2) != 0);
        }
        C16293e c16293e = this.appmetrica;
        if (c16293e.smaato) {
            c16293e.advert = typeface;
            TextView textView = (TextView) this.license.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new RunnableC10028e(textView, typeface, c16293e.adcel, 0));
                } else {
                    textView.setTypeface(typeface, c16293e.adcel);
                }
            }
        }
    }

    @Override // defpackage.AbstractC14437e
    public final void yandex(int i) {
    }
}
