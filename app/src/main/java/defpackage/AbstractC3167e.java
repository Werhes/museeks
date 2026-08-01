package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؘؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3167e {
    public static final C16372e ad = new C16372e("ResolutionAnchorProvider", 2);

    public static final int ad(C6564e c6564e, EnumC17426e enumC17426e) {
        return (int) (enumC17426e == EnumC17426e.f34146e ? c6564e.signatures & 4294967295L : c6564e.signatures >> 32);
    }

    public static String license(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String sb;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                sb = "null";
            } else {
                try {
                    sb = obj.toString();
                } catch (Exception e) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str2), (Throwable) e);
                    StringBuilder applovin = AbstractC8703e.applovin("<", str2, " threw ");
                    applovin.append(e.getClass().getName());
                    applovin.append(">");
                    sb = applovin.toString();
                }
            }
            objArr[i2] = sb;
            i2++;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (indexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i3, indexOf);
            sb2.append(objArr[i]);
            i++;
            i3 = indexOf + 2;
        }
        sb2.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb2.append(" [");
            sb2.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb2.append(", ");
                sb2.append(objArr[i4]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static final C16158e metrica(C14815e[] c14815eArr, InterfaceC3483e interfaceC3483e, InterfaceC3483e interfaceC3483e2) {
        C7748e ad2 = C16158e.f31735e.ad();
        for (C14815e c14815e : c14815eArr) {
            AbstractC4455e abstractC4455e = (AbstractC4455e) c14815e.f29341e;
            if (c14815e.f29336e || !((C16158e) interfaceC3483e).containsKey(abstractC4455e)) {
                ad2.put(abstractC4455e, abstractC4455e.metrica(c14815e, (InterfaceC6502e) ((C16158e) interfaceC3483e2).get(abstractC4455e)));
            }
        }
        return ad2.build();
    }

    public static final Object vip(InterfaceC3483e interfaceC3483e, AbstractC4455e abstractC4455e) {
        C16158e c16158e = (C16158e) interfaceC3483e;
        Object obj = c16158e.get(abstractC4455e);
        if (obj == null) {
            obj = abstractC4455e.vip();
        }
        return ((InterfaceC6502e) obj).ad(c16158e);
    }
}
