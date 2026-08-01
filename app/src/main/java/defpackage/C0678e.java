package defpackage;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۤۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0678e {
    public final WeakReference ad;
    public final int vip;

    public C0678e(ClassLoader classLoader) {
        this.ad = new WeakReference(classLoader);
        this.vip = System.identityHashCode(classLoader);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0678e) && this.ad.get() == ((C0678e) obj).ad.get();
    }

    public final int hashCode() {
        return this.vip;
    }

    public final String toString() {
        String obj;
        ClassLoader classLoader = (ClassLoader) this.ad.get();
        return (classLoader == null || (obj = classLoader.toString()) == null) ? "<null>" : obj;
    }
}
