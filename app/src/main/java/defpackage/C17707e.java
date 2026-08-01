package defpackage;

import android.util.Log;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٖ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17707e implements Thread.UncaughtExceptionHandler {
    public final C7850e ad;
    public final AtomicBoolean appmetrica = new AtomicBoolean(false);
    public final C12787e license;
    public final Thread.UncaughtExceptionHandler metrica;
    public final C4956e vip;

    public C17707e(C7850e c7850e, C4956e c4956e, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C12787e c12787e) {
        this.ad = c7850e;
        this.vip = c4956e;
        this.metrica = uncaughtExceptionHandler;
        this.license = c12787e;
    }

    public final boolean ad(Thread thread, Throwable th) {
        if (thread == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null thread", null);
            return false;
        }
        if (th == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null throwable", null);
            return false;
        }
        if (!this.license.vip()) {
            return true;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; native crash exists for session.", null);
        }
        return false;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.metrica;
        AtomicBoolean atomicBoolean = this.appmetrica;
        atomicBoolean.set(true);
        try {
            try {
                if (ad(thread, th)) {
                    this.ad.m2344throw(this.vip, thread, th);
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Uncaught exception will not be recorded by Crashlytics.", null);
                }
                if (uncaughtExceptionHandler != null) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Completed exception processing. Invoking default exception handler.", null);
                    }
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Completed exception processing, but no default exception handler.", null);
                    }
                    System.exit(1);
                }
                atomicBoolean.set(false);
            } catch (Exception e) {
                C5438e c5438e = C5438e.f11671e;
                if (c5438e.admob(6)) {
                    Log.e("FirebaseCrashlytics", "An error occurred in the uncaught exception handler", e);
                }
                if (uncaughtExceptionHandler != null) {
                    c5438e.subscription("Completed exception processing. Invoking default exception handler.");
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                } else {
                    c5438e.subscription("Completed exception processing, but no default exception handler.");
                    System.exit(1);
                }
                atomicBoolean.set(false);
            }
        } catch (Throwable th2) {
            if (uncaughtExceptionHandler != null) {
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Completed exception processing. Invoking default exception handler.", null);
                }
                uncaughtExceptionHandler.uncaughtException(thread, th);
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Completed exception processing, but no default exception handler.", null);
                }
                System.exit(1);
            }
            atomicBoolean.set(false);
            throw th2;
        }
    }
}
