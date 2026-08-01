package defpackage;

import android.media.MediaRouter;
import android.os.Bundle;
import android.view.Display;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۣؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12291e extends MediaRouter.Callback {
    public final C6779e ad;

    public C12291e(C6779e c6779e) {
        this.ad = c6779e;
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        C6779e c6779e = this.ad;
        if (c6779e.yandex(routeInfo)) {
            c6779e.subscription();
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int startapp;
        C6779e c6779e = this.ad;
        c6779e.getClass();
        if (C6779e.smaato(routeInfo) != null || (startapp = c6779e.startapp(routeInfo)) < 0) {
            return;
        }
        C0418e c0418e = (C0418e) c6779e.f13986e.get(startapp);
        C11106e c11106e = new C11106e(c0418e.vip, c6779e.advert(c0418e.ad));
        c6779e.amazon(c0418e, c11106e);
        c0418e.metrica = c11106e.signatures();
        c6779e.subscription();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteGrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup, int i) {
        this.ad.getClass();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRoutePresentationDisplayChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        C6779e c6779e = this.ad;
        int startapp = c6779e.startapp(routeInfo);
        if (startapp >= 0) {
            C0418e c0418e = (C0418e) c6779e.f13986e.get(startapp);
            Display presentationDisplay = routeInfo.getPresentationDisplay();
            int displayId = presentationDisplay != null ? presentationDisplay.getDisplayId() : -1;
            if (displayId != c0418e.metrica.ad.getInt("presentationDisplayId", -1)) {
                C16289e c16289e = c0418e.metrica;
                new ArrayList();
                new ArrayList();
                new HashSet();
                if (c16289e == null) {
                    throw new IllegalArgumentException("descriptor must not be null");
                }
                Bundle bundle = new Bundle(c16289e.ad);
                ArrayList metrica = c16289e.metrica();
                ArrayList vip = c16289e.vip();
                HashSet ad = c16289e.ad();
                bundle.putInt("presentationDisplayId", displayId);
                bundle.putParcelableArrayList("controlFilters", new ArrayList<>(vip));
                bundle.putStringArrayList("groupMemberIds", new ArrayList<>(metrica));
                bundle.putStringArrayList("allowedPackages", new ArrayList<>(ad));
                c0418e.metrica = new C16289e(bundle);
                c6779e.subscription();
            }
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int startapp;
        C6779e c6779e = this.ad;
        c6779e.getClass();
        if (C6779e.smaato(routeInfo) != null || (startapp = c6779e.startapp(routeInfo)) < 0) {
            return;
        }
        c6779e.f13986e.remove(startapp);
        c6779e.subscription();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteSelected(MediaRouter mediaRouter, int i, MediaRouter.RouteInfo routeInfo) {
        C6541e c6541e;
        C6779e c6779e = this.ad;
        if (routeInfo != c6779e.f13983e.getSelectedRoute(8388611)) {
            return;
        }
        C8147e smaato = C6779e.smaato(routeInfo);
        if (smaato != null) {
            smaato.ad.advert(false);
            return;
        }
        int startapp = c6779e.startapp(routeInfo);
        if (startapp >= 0) {
            C0418e c0418e = (C0418e) c6779e.f13986e.get(startapp);
            C14090e c14090e = c6779e.f13990e;
            String str = c0418e.vip;
            c14090e.ad.removeMessages(262);
            C9701e license = c14090e.license(c14090e.remoteconfig);
            if (license != null) {
                Iterator it = license.vip.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        c6541e = null;
                        break;
                    } else {
                        c6541e = (C6541e) it.next();
                        if (c6541e.vip.equals(str)) {
                            break;
                        }
                    }
                }
                if (c6541e != null) {
                    c6541e.advert(false);
                }
            }
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteUngrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup) {
        this.ad.getClass();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteUnselected(MediaRouter mediaRouter, int i, MediaRouter.RouteInfo routeInfo) {
        this.ad.getClass();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteVolumeChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int startapp;
        C6779e c6779e = this.ad;
        c6779e.getClass();
        if (C6779e.smaato(routeInfo) != null || (startapp = c6779e.startapp(routeInfo)) < 0) {
            return;
        }
        C0418e c0418e = (C0418e) c6779e.f13986e.get(startapp);
        int volume = routeInfo.getVolume();
        if (volume != c0418e.metrica.ad.getInt("volume")) {
            C16289e c16289e = c0418e.metrica;
            new ArrayList();
            new ArrayList();
            new HashSet();
            if (c16289e == null) {
                throw new IllegalArgumentException("descriptor must not be null");
            }
            Bundle bundle = new Bundle(c16289e.ad);
            ArrayList metrica = c16289e.metrica();
            ArrayList vip = c16289e.vip();
            HashSet ad = c16289e.ad();
            bundle.putInt("volume", volume);
            bundle.putParcelableArrayList("controlFilters", new ArrayList<>(vip));
            bundle.putStringArrayList("groupMemberIds", new ArrayList<>(metrica));
            bundle.putStringArrayList("allowedPackages", new ArrayList<>(ad));
            c0418e.metrica = new C16289e(bundle);
            c6779e.subscription();
        }
    }
}
