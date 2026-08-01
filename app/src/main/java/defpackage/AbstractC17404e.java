package defpackage;

import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗۥۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC17404e {
    public static String ad(List list, String str, Function1 function1, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        int i2 = i & 2;
        String str2 = BuildConfig.FLAVOR;
        String str3 = i2 != 0 ? BuildConfig.FLAVOR : "[\n\t";
        if ((i & 4) == 0) {
            str2 = "\n]";
        }
        if ((i & 32) != 0) {
            function1 = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str3);
        int size = list.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            Object obj = list.get(i4);
            i3++;
            if (i3 > 1) {
                sb.append((CharSequence) str);
            }
            if (function1 != null) {
                sb.append((CharSequence) function1.invoke(obj));
            } else if (obj != null ? obj instanceof CharSequence : true) {
                sb.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb.append(((Character) obj).charValue());
            } else {
                sb.append((CharSequence) obj.toString());
            }
        }
        sb.append((CharSequence) str2);
        return sb.toString();
    }

    public static final void metrica(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static final Void vip(String str) {
        throw new NoSuchElementException(str);
    }
}
