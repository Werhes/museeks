package defpackage;

import android.media.MediaRouter;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓ۟ۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14268e extends AbstractC13922e {
    public final MediaRouter.RouteInfo ad;

    public C14268e(MediaRouter.RouteInfo routeInfo) {
        this.ad = routeInfo;
    }

    @Override // defpackage.AbstractC13922e
    public final void purchase(int i) {
        this.ad.requestSetVolume(i);
    }

    @Override // defpackage.AbstractC13922e
    public final void startapp(int i) {
        this.ad.requestUpdateVolume(i);
    }
}
