package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1412e extends AbstractC17288e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1412e(InterfaceC11542e interfaceC11542e, InterfaceC15498e interfaceC15498e, InterfaceC2460e interfaceC2460e, C0520e c0520e, int i, boolean z, int i2, C5107e c5107e) {
        super(interfaceC11542e, interfaceC15498e, interfaceC2460e, c0520e, i, z, i2, c5107e);
        if (interfaceC11542e == null) {
            m602e(0);
            throw null;
        }
        if (interfaceC15498e == null) {
            m602e(1);
            throw null;
        }
        if (i == 0) {
            m602e(4);
            throw null;
        }
        if (c5107e != null) {
        } else {
            m602e(6);
            throw null;
        }
    }

    /* renamed from: e٘ؖٞ, reason: contains not printable characters */
    public static /* synthetic */ void m602e(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // defpackage.AbstractC2214e
    public final String toString() {
        boolean z = this.f33919e;
        String str = BuildConfig.FLAVOR;
        String str2 = z ? "reified " : BuildConfig.FLAVOR;
        if (mo2738e() != 1) {
            str = AbstractC8647e.m2461throw(mo2738e()).concat(" ");
        }
        return str2 + str + getName();
    }
}
