package defpackage;

import android.content.Context;
import androidx.work.ListenableWorker;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۧۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC12139e implements Runnable {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final String f24317e = C5401e.crashlytics("WorkForegroundRunnable");

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C13228e f24318e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C13394e f24319e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Context f24320e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final ListenableWorker f24321e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C6566e f24322e = new Object();

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C0912e f24323e;

    /* JADX WARN: Type inference failed for: r0v0, types: [eؙٟۢ, java.lang.Object] */
    public RunnableC12139e(Context context, C13394e c13394e, ListenableWorker listenableWorker, C13228e c13228e, C0912e c0912e) {
        this.f24320e = context;
        this.f24319e = c13394e;
        this.f24321e = listenableWorker;
        this.f24318e = c13228e;
        this.f24323e = c0912e;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [eؙٟۢ, eٍۡ, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f24319e.admob || AbstractC12711e.ad()) {
            this.f24322e.startapp(null);
            return;
        }
        ?? obj = new Object();
        C0912e c0912e = this.f24323e;
        ((ExecutorC3044e) c0912e.f3333e).execute(new RunnableC10927e(this, obj, 0));
        obj.ad(new RunnableC10927e(this, obj, 1), (ExecutorC3044e) c0912e.f3333e);
    }
}
