package defpackage;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٖؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC15931e extends AbstractC10766e {
    public final OnBackInvokedCallback appmetrica;
    public final int license;
    public final OnBackInvokedDispatcher metrica;
    public boolean purchase;

    public AbstractC15931e(OnBackInvokedDispatcher onBackInvokedDispatcher, int i) {
        this.metrica = onBackInvokedDispatcher;
        this.license = i;
        this.appmetrica = Build.VERSION.SDK_INT == 33 ? new C12609e(2, this) : new C8088e(this);
    }

    @Override // defpackage.AbstractC10766e
    public final void vip(boolean z) {
        if (z && !this.purchase) {
            this.metrica.registerOnBackInvokedCallback(this.license, this.appmetrica);
            this.purchase = true;
        } else {
            if (z || !this.purchase) {
                return;
            }
            this.metrica.unregisterOnBackInvokedCallback(this.appmetrica);
            this.purchase = false;
        }
    }
}
