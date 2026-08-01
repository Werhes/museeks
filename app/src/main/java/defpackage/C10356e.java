package defpackage;

import java.io.Closeable;
import java.net.URL;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؚٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10356e extends ClassLoader implements Closeable {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C10583e f20438e;

    public C10356e(ArrayList arrayList, ClassLoader classLoader) {
        super(classLoader);
        this.f20438e = new C10583e((URL[]) arrayList.toArray(new URL[0]), getParent());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f20438e.close();
    }

    @Override // java.lang.ClassLoader
    public final synchronized Class loadClass(String str, boolean z) {
        Class loadClass;
        try {
            loadClass = this.f20438e.findClass(str);
        } catch (ClassNotFoundException unused) {
            loadClass = super.loadClass(str, z);
        }
        return loadClass;
    }
}
