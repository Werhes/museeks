package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Trace;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٜٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14679e {
    public final Context ad;
    public final CopyOnWriteArrayList adcel;
    public final AtomicBoolean appmetrica;
    public final C6491e billing;
    public final C5306e license;
    public final C18094e metrica;
    public final AtomicBoolean purchase;
    public final CopyOnWriteArrayList startapp;
    public final String vip;
    public final InterfaceC7970e yandex;
    public static final Object mopub = new Object();
    public static final C2271e advert = new C17519e(0);

    public C14679e(Context context, String str, C18094e c18094e) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.appmetrica = atomicBoolean;
        this.purchase = new AtomicBoolean();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.startapp = copyOnWriteArrayList;
        this.adcel = new CopyOnWriteArrayList();
        this.ad = context;
        AbstractC9528e.purchase(str);
        this.vip = str;
        this.metrica = c18094e;
        C7738e c7738e = FirebaseInitProvider.f1072e;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList tapsense = new C17424e(context, new C0444e(ComponentDiscoveryService.class), false, 10).tapsense();
        Trace.endSection();
        Trace.beginSection("Runtime");
        EnumC12154e enumC12154e = EnumC12154e.f24437e;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.addAll(tapsense);
        int i = 1;
        arrayList.add(new C10175e(i, new FirebaseCommonRegistrar()));
        arrayList.add(new C10175e(i, new ExecutorsRegistrar()));
        arrayList2.add(C7259e.metrica(context, Context.class, new Class[0]));
        arrayList2.add(C7259e.metrica(this, C14679e.class, new Class[0]));
        arrayList2.add(C7259e.metrica(c18094e, C18094e.class, new Class[0]));
        C5107e c5107e = new C5107e(25);
        if ((Build.VERSION.SDK_INT >= 24 ? AbstractC12026e.admob(context) : true) && FirebaseInitProvider.f1071e.get()) {
            arrayList2.add(C7259e.metrica(c7738e, C7738e.class, new Class[0]));
        }
        C5306e c5306e = new C5306e(enumC12154e, arrayList, arrayList2, c5107e);
        this.license = c5306e;
        Trace.endSection();
        this.billing = new C6491e(new C12412e(this, context, 2));
        this.yandex = c5306e.appmetrica(C18162e.class);
        C12158e c12158e = new C12158e(this);
        ad();
        if (atomicBoolean.get()) {
            ComponentCallbacks2C1517e.f4389e.f4393e.get();
        }
        copyOnWriteArrayList.add(c12158e);
        Trace.endSection();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [eّؐۘ, java.lang.Object] */
    public static C14679e billing(Context context, C18094e c18094e) {
        C14679e c14679e;
        AtomicReference atomicReference = C5580e.ad;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = C5580e.ad;
            if (atomicReference2.get() == null) {
                ?? obj = new Object();
                while (true) {
                    if (atomicReference2.compareAndSet(null, obj)) {
                        ComponentCallbacks2C1517e.vip(application);
                        ComponentCallbacks2C1517e.f4389e.ad(obj);
                        break;
                    }
                    if (atomicReference2.get() != null) {
                        break;
                    }
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (mopub) {
            C2271e c2271e = advert;
            AbstractC9528e.mopub("FirebaseApp name [DEFAULT] already exists!", !c2271e.containsKey("[DEFAULT]"));
            AbstractC9528e.adcel(context, "Application context cannot be null.");
            c14679e = new C14679e(context, "[DEFAULT]", c18094e);
            c2271e.put("[DEFAULT]", c14679e);
        }
        c14679e.appmetrica();
        return c14679e;
    }

    public static C14679e metrica() {
        C14679e c14679e;
        synchronized (mopub) {
            try {
                c14679e = (C14679e) advert.get("[DEFAULT]");
                if (c14679e == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + AbstractC17305e.tapsense() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((C18162e) c14679e.yandex.get()).metrica();
            } catch (Throwable th) {
                throw th;
            }
        }
        return c14679e;
    }

    public static C14679e purchase(Context context) {
        synchronized (mopub) {
            try {
                if (advert.containsKey("[DEFAULT]")) {
                    return metrica();
                }
                C18094e ad = C18094e.ad(context);
                if (ad == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return billing(context, ad);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void ad() {
        AbstractC9528e.mopub("FirebaseApp was deleted", !this.purchase.get());
    }

    public final void appmetrica() {
        int i = Build.VERSION.SDK_INT;
        Context context = this.ad;
        boolean admob = i >= 24 ? AbstractC12026e.admob(context) : true;
        String str = this.vip;
        if (admob) {
            StringBuilder sb = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
            ad();
            sb.append(str);
            Log.i("FirebaseApp", sb.toString());
            ad();
            this.license.remoteconfig("[DEFAULT]".equals(str));
            ((C18162e) this.yandex.get()).metrica();
            return;
        }
        StringBuilder sb2 = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
        ad();
        sb2.append(str);
        Log.i("FirebaseApp", sb2.toString());
        AtomicReference atomicReference = C12257e.vip;
        if (atomicReference.get() == null) {
            C12257e c12257e = new C12257e(context);
            while (!atomicReference.compareAndSet(null, c12257e)) {
                if (atomicReference.get() != null) {
                    return;
                }
            }
            context.registerReceiver(c12257e, new IntentFilter("android.intent.action.USER_UNLOCKED"));
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C14679e)) {
            return false;
        }
        C14679e c14679e = (C14679e) obj;
        c14679e.ad();
        return this.vip.equals(c14679e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode();
    }

    public final String license() {
        StringBuilder sb = new StringBuilder();
        ad();
        byte[] bytes = this.vip.getBytes(Charset.defaultCharset());
        sb.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb.append("+");
        ad();
        byte[] bytes2 = this.metrica.vip.getBytes(Charset.defaultCharset());
        sb.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
        return sb.toString();
    }

    public final String toString() {
        C11883e c11883e = new C11883e(5, this);
        c11883e.vip(this.vip, "name");
        c11883e.vip(this.metrica, "options");
        return c11883e.toString();
    }

    public final Object vip(Class cls) {
        ad();
        return this.license.ad(cls);
    }

    public final boolean yandex() {
        boolean z;
        ad();
        C0506e c0506e = (C0506e) this.billing.get();
        synchronized (c0506e) {
            z = c0506e.ad;
        }
        return z;
    }
}
