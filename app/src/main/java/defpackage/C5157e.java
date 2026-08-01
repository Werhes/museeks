package defpackage;

import java.util.Iterator;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۛٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5157e implements AutoCloseable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f11043e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Object f11045e = new Object();

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C12718e f11044e = new C12718e();

    public final void ad() {
        synchronized (this.f11045e) {
            try {
                if (this.f11043e) {
                    return;
                }
                Iterator it = this.f11044e.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f11045e) {
            if (this.f11043e) {
                return;
            }
            this.f11043e = true;
            Unit unit = Unit.INSTANCE;
            Iterator<E> it = this.f11044e.iterator();
            if (it.hasNext()) {
                throw AbstractC5087e.m1747goto(it);
            }
            this.f11044e.clear();
        }
    }
}
