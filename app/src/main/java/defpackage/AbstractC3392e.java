package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٖؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3392e extends AbstractC15349e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final InterfaceC15498e f7603e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final InterfaceC3054e f7604e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3392e(InterfaceC11542e interfaceC11542e, InterfaceC15498e interfaceC15498e, C0520e c0520e, InterfaceC3054e interfaceC3054e) {
        super(interfaceC11542e, c0520e);
        if (interfaceC11542e == null) {
            billing(0);
            throw null;
        }
        if (interfaceC15498e == null) {
            billing(1);
            throw null;
        }
        if (c0520e == null) {
            billing(2);
            throw null;
        }
        this.f7603e = interfaceC15498e;
        this.f7604e = interfaceC3054e;
    }

    public static /* synthetic */ void billing(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i == 2) {
            objArr[0] = "name";
        } else if (i == 3) {
            objArr[0] = "source";
        } else if (i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 4 && i != 5) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i != 4 && i != 5) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // defpackage.InterfaceC7573e
    public final InterfaceC3054e adcel() {
        InterfaceC3054e interfaceC3054e = this.f7604e;
        if (interfaceC3054e != null) {
            return interfaceC3054e;
        }
        billing(5);
        throw null;
    }

    @Override // defpackage.InterfaceC17577e
    /* renamed from: eْٗۚ */
    public boolean mo466e() {
        return false;
    }

    @Override // defpackage.InterfaceC15498e
    /* renamed from: switch, reason: not valid java name */
    public final InterfaceC15498e mo1351switch() {
        InterfaceC15498e interfaceC15498e = this.f7603e;
        if (interfaceC15498e != null) {
            return interfaceC15498e;
        }
        billing(4);
        throw null;
    }
}
