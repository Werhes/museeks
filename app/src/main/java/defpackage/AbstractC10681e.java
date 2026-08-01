package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؙۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC10681e {
    public static void ad(int i, byte[] bArr, int[] iArr) {
        int length = iArr.length * 2;
        int[] iArr2 = new int[length];
        int i2 = iArr[iArr.length - 1] >> 31;
        int length2 = iArr.length;
        int i3 = length;
        while (true) {
            length2--;
            if (length2 < 0) {
                break;
            }
            int i4 = iArr[length2];
            iArr2[i3 - 1] = (i2 << 16) | (i4 >>> 16);
            i3 -= 2;
            iArr2[i3] = i4;
            i2 = i4;
        }
        int i5 = 32 - i;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < length) {
            int i9 = iArr2[i6];
            while (i7 < 16) {
                int i10 = i9 >>> i7;
                if ((i10 & 1) == i8) {
                    i7++;
                } else {
                    int i11 = (i10 | 1) << i5;
                    bArr[(i6 << 4) + i7] = (byte) (i11 >> i5);
                    i7 += i;
                    i8 = i11 >>> 31;
                }
            }
            i6++;
            i7 -= 16;
        }
    }

    public static final String adcel(String str, String str2, String str3, String str4, String str5) {
        if (!AbstractC6507e.pro(str, str2, false) || !AbstractC6507e.pro(str3, str4, false)) {
            return null;
        }
        String substring = str.substring(str2.length());
        String substring2 = str3.substring(str4.length());
        String concat = str5.concat(substring);
        if (substring.equals(substring2)) {
            return concat;
        }
        if (!mopub(substring, substring2)) {
            return null;
        }
        return concat + '!';
    }

    public static final void appmetrica(C13935e c13935e, String str, Number number) {
    }

    public static String billing(C0520e c0520e) {
        boolean z = c0520e.f2666e;
        String vip = c0520e.vip();
        if (!AbstractC1405e.ad.contains(vip)) {
            int i = 0;
            while (true) {
                if (i < vip.length()) {
                    char charAt = vip.charAt(i);
                    if (!Character.isLetterOrDigit(charAt) && charAt != '_') {
                        break;
                    }
                    i++;
                } else if (vip.length() != 0 && Character.isJavaIdentifierStart(vip.codePointAt(0))) {
                    return vip;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("`" + vip);
        sb.append('`');
        return sb.toString();
    }

    public static final InterfaceC12864e license(InterfaceC12864e interfaceC12864e, Function1 function1) {
        return interfaceC12864e.premium(new C7926e(null, function1));
    }

    public static final InterfaceC12864e metrica(InterfaceC12864e interfaceC12864e, Function1 function1) {
        return interfaceC12864e.premium(new C7926e(function1, null));
    }

    public static final boolean mopub(String str, String str2) {
        if (str.equals(AbstractC6507e.subscription(str2, "?", BuildConfig.FLAVOR, false))) {
            return true;
        }
        if (AbstractC6507e.amazon(str2, "?", false) && AbstractC7890e.billing(str.concat("?"), str2)) {
            return true;
        }
        StringBuilder sb = new StringBuilder("(");
        sb.append(str);
        sb.append(")?");
        return AbstractC7890e.billing(sb.toString(), str2);
    }

    public static final void purchase(C13935e c13935e, String str, String str2) {
    }

    public static final String startapp(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0520e c0520e = (C0520e) it.next();
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(billing(c0520e));
        }
        return sb.toString();
    }

    public static String vip(InterfaceC16897e interfaceC16897e, C0782e c0782e) {
        if (interfaceC16897e.metrica(c0782e)) {
            return null;
        }
        return interfaceC16897e.vip();
    }

    public static final String yandex(String str, String str2, Function0 function0, Function0 function02, Function1 function1) {
        String str3 = (String) function0.invoke();
        String adcel = adcel(str, AbstractC10257e.adcel(str3, "Mutable"), str2, str3, AbstractC10257e.adcel(str3, "(Mutable)"));
        if (adcel != null) {
            return adcel;
        }
        String adcel2 = adcel(str, str3.concat("MutableMap.MutableEntry"), str2, str3.concat("Map.Entry"), str3.concat("(Mutable)Map.(Mutable)Entry"));
        if (adcel2 != null) {
            return adcel2;
        }
        String str4 = (String) function02.invoke();
        StringBuilder inmobi = AbstractC8703e.inmobi(str4);
        inmobi.append((String) function1.invoke("Array<"));
        String sb = inmobi.toString();
        StringBuilder inmobi2 = AbstractC8703e.inmobi(str4);
        inmobi2.append((String) function1.invoke("Array<out "));
        String sb2 = inmobi2.toString();
        StringBuilder inmobi3 = AbstractC8703e.inmobi(str4);
        inmobi3.append((String) function1.invoke("Array<(out) "));
        String adcel3 = adcel(str, sb, str2, sb2, inmobi3.toString());
        if (adcel3 != null) {
            return adcel3;
        }
        return null;
    }
}
