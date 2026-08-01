package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import j$.util.DesugarCollections;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٟٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8033e {
    public static volatile C8033e advert;
    public final Context ad;
    public final C4480e appmetrica;
    public final C7031e billing;
    public final C12487e license;
    public final C10604e metrica;
    public final BinderC15170e purchase;
    public final C12118e startapp;
    public final C14618e vip;
    public final C9149e yandex;
    public static final C18482e adcel = new C18482e("CastContext", null);
    public static final Object mopub = new Object();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [eٖ٘ؔ] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v4, types: [eٕۘ٘] */
    public C8033e(Context context, C12487e c12487e, List list, BinderC8922e binderC8922e, C4480e c4480e) {
        ?? r4;
        this.ad = context;
        this.license = c12487e;
        this.appmetrica = c4480e;
        this.billing = new C7031e(context);
        this.yandex = binderC8922e.yandex;
        C9699e c9699e = null;
        if (TextUtils.isEmpty(c12487e.f25017e)) {
            this.startapp = null;
        } else {
            this.startapp = new C12118e(context, c12487e, binderC8922e);
        }
        HashMap hashMap = new HashMap();
        C12118e c12118e = this.startapp;
        if (c12118e != null) {
            hashMap.put(c12118e.vip, c12118e.metrica);
        }
        int i = 1;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C12118e c12118e2 = (C12118e) it.next();
                AbstractC9528e.adcel(c12118e2, "Additional SessionProvider must not be null.");
                String str = c12118e2.vip;
                AbstractC9528e.billing(str, "Category for SessionProvider must not be null or empty string.");
                AbstractC9528e.metrica(!hashMap.containsKey(str), "SessionProvider for category " + str + " already added");
                hashMap.put(str, c12118e2.metrica);
            }
        }
        c12487e.f25012e = new C0669e(1);
        try {
            InterfaceC12362e ad = AbstractC5672e.ad(context, c12487e, binderC8922e, hashMap);
            try {
                C10232e c10232e = (C10232e) ad;
                Parcel m4154e = c10232e.m4154e(c10232e.m4156e(), 6);
                IBinder readStrongBinder = m4154e.readStrongBinder();
                if (readStrongBinder == null) {
                    r4 = 0;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IDiscoveryManager");
                    r4 = queryLocalInterface instanceof C15675e ? (C15675e) queryLocalInterface : new AbstractC16277e(readStrongBinder, "com.google.android.gms.cast.framework.IDiscoveryManager", 1);
                }
                m4154e.recycle();
                this.metrica = new C10604e(r4);
                try {
                    C10232e c10232e2 = (C10232e) ad;
                    Parcel m4154e2 = c10232e2.m4154e(c10232e2.m4156e(), 5);
                    IBinder readStrongBinder2 = m4154e2.readStrongBinder();
                    if (readStrongBinder2 != null) {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.cast.framework.ISessionManager");
                        c9699e = queryLocalInterface2 instanceof C9699e ? (C9699e) queryLocalInterface2 : new AbstractC16277e(readStrongBinder2, "com.google.android.gms.cast.framework.ISessionManager", 1);
                    }
                    m4154e2.recycle();
                    C14618e c14618e = new C14618e(c9699e, context);
                    this.vip = c14618e;
                    AbstractC9528e.billing("PrecacheManager", "The log tag cannot be null or empty.");
                    C9149e c9149e = this.yandex;
                    if (c9149e != null) {
                        c9149e.purchase = c14618e;
                        HandlerC9134e handlerC9134e = c9149e.metrica;
                        AbstractC9528e.startapp(handlerC9134e);
                        handlerC9134e.post(new RunnableC17664e(c9149e, 0));
                    }
                    ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(3);
                    C1126e c1126e = new C1126e(context, newFixedThreadPool instanceof InterfaceExecutorServiceC17461e ? (InterfaceExecutorServiceC17461e) newFixedThreadPool : newFixedThreadPool instanceof ScheduledExecutorService ? new ScheduledExecutorServiceC10910e((ScheduledExecutorService) newFixedThreadPool) : new C8013e(newFixedThreadPool));
                    AbstractC9528e.billing("BaseNetUtils", "The log tag cannot be null or empty.");
                    c1126e.ad();
                    BinderC15170e binderC15170e = new BinderC15170e();
                    this.purchase = binderC15170e;
                    try {
                        C10232e c10232e3 = (C10232e) ad;
                        Parcel m4156e = c10232e3.m4156e();
                        AbstractC3336e.metrica(m4156e, binderC15170e);
                        c10232e3.m4155e(m4156e, 3);
                        binderC15170e.appmetrica.add(this.billing.ad);
                        if (!DesugarCollections.unmodifiableList(c12487e.f25004e).isEmpty()) {
                            C18482e c18482e = adcel;
                            Log.i(c18482e.ad, c18482e.license("Setting Route Discovery for appIds: ".concat(String.valueOf(DesugarCollections.unmodifiableList(this.license.f25004e))), new Object[0]));
                            C7031e c7031e = this.billing;
                            List unmodifiableList = DesugarCollections.unmodifiableList(this.license.f25004e);
                            c7031e.getClass();
                            C18482e c18482e2 = C7031e.purchase;
                            int size = unmodifiableList.size();
                            StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 26);
                            sb.append("SetRouteDiscovery for ");
                            sb.append(size);
                            sb.append(" IDs");
                            c18482e2.vip(sb.toString(), new Object[0]);
                            LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
                            Iterator it2 = unmodifiableList.iterator();
                            while (it2.hasNext()) {
                                linkedHashSet.add(AbstractC18129e.billing((String) it2.next()));
                            }
                            Map map = c7031e.metrica;
                            c18482e2.vip("resetting routes. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(map.keySet())), new Object[0]);
                            HashMap hashMap2 = new HashMap();
                            synchronized (map) {
                                try {
                                    for (String str2 : linkedHashSet) {
                                        C15593e c15593e = (C15593e) map.get(AbstractC18129e.billing(str2));
                                        if (c15593e != null) {
                                            hashMap2.put(str2, c15593e);
                                        }
                                    }
                                    map.clear();
                                    map.putAll(hashMap2);
                                } finally {
                                }
                            }
                            c18482e2.vip("Routes reset. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(map.keySet())), new Object[0]);
                            LinkedHashSet linkedHashSet2 = c7031e.license;
                            synchronized (linkedHashSet2) {
                                linkedHashSet2.clear();
                                linkedHashSet2.addAll(linkedHashSet);
                            }
                            c7031e.Signature();
                        }
                        c4480e.yandex(new String[]{"com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", "com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE", "com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE", "com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_CLIENT_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_ANALYTICS_CONSENT_TIMEOUT_SECONDS"}).appmetrica(new C13951e(this));
                        C9321e ad2 = C0381e.ad();
                        ad2.ad = new C8879e(c4480e, new String[]{"com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES"}, i);
                        ad2.license = new C1032e[]{AbstractC18209e.appmetrica};
                        ad2.metrica = true;
                        ad2.vip = false;
                        ad2.appmetrica = 8427;
                        c4480e.appmetrica(0, ad2.ad()).appmetrica(new C16554e(this));
                    } catch (RemoteException e) {
                        throw new IllegalStateException("Failed to call addAppVisibilityListener", e);
                    }
                } catch (RemoteException e2) {
                    throw new IllegalStateException("Failed to call getSessionManagerImpl", e2);
                }
            } catch (RemoteException e3) {
                throw new IllegalStateException("Failed to call getDiscoveryManagerImpl", e3);
            }
        } catch (RemoteException e4) {
            throw new IllegalStateException("Failed to call newCastContextImpl", e4);
        }
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [eؚؗۘ, eؖۤۛ] */
    public static C8033e ad(Context context) {
        AbstractC9528e.appmetrica();
        if (advert == null) {
            synchronized (mopub) {
                if (advert == null) {
                    Context applicationContext = context.getApplicationContext();
                    InterfaceC17867e vip = vip(applicationContext);
                    C12487e castOptions = vip.getCastOptions(applicationContext);
                    ?? abstractC6950e = new AbstractC6950e(applicationContext, C4480e.amazon, InterfaceC12516e.ad, C16258e.metrica);
                    try {
                        advert = new C8033e(applicationContext, castOptions, vip.getAdditionalSessionProviders(applicationContext), new BinderC8922e(applicationContext, C10085e.license(applicationContext), castOptions, abstractC6950e), abstractC6950e);
                    } catch (C13373e e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        return advert;
    }

    public static InterfaceC17867e vip(Context context) {
        try {
            Bundle bundle = C5277e.ad(context).vip(128, context.getPackageName()).metaData;
            if (bundle == null) {
                adcel.metrica(new Object[0]);
            }
            String string = bundle.getString("com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME");
            if (string != null) {
                return (InterfaceC17867e) Class.forName(string).asSubclass(InterfaceC17867e.class).getDeclaredConstructor(null).newInstance(null);
            }
            throw new IllegalStateException("The fully qualified name of the implementation of OptionsProvider must be provided as a metadata in the AndroidManifest.xml with key com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME.");
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e) {
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        }
    }
}
