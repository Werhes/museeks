package defpackage;

import androidx.car.app.model.Alert;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import java.lang.reflect.Method;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٕۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC12501e {
    public static final int[] ad = {1, 10, 100, 1000, ModuleDescriptor.MODULE_VERSION, 100000, 1000000, 10000000, 100000000, 1000000000};
    public static final int[] vip = {1, 2, 4, 5, 7, 8, 10, 11, 13, 14};
    public static final int[] metrica = {3, 6};
    public static final int[] license = {1, 2, 4, 5, 7, 8};

    public static C14137e ad(int i, int i2, Function1 function1, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            function1 = null;
        }
        if (i == -2) {
            if (i2 != 1) {
                return new C13134e(1, i2, function1);
            }
            InterfaceC0888e.startapp.getClass();
            return new C14137e(C18097e.vip, function1);
        }
        if (i != -1) {
            return i != 0 ? i != Integer.MAX_VALUE ? i2 == 1 ? new C14137e(i, function1) : new C13134e(i, i2, function1) : new C14137e(Alert.DURATION_SHOW_INDEFINITELY, function1) : i2 == 1 ? new C14137e(0, function1) : new C13134e(1, i2, function1);
        }
        if (i2 == 1) {
            return new C13134e(1, 2, function1);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }

    public static final C4625e billing(String str, String str2, int i, Function1 function1) {
        char charAt = str.charAt(i);
        if (((Boolean) function1.invoke(Character.valueOf(charAt))).booleanValue()) {
            return null;
        }
        return yandex(str, "Expected " + str2 + ", but got '" + charAt + "' at position " + i);
    }

    public static final void license(StringBuilder sb, StringBuilder sb2, int i) {
        if (i < 10) {
            sb.append('0');
        }
        sb2.append(i);
    }

    public static Method metrica(Class cls, Class... clsArr) {
        Method method = null;
        while (cls != null) {
            try {
                method = cls.getDeclaredMethod("get", clsArr);
            } catch (NoSuchMethodException unused) {
            }
            cls = cls.getSuperclass();
        }
        if (method == null) {
            throw new NoSuchMethodException("methodName == get");
        }
        method.setAccessible(true);
        return method;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x009f, code lost:
    
        if (defpackage.AbstractC7890e.billing(((defpackage.C15381e) r3).startapp, "java/lang/Object") != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0100, code lost:
    
        return defpackage.AbstractC5209e.purchase(defpackage.AbstractC11957e.billing(r6.ad(), true));
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f0, code lost:
    
        if (defpackage.AbstractC2876e.billing(r2).equals(defpackage.AbstractC2876e.billing(r0)) == false) goto L53;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.AbstractC17308e purchase(defpackage.InterfaceC16528e r5, defpackage.C13043e r6) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC12501e.purchase(eٖ۟ؖ, eْؖؕ):eْٗ۠");
    }

    public static final String smaato(int i, String str) {
        if (str.length() <= i) {
            return str.toString();
        }
        return str.subSequence(0, i).toString() + "...";
    }

    public static final int startapp(int i, String str) {
        return (str.charAt(i + 1) - '0') + ((str.charAt(i) - '0') * 10);
    }

    public static boolean vip(InterfaceC6647e interfaceC6647e, InterfaceC6647e interfaceC6647e2) {
        if (!(interfaceC6647e2 instanceof C0782e) || !(interfaceC6647e instanceof InterfaceC16528e)) {
            return false;
        }
        C0782e c0782e = (C0782e) interfaceC6647e2;
        c0782e.mo330e().size();
        InterfaceC16528e interfaceC16528e = (InterfaceC16528e) interfaceC6647e;
        interfaceC16528e.mo330e().size();
        Iterator it = AbstractC13480e.m3579e(interfaceC16528e.vip().mo330e(), c0782e.vip().mo330e()).iterator();
        while (it.hasNext()) {
            C6571e c6571e = (C6571e) it.next();
            if ((purchase((InterfaceC16528e) interfaceC6647e2, (C13043e) c6571e.f13544e) instanceof C12250e) != (purchase(interfaceC16528e, (C13043e) c6571e.f13543e) instanceof C12250e)) {
                return true;
            }
        }
        return false;
    }

    public static final C4625e yandex(String str, String str2) {
        StringBuilder isPro = AbstractC8703e.isPro(str2, " when parsing an Instant from \"");
        isPro.append(smaato(64, str));
        isPro.append('\"');
        return new C4625e(isPro.toString(), str);
    }

    public void adcel(boolean z) {
    }

    public abstract void advert(int i);

    public abstract void appmetrica();

    public abstract void mopub(boolean z);
}
