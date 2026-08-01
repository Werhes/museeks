package defpackage;

import java.io.InputStream;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Collections;
import java.util.Enumeration;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۡؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10583e extends URLClassLoader {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final ClassLoader f20882e;

    public C10583e(URL[] urlArr, ClassLoader classLoader) {
        super(urlArr, null);
        this.f20882e = classLoader;
    }

    @Override // java.net.URLClassLoader, java.lang.ClassLoader
    public final Class findClass(String str) {
        Class findLoadedClass = findLoadedClass(str);
        if (findLoadedClass != null) {
            return findLoadedClass;
        }
        try {
            return super.findClass(str);
        } catch (ClassNotFoundException unused) {
            return this.f20882e.loadClass(str);
        }
    }

    @Override // java.net.URLClassLoader, java.lang.ClassLoader
    public final URL findResource(String str) {
        return null;
    }

    @Override // java.net.URLClassLoader, java.lang.ClassLoader
    public final Enumeration findResources(String str) {
        return Collections.emptyEnumeration();
    }

    @Override // java.lang.ClassLoader
    public final URL getResource(String str) {
        return this.f20882e.getResource(str);
    }

    @Override // java.net.URLClassLoader, java.lang.ClassLoader
    public final InputStream getResourceAsStream(String str) {
        return this.f20882e.getResourceAsStream(str);
    }

    @Override // java.lang.ClassLoader
    public final Enumeration getResources(String str) {
        return this.f20882e.getResources(str);
    }
}
