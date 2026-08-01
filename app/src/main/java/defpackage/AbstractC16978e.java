package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٖٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC16978e {
    public static final C8268e ad;
    public static final HashMap license;
    public static final C8268e metrica;
    public static final C8268e vip;

    static {
        C4824e c4824e = C4824e.f10283e;
        C8268e c8268e = new C8268e(c4824e, 9);
        ad = c8268e;
        C4824e c4824e2 = C4824e.f10293e;
        C8268e c8268e2 = new C8268e(c4824e2, 10);
        vip = c8268e2;
        C4824e c4824e3 = C4824e.f10294e;
        C8268e c8268e3 = new C8268e(c4824e3, 11);
        metrica = c8268e3;
        HashMap hashMap = new HashMap();
        license = hashMap;
        hashMap.put(c4824e, c8268e);
        hashMap.put(c4824e2, c8268e2);
        hashMap.put(c4824e3, c8268e3);
    }

    public static /* synthetic */ void ad(int i) {
        String str = (i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i == 5 || i == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i == 2 || i == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (i != 5 && i != 6) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        String format = String.format(str, objArr);
        if (i != 5 && i != 6) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static boolean metrica(InterfaceC0091e interfaceC0091e, InterfaceC15498e interfaceC15498e) {
        if (interfaceC0091e == null) {
            ad(2);
            throw null;
        }
        if (interfaceC15498e == null) {
            ad(3);
            throw null;
        }
        InterfaceC9646e interfaceC9646e = (InterfaceC9646e) AbstractC14300e.yandex(interfaceC0091e, InterfaceC9646e.class, false);
        InterfaceC9646e interfaceC9646e2 = (InterfaceC9646e) AbstractC14300e.yandex(interfaceC15498e, InterfaceC9646e.class, false);
        return (interfaceC9646e2 == null || interfaceC9646e == null || !((AbstractC14941e) interfaceC9646e).f29618e.equals(((AbstractC14941e) interfaceC9646e2).f29618e)) ? false : true;
    }

    public static boolean vip(InterfaceC13969e interfaceC13969e, InterfaceC0091e interfaceC0091e, InterfaceC15498e interfaceC15498e) {
        InterfaceC0091e interfaceC0091e2;
        if (interfaceC15498e == null) {
            ad(1);
            throw null;
        }
        if (interfaceC0091e instanceof InterfaceC0390e) {
            interfaceC0091e2 = AbstractC14300e.subscription((InterfaceC0390e) interfaceC0091e);
        } else {
            int i = AbstractC14300e.ad;
            interfaceC0091e2 = interfaceC0091e;
        }
        if (metrica(interfaceC0091e2, interfaceC15498e)) {
            return true;
        }
        return AbstractC6050e.metrica.ad(interfaceC13969e, interfaceC0091e, interfaceC15498e);
    }
}
