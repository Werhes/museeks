package defpackage;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؒؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5363e implements InterfaceC3477e, Serializable {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public Function0 f11496e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public volatile Object f11495e = C15802e.f31127e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Object f11494e = this;

    public C5363e(Function0 function0) {
        this.f11496e = function0;
    }

    @Override // defpackage.InterfaceC3477e
    public final boolean ad() {
        return this.f11495e != C15802e.f31127e;
    }

    @Override // defpackage.InterfaceC3477e
    public final Object getValue() {
        Object obj;
        Object obj2 = this.f11495e;
        C15802e c15802e = C15802e.f31127e;
        if (obj2 != c15802e) {
            return obj2;
        }
        synchronized (this.f11494e) {
            obj = this.f11495e;
            if (obj == c15802e) {
                obj = this.f11496e.invoke();
                this.f11495e = obj;
                this.f11496e = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return ad() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
