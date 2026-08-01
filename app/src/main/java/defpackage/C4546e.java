package defpackage;

import android.content.Context;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$RouteCallback;
import android.media.RouteDiscoveryPreference;
import android.os.Looper;
import j$.util.Objects;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣؖۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4546e implements InterfaceC17490e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final RouteDiscoveryPreference f9830e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public C5294e f9831e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C9360e f9832e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public C17790e f9833e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public MediaRouter2 f9834e;

    static {
        C2171e c2171e = AbstractC17475e.f34223e;
        f9830e = new RouteDiscoveryPreference.Builder(C1410e.f4222e, false).build();
    }

    public static void ad(C4546e c4546e) {
        MediaRouter2 mediaRouter2 = c4546e.f9834e;
        mediaRouter2.getClass();
        C5294e c5294e = c4546e.f9831e;
        c5294e.getClass();
        mediaRouter2.unregisterControllerCallback(c5294e);
        c4546e.f9831e = null;
        MediaRouter2 mediaRouter22 = c4546e.f9834e;
        C9360e c9360e = c4546e.f9832e;
        c9360e.getClass();
        mediaRouter22.unregisterRouteCallback(c9360e);
    }

    public static boolean metrica(MediaRouter2 mediaRouter2) {
        mediaRouter2.getClass();
        int transferReason = mediaRouter2.getSystemController().getRoutingSessionInfo().getTransferReason();
        boolean wasTransferInitiatedBySelf = mediaRouter2.getSystemController().wasTransferInitiatedBySelf();
        Iterator<MediaRoute2Info> it = mediaRouter2.getSystemController().getSelectedRoutes().iterator();
        while (it.hasNext()) {
            int suitabilityStatus = C7815e.vip(it.next()).getSuitabilityStatus();
            if (suitabilityStatus == 1) {
                if (transferReason == 1 || transferReason == 2) {
                    if (wasTransferInitiatedBySelf) {
                        return true;
                    }
                }
            } else if (suitabilityStatus == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [eٍٍۖ, android.media.MediaRouter2$RouteCallback] */
    public static void vip(C4546e c4546e, Context context) {
        c4546e.f9833e.getClass();
        c4546e.f9834e = MediaRouter2.getInstance(context);
        c4546e.f9832e = new MediaRouter2$RouteCallback();
        C17790e c17790e = c4546e.f9833e;
        Objects.requireNonNull(c17790e);
        ExecutorC17160e executorC17160e = new ExecutorC17160e(1, c17790e);
        c4546e.f9834e.registerRouteCallback(executorC17160e, c4546e.f9832e, f9830e);
        C5294e c5294e = new C5294e(0, c4546e);
        c4546e.f9831e = c5294e;
        c4546e.f9834e.registerControllerCallback(executorC17160e, c5294e);
        c4546e.f9833e.m4432protected(Boolean.valueOf(metrica(c4546e.f9834e)));
    }

    @Override // defpackage.InterfaceC17490e
    public final void Signature(C6408e c6408e, Context context, Looper looper, Looper looper2, C17381e c17381e) {
        C17790e c17790e = new C17790e(Boolean.TRUE, looper2, looper, c17381e, new C15692e(c6408e, 1));
        this.f9833e = c17790e;
        c17790e.m4427extends(new RunnableC2623e(this, context, 2));
    }

    @Override // defpackage.InterfaceC17490e
    public final boolean advert() {
        C17790e c17790e = this.f9833e;
        if (c17790e == null) {
            return true;
        }
        return ((Boolean) c17790e.amazon()).booleanValue();
    }

    @Override // defpackage.InterfaceC17490e
    public final void billing() {
        C17790e c17790e = this.f9833e;
        c17790e.getClass();
        c17790e.m4427extends(new RunnableC17584e(26, this));
    }
}
