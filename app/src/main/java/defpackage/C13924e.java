package defpackage;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٓٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13924e implements InterfaceC3477e, Serializable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f27629e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public Function0 f27630e;

    @Override // defpackage.InterfaceC3477e
    public final boolean ad() {
        return this.f27629e != C15802e.f31127e;
    }

    @Override // defpackage.InterfaceC3477e
    public final Object getValue() {
        if (this.f27629e == C15802e.f31127e) {
            this.f27629e = this.f27630e.invoke();
            this.f27630e = null;
        }
        return this.f27629e;
    }

    public final String toString() {
        return ad() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
