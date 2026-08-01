package defpackage;

import android.net.Uri;
import android.view.View;
import ua.itaysonlab.catalogkit.objects.Catalog2ButtonAction;
import ua.itaysonlab.catalogkit.objects.banner.Catalog2Banner;
import ua.itaysonlab.catalogkit.objects.banner.Catalog2BannerClickActionRoot;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٗؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC16943e implements View.OnClickListener {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Catalog2Banner f33183e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f33184e;

    public /* synthetic */ ViewOnClickListenerC16943e(Catalog2Banner catalog2Banner, int i) {
        this.f33184e = i;
        this.f33183e = catalog2Banner;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Catalog2ButtonAction catalog2ButtonAction;
        Catalog2ButtonAction catalog2ButtonAction2;
        Catalog2ButtonAction catalog2ButtonAction3;
        switch (this.f33184e) {
            case 0:
                view.getContext();
                Catalog2BannerClickActionRoot catalog2BannerClickActionRoot = this.f33183e.vip;
                if (catalog2BannerClickActionRoot == null || (catalog2ButtonAction = catalog2BannerClickActionRoot.ad) == null || !(catalog2ButtonAction instanceof Catalog2ButtonAction.OpenUrl)) {
                    return;
                }
                C5658e.metrica(C5658e.ad, Uri.parse(((Catalog2ButtonAction.OpenUrl) catalog2ButtonAction).ad), false, 6);
                return;
            case 1:
                view.getContext();
                Catalog2BannerClickActionRoot catalog2BannerClickActionRoot2 = this.f33183e.vip;
                if (catalog2BannerClickActionRoot2 == null || (catalog2ButtonAction2 = catalog2BannerClickActionRoot2.ad) == null || !(catalog2ButtonAction2 instanceof Catalog2ButtonAction.OpenUrl)) {
                    return;
                }
                C5658e.metrica(C5658e.ad, Uri.parse(((Catalog2ButtonAction.OpenUrl) catalog2ButtonAction2).ad), false, 6);
                return;
            default:
                view.getContext();
                Catalog2BannerClickActionRoot catalog2BannerClickActionRoot3 = this.f33183e.vip;
                if (catalog2BannerClickActionRoot3 == null || (catalog2ButtonAction3 = catalog2BannerClickActionRoot3.ad) == null || !(catalog2ButtonAction3 instanceof Catalog2ButtonAction.OpenUrl)) {
                    return;
                }
                C5658e.metrica(C5658e.ad, Uri.parse(((Catalog2ButtonAction.OpenUrl) catalog2ButtonAction3).ad), false, 6);
                return;
        }
    }
}
