package defpackage;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٟ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5797e {
    public static C8496e ad;
    public static final C1581e vip = new C1581e(1);

    public static final String ad(Object[] objArr, int i, int i2, AbstractC14012e abstractC14012e) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == abstractC14012e) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static String appmetrica(String str, Object... objArr) {
        int length;
        int indexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length || (indexOf = str.indexOf("%s", i2)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i2, indexOf);
            sb.append(billing(objArr[i]));
            i2 = indexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i2, str.length());
        if (i < length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(billing(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static String billing(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            String ads = AbstractC8647e.ads(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(ads), (Throwable) e);
            String name2 = e.getClass().getName();
            StringBuilder sb = new StringBuilder(ads.length() + 8 + name2.length() + 1);
            AbstractC13501e.Signature(sb, "<", ads, " threw ", name2);
            sb.append(">");
            return sb.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C17985e license(C17994e c17994e, float f, C17985e c17985e) {
        boolean z;
        C17985e c17985e2 = c17985e;
        c17994e.getClass();
        C1169e license = AbstractC6874e.license();
        ArrayList arrayList = c17994e.ad;
        int size = arrayList.size();
        C4211e c4211e = null;
        C4211e c4211e2 = null;
        int i = 0;
        while (i < size) {
            float[] fArr = new float[8];
            for (int i2 = 0; i2 < 8; i2++) {
                fArr[i2] = AbstractC4424e.vip(((C4211e) ((C6571e) arrayList.get(i)).f13544e).ad[i2], ((C4211e) ((C6571e) arrayList.get(i)).f13543e).ad[i2], f);
            }
            C4211e c4211e3 = new C4211e(fArr);
            if (c4211e2 == null) {
                c4211e2 = c4211e3;
            }
            if (c4211e != null) {
                license.add(c4211e);
            }
            i++;
            c4211e = c4211e3;
        }
        if (c4211e != null && c4211e2 != null) {
            float[] fArr2 = c4211e.ad;
            float f2 = fArr2[0];
            float f3 = fArr2[1];
            float f4 = fArr2[2];
            float f5 = fArr2[3];
            float f6 = fArr2[4];
            float f7 = fArr2[5];
            float[] fArr3 = c4211e2.ad;
            license.add(AbstractC8217e.vip(f2, f3, f4, f5, f6, f7, fArr3[0], fArr3[1]));
        }
        C1169e metrica = AbstractC6874e.metrica(license);
        c17985e2.startapp();
        int subs = metrica.subs();
        int i3 = 0;
        boolean z2 = true;
        while (i3 < subs) {
            C4211e c4211e4 = (C4211e) metrica.get(i3);
            if (z2) {
                float[] fArr4 = c4211e4.ad;
                c17985e2.purchase(fArr4[0], fArr4[1]);
                z = false;
            } else {
                z = z2;
            }
            float[] fArr5 = c4211e4.ad;
            c17985e2.metrica(fArr5[2], fArr5[3], fArr5[4], fArr5[5], c4211e4.ad(), c4211e4.vip());
            i3++;
            c17985e2 = c17985e;
            z2 = z;
        }
        c17985e.vip();
        return c17985e;
    }

    public static final void metrica(int i, int i2, Object[] objArr) {
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    public static synchronized C17856e purchase(C6758e c6758e) {
        C17856e c17856e;
        synchronized (AbstractC5797e.class) {
            try {
                if (ad == null) {
                    ad = new C8496e(2);
                }
                c17856e = (C17856e) ad.m4615e(c6758e);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c17856e;
    }

    public static InterfaceC8850e vip(InterfaceC8850e interfaceC8850e, InterfaceC8850e interfaceC8850e2) {
        if (interfaceC8850e2 == C2693e.f6576e) {
            return interfaceC8850e;
        }
        return (InterfaceC8850e) interfaceC8850e2.mo395e(interfaceC8850e, new C8436e((byte) 0, 4));
    }
}
