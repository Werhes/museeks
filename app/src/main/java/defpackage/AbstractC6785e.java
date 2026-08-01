package defpackage;

import android.accounts.Account;
import android.content.AttributionSource;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۦؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6785e {
    public static final C1032e[] applovin = new C1032e[0];
    public final InterfaceC3440e Signature;
    public C16850e adcel;
    public final InterfaceC5560e admob;
    public IInterface advert;
    public ServiceConnectionC8375e amazon;
    public final C14864e appmetrica;
    public final HandlerC3262e billing;
    public final Looper license;
    public final Context metrica;
    public InterfaceC8596e mopub;
    public volatile String pro;
    public final C17991e purchase;
    public final String remoteconfig;
    public volatile C5389e signatures;
    public final int subscription;
    public C1190e vip;
    public volatile String ad = null;
    public final Object yandex = new Object();
    public final Object startapp = new Object();
    public final ArrayList smaato = new ArrayList();
    public int loadAd = 1;
    public C14758e tapsense = null;
    public boolean isVip = false;
    public volatile C4295e inmobi = null;
    public final AtomicInteger isPro = new AtomicInteger(0);

    public AbstractC6785e(Context context, Looper looper, C14864e c14864e, C17991e c17991e, int i, InterfaceC3440e interfaceC3440e, InterfaceC5560e interfaceC5560e, String str) {
        AbstractC9528e.adcel(context, "Context must not be null");
        this.metrica = context;
        AbstractC9528e.adcel(looper, "Looper must not be null");
        this.license = looper;
        AbstractC9528e.adcel(c14864e, "Supervisor must not be null");
        this.appmetrica = c14864e;
        AbstractC9528e.adcel(c17991e, "API availability must not be null");
        this.purchase = c17991e;
        this.billing = new HandlerC3262e(this, looper);
        this.subscription = i;
        this.Signature = interfaceC3440e;
        this.admob = interfaceC5560e;
        this.remoteconfig = str;
    }

    public abstract String Signature();

    public boolean ad() {
        return true;
    }

    public Executor adcel() {
        return null;
    }

    public abstract String admob();

    public final /* synthetic */ boolean ads(int i, int i2, IInterface iInterface) {
        synchronized (this.yandex) {
            try {
                if (this.loadAd != i) {
                    return false;
                }
                subs(i2, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Bundle advert() {
        return new Bundle();
    }

    public Set amazon() {
        return Collections.EMPTY_SET;
    }

    public final String applovin() {
        String str = this.remoteconfig;
        return str == null ? this.metrica.getClass().getName() : str;
    }

    public abstract IInterface appmetrica(IBinder iBinder);

    public final void billing(String str) {
        this.ad = str;
        purchase();
    }

    public void inmobi(int i, IBinder iBinder, Bundle bundle, int i2) {
        C10393e c10393e = new C10393e(this, i, iBinder, bundle);
        HandlerC3262e handlerC3262e = this.billing;
        handlerC3262e.sendMessage(handlerC3262e.obtainMessage(1, i2, -1, c10393e));
    }

    public boolean isPro() {
        return this instanceof C6735e;
    }

    public void isVip(int i) {
        System.currentTimeMillis();
    }

    public final void license() {
        int metrica = this.purchase.metrica(this.metrica, vip());
        if (metrica == 0) {
            this.mopub = new C7988e(this);
            subs(2, null);
            return;
        }
        subs(1, null);
        this.mopub = new C7988e(this);
        int i = this.isPro.get();
        HandlerC3262e handlerC3262e = this.billing;
        handlerC3262e.sendMessage(handlerC3262e.obtainMessage(3, i, metrica, null));
    }

    public final IInterface loadAd() {
        IInterface iInterface;
        synchronized (this.yandex) {
            try {
                if (this.loadAd == 5) {
                    throw new DeadObjectException();
                }
                if (!remoteconfig()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                iInterface = this.advert;
                AbstractC9528e.adcel(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public boolean metrica() {
        return false;
    }

    public Bundle mopub() {
        return null;
    }

    public final /* synthetic */ void premium() {
        int i;
        int i2;
        synchronized (this.yandex) {
            i = this.loadAd;
        }
        if (i == 3) {
            this.isVip = true;
            i2 = 5;
        } else {
            i2 = 4;
        }
        HandlerC3262e handlerC3262e = this.billing;
        handlerC3262e.sendMessage(handlerC3262e.obtainMessage(i2, this.isPro.get(), 16));
    }

    public final boolean pro() {
        boolean z;
        synchronized (this.yandex) {
            int i = this.loadAd;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public void purchase() {
        this.isPro.incrementAndGet();
        ArrayList arrayList = this.smaato;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC1600e) arrayList.get(i)).license();
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.startapp) {
            this.adcel = null;
        }
        subs(1, null);
    }

    public final boolean remoteconfig() {
        boolean z;
        synchronized (this.yandex) {
            z = this.loadAd == 4;
        }
        return z;
    }

    public void signatures(IInterface iInterface) {
        System.currentTimeMillis();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void smaato(InterfaceC6840e interfaceC6840e, Set set) {
        String attributionTag;
        Bundle advert = advert();
        if (Build.VERSION.SDK_INT < 31) {
            attributionTag = this.pro;
        } else if (this.signatures == null) {
            attributionTag = this.pro;
        } else {
            AttributionSource attributionSource = (AttributionSource) this.signatures.f11540e;
            attributionTag = attributionSource == null ? this.pro : attributionSource.getAttributionTag() == null ? this.pro : attributionSource.getAttributionTag();
        }
        String str = attributionTag;
        int i = this.subscription;
        int i2 = C17991e.ad;
        Scope[] scopeArr = C12288e.f24641e;
        Bundle bundle = new Bundle();
        C1032e[] c1032eArr = C12288e.f24642e;
        C12288e c12288e = new C12288e(6, i, i2, null, null, scopeArr, bundle, null, c1032eArr, c1032eArr, true, 0, false, str);
        c12288e.f24652e = this.metrica.getPackageName();
        c12288e.f24655e = advert;
        if (set != null) {
            c12288e.f24656e = (Scope[]) set.toArray(new Scope[0]);
        }
        if (metrica()) {
            Account yandex = yandex();
            if (yandex == null) {
                yandex = new Account("<<default account>>", "com.google");
            }
            c12288e.f24650e = yandex;
            if (interfaceC6840e != 0) {
                c12288e.f24643e = ((AbstractC16277e) interfaceC6840e).license;
            }
        }
        c12288e.f24653e = applovin;
        c12288e.f24647e = startapp();
        if (isPro()) {
            c12288e.f24644e = true;
        }
        try {
            synchronized (this.startapp) {
                try {
                    C16850e c16850e = this.adcel;
                    if (c16850e != null) {
                        c16850e.adcel(new BinderC2906e(this, this.isPro.get()), c12288e);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i3 = this.isPro.get();
            HandlerC3262e handlerC3262e = this.billing;
            handlerC3262e.sendMessage(handlerC3262e.obtainMessage(6, i3, 3));
        } catch (RemoteException e2) {
            e = e2;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            inmobi(8, null, null, this.isPro.get());
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            e = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            inmobi(8, null, null, this.isPro.get());
        }
    }

    public C1032e[] startapp() {
        return applovin;
    }

    public final void subs(int i, IInterface iInterface) {
        C1190e c1190e;
        AbstractC9528e.vip((i == 4) == (iInterface != null));
        synchronized (this.yandex) {
            try {
                this.loadAd = i;
                this.advert = iInterface;
                Bundle bundle = null;
                if (i == 1) {
                    ServiceConnectionC8375e serviceConnectionC8375e = this.amazon;
                    if (serviceConnectionC8375e != null) {
                        C14864e c14864e = this.appmetrica;
                        String str = this.vip.metrica;
                        AbstractC9528e.startapp(str);
                        this.vip.getClass();
                        applovin();
                        c14864e.license(new C5605e(str, this.vip.vip), serviceConnectionC8375e);
                        this.amazon = null;
                    }
                } else if (i == 2 || i == 3) {
                    ServiceConnectionC8375e serviceConnectionC8375e2 = this.amazon;
                    if (serviceConnectionC8375e2 != null && (c1190e = this.vip) != null) {
                        String str2 = c1190e.metrica;
                        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 70 + "com.google.android.gms".length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(str2);
                        sb.append(" on com.google.android.gms");
                        Log.e("GmsClient", sb.toString());
                        C14864e c14864e2 = this.appmetrica;
                        String str3 = this.vip.metrica;
                        AbstractC9528e.startapp(str3);
                        this.vip.getClass();
                        applovin();
                        boolean z = this.vip.vip;
                        c14864e2.getClass();
                        c14864e2.license(new C5605e(str3, z), serviceConnectionC8375e2);
                        this.isPro.incrementAndGet();
                    }
                    ServiceConnectionC8375e serviceConnectionC8375e3 = new ServiceConnectionC8375e(this, this.isPro.get());
                    this.amazon = serviceConnectionC8375e3;
                    String admob = admob();
                    boolean subscription = subscription();
                    this.vip = new C1190e(admob, subscription, 2);
                    if (subscription && vip() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.vip.metrica)));
                    }
                    C14864e c14864e3 = this.appmetrica;
                    String str4 = this.vip.metrica;
                    AbstractC9528e.startapp(str4);
                    this.vip.getClass();
                    C14758e metrica = c14864e3.metrica(new C5605e(str4, this.vip.vip), serviceConnectionC8375e3, applovin(), adcel());
                    if (!(metrica.f29190e == 0)) {
                        String str5 = this.vip.metrica;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + 34 + "com.google.android.gms".length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(str5);
                        sb2.append(" on com.google.android.gms");
                        Log.w("GmsClient", sb2.toString());
                        int i2 = metrica.f29190e;
                        if (i2 == -1) {
                            i2 = 16;
                        }
                        if (metrica.f29189e != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", metrica.f29189e);
                        }
                        int i3 = this.isPro.get();
                        C16195e c16195e = new C16195e(this, i2, bundle);
                        HandlerC3262e handlerC3262e = this.billing;
                        handlerC3262e.sendMessage(handlerC3262e.obtainMessage(7, i3, -1, c16195e));
                    }
                } else if (i == 4) {
                    AbstractC9528e.startapp(iInterface);
                    signatures(iInterface);
                }
            } finally {
            }
        }
    }

    public boolean subscription() {
        return vip() >= 211700000;
    }

    public void tapsense(C14758e c14758e) {
        c14758e.getClass();
        System.currentTimeMillis();
    }

    public abstract int vip();

    public Account yandex() {
        return null;
    }
}
