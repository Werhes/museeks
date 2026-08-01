package defpackage;

import android.view.View;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؔٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ViewOnLayoutChangeListenerC2565e implements View.OnLayoutChangeListener {
    public final /* synthetic */ int ad;
    public final /* synthetic */ Object vip;

    public /* synthetic */ ViewOnLayoutChangeListenerC2565e(int i, Object obj) {
        this.ad = i;
        this.vip = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.ad) {
            case 0:
                throw null;
            case 1:
                ((AbstractC5004e) this.vip).f10591e.setSheetHeight(view.getHeight());
                view.removeOnLayoutChangeListener(this);
                return;
            default:
                view.removeOnLayoutChangeListener(this);
                ((C9412e) this.vip).license(0.0d);
                AbstractC5004e.f10579e.post(new RunnableC16165e(view, 0));
                return;
        }
    }
}
