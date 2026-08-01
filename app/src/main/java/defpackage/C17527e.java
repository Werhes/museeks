package defpackage;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ؔۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17527e implements IBinder.DeathRecipient {
    public final Messenger ad;
    public int billing;
    public final Messenger metrica;
    public int purchase;
    public final /* synthetic */ ServiceConnectionC12367e startapp;
    public final HandlerC15600e vip;
    public int license = 1;
    public int appmetrica = 1;
    public final SparseArray yandex = new SparseArray();

    public C17527e(ServiceConnectionC12367e serviceConnectionC12367e, Messenger messenger) {
        this.startapp = serviceConnectionC12367e;
        this.ad = messenger;
        HandlerC15600e handlerC15600e = new HandlerC15600e(this);
        this.vip = handlerC15600e;
        this.metrica = new Messenger(handlerC15600e);
    }

    public final void ad(int i) {
        int i2 = this.license;
        this.license = i2 + 1;
        vip(5, i2, i, null, null);
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.startapp.f24796e.post(new RunnableC3682e(this, 1));
    }

    public final void license(int i, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i2);
        int i3 = this.license;
        this.license = i3 + 1;
        vip(8, i3, i, null, bundle);
    }

    public final void metrica(int i, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i2);
        int i3 = this.license;
        this.license = i3 + 1;
        vip(7, i3, i, null, bundle);
    }

    public final boolean vip(int i, int i2, int i3, Bundle bundle, Bundle bundle2) {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.arg1 = i2;
        obtain.arg2 = i3;
        obtain.obj = bundle;
        obtain.setData(bundle2);
        obtain.replyTo = this.metrica;
        try {
            this.ad.send(obtain);
            return true;
        } catch (DeadObjectException unused) {
            return false;
        } catch (RemoteException e) {
            if (i == 2) {
                return false;
            }
            Log.e("MediaRouteProviderProxy", "Could not send message to service.", e);
            return false;
        }
    }
}
