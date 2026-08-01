package defpackage;

import j$.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؔۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC6903e implements Runnable {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final Object f14141e = new Object();

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final InterfaceC4868e f14144e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final AtomicReference f14145e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Executor f14146e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final AtomicBoolean f14143e = new AtomicBoolean(true);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Object f14142e = f14141e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f14148e = -1;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public boolean f14147e = false;

    public RunnableC6903e(AtomicReference atomicReference, Executor executor, InterfaceC4868e interfaceC4868e) {
        this.f14145e = atomicReference;
        this.f14146e = executor;
        this.f14144e = interfaceC4868e;
    }

    public final void ad(int i) {
        synchronized (this) {
            try {
                if (this.f14143e.get()) {
                    if (i <= this.f14148e) {
                        return;
                    }
                    this.f14148e = i;
                    if (this.f14147e) {
                        return;
                    }
                    this.f14147e = true;
                    try {
                        this.f14146e.execute(this);
                    } catch (Throwable unused) {
                        synchronized (this) {
                            this.f14147e = false;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this) {
            try {
                if (!this.f14143e.get()) {
                    this.f14147e = false;
                    return;
                }
                Object obj = this.f14145e.get();
                int i = this.f14148e;
                while (true) {
                    if (!Objects.equals(this.f14142e, obj)) {
                        this.f14142e = obj;
                        if (obj instanceof AbstractC4907e) {
                            this.f14144e.onError(null);
                        } else {
                            this.f14144e.ad(obj);
                        }
                    }
                    synchronized (this) {
                        try {
                            if (i == this.f14148e || !this.f14143e.get()) {
                                break;
                            }
                            obj = this.f14145e.get();
                            i = this.f14148e;
                        } finally {
                        }
                    }
                }
                this.f14147e = false;
            } finally {
            }
        }
    }
}
