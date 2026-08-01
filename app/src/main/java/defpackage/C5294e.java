package defpackage;

import android.media.MediaRouter2;
import android.media.MediaRouter2$ControllerCallback;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۦۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5294e extends MediaRouter2$ControllerCallback {
    public final /* synthetic */ int ad;
    public final /* synthetic */ Object vip;

    public /* synthetic */ C5294e(int i, Object obj) {
        this.ad = i;
        this.vip = obj;
    }

    public final void onControllerUpdated(MediaRouter2.RoutingController routingController) {
        switch (this.ad) {
            case 0:
                C4546e c4546e = (C4546e) this.vip;
                c4546e.f9833e.m4432protected(Boolean.valueOf(C4546e.metrica(c4546e.f9834e)));
                return;
            default:
                ((C11631e) this.vip).advert(routingController);
                return;
        }
    }
}
