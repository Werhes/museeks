package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌِٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC16946e extends AbstractC2214e implements InterfaceC7573e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final InterfaceC3054e f33185e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final InterfaceC15498e f33186e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC16946e(InterfaceC15498e interfaceC15498e, InterfaceC2460e interfaceC2460e, C0520e c0520e, InterfaceC3054e interfaceC3054e) {
        super(interfaceC2460e, c0520e);
        if (interfaceC15498e == null) {
            m4230e(0);
            throw null;
        }
        if (interfaceC2460e == null) {
            m4230e(1);
            throw null;
        }
        if (c0520e == null) {
            m4230e(2);
            throw null;
        }
        if (interfaceC3054e == null) {
            m4230e(3);
            throw null;
        }
        this.f33186e = interfaceC15498e;
        this.f33185e = interfaceC3054e;
    }

    /* renamed from: e٘ؖٞ, reason: contains not printable characters */
    public static /* synthetic */ void m4230e(int i) {
        String str = (i == 4 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 4) {
            objArr[1] = "getOriginal";
        } else if (i == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 4 && i != 5 && i != 6) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i != 4 && i != 5 && i != 6) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public InterfaceC3054e adcel() {
        InterfaceC3054e interfaceC3054e = this.f33185e;
        if (interfaceC3054e != null) {
            return interfaceC3054e;
        }
        m4230e(6);
        throw null;
    }

    @Override // defpackage.AbstractC2214e, defpackage.InterfaceC15498e
    /* renamed from: eَٔٞ */
    public InterfaceC7573e vip() {
        return this;
    }

    /* renamed from: switch */
    public InterfaceC15498e mo1351switch() {
        InterfaceC15498e interfaceC15498e = this.f33186e;
        if (interfaceC15498e != null) {
            return interfaceC15498e;
        }
        m4230e(5);
        throw null;
    }
}
