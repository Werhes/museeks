package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؙؓ */
/* loaded from: classes3.dex */
public abstract class AbstractC6261e {
    public static InterfaceC12864e ad(InterfaceC12864e interfaceC12864e) {
        return interfaceC12864e.premium(new C12104e(new C10310e(6)));
    }

    public static final String appmetrica(Object obj) {
        return (obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName()) + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    public static final InterfaceC12864e license(InterfaceC5823e interfaceC5823e, C6594e c6594e, EnumC17426e enumC17426e) {
        return new C4328e(interfaceC5823e, c6594e, enumC17426e);
    }

    public static String metrica(String str, List list) {
        if (list == null || list.size() == 0) {
            throw new IllegalArgumentException("valueList might not be null or empty!");
        }
        if (str == null) {
            throw new IllegalArgumentException("separator might not be null!");
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < list.size()) {
            sb.append(list.get(i).toString());
            i++;
            if (i < list.size()) {
                sb.append(str);
            }
        }
        return sb.toString();
    }

    public static String purchase(String str, String str2, boolean z) {
        if (str == null && z) {
            return "\"\"";
        }
        StringBuilder sb = new StringBuilder(str.length() + 2);
        sb.append("\"");
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (i == 0 && AbstractC0815e.mopub(charAt)) {
                throw new C15608e(7, str2);
            }
            if (charAt == '\"') {
                sb.append('\\');
                sb.append(charAt);
            } else {
                sb.append(charAt);
            }
        }
        sb.append("\"");
        return sb.toString();
    }

    public static /* synthetic */ Collection vip(InterfaceC7192e interfaceC7192e, C4942e c4942e, int i) {
        if ((i & 1) != 0) {
            c4942e = C4942e.smaato;
        }
        InterfaceC8528e.ad.getClass();
        return interfaceC7192e.metrica(c4942e, C8865e.f17799e);
    }
}
