package defpackage;

import java.util.Arrays;
import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۚؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC10510e {
    public static final C16372e ad = new C16372e("InvalidModuleNotifier", 2);

    public static final String ad(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final Object appmetrica(Object[] objArr, InterfaceC12163e interfaceC12163e, Function0 function0, C13770e c13770e, int i) {
        return metrica(Arrays.copyOf(objArr, objArr.length), interfaceC12163e, function0, c13770e, ((i << 3) & 7168) | (i & 112) | 384);
    }

    public static final C11303e billing(C7088e c7088e) {
        return new C11303e(c7088e.ad, c7088e.vip, c7088e.metrica, c7088e.license);
    }

    public static final Object license(Object[] objArr, Function0 function0, C13770e c13770e) {
        return metrica(Arrays.copyOf(objArr, objArr.length), AbstractC17514e.ad, function0, c13770e, 3456);
    }

    public static final Object metrica(Object[] objArr, InterfaceC12163e interfaceC12163e, Function0 function0, C13770e c13770e, int i) {
        Object[] objArr2;
        InterfaceC12163e interfaceC12163e2;
        Object obj;
        Object appmetrica;
        long j = c13770e.f27286case;
        AbstractC15211e.ad(36);
        String l = Long.toString(j, 36);
        InterfaceC5039e interfaceC5039e = (InterfaceC5039e) c13770e.adcel(AbstractC5991e.ad);
        Object m3681throw = c13770e.m3681throw();
        Object obj2 = C2987e.ad;
        if (m3681throw == obj2) {
            Object startapp = (interfaceC5039e == null || (appmetrica = interfaceC5039e.appmetrica(l)) == null) ? null : interfaceC12163e.startapp(appmetrica);
            if (startapp == null) {
                startapp = function0.invoke();
            }
            objArr2 = objArr;
            interfaceC12163e2 = interfaceC12163e;
            Object c13840e = new C13840e(interfaceC12163e2, interfaceC5039e, l, startapp, objArr2);
            c13770e.m3682throws(c13840e);
            m3681throw = c13840e;
        } else {
            objArr2 = objArr;
            interfaceC12163e2 = interfaceC12163e;
        }
        C13840e c13840e2 = (C13840e) m3681throw;
        Object obj3 = Arrays.equals(objArr2, c13840e2.f27412e) ? c13840e2.f27415e : null;
        if (obj3 == null) {
            obj3 = function0.invoke();
        }
        boolean yandex = c13770e.yandex(c13840e2) | ((((i & 112) ^ 48) > 32 && c13770e.yandex(interfaceC12163e2)) || (i & 48) == 32) | c13770e.yandex(interfaceC5039e) | c13770e.purchase(l) | c13770e.yandex(obj3) | c13770e.yandex(objArr2);
        Object m3681throw2 = c13770e.m3681throw();
        if (yandex || m3681throw2 == obj2) {
            Object[] objArr3 = objArr2;
            obj = obj3;
            Object c8841e = new C8841e(c13840e2, interfaceC12163e2, interfaceC5039e, l, obj, objArr3, 0);
            c13770e.m3682throws(c8841e);
            m3681throw2 = c8841e;
        } else {
            obj = obj3;
        }
        AbstractC17680e.purchase((Function0) m3681throw2, c13770e);
        return obj;
    }

    public static C9265e purchase(int i, boolean z, C7232e c7232e, int i2) {
        boolean z2 = (i2 & 1) != 0 ? false : z;
        boolean z3 = (i2 & 2) == 0;
        if ((i2 & 4) != 0) {
            c7232e = null;
        }
        return new C9265e(i, z3, z2, c7232e != null ? Collections.singleton(c7232e) : null, 34);
    }

    public static boolean vip(char c) {
        if (c < 'A' || c > 'Z') {
            return c >= '0' && c <= '9';
        }
        return true;
    }
}
