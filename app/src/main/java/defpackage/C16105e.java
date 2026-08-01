package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍَٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16105e implements InterfaceC3477e, Serializable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final AtomicReferenceFieldUpdater f31688e = AtomicReferenceFieldUpdater.newUpdater(C16105e.class, Object.class, "eؘٙؓ");

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public volatile Object f31689e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public volatile Function0 f31690e;

    @Override // defpackage.InterfaceC3477e
    public final boolean ad() {
        return this.f31689e != C15802e.f31127e;
    }

    @Override // defpackage.InterfaceC3477e
    public final Object getValue() {
        Object obj = this.f31689e;
        C15802e c15802e = C15802e.f31127e;
        if (obj != c15802e) {
            return obj;
        }
        Function0 function0 = this.f31690e;
        if (function0 != null) {
            Object invoke = function0.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31688e;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c15802e, invoke)) {
                if (atomicReferenceFieldUpdater.get(this) != c15802e) {
                }
            }
            this.f31690e = null;
            return invoke;
        }
        return this.f31689e;
    }

    public final String toString() {
        return ad() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
