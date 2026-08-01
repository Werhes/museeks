package defpackage;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٝٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC11132e {
    public static final ThreadLocal ad = new ThreadLocal();
    public static final Class vip = C11467e.class;
    public static final Class metrica = C5033e.class;

    public static final InterfaceC5261e ad(ArrayList arrayList) {
        return (InterfaceC5261e) AbstractC13480e.m3569abstract(AbstractC13480e.m3577else(arrayList, AbstractC0258e.ad(new C17014e(3), new C17014e(4), new C17014e(5))));
    }

    public static final boolean metrica(InterfaceC8960e interfaceC8960e, Class cls) {
        Type smaato = AbstractC9546e.smaato(((C2299e) interfaceC8960e).advert());
        Class<?> cls2 = smaato instanceof Class ? (Class) smaato : null;
        if (cls2 != null) {
            return cls.isAssignableFrom(cls2);
        }
        return false;
    }

    public static final boolean vip(InterfaceC5261e interfaceC5261e) {
        if (interfaceC5261e.mo1846return() || interfaceC5261e.mo1845e() || interfaceC5261e.yandex() || interfaceC5261e.ads()) {
            return false;
        }
        InterfaceC8960e startapp = AbstractC2803e.startapp(interfaceC5261e);
        if (startapp != null && !metrica(startapp, metrica) && !metrica(startapp, vip)) {
            return false;
        }
        Method license = AbstractC4306e.license(interfaceC5261e);
        if (license == null) {
            return true;
        }
        if (license.isSynthetic()) {
            return false;
        }
        return (Modifier.isStatic(license.getModifiers()) && interfaceC5261e.getParameters().isEmpty()) ? false : true;
    }
}
