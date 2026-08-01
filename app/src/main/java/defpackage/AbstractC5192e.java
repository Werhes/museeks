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
/* renamed from: eؗ۟ۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5192e {
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
        vip(i, sb);
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
            sb.append(AbstractC18039e.yandex(new C2655e(((String) obj).getBytes(AbstractC12312e.ad))));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC13532e) {
            sb.append(": \"");
            sb.append(AbstractC18039e.yandex((AbstractC13532e) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC17076e) {
            sb.append(" {");
            metrica((AbstractC17076e) obj, sb, i + 2);
            sb.append("\n");
            vip(i, sb);
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
        vip(i, sb);
        sb.append("}");
    }

    public static void metrica(AbstractC17076e abstractC17076e, StringBuilder sb, int i) {
        int i2;
        int i3;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = abstractC17076e.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i4 = 0;
        while (true) {
            i2 = 3;
            if (i4 >= length) {
                break;
            }
            Method method3 = declaredMethods[i4];
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
            i4++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i2);
            if (!substring.endsWith("List") || substring.endsWith("OrBuilderList") || substring.equals("List") || (method2 = (Method) entry.getValue()) == null) {
                i3 = i2;
            } else {
                i3 = i2;
                if (method2.getReturnType().equals(List.class)) {
                    ad(sb, i, substring.substring(0, substring.length() - 4), AbstractC17076e.purchase(method2, abstractC17076e, new Object[0]));
                    i2 = i3;
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                ad(sb, i, substring.substring(0, substring.length() - 3), AbstractC17076e.purchase(method, abstractC17076e, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object purchase = AbstractC17076e.purchase(method4, abstractC17076e, new Object[0]);
                    if (method5 != null) {
                        if (!((Boolean) AbstractC17076e.purchase(method5, abstractC17076e, new Object[0])).booleanValue()) {
                        }
                        ad(sb, i, substring, purchase);
                    } else if (purchase instanceof Boolean) {
                        if (!((Boolean) purchase).booleanValue()) {
                        }
                        ad(sb, i, substring, purchase);
                    } else if (purchase instanceof Integer) {
                        if (((Integer) purchase).intValue() == 0) {
                        }
                        ad(sb, i, substring, purchase);
                    } else if (purchase instanceof Float) {
                        if (Float.floatToRawIntBits(((Float) purchase).floatValue()) == 0) {
                        }
                        ad(sb, i, substring, purchase);
                    } else if (purchase instanceof Double) {
                        if (Double.doubleToRawLongBits(((Double) purchase).doubleValue()) == 0) {
                        }
                        ad(sb, i, substring, purchase);
                    } else {
                        if (purchase instanceof String) {
                            equals = purchase.equals(BuildConfig.FLAVOR);
                        } else if (purchase instanceof AbstractC13532e) {
                            equals = purchase.equals(AbstractC13532e.f26826e);
                        } else if (purchase instanceof AbstractC4291e) {
                            if (purchase == ((AbstractC17076e) ((AbstractC17076e) ((AbstractC4291e) purchase)).smaato(6, null))) {
                            }
                            ad(sb, i, substring, purchase);
                        } else {
                            if ((purchase instanceof Enum) && ((Enum) purchase).ordinal() == 0) {
                            }
                            ad(sb, i, substring, purchase);
                        }
                        if (equals) {
                        }
                        ad(sb, i, substring, purchase);
                    }
                }
            }
            i2 = i3;
        }
        if (abstractC17076e instanceof AbstractC15267e) {
            Iterator metrica = ((AbstractC15267e) abstractC17076e).zzb.metrica();
            while (metrica.hasNext()) {
                Map.Entry entry2 = (Map.Entry) metrica.next();
                ((AbstractC10814e) entry2.getKey()).getClass();
                ad(sb, i, AbstractC1634e.smaato("[", 0, "]"), entry2.getValue());
            }
        }
        C10308e c10308e = abstractC17076e.zzc;
        if (c10308e != null) {
            for (int i5 = 0; i5 < c10308e.ad; i5++) {
                ad(sb, i, String.valueOf(c10308e.vip[i5] >>> 3), c10308e.metrica[i5]);
            }
        }
    }

    public static void vip(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(ad, 0, i2);
            i -= i2;
        }
    }
}
