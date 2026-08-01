package defpackage;

import java.io.IOException;
import java.util.Locale;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖٞۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4265e {
    public static final C2892e ad = new C2892e(1752947294, false, new C8436e(0, 0));
    public static final C2892e vip = new C2892e(1238711670, false, new C8580e(9));
    public static final C2892e metrica = new C2892e(-1975174163, false, new C8580e(10));
    public static final C2892e license = new C2892e(1761809070, false, new C8580e(11));

    /* JADX WARN: Type inference failed for: r1v0, types: [eَّۙ, java.lang.Object] */
    public static C9967e ad(byte[] bArr) {
        int length = bArr.length;
        ?? obj = new Object();
        obj.write(bArr, 0, length);
        return new C9967e(obj);
    }

    public static void appmetrica(int i, int i2, int i3, String str) {
        if (i < i2) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(str + " is out of range of [" + i2 + ", " + i3 + "] (too low)");
        }
        if (i <= i3) {
            return;
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException(str + " is out of range of [" + i2 + ", " + i3 + "] (too high)");
    }

    public static void billing(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(String.valueOf(str));
        }
    }

    public static void license(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void metrica(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void purchase(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static int startapp(int i, int i2, int i3) {
        if ((i2 & 8) != 0) {
            i--;
        }
        if (i3 <= i) {
            return i - i3;
        }
        throw new IOException(AbstractC1786e.Signature(i3, i, "PROTOCOL_ERROR padding ", " > remaining length "));
    }

    public static final C10574e vip(C14542e c14542e, Throwable th) {
        InterfaceC4082e interfaceC4082e;
        if (th instanceof C18229e) {
            Function1 function1 = c14542e.admob;
            C13661e c13661e = c14542e.isVip;
            interfaceC4082e = (InterfaceC4082e) function1.invoke(c14542e);
            if (interfaceC4082e == null) {
                interfaceC4082e = (InterfaceC4082e) c13661e.adcel.invoke(c14542e);
            }
            if (interfaceC4082e == null && (interfaceC4082e = (InterfaceC4082e) c14542e.Signature.invoke(c14542e)) == null) {
                interfaceC4082e = (InterfaceC4082e) c13661e.startapp.invoke(c14542e);
            }
        } else {
            interfaceC4082e = (InterfaceC4082e) c14542e.Signature.invoke(c14542e);
            if (interfaceC4082e == null) {
                interfaceC4082e = (InterfaceC4082e) c14542e.isVip.startapp.invoke(c14542e);
            }
        }
        return new C10574e(interfaceC4082e, c14542e, th);
    }

    public static void yandex(String str, boolean z) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }
}
