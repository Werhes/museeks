package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC3512e implements Runnable {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f7933e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f7934e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f7935e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f7936e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f7937e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ Object f7938e;

    public /* synthetic */ RunnableC3512e(C1729e c1729e, C0731e c0731e, C15816e c15816e, Callable callable, C8988e c8988e) {
        this.f7937e = 5;
        this.f7935e = c1729e;
        this.f7934e = c0731e;
        this.f7936e = c15816e;
        this.f7933e = callable;
        this.f7938e = c8988e;
    }

    public RunnableC3512e(C10640e c10640e, String str, String str2, C8019e c8019e, InterfaceC9026e interfaceC9026e) {
        this.f7937e = 4;
        this.f7934e = str;
        this.f7935e = str2;
        this.f7936e = c8019e;
        this.f7933e = interfaceC9026e;
        this.f7938e = c10640e;
    }

    public /* synthetic */ RunnableC3512e(BinderC14884e binderC14884e, C8019e c8019e, Bundle bundle, InterfaceC6486e interfaceC6486e, String str) {
        this.f7937e = 2;
        this.f7935e = binderC14884e;
        this.f7936e = c8019e;
        this.f7933e = bundle;
        this.f7938e = interfaceC6486e;
        this.f7934e = str;
    }

    public /* synthetic */ RunnableC3512e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f7937e = i;
        this.f7938e = obj;
        this.f7935e = obj2;
        this.f7934e = obj3;
        this.f7936e = obj4;
        this.f7933e = obj5;
    }

    private final void ad() {
        AtomicReference atomicReference;
        C10640e c10640e;
        InterfaceC8227e interfaceC8227e;
        AtomicReference atomicReference2 = (AtomicReference) this.f7935e;
        synchronized (atomicReference2) {
            try {
                try {
                    c10640e = (C10640e) this.f7938e;
                    interfaceC8227e = c10640e.f20961e;
                } catch (RemoteException e) {
                    C13879e c13879e = ((C6936e) ((C10640e) this.f7938e).f36443e).f14227e;
                    C6936e.yandex(c13879e);
                    c13879e.f27502e.license("(legacy) Failed to get conditional properties; remote exception", null, (String) this.f7934e, e);
                    ((AtomicReference) this.f7935e).set(Collections.EMPTY_LIST);
                    atomicReference = (AtomicReference) this.f7935e;
                }
                if (interfaceC8227e == null) {
                    C13879e c13879e2 = ((C6936e) c10640e.f36443e).f14227e;
                    C6936e.yandex(c13879e2);
                    c13879e2.f27502e.license("(legacy) Failed to get conditional properties; not connected to service", null, (String) this.f7934e, (String) this.f7936e);
                    atomicReference2.set(Collections.EMPTY_LIST);
                    atomicReference2.notify();
                    return;
                }
                if (TextUtils.isEmpty(null)) {
                    atomicReference2.set(interfaceC8227e.mo1659e((String) this.f7934e, (String) this.f7936e, (C8019e) this.f7933e));
                } else {
                    atomicReference2.set(interfaceC8227e.mo1660e(null, (String) this.f7934e, (String) this.f7936e));
                }
                c10640e.m2853e();
                atomicReference = (AtomicReference) this.f7935e;
                atomicReference.notify();
            } catch (Throwable th) {
                ((AtomicReference) this.f7935e).notify();
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ServiceC13230e serviceC13230e;
        C5240e c5240e;
        InterfaceC8227e interfaceC8227e;
        switch (this.f7937e) {
            case 0:
                String str = (String) this.f7934e;
                IBinder binder = ((Messenger) ((C9770e) this.f7935e).f19315e).getBinder();
                C12916e c12916e = (C12916e) this.f7938e;
                C17684e c17684e = (C17684e) ((ServiceC13230e) c12916e.f25784e).f26248e.get(binder);
                if (c17684e == null) {
                    AbstractC17861e.applovin("addSubscription for callback that isn't registered id=", str, "MBServiceCompat");
                    return;
                }
                HashMap hashMap = c17684e.purchase;
                ServiceC13230e serviceC13230e2 = (ServiceC13230e) c12916e.f25784e;
                IBinder iBinder = (IBinder) this.f7936e;
                Bundle bundle = (Bundle) this.f7933e;
                List<C15552e> list = (List) hashMap.get(str);
                if (list == null) {
                    list = new ArrayList();
                }
                for (C15552e c15552e : list) {
                    if (iBinder == c15552e.ad) {
                        Bundle bundle2 = (Bundle) c15552e.vip;
                        if (bundle == bundle2) {
                            return;
                        }
                        if (bundle == null) {
                            bundle2.getClass();
                            if (bundle2.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1) {
                                return;
                            }
                        } else if (bundle2 == null) {
                            if (bundle.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1) {
                                return;
                            }
                        } else if (bundle.getInt("android.media.browse.extra.PAGE", -1) == bundle2.getInt("android.media.browse.extra.PAGE", -1) && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1)) {
                            return;
                        }
                    }
                }
                list.add(new C15552e(iBinder, bundle));
                hashMap.put(str, list);
                serviceC13230e2.billing(str, c17684e, bundle, null);
                serviceC13230e2.f26259e = c17684e;
                C18424e vip = serviceC13230e2.vip();
                if (vip != null) {
                    if (!TextUtils.isEmpty(str)) {
                        serviceC13230e = serviceC13230e2;
                        AbstractC9413e.m2565strictfp(serviceC13230e2.f26249e.advert, new RunnableC6795e(serviceC13230e, vip, bundle, str, 5));
                        serviceC13230e.f26259e = null;
                        return;
                    }
                    AbstractC2803e.smaato("MLSLegacyStub", "onSubscribe(): Ignoring empty id from " + vip);
                }
                serviceC13230e = serviceC13230e2;
                serviceC13230e.f26259e = null;
                return;
            case 1:
                try {
                    if (!(((C6566e) this.f7935e).f36122e instanceof C12216e)) {
                        String uuid = ((UUID) this.f7934e).toString();
                        EnumC7300e advert = ((C13228e) this.f7938e).metrica.advert(uuid);
                        if (advert == null || advert.ad()) {
                            throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                        }
                        ((C9327e) ((C13228e) this.f7938e).vip).billing(uuid, (C8098e) this.f7936e);
                        ((Context) this.f7933e).startService(C17387e.vip((Context) this.f7933e, uuid, (C8098e) this.f7936e));
                    }
                    ((C6566e) this.f7935e).startapp(null);
                    return;
                } catch (Throwable th) {
                    ((C6566e) this.f7935e).adcel(th);
                    return;
                }
            case 2:
                BinderC14884e binderC14884e = (BinderC14884e) this.f7935e;
                C8019e c8019e = (C8019e) this.f7936e;
                Bundle bundle3 = (Bundle) this.f7933e;
                InterfaceC6486e interfaceC6486e = (InterfaceC6486e) this.f7938e;
                String str2 = (String) this.f7934e;
                C15398e c15398e = binderC14884e.metrica;
                c15398e.m3946default();
                try {
                    interfaceC6486e.mo2189e(c15398e.m3959private(bundle3, c8019e));
                    return;
                } catch (RemoteException e) {
                    c15398e.mo2261e().f27502e.metrica(str2, e, "Failed to return trigger URIs for app");
                    return;
                }
            case 3:
                ad();
                return;
            case 4:
                InterfaceC9026e interfaceC9026e = (InterfaceC9026e) this.f7933e;
                String str3 = (String) this.f7935e;
                String str4 = (String) this.f7934e;
                C10640e c10640e = (C10640e) this.f7938e;
                ArrayList arrayList = new ArrayList();
                try {
                    try {
                        interfaceC8227e = c10640e.f20961e;
                    } catch (RemoteException e2) {
                        C13879e c13879e = ((C6936e) c10640e.f36443e).f14227e;
                        C6936e.yandex(c13879e);
                        c13879e.f27502e.license("Failed to get conditional properties; remote exception", str4, str3, e2);
                    }
                    if (interfaceC8227e != null) {
                        arrayList = C5240e.m1783e(interfaceC8227e.mo1659e(str4, str3, (C8019e) this.f7936e));
                        c10640e.m2853e();
                        c5240e = ((C6936e) c10640e.f36443e).f14223e;
                        C6936e.purchase(c5240e);
                        c5240e.m1798e(interfaceC9026e, arrayList);
                        return;
                    }
                    C6936e c6936e = (C6936e) c10640e.f36443e;
                    C13879e c13879e2 = c6936e.f14227e;
                    C6936e.yandex(c13879e2);
                    c13879e2.f27502e.metrica(str4, str3, "Failed to get conditional properties; not connected to service");
                    c5240e = c6936e.f14223e;
                    C6936e.purchase(c5240e);
                    c5240e.m1798e(interfaceC9026e, arrayList);
                    return;
                } catch (Throwable th2) {
                    C5240e c5240e2 = ((C6936e) c10640e.f36443e).f14223e;
                    C6936e.purchase(c5240e2);
                    c5240e2.m1798e(interfaceC9026e, arrayList);
                    throw th2;
                }
            default:
                C1729e c1729e = (C1729e) this.f7935e;
                C0731e c0731e = (C0731e) this.f7934e;
                C15816e c15816e = (C15816e) this.f7936e;
                Callable callable = (Callable) this.f7933e;
                C8988e c8988e = (C8988e) this.f7938e;
                try {
                    if (((C0560e) c0731e.f3025e).mopub()) {
                        c15816e.pro();
                        return;
                    }
                    try {
                        if (!c1729e.metrica.get()) {
                            synchronized (c1729e) {
                                c1729e.startapp = c1729e.appmetrica.startapp();
                            }
                            c1729e.metrica.set(true);
                        }
                        if (((C0560e) c0731e.f3025e).mopub()) {
                            c15816e.pro();
                            return;
                        }
                        Object call = callable.call();
                        if (((C0560e) c0731e.f3025e).mopub()) {
                            c15816e.pro();
                            return;
                        } else {
                            c8988e.vip(call);
                            return;
                        }
                    } catch (RuntimeException e3) {
                        throw new C15745e("Internal error has occurred when executing ML Kit tasks", e3);
                    }
                } catch (Exception e4) {
                    if (((C0560e) c0731e.f3025e).mopub()) {
                        c15816e.pro();
                        return;
                    } else {
                        c8988e.ad(e4);
                        return;
                    }
                }
        }
    }
}
