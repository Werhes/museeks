package defpackage;

import android.view.View;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔؗۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC2391e implements View.OnFocusChangeListener {
    public final /* synthetic */ int ad;
    public final /* synthetic */ AbstractC7483e vip;

    public /* synthetic */ ViewOnFocusChangeListenerC2391e(AbstractC7483e abstractC7483e, int i) {
        this.ad = i;
        this.vip = abstractC7483e;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.ad) {
            case 0:
                C15624e c15624e = (C15624e) this.vip;
                c15624e.remoteconfig(c15624e.pro());
                return;
            default:
                C12801e c12801e = (C12801e) this.vip;
                c12801e.advert = z;
                c12801e.Signature();
                if (z) {
                    return;
                }
                c12801e.remoteconfig(false);
                c12801e.smaato = false;
                return;
        }
    }
}
