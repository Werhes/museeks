package defpackage;

import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚ۟۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7489e implements InterfaceC4303e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public transient C16166e f15260e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public transient C11478e f15261e;

    public final Map ad() {
        C16166e c16166e = this.f15260e;
        if (c16166e != null) {
            return c16166e;
        }
        C6834e c6834e = (C6834e) this;
        C16166e c16166e2 = new C16166e(c6834e, c6834e.f14065e, 1);
        this.f15260e = c16166e2;
        return c16166e2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC4303e) {
            return ad().equals(((AbstractC7489e) ((InterfaceC4303e) obj)).ad());
        }
        return false;
    }

    public final int hashCode() {
        return ((C16166e) ad()).f31766e.hashCode();
    }

    public final String toString() {
        return ((C16166e) ad()).f31766e.toString();
    }

    public final Set vip() {
        C11478e c11478e = this.f15261e;
        if (c11478e != null) {
            return c11478e;
        }
        C6834e c6834e = (C6834e) this;
        C11478e c11478e2 = new C11478e(c6834e, c6834e.f14065e);
        this.f15261e = c11478e2;
        return c11478e2;
    }
}
