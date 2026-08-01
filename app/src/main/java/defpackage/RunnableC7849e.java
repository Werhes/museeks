package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًَ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC7849e implements Runnable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f15891e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ BinderC12679e f15892e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f15893e;

    public /* synthetic */ RunnableC7849e(BinderC12679e binderC12679e, int i, int i2) {
        this.f15893e = i2;
        this.f15892e = binderC12679e;
        this.f15891e = i;
    }

    private final void ad() {
        Iterator it;
        int i = this.f15891e;
        BinderC12679e binderC12679e = this.f15892e;
        if (i == 0) {
            C4612e c4612e = binderC12679e.license;
            c4612e.f9941class = 3;
            c4612e.smaato = true;
            c4612e.amazon = true;
            synchronized (c4612e.firebase) {
                try {
                    Iterator it2 = c4612e.firebase.iterator();
                    while (it2.hasNext()) {
                        ((C10025e) it2.next()).ad();
                    }
                } finally {
                }
            }
            return;
        }
        C4612e c4612e2 = binderC12679e.license;
        c4612e2.f9941class = 1;
        synchronized (c4612e2.firebase) {
            try {
                it = c4612e2.firebase.iterator();
            } catch (RemoteException e) {
                C10078e.smaato.ad(e, "Unable to call %s on %s.", "onConnectionFailed", InterfaceC4112e.class.getSimpleName());
            } finally {
            }
            while (it.hasNext()) {
                InterfaceC4112e interfaceC4112e = ((C10025e) it.next()).ad.appmetrica;
                if (interfaceC4112e != null) {
                    C14758e c14758e = new C14758e(i, null, null);
                    C13560e c13560e = (C13560e) interfaceC4112e;
                    Parcel m4156e = c13560e.m4156e();
                    AbstractC3336e.vip(m4156e, c14758e);
                    c13560e.m4155e(m4156e, 3);
                }
            }
        }
        binderC12679e.license.startapp();
    }

    private final void vip() {
        C4612e c4612e = this.f15892e.license;
        c4612e.f9941class = 4;
        List list = c4612e.firebase;
        int i = this.f15891e;
        synchronized (list) {
            try {
                Iterator it = c4612e.firebase.iterator();
                while (it.hasNext()) {
                    InterfaceC4112e interfaceC4112e = ((C10025e) it.next()).ad.appmetrica;
                    if (interfaceC4112e != null) {
                        try {
                            C13560e c13560e = (C13560e) interfaceC4112e;
                            Parcel m4156e = c13560e.m4156e();
                            m4156e.writeInt(i);
                            c13560e.m4155e(m4156e, 2);
                        } catch (RemoteException e) {
                            C10078e.smaato.ad(e, "Unable to call %s on %s.", "onConnectionSuspended", InterfaceC4112e.class.getSimpleName());
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15893e) {
            case 0:
                ad();
                return;
            case 1:
                vip();
                return;
            case 2:
                this.f15892e.license.crashlytics.vip(this.f15891e);
                return;
            default:
                BinderC12679e binderC12679e = this.f15892e;
                C4612e c4612e = binderC12679e.license;
                c4612e.inmobi = -1;
                c4612e.isPro = -1;
                c4612e.pro = null;
                c4612e.signatures = null;
                c4612e.tapsense = 0.0d;
                c4612e.mopub();
                c4612e.isVip = false;
                c4612e.applovin = null;
                c4612e.f9941class = 1;
                List list = c4612e.firebase;
                int i = this.f15891e;
                synchronized (list) {
                    try {
                        Iterator it = c4612e.firebase.iterator();
                        while (it.hasNext()) {
                            InterfaceC4112e interfaceC4112e = ((C10025e) it.next()).ad.appmetrica;
                            if (interfaceC4112e != null) {
                                try {
                                    C14758e c14758e = new C14758e(i, null, null);
                                    C13560e c13560e = (C13560e) interfaceC4112e;
                                    Parcel m4156e = c13560e.m4156e();
                                    AbstractC3336e.vip(m4156e, c14758e);
                                    c13560e.m4155e(m4156e, 3);
                                } catch (RemoteException e) {
                                    C10078e.smaato.ad(e, "Unable to call %s on %s.", "onDisconnected", InterfaceC4112e.class.getSimpleName());
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                C4612e c4612e2 = binderC12679e.license;
                c4612e2.startapp();
                C9364e c9364e = (C9364e) c4612e2.license(c4612e2.mopub, "castDeviceControllerListenerKey").vip;
                AbstractC9528e.adcel(c9364e, "Key must not be null");
                c4612e2.metrica(c9364e, 8415);
                return;
        }
    }
}
