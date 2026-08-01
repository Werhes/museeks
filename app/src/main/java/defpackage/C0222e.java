package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًَؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0222e {
    public boolean ad;
    public final Object appmetrica;
    public final AbstractCollection billing;
    public final Object license;
    public final Object metrica;
    public final Object purchase;
    public final Object startapp;
    public boolean vip;
    public final Object yandex;

    public C0222e(Context context, C14090e c14090e) {
        this.billing = new ArrayList();
        this.yandex = new C13264e(8, this);
        this.startapp = new RunnableC12991e(24, this);
        this.metrica = context;
        this.license = c14090e;
        this.appmetrica = new Handler();
        this.purchase = context.getPackageManager();
    }

    public C0222e(Looper looper, C17381e c17381e, InterfaceC14173e interfaceC14173e) {
        this(new CopyOnWriteArraySet(), looper, looper.getThread(), c17381e, interfaceC14173e, true);
    }

    public C0222e(Thread thread) {
        this(new CopyOnWriteArraySet(), null, thread, null, null, true);
    }

    public C0222e(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, Thread thread, C17381e c17381e, InterfaceC14173e interfaceC14173e, boolean z) {
        this.metrica = thread;
        this.purchase = copyOnWriteArraySet;
        this.appmetrica = interfaceC14173e;
        this.startapp = new Object();
        this.billing = new ArrayDeque();
        this.yandex = new ArrayDeque();
        if (looper == null || c17381e == null || interfaceC14173e == null) {
            this.license = null;
        } else {
            this.license = c17381e.ad(looper, new C3275e(0, this));
        }
        this.vip = z;
    }

    public void ad(Object obj) {
        obj.getClass();
        synchronized (this.startapp) {
            try {
                if (this.ad) {
                    return;
                }
                ((CopyOnWriteArraySet) this.purchase).add(new C12587e(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void appmetrica(InterfaceC8524e interfaceC8524e) {
        if (this.vip) {
            AbstractC2301e.subscription(Thread.currentThread() == ((Thread) this.metrica));
        }
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.purchase;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            C12587e c12587e = (C12587e) it.next();
            if (c12587e.ad.equals(interfaceC8524e)) {
                InterfaceC14173e interfaceC14173e = (InterfaceC14173e) this.appmetrica;
                c12587e.license = true;
                if (interfaceC14173e != null && c12587e.metrica) {
                    c12587e.metrica = false;
                    interfaceC14173e.adcel(c12587e.ad, c12587e.vip.appmetrica());
                }
                copyOnWriteArraySet.remove(c12587e);
            }
        }
    }

    public void billing(int i, InterfaceC12504e interfaceC12504e) {
        metrica(i, interfaceC12504e);
        vip();
    }

    public void license() {
        if (this.vip) {
            AbstractC2301e.subscription(Thread.currentThread() == ((Thread) this.metrica));
        }
        synchronized (this.startapp) {
            this.ad = true;
        }
        Iterator it = ((CopyOnWriteArraySet) this.purchase).iterator();
        while (it.hasNext()) {
            C12587e c12587e = (C12587e) it.next();
            InterfaceC14173e interfaceC14173e = (InterfaceC14173e) this.appmetrica;
            c12587e.license = true;
            if (interfaceC14173e != null && c12587e.metrica) {
                c12587e.metrica = false;
                interfaceC14173e.adcel(c12587e.ad, c12587e.vip.appmetrica());
            }
        }
        ((CopyOnWriteArraySet) this.purchase).clear();
    }

    public void metrica(int i, InterfaceC12504e interfaceC12504e) {
        if (this.vip) {
            AbstractC2301e.subscription(Thread.currentThread() == ((Thread) this.metrica));
        }
        ((ArrayDeque) this.yandex).add(new RunnableC16764e(new CopyOnWriteArraySet((CopyOnWriteArraySet) this.purchase), i, interfaceC12504e, 5));
    }

    public void purchase() {
        int i;
        C14090e c14090e = (C14090e) this.license;
        Context context = (Context) this.metrica;
        PackageManager packageManager = (PackageManager) this.purchase;
        ArrayList arrayList = (ArrayList) this.billing;
        if (this.vip) {
            ArrayList<ServiceInfo> arrayList2 = new ArrayList();
            if (Build.VERSION.SDK_INT >= 30) {
                Intent intent = new Intent("android.media.MediaRoute2ProviderService");
                ArrayList arrayList3 = new ArrayList();
                Iterator<ResolveInfo> it = packageManager.queryIntentServices(intent, 0).iterator();
                while (it.hasNext()) {
                    ServiceInfo serviceInfo = it.next().serviceInfo;
                    if (!this.ad || TextUtils.equals(context.getPackageName(), serviceInfo.packageName)) {
                        arrayList3.add(serviceInfo);
                    }
                }
                arrayList2 = arrayList3;
            }
            Iterator<ResolveInfo> it2 = packageManager.queryIntentServices(new Intent("android.media.MediaRouteProviderService"), 0).iterator();
            int i2 = 0;
            while (true) {
                boolean z = true;
                if (!it2.hasNext()) {
                    break;
                }
                ServiceInfo serviceInfo2 = it2.next().serviceInfo;
                if (serviceInfo2 != null) {
                    if ((C10085e.metrica == null ? false : C10085e.metrica().startapp()) && !arrayList2.isEmpty()) {
                        for (ServiceInfo serviceInfo3 : arrayList2) {
                            if (!serviceInfo2.packageName.equals(serviceInfo3.packageName) || !serviceInfo2.name.equals(serviceInfo3.name)) {
                            }
                        }
                    }
                    String str = serviceInfo2.packageName;
                    String str2 = serviceInfo2.name;
                    int size = arrayList.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            i3 = -1;
                            break;
                        }
                        ComponentName componentName = ((ServiceConnectionC12367e) arrayList.get(i3)).f24801e;
                        if (componentName.getPackageName().equals(str) && componentName.getClassName().equals(str2)) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    if (i3 < 0) {
                        ServiceConnectionC12367e serviceConnectionC12367e = new ServiceConnectionC12367e(context, new ComponentName(serviceInfo2.packageName, serviceInfo2.name));
                        serviceConnectionC12367e.f24799e = new C2007e(this, serviceConnectionC12367e);
                        if (!serviceConnectionC12367e.f24795e) {
                            serviceConnectionC12367e.f24795e = true;
                            serviceConnectionC12367e.advert();
                        }
                        i = i2 + 1;
                        arrayList.add(i2, serviceConnectionC12367e);
                        c14090e.ad(serviceConnectionC12367e, false);
                    } else if (i3 >= i2) {
                        ServiceConnectionC12367e serviceConnectionC12367e2 = (ServiceConnectionC12367e) arrayList.get(i3);
                        if (!serviceConnectionC12367e2.f24795e) {
                            serviceConnectionC12367e2.f24795e = true;
                            serviceConnectionC12367e2.advert();
                        }
                        if (serviceConnectionC12367e2.f24797e == null) {
                            if (!serviceConnectionC12367e2.f24795e || (serviceConnectionC12367e2.f18727e == null && serviceConnectionC12367e2.f24800e.isEmpty())) {
                                z = false;
                            }
                            if (z) {
                                serviceConnectionC12367e2.mopub();
                                serviceConnectionC12367e2.yandex();
                            }
                        }
                        i = i2 + 1;
                        Collections.swap(arrayList, i3, i2);
                    }
                    i2 = i;
                }
            }
            if (i2 < arrayList.size()) {
                for (int size2 = arrayList.size() - 1; size2 >= i2; size2--) {
                    ServiceConnectionC12367e serviceConnectionC12367e3 = (ServiceConnectionC12367e) arrayList.get(size2);
                    C9701e license = c14090e.license(serviceConnectionC12367e3);
                    if (license != null) {
                        serviceConnectionC12367e3.getClass();
                        C10085e.vip();
                        serviceConnectionC12367e3.f18731e = null;
                        serviceConnectionC12367e3.billing(null);
                        c14090e.loadAd(license, null);
                        c14090e.ad.vip(514, license);
                        c14090e.advert.remove(license);
                    }
                    arrayList.remove(serviceConnectionC12367e3);
                    serviceConnectionC12367e3.f24799e = null;
                    if (serviceConnectionC12367e3.f24795e) {
                        serviceConnectionC12367e3.f24795e = false;
                        serviceConnectionC12367e3.advert();
                    }
                }
            }
        }
    }

    public void vip() {
        C2399e c2399e = (C2399e) this.license;
        ArrayDeque arrayDeque = (ArrayDeque) this.billing;
        if (this.vip) {
            AbstractC2301e.subscription(Thread.currentThread() == ((Thread) this.metrica));
        }
        ArrayDeque arrayDeque2 = (ArrayDeque) this.yandex;
        if (arrayDeque2.isEmpty()) {
            return;
        }
        if (((InterfaceC14173e) this.appmetrica) != null) {
            c2399e.getClass();
            Handler handler = c2399e.ad;
            if (!handler.hasMessages(1)) {
                C12414e ad = c2399e.ad(1);
                Message message = ad.ad;
                message.getClass();
                handler.sendMessageAtFrontOfQueue(message);
                ad.ad();
            }
        }
        boolean isEmpty = arrayDeque.isEmpty();
        arrayDeque.addAll(arrayDeque2);
        arrayDeque2.clear();
        if (isEmpty) {
            while (!arrayDeque.isEmpty()) {
                ((Runnable) arrayDeque.peekFirst()).run();
                arrayDeque.removeFirst();
            }
        }
    }
}
