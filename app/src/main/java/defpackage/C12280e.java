package defpackage;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؗٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12280e {
    public static final String ad = C5401e.crashlytics("WorkerFactory");

    public static ListenableWorker ad(Context context, String str, WorkerParameters workerParameters) {
        Class cls;
        String str2 = ad;
        ListenableWorker listenableWorker = null;
        try {
            cls = Class.forName(str).asSubclass(ListenableWorker.class);
        } catch (Throwable th) {
            C5401e.loadAd().amazon(str2, AbstractC17861e.Signature("Invalid class: ", str), th);
            cls = null;
        }
        if (cls != null) {
            try {
                listenableWorker = (ListenableWorker) cls.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
            } catch (Throwable th2) {
                C5401e.loadAd().amazon(str2, AbstractC17861e.Signature("Could not instantiate ", str), th2);
            }
        }
        if (listenableWorker == null || !listenableWorker.f604e) {
            return listenableWorker;
        }
        throw new IllegalStateException(AbstractC17861e.subscription("WorkerFactory (", C12280e.class.getName(), ") returned an instance of a ListenableWorker (", str, ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker."));
    }
}
