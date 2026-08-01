package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؚٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC7077e implements Runnable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ ServiceConnectionC15550e f14528e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f14529e;

    public /* synthetic */ RunnableC7077e(ServiceConnectionC15550e serviceConnectionC15550e, int i) {
        this.f14529e = i;
        this.f14528e = serviceConnectionC15550e;
    }

    private final void ad() {
        ServiceConnectionC15550e serviceConnectionC15550e = this.f14528e;
        synchronized (serviceConnectionC15550e) {
            if (serviceConnectionC15550e.f30705e == 1) {
                serviceConnectionC15550e.ad("Timed out while binding");
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14529e) {
            case 0:
                break;
            case 1:
                ad();
                return;
            default:
                this.f14528e.ad("Service disconnected");
                return;
        }
        while (true) {
            ServiceConnectionC15550e serviceConnectionC15550e = this.f14528e;
            synchronized (serviceConnectionC15550e) {
                try {
                    if (serviceConnectionC15550e.f30705e != 2) {
                        return;
                    }
                    if (serviceConnectionC15550e.f30704e.isEmpty()) {
                        serviceConnectionC15550e.metrica();
                        return;
                    }
                    C2680e c2680e = (C2680e) serviceConnectionC15550e.f30704e.poll();
                    serviceConnectionC15550e.f30701e.put(c2680e.ad, c2680e);
                    ((ScheduledExecutorService) serviceConnectionC15550e.f30706e.f18967e).schedule(new RunnableC12554e(serviceConnectionC15550e, c2680e, 20), 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(c2680e)));
                    }
                    C9556e c9556e = serviceConnectionC15550e.f30706e;
                    Messenger messenger = serviceConnectionC15550e.f30703e;
                    int i = c2680e.metrica;
                    Context context = (Context) c9556e.f18968e;
                    Message obtain = Message.obtain();
                    obtain.what = i;
                    obtain.arg1 = c2680e.ad;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", c2680e.ad());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", c2680e.license);
                    obtain.setData(bundle);
                    try {
                        C9271e c9271e = serviceConnectionC15550e.f30702e;
                        Messenger messenger2 = (Messenger) c9271e.f18486e;
                        if (messenger2 != null) {
                            messenger2.send(obtain);
                        } else {
                            C3773e c3773e = (C3773e) c9271e.f18485e;
                            if (c3773e == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            Messenger messenger3 = c3773e.f8375e;
                            messenger3.getClass();
                            messenger3.send(obtain);
                        }
                    } catch (RemoteException e) {
                        serviceConnectionC15550e.ad(e.getMessage());
                    }
                } finally {
                }
            }
        }
    }
}
