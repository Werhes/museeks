package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؔٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8466e implements InterfaceC2268e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f17237e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC2268e f17238e;

    public C8466e(String str) {
        this.f17238e = InterfaceC2268e.f5755e;
        this.f17237e = str;
    }

    public C8466e(String str, InterfaceC2268e interfaceC2268e) {
        this.f17238e = interfaceC2268e;
        this.f17237e = str;
    }

    @Override // defpackage.InterfaceC2268e
    public final Iterator appmetrica() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8466e)) {
            return false;
        }
        C8466e c8466e = (C8466e) obj;
        return this.f17237e.equals(c8466e.f17237e) && this.f17238e.equals(c8466e.f17238e);
    }

    public final int hashCode() {
        return this.f17238e.hashCode() + (this.f17237e.hashCode() * 31);
    }

    @Override // defpackage.InterfaceC2268e
    public final InterfaceC2268e remoteconfig(String str, C11467e c11467e, ArrayList arrayList) {
        throw new IllegalStateException("Control does not have functions");
    }

    @Override // defpackage.InterfaceC2268e
    public final String startapp() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // defpackage.InterfaceC2268e
    public final Double subscription() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // defpackage.InterfaceC2268e
    public final InterfaceC2268e tapsense() {
        return new C8466e(this.f17237e, this.f17238e.tapsense());
    }

    @Override // defpackage.InterfaceC2268e
    public final Boolean yandex() {
        throw new IllegalStateException("Control is not a boolean");
    }
}
