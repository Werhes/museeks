package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۖ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14898e implements InterfaceC2268e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final boolean f29522e;

    public C14898e(Boolean bool) {
        this.f29522e = bool == null ? false : bool.booleanValue();
    }

    @Override // defpackage.InterfaceC2268e
    public final Iterator appmetrica() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C14898e) && this.f29522e == ((C14898e) obj).f29522e;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f29522e).hashCode();
    }

    @Override // defpackage.InterfaceC2268e
    public final InterfaceC2268e remoteconfig(String str, C11467e c11467e, ArrayList arrayList) {
        boolean equals = "toString".equals(str);
        boolean z = this.f29522e;
        if (equals) {
            return new C15547e(Boolean.toString(z));
        }
        throw new IllegalArgumentException(Boolean.toString(z) + "." + str + " is not a function.");
    }

    @Override // defpackage.InterfaceC2268e
    public final String startapp() {
        return Boolean.toString(this.f29522e);
    }

    @Override // defpackage.InterfaceC2268e
    public final Double subscription() {
        return Double.valueOf(true != this.f29522e ? 0.0d : 1.0d);
    }

    @Override // defpackage.InterfaceC2268e
    public final InterfaceC2268e tapsense() {
        return new C14898e(Boolean.valueOf(this.f29522e));
    }

    public final String toString() {
        return String.valueOf(this.f29522e);
    }

    @Override // defpackage.InterfaceC2268e
    public final Boolean yandex() {
        return Boolean.valueOf(this.f29522e);
    }
}
