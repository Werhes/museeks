package defpackage;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC18232e {
    public static final char[] ad;

    static {
        char[] cArr = new char[80];
        ad = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void ad(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                ad(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                ad(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        metrica(i, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i2 = 1; i2 < str.length(); i2++) {
                char charAt = str.charAt(i2);
                if (Character.isUpperCase(charAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(charAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            C11133e c11133e = C11133e.f22049e;
            sb.append(AbstractC17595e.remoteconfig(new C11133e(((String) obj).getBytes(AbstractC9561e.ad))));
            sb.append('\"');
            return;
        }
        if (obj instanceof C11133e) {
            sb.append(": \"");
            sb.append(AbstractC17595e.remoteconfig((C11133e) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC11202e) {
            sb.append(" {");
            vip((AbstractC11202e) obj, sb, i + 2);
            sb.append("\n");
            metrica(i, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        int i3 = i + 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        ad(sb, i3, "key", entry.getKey());
        ad(sb, i3, "value", entry.getValue());
        sb.append("\n");
        metrica(i, sb);
        sb.append("}");
    }

    public static void metrica(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(ad, 0, i2);
            i -= i2;
        }
    }

    public static void vip(AbstractC11202e abstractC11202e, StringBuilder sb, int i) {
        int i2;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = abstractC11202e.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i3 = 0;
        while (true) {
            i2 = 3;
            if (i3 >= length) {
                break;
            }
            Method method3 = declaredMethods[i3];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i3++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i2);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                ad(sb, i, substring.substring(0, substring.length() - 4), AbstractC11202e.yandex(method2, abstractC11202e, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                ad(sb, i, substring.substring(0, substring.length() - 3), AbstractC11202e.yandex(method, abstractC11202e, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object yandex = AbstractC11202e.yandex(method4, abstractC11202e, new Object[0]);
                    if (method5 != null) {
                        if (!((Boolean) AbstractC11202e.yandex(method5, abstractC11202e, new Object[0])).booleanValue()) {
                        }
                        ad(sb, i, substring, yandex);
                    } else if (yandex instanceof Boolean) {
                        if (!((Boolean) yandex).booleanValue()) {
                        }
                        ad(sb, i, substring, yandex);
                    } else if (yandex instanceof Integer) {
                        if (((Integer) yandex).intValue() == 0) {
                        }
                        ad(sb, i, substring, yandex);
                    } else if (yandex instanceof Float) {
                        if (Float.floatToRawIntBits(((Float) yandex).floatValue()) == 0) {
                        }
                        ad(sb, i, substring, yandex);
                    } else if (yandex instanceof Double) {
                        if (Double.doubleToRawLongBits(((Double) yandex).doubleValue()) == 0) {
                        }
                        ad(sb, i, substring, yandex);
                    } else {
                        if (yandex instanceof String) {
                            equals = yandex.equals(BuildConfig.FLAVOR);
                        } else if (yandex instanceof C11133e) {
                            equals = yandex.equals(C11133e.f22049e);
                        } else if (yandex instanceof AbstractC4191e) {
                            if (yandex == ((AbstractC11202e) ((AbstractC11202e) ((AbstractC4191e) yandex)).startapp(6, null))) {
                            }
                            ad(sb, i, substring, yandex);
                        } else {
                            if ((yandex instanceof Enum) && ((Enum) yandex).ordinal() == 0) {
                            }
                            ad(sb, i, substring, yandex);
                        }
                        if (equals) {
                        }
                        ad(sb, i, substring, yandex);
                    }
                }
            }
            i2 = 3;
        }
    }
}
