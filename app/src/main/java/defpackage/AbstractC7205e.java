package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؚٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7205e {
    public static final C2443e ad;
    public static String metrica = "vk.com";
    public static final C2443e vip;

    static {
        int i = 2;
        ad = new C2443e("REMOVED_TASK", i);
        vip = new C2443e("CLOSED_EMPTY", i);
    }

    public static final C5404e ad(InterfaceC5372e interfaceC5372e, String str) {
        return new C5404e(str, new C7292e(interfaceC5372e));
    }

    public static final int appmetrica(int i, int i2, String str) {
        while (i < i2 && AbstractC15211e.license(str.charAt(i))) {
            i++;
        }
        return i;
    }

    public static final int license(int i, int i2, String str) {
        while (i2 > i && AbstractC15211e.license(str.charAt(i2 - 1))) {
            i2--;
        }
        return i2;
    }

    public static InterfaceC11129e metrica(int i, int i2, String str) {
        String str2;
        int i3;
        int i4;
        int i5 = 0;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        boolean z = (i2 & 8) != 0;
        if (i > AbstractC5304e.crashlytics(str)) {
            InterfaceC11129e.vip.getClass();
            return C2991e.metrica;
        }
        C10990e c10990e = InterfaceC11129e.vip;
        C10095e c10095e = new C10095e(1);
        int crashlytics = AbstractC5304e.crashlytics(str);
        if (i <= crashlytics) {
            i3 = i;
            int i6 = i3;
            i4 = -1;
            while (i5 != 1000) {
                char charAt = str.charAt(i6);
                if (charAt == '&') {
                    str2 = str;
                    vip(c10095e, str2, i3, i4, i6, z);
                    i5++;
                    i3 = i6 + 1;
                    i4 = -1;
                } else if (charAt == '=' && i4 == -1) {
                    str2 = str;
                    i4 = i6;
                } else {
                    str2 = str;
                }
                if (i6 != crashlytics) {
                    i6++;
                    str = str2;
                }
            }
            return c10095e.build();
        }
        str2 = str;
        i3 = i;
        i4 = -1;
        if (i5 != 1000) {
            vip(c10095e, str2, i3, i4, str2.length(), z);
        }
        return c10095e.build();
    }

    public static Object purchase(InterfaceC12424e interfaceC12424e, InterfaceC7227e interfaceC7227e) {
        if (interfaceC12424e instanceof InterfaceC15070e) {
            return ((InterfaceC15070e) interfaceC12424e).mo754static(interfaceC7227e);
        }
        if (!(interfaceC12424e instanceof InterfaceC12424e)) {
            return null;
        }
        InterfaceC12424e interfaceC12424e2 = interfaceC12424e;
        if (interfaceC12424e2.startapp() != interfaceC12424e) {
            return purchase(interfaceC12424e2.startapp(), interfaceC7227e);
        }
        return null;
    }

    public static final void vip(C10095e c10095e, String str, int i, int i2, int i3, boolean z) {
        if (i2 == -1) {
            int appmetrica = appmetrica(i, i3, str);
            int license = license(appmetrica, i3, str);
            if (license > appmetrica) {
                c10095e.mo858e(z ? AbstractC6528e.license(appmetrica, license, 12, str) : str.substring(appmetrica, license), C13664e.f27089e);
                return;
            }
            return;
        }
        int appmetrica2 = appmetrica(i, i2, str);
        int license2 = license(appmetrica2, i2, str);
        if (license2 > appmetrica2) {
            String license3 = z ? AbstractC6528e.license(appmetrica2, license2, 12, str) : str.substring(appmetrica2, license2);
            int appmetrica3 = appmetrica(i2 + 1, i3, str);
            int license4 = license(appmetrica3, i3, str);
            c10095e.mo859e(license3, z ? AbstractC6528e.license(appmetrica3, license4, 8, str) : str.substring(appmetrica3, license4));
        }
    }
}
