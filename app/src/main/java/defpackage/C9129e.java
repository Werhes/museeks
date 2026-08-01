package defpackage;

import android.os.Looper;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۦۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9129e extends AbstractC15920e {
    public static final ExecutorC14279e advert = new ExecutorC14279e(0);
    public static volatile C9129e mopub;
    public final C11953e adcel = new C11953e();

    /* renamed from: class, reason: not valid java name */
    public static C9129e m2520class() {
        if (mopub != null) {
            return mopub;
        }
        synchronized (C9129e.class) {
            try {
                if (mopub == null) {
                    mopub = new C9129e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mopub;
    }

    /* renamed from: interface, reason: not valid java name */
    public final void m2521interface(Runnable runnable) {
        C11953e c11953e = this.adcel;
        if (c11953e.advert == null) {
            synchronized (c11953e.adcel) {
                try {
                    if (c11953e.advert == null) {
                        c11953e.advert = C11953e.m3288class(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        c11953e.advert.post(runnable);
    }
}
