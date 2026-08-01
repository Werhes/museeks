package defpackage;

import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٗؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16899e extends AbstractC16709e {
    public final /* synthetic */ C11631e Signature;
    public final MediaRouter2.RoutingController billing;
    public C16289e loadAd;
    public final Handler mopub;
    public final String purchase;
    public final Messenger startapp;
    public final Messenger yandex;
    public final SparseArray adcel = new SparseArray();
    public final AtomicInteger advert = new AtomicInteger(1);
    public final RunnableC2783e smaato = new RunnableC2783e(18, this);
    public int amazon = -1;

    public C16899e(C11631e c11631e, MediaRouter2.RoutingController routingController, String str) {
        this.Signature = c11631e;
        this.billing = routingController;
        this.purchase = str;
        Messenger yandex = C11631e.yandex(routingController);
        this.yandex = yandex;
        this.startapp = yandex == null ? null : new Messenger(new HandlerC17797e(this));
        this.mopub = new Handler(Looper.getMainLooper());
    }

    public final String Signature() {
        C16289e c16289e = this.loadAd;
        return c16289e != null ? c16289e.license() : this.billing.getId();
    }

    public final void admob(int i, String str) {
        Messenger messenger;
        MediaRouter2.RoutingController routingController = this.billing;
        if (routingController == null || routingController.isReleased() || (messenger = this.yandex) == null) {
            return;
        }
        int andIncrement = this.advert.getAndIncrement();
        Message obtain = Message.obtain();
        obtain.what = 7;
        obtain.arg1 = andIncrement;
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i);
        bundle.putString("routeId", str);
        obtain.setData(bundle);
        obtain.replyTo = this.startapp;
        try {
            messenger.send(obtain);
        } catch (DeadObjectException unused) {
        } catch (RemoteException e) {
            Log.e("MR2Provider", "Could not send control request to service.", e);
        }
    }

    @Override // defpackage.AbstractC16709e
    public final void amazon(String str) {
        if (str == null || str.isEmpty()) {
            Log.w("MR2Provider", "onRemoveMemberRoute: Ignoring null or empty routeId.");
            return;
        }
        MediaRoute2Info startapp = this.Signature.startapp(str);
        if (startapp == null) {
            Log.w("MR2Provider", "onRemoveMemberRoute: Specified route not found. routeId=".concat(str));
        } else {
            this.billing.deselectRoute(startapp);
        }
    }

    @Override // defpackage.AbstractC13922e
    public final void license() {
        this.billing.release();
    }

    @Override // defpackage.AbstractC16709e
    public final void loadAd(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            Log.w("MR2Provider", "onUpdateMemberRoutes: Ignoring null or empty routeIds.");
            return;
        }
        String str = (String) arrayList.get(0);
        C11631e c11631e = this.Signature;
        MediaRoute2Info startapp = c11631e.startapp(str);
        if (startapp != null) {
            c11631e.f23345e.transferTo(startapp);
            return;
        }
        Log.w("MR2Provider", "onUpdateMemberRoutes: Specified route not found. routeId=" + str);
    }

    @Override // defpackage.AbstractC13922e
    public final void purchase(int i) {
        MediaRouter2.RoutingController routingController = this.billing;
        if (routingController == null) {
            return;
        }
        routingController.setVolume(i);
        this.amazon = i;
        Handler handler = this.mopub;
        RunnableC2783e runnableC2783e = this.smaato;
        handler.removeCallbacks(runnableC2783e);
        handler.postDelayed(runnableC2783e, 1000L);
    }

    @Override // defpackage.AbstractC16709e
    public final void smaato(String str) {
        if (str == null || str.isEmpty()) {
            Log.w("MR2Provider", "onAddMemberRoute: Ignoring null or empty routeId.");
            return;
        }
        MediaRoute2Info startapp = this.Signature.startapp(str);
        if (startapp == null) {
            Log.w("MR2Provider", "onAddMemberRoute: Specified route not found. routeId=".concat(str));
        } else {
            this.billing.selectRoute(startapp);
        }
    }

    @Override // defpackage.AbstractC13922e
    public final void startapp(int i) {
        MediaRouter2.RoutingController routingController = this.billing;
        if (routingController == null) {
            return;
        }
        int i2 = this.amazon;
        if (i2 < 0) {
            i2 = routingController.getVolume();
        }
        int max = Math.max(0, Math.min(i2 + i, this.billing.getVolumeMax()));
        this.amazon = max;
        this.billing.setVolume(max);
        Handler handler = this.mopub;
        RunnableC2783e runnableC2783e = this.smaato;
        handler.removeCallbacks(runnableC2783e);
        handler.postDelayed(runnableC2783e, 1000L);
    }

    public final void subscription(int i, String str) {
        Messenger messenger;
        MediaRouter2.RoutingController routingController = this.billing;
        if (routingController == null || routingController.isReleased() || (messenger = this.yandex) == null) {
            return;
        }
        int andIncrement = this.advert.getAndIncrement();
        Message obtain = Message.obtain();
        obtain.what = 8;
        obtain.arg1 = andIncrement;
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i);
        bundle.putString("routeId", str);
        obtain.setData(bundle);
        obtain.replyTo = this.startapp;
        try {
            messenger.send(obtain);
        } catch (DeadObjectException unused) {
        } catch (RemoteException e) {
            Log.e("MR2Provider", "Could not send control request to service.", e);
        }
    }
}
