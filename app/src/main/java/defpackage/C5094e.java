package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۖۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5094e implements InterfaceC2268e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final ArrayList f10934e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f10935e;

    public C5094e(String str, ArrayList arrayList) {
        this.f10935e = str;
        ArrayList arrayList2 = new ArrayList();
        this.f10934e = arrayList2;
        arrayList2.addAll(arrayList);
    }

    @Override // defpackage.InterfaceC2268e
    public final Iterator appmetrica() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5094e)) {
            return false;
        }
        C5094e c5094e = (C5094e) obj;
        String str = c5094e.f10935e;
        String str2 = this.f10935e;
        if (str2 == null ? str == null : str2.equals(str)) {
            return this.f10934e.equals(c5094e.f10934e);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f10935e;
        return this.f10934e.hashCode() + ((str != null ? str.hashCode() : 0) * 31);
    }

    @Override // defpackage.InterfaceC2268e
    public final InterfaceC2268e remoteconfig(String str, C11467e c11467e, ArrayList arrayList) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    @Override // defpackage.InterfaceC2268e
    public final String startapp() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // defpackage.InterfaceC2268e
    public final Double subscription() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // defpackage.InterfaceC2268e
    public final InterfaceC2268e tapsense() {
        return this;
    }

    @Override // defpackage.InterfaceC2268e
    public final Boolean yandex() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }
}
