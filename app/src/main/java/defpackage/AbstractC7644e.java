package defpackage;

import j$.util.DesugarCollections;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؐۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7644e {
    public static final Class metrica;
    public static final Set ad = Collections.EMPTY_SET;
    public static final Type[] vip = new Type[0];

    static {
        Class<?> cls;
        try {
            cls = Class.forName(getKotlinMetadataClassName());
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        metrica = cls;
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        linkedHashMap.put(Boolean.TYPE, Boolean.class);
        linkedHashMap.put(Byte.TYPE, Byte.class);
        linkedHashMap.put(Character.TYPE, Character.class);
        linkedHashMap.put(Double.TYPE, Double.class);
        linkedHashMap.put(Float.TYPE, Float.class);
        linkedHashMap.put(Integer.TYPE, Integer.class);
        linkedHashMap.put(Long.TYPE, Long.class);
        linkedHashMap.put(Short.TYPE, Short.class);
        linkedHashMap.put(Void.TYPE, Void.class);
        DesugarCollections.unmodifiableMap(linkedHashMap);
    }

    public static Type ad(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new C3069e(ad(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            if (type instanceof C2897e) {
                return type;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C2897e(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return type instanceof C3069e ? type : new C3069e(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType) || (type instanceof C15140e)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new C15140e(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    public static C14803e adcel(String str, String str2, AbstractC17080e abstractC17080e) {
        String sb;
        String loadAd = abstractC17080e.loadAd();
        if (str2.equals(str)) {
            sb = AbstractC17861e.admob("Non-null value '", str, "' was null at ", loadAd);
        } else {
            StringBuilder tapsense = AbstractC17861e.tapsense("Non-null value '", str, "' (JSON name '", str2, "') was null at ");
            tapsense.append(loadAd);
            sb = tapsense.toString();
        }
        return new C14803e(sb, 8, (byte) 0);
    }

    public static C14803e appmetrica(String str, String str2, AbstractC17080e abstractC17080e) {
        String sb;
        String loadAd = abstractC17080e.loadAd();
        if (str2.equals(str)) {
            sb = AbstractC17861e.admob("Required value '", str, "' missing at ", loadAd);
        } else {
            StringBuilder tapsense = AbstractC17861e.tapsense("Required value '", str, "' (JSON name '", str2, "') missing at ");
            tapsense.append(loadAd);
            sb = tapsense.toString();
        }
        return new C14803e(sb, 8, (byte) 0);
    }

    public static void billing(InvocationTargetException invocationTargetException) {
        Throwable targetException = invocationTargetException.getTargetException();
        if (targetException instanceof RuntimeException) {
            throw ((RuntimeException) targetException);
        }
        if (!(targetException instanceof Error)) {
            throw new RuntimeException(targetException);
        }
        throw ((Error) targetException);
    }

    private static String getKotlinMetadataClassName() {
        return "kotlin.Metadata";
    }

    public static boolean license(Class cls) {
        String name = cls.getName();
        return name.startsWith("android.") || name.startsWith("androidx.") || name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("kotlin.") || name.startsWith("kotlinx.") || name.startsWith("scala.");
    }

    public static Type metrica(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return metrica(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return metrica(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Type purchase(Type type, Class cls, Type type2, LinkedHashSet linkedHashSet) {
        TypeVariable typeVariable;
        do {
            int i = 0;
            if (!(type2 instanceof TypeVariable)) {
                if (type2 instanceof Class) {
                    Class cls2 = (Class) type2;
                    if (cls2.isArray()) {
                        Class<?> componentType = cls2.getComponentType();
                        Type purchase = purchase(type, cls, componentType, linkedHashSet);
                        return componentType == purchase ? cls2 : new C3069e(purchase);
                    }
                }
                if (type2 instanceof GenericArrayType) {
                    GenericArrayType genericArrayType = (GenericArrayType) type2;
                    Type genericComponentType = genericArrayType.getGenericComponentType();
                    Type purchase2 = purchase(type, cls, genericComponentType, linkedHashSet);
                    return genericComponentType == purchase2 ? genericArrayType : new C3069e(purchase2);
                }
                if (type2 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type2;
                    Type ownerType = parameterizedType.getOwnerType();
                    Type purchase3 = purchase(type, cls, ownerType, linkedHashSet);
                    boolean z = purchase3 != ownerType;
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    int length = actualTypeArguments.length;
                    while (i < length) {
                        Type purchase4 = purchase(type, cls, actualTypeArguments[i], linkedHashSet);
                        if (purchase4 != actualTypeArguments[i]) {
                            if (!z) {
                                actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                z = true;
                            }
                            actualTypeArguments[i] = purchase4;
                        }
                        i++;
                    }
                    return z ? new C2897e(purchase3, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
                }
                boolean z2 = type2 instanceof WildcardType;
                Type type3 = type2;
                if (z2) {
                    WildcardType wildcardType = (WildcardType) type2;
                    Type[] lowerBounds = wildcardType.getLowerBounds();
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    if (lowerBounds.length == 1) {
                        Type purchase5 = purchase(type, cls, lowerBounds[0], linkedHashSet);
                        type3 = wildcardType;
                        if (purchase5 != lowerBounds[0]) {
                            return new C15140e(new Type[]{Object.class}, purchase5 instanceof WildcardType ? ((WildcardType) purchase5).getLowerBounds() : new Type[]{purchase5});
                        }
                    } else {
                        type3 = wildcardType;
                        if (upperBounds.length == 1) {
                            Type purchase6 = purchase(type, cls, upperBounds[0], linkedHashSet);
                            type3 = wildcardType;
                            if (purchase6 != upperBounds[0]) {
                                return new C15140e(purchase6 instanceof WildcardType ? ((WildcardType) purchase6).getUpperBounds() : new Type[]{purchase6}, vip);
                            }
                        }
                    }
                }
                return type3;
            }
            typeVariable = (TypeVariable) type2;
            if (linkedHashSet.contains(typeVariable)) {
                return type2;
            }
            linkedHashSet.add(typeVariable);
            GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
            Class cls3 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
            if (cls3 != null) {
                Type metrica2 = metrica(type, cls, cls3);
                if (metrica2 instanceof ParameterizedType) {
                    TypeVariable[] typeParameters = cls3.getTypeParameters();
                    while (i < typeParameters.length) {
                        if (typeVariable.equals(typeParameters[i])) {
                            type2 = ((ParameterizedType) metrica2).getActualTypeArguments()[i];
                        } else {
                            i++;
                        }
                    }
                    throw new NoSuchElementException();
                }
            }
            type2 = typeVariable;
        } while (type2 != typeVariable);
        return type2;
    }

    public static String startapp(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static void vip(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException("Unexpected primitive " + type + ". Use the boxed type.");
        }
    }

    public static String yandex(Type type, Set set) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(type);
        if (set.isEmpty()) {
            str = " (with no annotations)";
        } else {
            str = " annotated " + set;
        }
        sb.append(str);
        return sb.toString();
    }
}
