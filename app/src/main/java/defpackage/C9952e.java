package defpackage;

import android.media.MediaRouter;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۣۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9952e extends MediaRouter.VolumeCallback {
    public final C6779e ad;

    public C9952e(C6779e c6779e) {
        this.ad = c6779e;
    }

    @Override // android.media.MediaRouter.VolumeCallback
    public final void onVolumeSetRequest(MediaRouter.RouteInfo routeInfo, int i) {
        this.ad.getClass();
        C8147e smaato = C6779e.smaato(routeInfo);
        if (smaato != null) {
            smaato.ad.adcel(i);
        }
    }

    @Override // android.media.MediaRouter.VolumeCallback
    public final void onVolumeUpdateRequest(MediaRouter.RouteInfo routeInfo, int i) {
        this.ad.getClass();
        C8147e smaato = C6779e.smaato(routeInfo);
        if (smaato != null) {
            smaato.ad.mopub(i);
        }
    }
}
