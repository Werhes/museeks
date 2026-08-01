package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓۥؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2214e extends Cpackage implements InterfaceC15498e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C0520e f5613e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2214e(InterfaceC2460e interfaceC2460e, C0520e c0520e) {
        super(interfaceC2460e);
        if (interfaceC2460e == null) {
            m767e(0);
            throw null;
        }
        if (c0520e == null) {
            m767e(1);
            throw null;
        }
        this.f5613e = c0520e;
    }

    /* renamed from: eؚۚۦ, reason: contains not printable characters */
    public static String m766e(InterfaceC15498e interfaceC15498e) {
        try {
            String str = C8746e.appmetrica.tapsense(interfaceC15498e) + "[" + interfaceC15498e.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(interfaceC15498e)) + "]";
            if (str != null) {
                return str;
            }
            m767e(5);
            throw null;
        } catch (Throwable unused) {
            String str2 = interfaceC15498e.getClass().getSimpleName() + " " + interfaceC15498e.getName();
            if (str2 != null) {
                return str2;
            }
            m767e(6);
            throw null;
        }
    }

    /* renamed from: e٘ؖٞ, reason: contains not printable characters */
    public static /* synthetic */ void m767e(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 5 || i == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (i != 2 && i != 3) {
            if (i == 4) {
                objArr[2] = "toString";
            } else if (i != 5 && i != 6) {
                objArr[2] = "<init>";
            }
        }
        String format = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 5 && i != 6) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // defpackage.InterfaceC15498e
    public final C0520e getName() {
        C0520e c0520e = this.f5613e;
        if (c0520e != null) {
            return c0520e;
        }
        m767e(2);
        throw null;
    }

    public String toString() {
        return m766e(this);
    }

    public InterfaceC15498e vip() {
        return this;
    }
}
