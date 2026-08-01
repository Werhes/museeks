package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function12;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.functions.Function14;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.functions.Function16;
import kotlin.jvm.functions.Function17;
import kotlin.jvm.functions.Function18;
import kotlin.jvm.functions.Function19;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function20;
import kotlin.jvm.functions.Function21;
import kotlin.jvm.functions.Function22;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.functions.Function9;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔٙۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2677e {
    public static final List ad;
    public static final Map license;
    public static final Map metrica;
    public static final Map vip;

    static {
        C12232e c12232e = AbstractC3820e.ad;
        int i = 0;
        List<InterfaceC7227e> startapp = AbstractC6874e.startapp(c12232e.vip(Boolean.TYPE), c12232e.vip(Byte.TYPE), c12232e.vip(Character.TYPE), c12232e.vip(Double.TYPE), c12232e.vip(Float.TYPE), c12232e.vip(Integer.TYPE), c12232e.vip(Long.TYPE), c12232e.vip(Short.TYPE));
        ad = startapp;
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(startapp, 10));
        for (InterfaceC7227e interfaceC7227e : startapp) {
            arrayList.add(new C6571e(AbstractC14437e.purchase(interfaceC7227e), AbstractC14437e.billing(interfaceC7227e)));
        }
        vip = AbstractC10064e.mopub(arrayList);
        List<InterfaceC7227e> list = ad;
        ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(list, 10));
        for (InterfaceC7227e interfaceC7227e2 : list) {
            arrayList2.add(new C6571e(AbstractC14437e.billing(interfaceC7227e2), AbstractC14437e.purchase(interfaceC7227e2)));
        }
        metrica = AbstractC10064e.mopub(arrayList2);
        List startapp2 = AbstractC6874e.startapp(Function0.class, Function1.class, Function2.class, Function3.class, Function4.class, Function5.class, Function6.class, Function7.class, Function8.class, Function9.class, Function10.class, Function11.class, Function12.class, Function13.class, Function14.class, Function15.class, Function16.class, Function17.class, Function18.class, Function19.class, Function20.class, Function21.class, Function22.class);
        ArrayList arrayList3 = new ArrayList(AbstractC0746e.subscription(startapp2, 10));
        for (Object obj : startapp2) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC6874e.Signature();
                throw null;
            }
            arrayList3.add(new C6571e((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        license = AbstractC10064e.mopub(arrayList3);
    }

    public static final C11709e ad(Class cls) {
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException(AbstractC0054e.subs(cls, "Can't compute ClassId for primitive type: "));
        }
        if (cls.isArray()) {
            throw new IllegalArgumentException(AbstractC0054e.subs(cls, "Can't compute ClassId for array type: "));
        }
        if (cls.getEnclosingMethod() != null || cls.getEnclosingConstructor() != null || cls.getSimpleName().length() == 0) {
            C12816e c12816e = new C12816e(cls.getName());
            return new C11709e(c12816e.vip(), AbstractC18453e.billing(c12816e.ad.billing()), true);
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass != null) {
            return ad(declaringClass).license(C0520e.appmetrica(cls.getSimpleName()));
        }
        C12816e c12816e2 = new C12816e(cls.getName());
        return new C11709e(c12816e2.vip(), c12816e2.ad.billing());
    }

    public static final ClassLoader license(Class cls) {
        ClassLoader classLoader = cls.getClassLoader();
        return classLoader == null ? ClassLoader.getSystemClassLoader() : classLoader;
    }

    public static final List metrica(Type type) {
        if (!(type instanceof ParameterizedType)) {
            return C13664e.f27089e;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        return parameterizedType.getOwnerType() == null ? AbstractC1660e.m670implements(parameterizedType.getActualTypeArguments()) : AbstractC7762e.Signature(AbstractC7762e.mopub(AbstractC7762e.advert(type, C8865e.f17824e), C8865e.f17800e));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000e. Please report as an issue. */
    public static final String vip(Class cls) {
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                return cls.getName().replace('.', '/');
            }
            return "L" + cls.getName().replace('.', '/') + ';';
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return "D";
                }
                throw new IllegalArgumentException(AbstractC0054e.subs(cls, "Unsupported primitive type: "));
            case 104431:
                if (name.equals("int")) {
                    return "I";
                }
                throw new IllegalArgumentException(AbstractC0054e.subs(cls, "Unsupported primitive type: "));
            case 3039496:
                if (name.equals("byte")) {
                    return "B";
                }
                throw new IllegalArgumentException(AbstractC0054e.subs(cls, "Unsupported primitive type: "));
            case 3052374:
                if (name.equals("char")) {
                    return "C";
                }
                throw new IllegalArgumentException(AbstractC0054e.subs(cls, "Unsupported primitive type: "));
            case 3327612:
                if (name.equals("long")) {
                    return "J";
                }
                throw new IllegalArgumentException(AbstractC0054e.subs(cls, "Unsupported primitive type: "));
            case 3625364:
                if (name.equals("void")) {
                    return "V";
                }
                throw new IllegalArgumentException(AbstractC0054e.subs(cls, "Unsupported primitive type: "));
            case 64711720:
                if (name.equals("boolean")) {
                    return "Z";
                }
                throw new IllegalArgumentException(AbstractC0054e.subs(cls, "Unsupported primitive type: "));
            case 97526364:
                if (name.equals("float")) {
                    return "F";
                }
                throw new IllegalArgumentException(AbstractC0054e.subs(cls, "Unsupported primitive type: "));
            case 109413500:
                if (name.equals("short")) {
                    return "S";
                }
                throw new IllegalArgumentException(AbstractC0054e.subs(cls, "Unsupported primitive type: "));
            default:
                throw new IllegalArgumentException(AbstractC0054e.subs(cls, "Unsupported primitive type: "));
        }
    }
}
