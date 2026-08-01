package defpackage;

import ealvatag.tag.datatype.DataTypes;
import java.util.LinkedHashMap;
import java.util.List;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًْٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC13133e {
    public static final String ad = AbstractC13480e.m3608try(AbstractC6874e.startapp('k', 'o', 't', 'l', 'i', 'n'), BuildConfig.FLAVOR, null, null, null, 62);
    public static final LinkedHashMap vip;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List startapp = AbstractC6874e.startapp("Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int license = AbstractC4340e.license(0, startapp.size() - 1, 2);
        if (license >= 0) {
            int i = 0;
            while (true) {
                StringBuilder sb = new StringBuilder();
                String str = ad;
                sb.append(str);
                sb.append('/');
                sb.append((String) startapp.get(i));
                int i2 = i + 1;
                linkedHashMap.put(sb.toString(), startapp.get(i2));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append('/');
                linkedHashMap.put(AbstractC1786e.signatures(sb2, (String) startapp.get(i), "Array"), "[" + ((String) startapp.get(i2)));
                if (i == license) {
                    break;
                } else {
                    i += 2;
                }
            }
        }
        linkedHashMap.put(ad + "/Unit", "V");
        ad(linkedHashMap, "Any", "java/lang/Object");
        ad(linkedHashMap, "Nothing", "java/lang/Void");
        ad(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str2 : AbstractC6874e.startapp("String", "CharSequence", "Throwable", "Cloneable", DataTypes.OBJ_NUMBER, "Comparable", "Enum")) {
            ad(linkedHashMap, str2, "java/lang/" + str2);
        }
        for (String str3 : AbstractC6874e.startapp("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            ad(linkedHashMap, AbstractC17861e.Signature("collections/", str3), "java/util/" + str3);
            ad(linkedHashMap, "collections/Mutable" + str3, "java/util/" + str3);
        }
        ad(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        ad(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        ad(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        ad(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i3 = 0; i3 < 23; i3++) {
            String admob = AbstractC1786e.admob(i3, "Function");
            StringBuilder sb3 = new StringBuilder();
            String str4 = ad;
            sb3.append(str4);
            sb3.append("/jvm/functions/Function");
            sb3.append(i3);
            ad(linkedHashMap, admob, sb3.toString());
            ad(linkedHashMap, "reflect/KFunction" + i3, str4 + "/reflect/KFunction");
        }
        for (String str5 : AbstractC6874e.startapp("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            ad(linkedHashMap, AbstractC10257e.adcel(str5, ".Companion"), AbstractC4653e.ads(new StringBuilder(), ad, "/jvm/internal/", str5, "CompanionObject"));
        }
        vip = linkedHashMap;
    }

    public static final void ad(LinkedHashMap linkedHashMap, String str, String str2) {
        linkedHashMap.put(ad + '/' + str, "L" + str2 + ';');
    }

    public static final String vip(String str) {
        String str2 = (String) vip.get(str);
        if (str2 != null) {
            return str2;
        }
        return "L" + str.replace('.', '$') + ';';
    }
}
