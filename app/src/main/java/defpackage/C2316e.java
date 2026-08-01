package defpackage;

import android.content.Context;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔؑۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2316e {
    public static C2316e metrica;
    public static final Object vip = new Object();
    public C5306e ad;

    /* JADX WARN: Type inference failed for: r1v3, types: [eؔؑۧ, java.lang.Object] */
    public static C2316e license(Context context, Executor executor) {
        C2316e c2316e;
        synchronized (vip) {
            AbstractC9528e.mopub("MlKitContext is already initialized", metrica == null);
            ?? obj = new Object();
            metrica = obj;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList tapsense = new C17424e(context, new C0444e(MlKitComponentDiscoveryService.class), false, 10).tapsense();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            C8391e c8391e = InterfaceC7113e.adcel;
            arrayList.addAll(tapsense);
            arrayList2.add(C7259e.metrica(context, Context.class, new Class[0]));
            arrayList2.add(C7259e.metrica(obj, C2316e.class, new Class[0]));
            C5306e c5306e = new C5306e(executor, arrayList, arrayList2, c8391e);
            obj.ad = c5306e;
            c5306e.remoteconfig(true);
            c2316e = metrica;
        }
        return c2316e;
    }

    public static C2316e metrica() {
        C2316e c2316e;
        synchronized (vip) {
            AbstractC9528e.mopub("MlKitContext has not been initialized", metrica != null);
            c2316e = metrica;
            AbstractC9528e.startapp(c2316e);
        }
        return c2316e;
    }

    public final Object ad(Class cls) {
        AbstractC9528e.mopub("MlKitContext has been deleted", metrica == this);
        AbstractC9528e.startapp(this.ad);
        return this.ad.ad(cls);
    }

    public final Context vip() {
        return (Context) ad(Context.class);
    }
}
