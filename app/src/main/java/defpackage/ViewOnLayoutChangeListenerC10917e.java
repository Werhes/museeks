package defpackage;

import android.view.View;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًَُ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ViewOnLayoutChangeListenerC10917e implements View.OnLayoutChangeListener {
    public final /* synthetic */ int ad;
    public final /* synthetic */ Object metrica;
    public final /* synthetic */ View vip;

    public /* synthetic */ ViewOnLayoutChangeListenerC10917e(Object obj, View view, int i) {
        this.ad = i;
        this.metrica = obj;
        this.vip = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.ad) {
            case 0:
                View view2 = this.vip;
                if (view2.getVisibility() == 0) {
                    ((C13495e) this.metrica).license(view2);
                    return;
                }
                return;
            case 1:
                View view3 = this.vip;
                if (view3.getVisibility() == 0) {
                    ((C10937e) this.metrica).metrica(view3);
                    return;
                }
                return;
            default:
                ((C16200e) this.metrica).invoke();
                this.vip.removeOnLayoutChangeListener(this);
                return;
        }
    }
}
