package defpackage;

import android.net.Uri;
import android.view.View;
import ua.itaysonlab.catalogkit.objects.Catalog2Button;
import ua.itaysonlab.catalogkit.objects.Catalog2ButtonAction;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٟٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC11834e implements View.OnClickListener {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Catalog2Button f23739e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f23740e;

    public /* synthetic */ ViewOnClickListenerC11834e(Catalog2Button catalog2Button, int i) {
        this.f23740e = i;
        this.f23739e = catalog2Button;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f23740e) {
            case 0:
                view.getContext();
                Catalog2ButtonAction catalog2ButtonAction = this.f23739e.ad;
                if (catalog2ButtonAction instanceof Catalog2ButtonAction.OpenUrl) {
                    C5658e.metrica(C5658e.ad, Uri.parse(((Catalog2ButtonAction.OpenUrl) catalog2ButtonAction).ad), false, 6);
                    return;
                }
                return;
            default:
                C5658e.ad.vip(((Catalog2ButtonAction.OpenUrl) this.f23739e.ad).ad);
                return;
        }
    }
}
