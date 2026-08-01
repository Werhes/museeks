package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.util.ArrayMap;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؒۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1080e {
    public static final ArrayMap ad;
    public static final ArrayMap vip;

    static {
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put(Boolean.class, "bool");
        arrayMap.put(Byte.class, "byte");
        arrayMap.put(Short.class, "short");
        arrayMap.put(Integer.class, "int");
        arrayMap.put(Long.class, "long");
        arrayMap.put(Double.class, "double");
        arrayMap.put(Float.class, "float");
        arrayMap.put(String.class, "string");
        arrayMap.put(Parcelable.class, "parcelable");
        arrayMap.put(Map.class, "map");
        arrayMap.put(List.class, "list");
        arrayMap.put(IconCompat.class, "image");
        ad = arrayMap;
        ArrayMap arrayMap2 = new ArrayMap();
        arrayMap2.put(0, "primitive");
        arrayMap2.put(1, "iInterface");
        arrayMap2.put(9, "iBinder");
        arrayMap2.put(2, "map");
        arrayMap2.put(3, "set");
        arrayMap2.put(4, "list");
        arrayMap2.put(5, "object");
        arrayMap2.put(6, "image");
        vip = arrayMap2;
    }

    public static void ad(Bundle bundle, AbstractCollection abstractCollection, C16347e c16347e) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("tag_value");
        if (parcelableArrayList == null) {
            throw new C9496e("Bundle is missing the collection", c16347e);
        }
        Iterator it = parcelableArrayList.iterator();
        while (it.hasNext()) {
            abstractCollection.add(purchase((Bundle) ((Parcelable) it.next()), c16347e));
        }
    }

    public static Bundle adcel(Collection collection, C16347e c16347e) {
        Bundle bundle = new Bundle(2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            arrayList.add(loadAd(it.next(), "<item " + i + ">", c16347e));
            i++;
        }
        bundle.putParcelableArrayList("tag_value", arrayList);
        return bundle;
    }

    public static Bundle advert(Map map, C16347e c16347e) {
        Bundle bundle = new Bundle(2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        int i = 0;
        for (Map.Entry entry : map.entrySet()) {
            Bundle bundle2 = new Bundle(2);
            bundle2.putBundle("tag_1", loadAd(entry.getKey(), "<key " + i + ">", c16347e));
            if (entry.getValue() != null) {
                bundle2.putBundle("tag_2", loadAd(entry.getValue(), "<value " + i + ">", c16347e));
            }
            i++;
            arrayList.add(bundle2);
        }
        bundle.putInt("tag_class_type", 2);
        bundle.putParcelableArrayList("tag_value", arrayList);
        return bundle;
    }

    public static Bundle amazon(Object obj, C16347e c16347e) {
        Bundle bundle = new Bundle(2);
        bundle.putInt("tag_class_type", 0);
        if (obj instanceof Boolean) {
            bundle.putBoolean("tag_value", ((Boolean) obj).booleanValue());
            return bundle;
        }
        if (obj instanceof Byte) {
            bundle.putByte("tag_value", ((Byte) obj).byteValue());
            return bundle;
        }
        if (obj instanceof Character) {
            bundle.putChar("tag_value", ((Character) obj).charValue());
            return bundle;
        }
        if (obj instanceof Short) {
            bundle.putShort("tag_value", ((Short) obj).shortValue());
            return bundle;
        }
        if (obj instanceof Integer) {
            bundle.putInt("tag_value", ((Integer) obj).intValue());
            return bundle;
        }
        if (obj instanceof Long) {
            bundle.putLong("tag_value", ((Long) obj).longValue());
            return bundle;
        }
        if (obj instanceof Double) {
            bundle.putDouble("tag_value", ((Double) obj).doubleValue());
            return bundle;
        }
        if (obj instanceof Float) {
            bundle.putFloat("tag_value", ((Float) obj).floatValue());
            return bundle;
        }
        if (obj instanceof String) {
            bundle.putString("tag_value", (String) obj);
            return bundle;
        }
        if (!(obj instanceof Parcelable)) {
            throw new C9496e("Unsupported primitive type: ".concat(obj.getClass().getName()), c16347e);
        }
        bundle.putParcelable("tag_value", (Parcelable) obj);
        return bundle;
    }

    public static Object appmetrica(Bundle bundle, C16347e c16347e) {
        String string = bundle.getString("tag_class_name");
        if (string == null) {
            throw new C9496e("Bundle is missing the class name", c16347e);
        }
        try {
            Class<?> cls = Class.forName(string);
            if (!cls.isAnnotationPresent(InterfaceC10641e.class)) {
                throw new C9496e("Invalid class not marked as CarProtocol: ".concat(string), c16347e);
            }
            Constructor<?> declaredConstructor = cls.getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            Object newInstance = declaredConstructor.newInstance(null);
            Iterator it = yandex(cls).iterator();
            while (it.hasNext()) {
                Field field = (Field) it.next();
                field.setAccessible(true);
                String str = field.getDeclaringClass().getName() + field.getName();
                Object obj = bundle.get(str);
                if (obj == null) {
                    obj = bundle.get(str.replaceAll("androidx.core.graphics.drawable.IconCompat", "android.support.v4.graphics.drawable.IconCompat"));
                }
                if (obj instanceof Bundle) {
                    field.set(newInstance, purchase((Bundle) obj, c16347e));
                } else if (obj == null && Log.isLoggable("CarApp.Bun", 3)) {
                    Log.d("CarApp.Bun", "Value is null for field: " + field);
                }
            }
            return newInstance;
        } catch (ClassNotFoundException e) {
            throw new C9496e("Object for unknown class: ".concat(string), c16347e, e);
        } catch (IllegalArgumentException e2) {
            throw new C9496e("Failed to deserialize class: ".concat(string), c16347e, e2);
        } catch (NoSuchMethodException e3) {
            throw new C9496e("Object missing no args constructor: ".concat(string), c16347e, e3);
        } catch (ReflectiveOperationException e4) {
            throw new C9496e("Constructor or field is not accessible: ".concat(string), c16347e, e4);
        }
    }

    public static Method billing(Class cls, String str, C16347e c16347e) {
        if (cls == null || cls == Object.class) {
            throw new C9496e("No method " + str + " in class " + cls, c16347e);
        }
        for (Method method : cls.getDeclaredMethods()) {
            if (method.getName().equals(str)) {
                method.setAccessible(true);
                return method;
            }
        }
        return billing(cls.getSuperclass(), str, c16347e);
    }

    public static HashMap license(Bundle bundle, C16347e c16347e) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("tag_value");
        if (parcelableArrayList == null) {
            throw new C9496e("Bundle is missing the map", c16347e);
        }
        HashMap hashMap = new HashMap();
        Iterator it = parcelableArrayList.iterator();
        while (it.hasNext()) {
            Bundle bundle2 = (Bundle) ((Parcelable) it.next());
            Bundle bundle3 = bundle2.getBundle("tag_1");
            Bundle bundle4 = bundle2.getBundle("tag_2");
            if (bundle3 == null) {
                throw new C9496e("Bundle is missing key", c16347e);
            }
            hashMap.put(purchase(bundle3, c16347e), bundle4 == null ? null : purchase(bundle4, c16347e));
        }
        return hashMap;
    }

    public static Bundle loadAd(Object obj, String str, C16347e c16347e) {
        ArrayDeque arrayDeque = (ArrayDeque) c16347e.f32119e;
        if (obj != null) {
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                if (((C6298e) it.next()).ad == obj) {
                    throw new C9496e("Found cycle while bundling type ".concat(obj.getClass().getSimpleName()), c16347e);
                }
            }
        }
        C16347e c16347e2 = new C16347e(obj, str, arrayDeque);
        try {
            if (obj == null) {
                throw new C9496e("Bundling of null object is not supported", c16347e2);
            }
            if (obj instanceof IconCompat) {
                Bundle bundle = new Bundle(2);
                bundle.putInt("tag_class_type", 6);
                bundle.putBundle("tag_value", ((IconCompat) obj).startapp());
                c16347e2.close();
                return bundle;
            }
            if (!(obj instanceof Boolean) && !(obj instanceof Byte) && !(obj instanceof Character) && !(obj instanceof Short) && !(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Double) && !(obj instanceof Float) && !(obj instanceof String) && !(obj instanceof Parcelable)) {
                if (obj instanceof IInterface) {
                    IInterface iInterface = (IInterface) obj;
                    Bundle bundle2 = new Bundle(3);
                    String name = iInterface.getClass().getName();
                    bundle2.putInt("tag_class_type", 1);
                    bundle2.putBinder("tag_value", iInterface.asBinder());
                    bundle2.putString("tag_class_name", name);
                    c16347e2.close();
                    return bundle2;
                }
                if (obj instanceof IBinder) {
                    Bundle bundle3 = new Bundle(2);
                    bundle3.putInt("tag_class_type", 9);
                    bundle3.putBinder("tag_value", (IBinder) obj);
                    c16347e2.close();
                    return bundle3;
                }
                if (obj instanceof Map) {
                    Bundle advert = advert((Map) obj, c16347e2);
                    c16347e2.close();
                    return advert;
                }
                if (obj instanceof List) {
                    Bundle adcel = adcel((List) obj, c16347e2);
                    adcel.putInt("tag_class_type", 4);
                    c16347e2.close();
                    return adcel;
                }
                if (obj instanceof Set) {
                    Bundle adcel2 = adcel((Set) obj, c16347e2);
                    adcel2.putInt("tag_class_type", 3);
                    c16347e2.close();
                    return adcel2;
                }
                if (obj.getClass().isEnum()) {
                    Bundle mopub = mopub(obj, c16347e2);
                    c16347e2.close();
                    return mopub;
                }
                if (obj instanceof Class) {
                    Bundle bundle4 = new Bundle(2);
                    bundle4.putInt("tag_class_type", 8);
                    bundle4.putString("tag_value", ((Class) obj).getName());
                    c16347e2.close();
                    return bundle4;
                }
                if (obj.getClass().isArray()) {
                    throw new C9496e("Object serializing contains an array, use a list or a set instead", c16347e2);
                }
                if (!(obj instanceof C2730e)) {
                    Bundle smaato = smaato(obj, c16347e2);
                    c16347e2.close();
                    return smaato;
                }
                Bundle vip2 = ((C2730e) obj).vip();
                vip2.putInt("tag_class_type", 10);
                c16347e2.close();
                return vip2;
            }
            Bundle amazon = amazon(obj, c16347e2);
            c16347e2.close();
            return amazon;
        } catch (Throwable th) {
            try {
                c16347e2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static Object metrica(Bundle bundle, C16347e c16347e) {
        IBinder binder = bundle.getBinder("tag_value");
        if (binder == null) {
            throw new C9496e("Bundle is missing the binder", c16347e);
        }
        String string = bundle.getString("tag_class_name");
        if (string == null) {
            throw new C9496e("Bundle is missing IInterface class name", c16347e);
        }
        try {
            Object invoke = billing(Class.forName(string), "asInterface", c16347e).invoke(null, binder);
            if (invoke != null) {
                return invoke;
            }
            throw new C9496e("Failed to get interface from binder", c16347e);
        } catch (ClassNotFoundException e) {
            throw new C9496e("Binder for unknown IInterface: ".concat(string), c16347e, e);
        } catch (ReflectiveOperationException e2) {
            throw new C9496e("Method to create IInterface from a Binder is not accessible for interface: ".concat(string), c16347e, e2);
        }
    }

    public static Bundle mopub(Object obj, C16347e c16347e) {
        Bundle bundle = new Bundle(3);
        bundle.putInt("tag_class_type", 7);
        try {
            bundle.putString("tag_value", (String) billing(obj.getClass(), "name", c16347e).invoke(obj, null));
            bundle.putString("tag_class_name", obj.getClass().getName());
            return bundle;
        } catch (ReflectiveOperationException e) {
            throw new C9496e("Enum missing name method", c16347e, e);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(1:3)|4|(2:5|6)|65|66|67|68|69|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00f6, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00f7, code lost:
    
        r4.addSuppressed(r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object purchase(android.os.Bundle r4, defpackage.C16347e r5) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC1080e.purchase(android.os.Bundle, eْٖٜ):java.lang.Object");
    }

    public static Bundle smaato(Object obj, C16347e c16347e) {
        String name = obj.getClass().getName();
        if (!obj.getClass().isAnnotationPresent(InterfaceC10641e.class)) {
            throw new C9496e("Invalid class not marked as CarProtocol: ".concat(name), c16347e);
        }
        try {
            obj.getClass().getDeclaredConstructor(null);
            ArrayList yandex = yandex(obj.getClass());
            Bundle bundle = new Bundle(yandex.size() + 2);
            bundle.putInt("tag_class_type", 5);
            bundle.putString("tag_class_name", name);
            Iterator it = yandex.iterator();
            while (it.hasNext()) {
                Field field = (Field) it.next();
                field.setAccessible(true);
                String adcel = AbstractC10257e.adcel(field.getDeclaringClass().getName(), field.getName());
                try {
                    Object obj2 = field.get(obj);
                    if (obj2 != null) {
                        bundle.putParcelable(adcel, loadAd(obj2, field.getName(), c16347e));
                    }
                } catch (IllegalAccessException e) {
                    throw new C9496e(AbstractC17861e.Signature("Field is not accessible: ", adcel), c16347e, e);
                }
            }
            return bundle;
        } catch (NoSuchMethodException e2) {
            throw new C9496e("Class to deserialize is missing a no args constructor: ".concat(name), c16347e, e2);
        }
    }

    public static String startapp(Class cls) {
        String str = (String) ad.get(cls);
        if (str == null) {
            if (List.class.isAssignableFrom(cls)) {
                return "<List>";
            }
            if (Map.class.isAssignableFrom(cls)) {
                return "<Map>";
            }
            if (Set.class.isAssignableFrom(cls)) {
                return "<Set>";
            }
        }
        return str == null ? cls.getSimpleName() : str;
    }

    public static Object vip(Bundle bundle, C16347e c16347e) {
        String string = bundle.getString("tag_value");
        if (string == null) {
            throw new C9496e(AbstractC5087e.m1746extends("Missing enum name [", string, "]"), c16347e);
        }
        String string2 = bundle.getString("tag_class_name");
        if (string2 == null) {
            throw new C9496e(AbstractC5087e.m1746extends("Missing enum className [", string2, "]"), c16347e);
        }
        try {
            return billing(Class.forName(string2), "valueOf", c16347e).invoke(null, string);
        } catch (ClassNotFoundException e) {
            throw new C9496e(AbstractC5087e.m1746extends("Enum class [", string2, "] not found"), c16347e, e);
        } catch (IllegalArgumentException e2) {
            throw new C9496e(AbstractC17861e.subscription("Enum value [", string, "] does not exist in enum class [", string2, "]"), c16347e, e2);
        } catch (ReflectiveOperationException e3) {
            throw new C9496e(AbstractC5087e.m1746extends("Enum of class [", string2, "] missing valueOf method"), c16347e, e3);
        }
    }

    public static ArrayList yandex(Class cls) {
        ArrayList arrayList = new ArrayList();
        if (cls != null && cls != Object.class) {
            for (Field field : cls.getDeclaredFields()) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    arrayList.add(field);
                }
            }
            arrayList.addAll(yandex(cls.getSuperclass()));
        }
        return arrayList;
    }
}
