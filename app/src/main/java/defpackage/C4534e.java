package defpackage;

import android.media.MediaRouter2$RouteCallback;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۨؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4534e extends MediaRouter2$RouteCallback {
    public final /* synthetic */ int ad;
    public final /* synthetic */ C11631e vip;

    public /* synthetic */ C4534e(C11631e c11631e, int i) {
        this.ad = i;
        this.vip = c11631e;
    }

    public void onRoutesAdded(List list) {
        switch (this.ad) {
            case 0:
                this.vip.mopub();
                return;
            default:
                super.onRoutesAdded(list);
                return;
        }
    }

    public void onRoutesChanged(List list) {
        switch (this.ad) {
            case 0:
                this.vip.mopub();
                return;
            default:
                super.onRoutesChanged(list);
                return;
        }
    }

    public void onRoutesRemoved(List list) {
        switch (this.ad) {
            case 0:
                this.vip.mopub();
                return;
            default:
                super.onRoutesRemoved(list);
                return;
        }
    }

    public void onRoutesUpdated(List list) {
        switch (this.ad) {
            case 1:
                this.vip.mopub();
                return;
            default:
                super.onRoutesUpdated(list);
                return;
        }
    }
}
