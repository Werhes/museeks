package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔؐۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2290e implements InterfaceC6823e, Serializable {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Object f5794e;

    public C2290e(Object obj) {
        this.f5794e = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2290e) {
            return AbstractC13328e.metrica(this.f5794e, ((C2290e) obj).f5794e);
        }
        return false;
    }

    @Override // defpackage.InterfaceC6823e
    public final Object get() {
        return this.f5794e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5794e});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.f5794e + ")";
    }
}
