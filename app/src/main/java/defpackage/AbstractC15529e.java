package defpackage;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٕ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC15529e implements InterfaceC18155e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final C10445e f30670e = new C10445e("<v#(\\d+)>");

    /* renamed from: break, reason: not valid java name */
    public static Method m3998break(Class cls, String str, Class[] clsArr, Class cls2) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (AbstractC7890e.billing(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            for (Method method : cls.getDeclaredMethods()) {
                if (AbstractC7890e.billing(method.getName(), str) && AbstractC7890e.billing(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.List] */
    public static void crashlytics(ArrayList arrayList, ArrayList arrayList2, boolean z) {
        Class cls;
        cls = AbstractC1619e.class;
        boolean billing = AbstractC7890e.billing(AbstractC13480e.m3569abstract(arrayList2), cls);
        ArrayList arrayList3 = arrayList2;
        if (billing) {
            arrayList3 = arrayList2.subList(0, arrayList2.size() - 1);
        }
        arrayList.addAll(arrayList3);
        int size = (arrayList3.size() + 31) / 32;
        for (int i = 0; i < size; i++) {
            arrayList.add(Integer.TYPE);
        }
        arrayList.add(z ? AbstractC1619e.class : Object.class);
    }

    /* renamed from: while, reason: not valid java name */
    public static Method m3999while(Class cls, String str, Class[] clsArr, Class cls2, boolean z) {
        Class license;
        Method m3999while;
        if (z) {
            clsArr[0] = cls;
        }
        Method m3998break = m3998break(cls, str, clsArr, cls2);
        if (m3998break != null) {
            return m3998break;
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null && (m3999while = m3999while(superclass, str, clsArr, cls2, z)) != null) {
            return m3999while;
        }
        for (Class<?> cls3 : cls.getInterfaces()) {
            Method m3999while2 = m3999while(cls3, str, clsArr, cls2, z);
            if (m3999while2 != null) {
                return m3999while2;
            }
            if (z && (license = AbstractC15365e.license(AbstractC2677e.license(cls3), cls3.getName().concat("$DefaultImpls"))) != null) {
                clsArr[0] = cls3;
                Method m3998break2 = m3998break(license, str, clsArr, cls2);
                if (m3998break2 != null) {
                    return m3998break2;
                }
            }
        }
        return null;
    }

    /* renamed from: class, reason: not valid java name */
    public final Method m4000class(String str, String str2) {
        Method m3999while;
        if (str.equals("<init>")) {
            return null;
        }
        C13391e m4002try = m4002try(str2, true);
        Class[] clsArr = (Class[]) ((ArrayList) m4002try.f26645e).toArray(new Class[0]);
        Class cls = (Class) m4002try.f26644e;
        Method m3999while2 = m3999while(mo2863native(), str, clsArr, cls, false);
        if (m3999while2 != null) {
            return m3999while2;
        }
        if (!mo2863native().isInterface() || (m3999while = m3999while(Object.class, str, clsArr, cls, false)) == null) {
            return null;
        }
        return m3999while;
    }

    /* renamed from: extends */
    public abstract Collection mo2425extends(C0520e c0520e);

    public final Method firebase(String str, String str2, boolean z) {
        if (str.equals("<init>")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(subs());
        }
        C13391e m4002try = m4002try(str2, true);
        crashlytics(arrayList, (ArrayList) m4002try.f26645e, false);
        return m3999while(mo2863native(), str.concat("$default"), (Class[]) arrayList.toArray(new Class[0]), (Class) m4002try.f26644e, z);
    }

    /* renamed from: goto */
    public abstract Collection mo2427goto(C0520e c0520e);

    /* renamed from: interface */
    public abstract Collection mo2429interface();

    /* renamed from: native */
    public Class mo2863native() {
        Class cls = (Class) AbstractC2677e.metrica.get(subs());
        return cls == null ? subs() : cls;
    }

    /* renamed from: protected, reason: not valid java name */
    public final Class m4001protected(int i, int i2, String str) {
        char charAt = str.charAt(i);
        if (charAt == 'F') {
            return Float.TYPE;
        }
        if (charAt == 'L') {
            return AbstractC2677e.license(subs()).loadClass(str.substring(i + 1, i2 - 1).replace('/', '.'));
        }
        if (charAt == 'S') {
            return Short.TYPE;
        }
        if (charAt == 'V') {
            return Void.TYPE;
        }
        if (charAt == 'I') {
            return Integer.TYPE;
        }
        if (charAt == 'J') {
            return Long.TYPE;
        }
        if (charAt == 'Z') {
            return Boolean.TYPE;
        }
        if (charAt == '[') {
            Class m4001protected = m4001protected(i + 1, i2, str);
            C12816e c12816e = AbstractC5965e.ad;
            return Array.newInstance((Class<?>) m4001protected, 0).getClass();
        }
        switch (charAt) {
            case 'B':
                return Byte.TYPE;
            case 'C':
                return Character.TYPE;
            case 'D':
                return Double.TYPE;
            default:
                throw new Error("Unknown type prefix in the method signature: ".concat(str));
        }
    }

    /* renamed from: this */
    public abstract InterfaceC2188e mo2430this(int i);

    /* renamed from: try, reason: not valid java name */
    public final C13391e m4002try(String str, boolean z) {
        int m1865interface;
        ArrayList arrayList = new ArrayList();
        int i = 1;
        while (str.charAt(i) != ')') {
            int i2 = i;
            while (str.charAt(i2) == '[') {
                i2++;
            }
            char charAt = str.charAt(i2);
            if (AbstractC5304e.isPro("VZCBSIFJD", charAt)) {
                m1865interface = i2 + 1;
            } else {
                if (charAt != 'L') {
                    throw new Error("Unknown type prefix in the method signature: ".concat(str));
                }
                m1865interface = AbstractC5304e.m1865interface(str, ';', i, 4) + 1;
            }
            arrayList.add(m4001protected(i, m1865interface, str));
            i = m1865interface;
        }
        return new C13391e(arrayList, z ? m4001protected(i + 1, str.length(), str) : null, 28);
    }
}
