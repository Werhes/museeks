package defpackage;

import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$TransferCallback;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕؖؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3136e extends MediaRouter2$TransferCallback {
    public final /* synthetic */ C11631e ad;

    public C3136e(C11631e c11631e) {
        this.ad = c11631e;
    }

    public final void onStop(MediaRouter2.RoutingController routingController) {
        C11631e c11631e = this.ad;
        c11631e.f23344e = null;
        AbstractC13922e abstractC13922e = (AbstractC13922e) c11631e.f23343e.remove(routingController);
        if (abstractC13922e == null) {
            Log.w("MR2Provider", "onStop: No matching routeController found. routingController=" + routingController);
            return;
        }
        C14090e c14090e = (C14090e) c11631e.f23337e.f31681e;
        if (abstractC13922e != c14090e.appmetrica) {
            int i = C14090e.f27845class;
            return;
        }
        C6541e metrica = c14090e.metrica();
        if (c14090e.yandex() != metrica) {
            c14090e.advert(metrica, 2, true);
        }
    }

    public final void onTransfer(MediaRouter2.RoutingController routingController, MediaRouter2.RoutingController routingController2) {
        C11631e c11631e = this.ad;
        C6541e c6541e = null;
        c11631e.f23344e = null;
        c11631e.f23343e.remove(routingController);
        if (routingController2 == this.ad.f23345e.getSystemController()) {
            C14090e c14090e = (C14090e) this.ad.f23337e.f31681e;
            C6541e metrica = c14090e.metrica();
            if (c14090e.yandex() != metrica) {
                c14090e.advert(metrica, 3, true);
                return;
            }
            return;
        }
        List<MediaRoute2Info> selectedRoutes = routingController2.getSelectedRoutes();
        if (selectedRoutes.isEmpty()) {
            Log.w("MR2Provider", "Selected routes are empty. This shouldn't happen.");
            return;
        }
        String id = C7815e.vip(selectedRoutes.get(0)).getId();
        this.ad.f23343e.put(routingController2, new C16899e(this.ad, routingController2, id));
        C14090e c14090e2 = (C14090e) this.ad.f23337e.f31681e;
        Iterator it = c14090e2.startapp.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C6541e c6541e2 = (C6541e) it.next();
            if (c6541e2.metrica() == c14090e2.subscription && TextUtils.equals(id, c6541e2.vip)) {
                c6541e = c6541e2;
                break;
            }
        }
        if (c6541e == null) {
            Log.w("AxMediaRouter", "onSelectRoute: The target RouteInfo is not found for descriptorId=" + id);
        } else {
            c14090e2.advert(c6541e, 3, true);
        }
        this.ad.advert(routingController2);
    }

    public final void onTransferFailure(MediaRoute2Info mediaRoute2Info) {
        this.ad.f23344e = null;
        Log.w("MR2Provider", "Transfer failed. requestedRoute=" + mediaRoute2Info);
    }
}
