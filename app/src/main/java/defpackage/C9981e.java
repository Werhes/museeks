package defpackage;

import j$.util.DesugarCollections;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَُؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9981e implements InterfaceC10361e {
    public final /* synthetic */ int ad;

    public /* synthetic */ C9981e(int i) {
        this.ad = i;
    }

    public static void vip(Type type, Class cls) {
        Class<?> appmetrica = AbstractC18453e.appmetrica(type);
        if (cls.isAssignableFrom(appmetrica)) {
            throw new IllegalArgumentException("No JsonAdapter for " + type + ", you should probably use " + cls.getSimpleName() + " instead of " + appmetrica.getSimpleName() + " (Moshi only supports the collection interfaces by default) or else register a custom JsonAdapter.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v6 */
    @Override // defpackage.InterfaceC10361e
    public final AbstractC13345e ad(Type type, Set set, C14172e c14172e) {
        int i;
        AbstractC16947e c2293e;
        Class cls;
        boolean z;
        Class<?> cls2;
        boolean z2;
        InterfaceC7685e interfaceC7685e;
        Class appmetrica;
        Type[] typeArr;
        char c;
        C11248e c11248e;
        Class<?> cls3;
        Constructor<?> declaredConstructor;
        Object[] objArr;
        Type type2 = type;
        int i2 = this.ad;
        Class cls4 = Integer.TYPE;
        Class<?> cls5 = null;
        boolean z3 = true;
        switch (i2) {
            case 0:
                Type genericComponentType = type2 instanceof GenericArrayType ? ((GenericArrayType) type2).getGenericComponentType() : type2 instanceof Class ? ((Class) type2).getComponentType() : null;
                if (genericComponentType != null && set.isEmpty()) {
                    return new C1883e(AbstractC18453e.appmetrica(genericComponentType), c14172e.ad(genericComponentType)).license();
                }
                return null;
            case 1:
                if ((type2 instanceof Class) || (type2 instanceof ParameterizedType)) {
                    Class appmetrica2 = AbstractC18453e.appmetrica(type2);
                    if (!appmetrica2.isInterface() && !appmetrica2.isEnum() && set.isEmpty()) {
                        if (AbstractC7644e.license(appmetrica2)) {
                            vip(type2, List.class);
                            vip(type2, Set.class);
                            vip(type2, Map.class);
                            vip(type2, Collection.class);
                            String str = "Platform " + appmetrica2;
                            if (type2 instanceof ParameterizedType) {
                                str = str + " in " + type2;
                            }
                            throw new IllegalArgumentException(AbstractC10257e.adcel(str, " requires explicit JsonAdapter to be registered"));
                        }
                        if (appmetrica2.isAnonymousClass()) {
                            throw new IllegalArgumentException("Cannot serialize anonymous class ".concat(appmetrica2.getName()));
                        }
                        if (appmetrica2.isLocalClass()) {
                            throw new IllegalArgumentException("Cannot serialize local class ".concat(appmetrica2.getName()));
                        }
                        if (appmetrica2.getEnclosingClass() != null && !Modifier.isStatic(appmetrica2.getModifiers())) {
                            throw new IllegalArgumentException("Cannot serialize non-static nested class ".concat(appmetrica2.getName()));
                        }
                        if (Modifier.isAbstract(appmetrica2.getModifiers())) {
                            throw new IllegalArgumentException("Cannot serialize abstract class ".concat(appmetrica2.getName()));
                        }
                        Class<? extends Annotation> cls6 = AbstractC7644e.metrica;
                        if (cls6 != null && appmetrica2.isAnnotationPresent(cls6)) {
                            throw new IllegalArgumentException("Cannot serialize Kotlin type " + appmetrica2.getName() + ". Reflective serialization of Kotlin classes without using kotlin-reflect has undefined and unexpected behavior. Please use KotlinJsonAdapterFactory from the moshi-kotlin artifact or use code gen from the moshi-kotlin-codegen artifact.");
                        }
                        try {
                            try {
                                try {
                                    try {
                                        Constructor declaredConstructor2 = appmetrica2.getDeclaredConstructor(null);
                                        declaredConstructor2.setAccessible(true);
                                        c2293e = new C2293e(declaredConstructor2, appmetrica2);
                                    } catch (NoSuchMethodException unused) {
                                        Class<?> cls7 = Class.forName("sun.misc.Unsafe");
                                        Field declaredField = cls7.getDeclaredField("theUnsafe");
                                        declaredField.setAccessible(true);
                                        c2293e = new C8829e(cls7.getMethod("allocateInstance", Class.class), declaredField.get(null), appmetrica2);
                                    }
                                } catch (Exception unused2) {
                                    throw new IllegalArgumentException("cannot construct instances of ".concat(appmetrica2.getName()));
                                }
                            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused3) {
                                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                                declaredMethod.setAccessible(true);
                                int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, cls4);
                                declaredMethod2.setAccessible(true);
                                c2293e = new C6090e(declaredMethod2, appmetrica2, intValue);
                            } catch (IllegalAccessException unused4) {
                                throw new AssertionError();
                            }
                            i = 0;
                        } catch (IllegalAccessException unused5) {
                            throw new AssertionError();
                        } catch (NoSuchMethodException unused6) {
                            i = 0;
                            Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                            declaredMethod3.setAccessible(true);
                            c2293e = new C2293e(declaredMethod3, appmetrica2);
                        } catch (InvocationTargetException e) {
                            AbstractC7644e.billing(e);
                            throw null;
                        }
                        TreeMap treeMap = new TreeMap();
                        while (type2 != Object.class) {
                            Class appmetrica3 = AbstractC18453e.appmetrica(type2);
                            boolean license = AbstractC7644e.license(appmetrica3);
                            Field[] declaredFields = appmetrica3.getDeclaredFields();
                            int length = declaredFields.length;
                            int i3 = i;
                            while (i3 < length) {
                                Field field = declaredFields[i3];
                                int modifiers = field.getModifiers();
                                if (Modifier.isStatic(modifiers) || Modifier.isTransient(modifiers) || (!(Modifier.isPublic(modifiers) || Modifier.isProtected(modifiers) || !license) || ((interfaceC7685e = (InterfaceC7685e) field.getAnnotation(InterfaceC7685e.class)) != null && interfaceC7685e.ignore()))) {
                                    cls = appmetrica3;
                                    z = license;
                                    cls2 = cls5;
                                    z2 = z3;
                                } else {
                                    cls2 = cls5;
                                    Type purchase = AbstractC7644e.purchase(type2, appmetrica3, field.getGenericType(), new LinkedHashSet());
                                    Annotation[] annotations = field.getAnnotations();
                                    int length2 = annotations.length;
                                    ?? r19 = cls2;
                                    int i4 = i;
                                    while (i4 < length2) {
                                        int i5 = i4;
                                        Annotation annotation = annotations[i5];
                                        Class cls8 = appmetrica3;
                                        boolean z4 = license;
                                        LinkedHashSet linkedHashSet = r19;
                                        if (annotation.annotationType().isAnnotationPresent(InterfaceC5964e.class)) {
                                            if (r19 == 0) {
                                                linkedHashSet = new LinkedHashSet();
                                            }
                                            LinkedHashSet linkedHashSet2 = linkedHashSet;
                                            linkedHashSet2.add(annotation);
                                            r19 = linkedHashSet2;
                                        }
                                        i4 = i5 + 1;
                                        appmetrica3 = cls8;
                                        license = z4;
                                        r19 = r19;
                                    }
                                    cls = appmetrica3;
                                    z = license;
                                    Set unmodifiableSet = r19 != 0 ? DesugarCollections.unmodifiableSet(r19) : AbstractC7644e.ad;
                                    String name = field.getName();
                                    AbstractC13345e vip = c14172e.vip(purchase, unmodifiableSet, name);
                                    z2 = true;
                                    field.setAccessible(true);
                                    if (interfaceC7685e != null) {
                                        String name2 = interfaceC7685e.name();
                                        if (!"\u0000".equals(name2)) {
                                            name = name2;
                                        }
                                    }
                                    C3003e c3003e = (C3003e) treeMap.put(name, new C3003e(name, field, vip));
                                    if (c3003e != null) {
                                        throw new IllegalArgumentException("Conflicting fields:\n    " + c3003e.vip + "\n    " + field);
                                    }
                                }
                                i3++;
                                appmetrica3 = cls;
                                z3 = z2;
                                cls5 = cls2;
                                license = z;
                            }
                            Class appmetrica4 = AbstractC18453e.appmetrica(type2);
                            type2 = AbstractC7644e.purchase(type2, appmetrica4, appmetrica4.getGenericSuperclass(), new LinkedHashSet());
                        }
                        return new C0253e(c2293e, treeMap).license();
                    }
                }
                return null;
            case 2:
                Class appmetrica5 = AbstractC18453e.appmetrica(type2);
                if (!set.isEmpty()) {
                    return null;
                }
                if (appmetrica5 == List.class || appmetrica5 == Collection.class) {
                    return new C12497e(c14172e.ad(AbstractC18453e.vip(type2)), 0).license();
                }
                if (appmetrica5 == Set.class) {
                    return new C12497e(c14172e.ad(AbstractC18453e.vip(type2)), 1).license();
                }
                return null;
            case 3:
                if (!set.isEmpty() || (appmetrica = AbstractC18453e.appmetrica(type2)) != Map.class) {
                    return null;
                }
                if (type2 == Properties.class) {
                    typeArr = new Type[]{String.class, String.class};
                } else {
                    if (!Map.class.isAssignableFrom(appmetrica)) {
                        throw new IllegalArgumentException();
                    }
                    Type purchase2 = AbstractC7644e.purchase(type2, appmetrica, AbstractC7644e.metrica(type2, appmetrica, Map.class), new LinkedHashSet());
                    if (!(purchase2 instanceof ParameterizedType)) {
                        c = 0;
                        typeArr = new Type[]{Object.class, Object.class};
                        return new C1883e(c14172e, typeArr[c], typeArr[1]).license();
                    }
                    typeArr = ((ParameterizedType) purchase2).getActualTypeArguments();
                }
                c = 0;
                return new C1883e(c14172e, typeArr[c], typeArr[1]).license();
            case 4:
                return null;
            default:
                C7386e c7386e = AbstractC11750e.mopub;
                C7386e c7386e2 = AbstractC11750e.adcel;
                C7386e c7386e3 = AbstractC11750e.startapp;
                C7386e c7386e4 = AbstractC11750e.yandex;
                C7386e c7386e5 = AbstractC11750e.billing;
                C7386e c7386e6 = AbstractC11750e.purchase;
                C7386e c7386e7 = AbstractC11750e.appmetrica;
                C7386e c7386e8 = AbstractC11750e.license;
                if (!set.isEmpty()) {
                    return null;
                }
                if (type2 == Boolean.TYPE) {
                    return c7386e8;
                }
                if (type2 == Byte.TYPE) {
                    return c7386e7;
                }
                if (type2 == Character.TYPE) {
                    return c7386e6;
                }
                if (type2 == Double.TYPE) {
                    return c7386e5;
                }
                if (type2 == Float.TYPE) {
                    return c7386e4;
                }
                if (type2 == cls4) {
                    return c7386e3;
                }
                if (type2 == Long.TYPE) {
                    return c7386e2;
                }
                if (type2 == Short.TYPE) {
                    return c7386e;
                }
                if (type2 == Boolean.class) {
                    return c7386e8.license();
                }
                if (type2 == Byte.class) {
                    return c7386e7.license();
                }
                if (type2 == Character.class) {
                    return c7386e6.license();
                }
                if (type2 == Double.class) {
                    return c7386e5.license();
                }
                if (type2 == Float.class) {
                    return c7386e4.license();
                }
                if (type2 == Integer.class) {
                    return c7386e3.license();
                }
                if (type2 == Long.class) {
                    return c7386e2.license();
                }
                if (type2 == Short.class) {
                    return c7386e.license();
                }
                if (type2 == String.class) {
                    return AbstractC11750e.advert.license();
                }
                if (type2 == Object.class) {
                    return new C14807e(c14172e).license();
                }
                Class appmetrica6 = AbstractC18453e.appmetrica(type2);
                Set set2 = AbstractC7644e.ad;
                InterfaceC3919e interfaceC3919e = (InterfaceC3919e) appmetrica6.getAnnotation(InterfaceC3919e.class);
                if (interfaceC3919e == null || !interfaceC3919e.generateAdapter()) {
                    c11248e = null;
                } else {
                    try {
                        try {
                            cls3 = Class.forName(appmetrica6.getName().replace("$", "_") + "JsonAdapter", true, appmetrica6.getClassLoader());
                        } catch (NoSuchMethodException e2) {
                            e = e2;
                        }
                        try {
                            if (type2 instanceof ParameterizedType) {
                                Type[] actualTypeArguments = ((ParameterizedType) type2).getActualTypeArguments();
                                try {
                                    declaredConstructor = cls3.getDeclaredConstructor(C14172e.class, Type[].class);
                                    objArr = new Object[]{c14172e, actualTypeArguments};
                                } catch (NoSuchMethodException unused7) {
                                    declaredConstructor = cls3.getDeclaredConstructor(Type[].class);
                                    objArr = new Object[]{actualTypeArguments};
                                }
                            } else {
                                try {
                                    declaredConstructor = cls3.getDeclaredConstructor(C14172e.class);
                                    objArr = new Object[]{c14172e};
                                } catch (NoSuchMethodException unused8) {
                                    declaredConstructor = cls3.getDeclaredConstructor(null);
                                    objArr = new Object[0];
                                }
                            }
                            declaredConstructor.setAccessible(true);
                            c11248e = ((AbstractC13345e) declaredConstructor.newInstance(objArr)).license();
                        } catch (NoSuchMethodException e3) {
                            e = e3;
                            cls5 = cls3;
                            if ((type2 instanceof ParameterizedType) || cls5.getTypeParameters().length == 0) {
                                throw new RuntimeException("Failed to find the generated JsonAdapter constructor for " + type2, e);
                            }
                            throw new RuntimeException("Failed to find the generated JsonAdapter constructor for '" + type2 + "'. Suspiciously, the type was not parameterized but the target class '" + cls5.getCanonicalName() + "' is generic. Consider using Types#newParameterizedType() to define these missing type variables.", e);
                        }
                    } catch (ClassNotFoundException e4) {
                        throw new RuntimeException("Failed to find the generated JsonAdapter class for " + type2, e4);
                    } catch (IllegalAccessException e5) {
                        throw new RuntimeException("Failed to access the generated JsonAdapter for " + type2, e5);
                    } catch (InstantiationException e6) {
                        throw new RuntimeException("Failed to instantiate the generated JsonAdapter for " + type2, e6);
                    } catch (InvocationTargetException e7) {
                        AbstractC7644e.billing(e7);
                        throw null;
                    }
                }
                if (c11248e != null) {
                    return c11248e;
                }
                if (appmetrica6.isEnum()) {
                    return new C2202e(appmetrica6).license();
                }
                return null;
        }
    }
}
