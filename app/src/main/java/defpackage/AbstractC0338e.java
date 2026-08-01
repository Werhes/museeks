package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؑ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0338e extends AbstractC16946e implements InterfaceC8185e {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public AbstractC1186e f2369e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0338e(InterfaceC15498e interfaceC15498e, InterfaceC2460e interfaceC2460e, C0520e c0520e, AbstractC1186e abstractC1186e, InterfaceC3054e interfaceC3054e) {
        super(interfaceC15498e, interfaceC2460e, c0520e, interfaceC3054e);
        if (interfaceC15498e == null) {
            m326e(0);
            throw null;
        }
        if (interfaceC2460e == null) {
            m326e(1);
            throw null;
        }
        if (c0520e == null) {
            m326e(2);
            throw null;
        }
        if (interfaceC3054e == null) {
            m326e(3);
            throw null;
        }
        this.f2369e = abstractC1186e;
    }

    /* renamed from: e٘ؖٞ, reason: contains not printable characters */
    public static /* synthetic */ void m326e(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
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
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 10:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // defpackage.Cpackage, defpackage.InterfaceC13969e, defpackage.InterfaceC1182e
    public final AbstractC1186e ad() {
        AbstractC1186e abstractC1186e = this.f2369e;
        if (abstractC1186e != null) {
            return abstractC1186e;
        }
        m326e(4);
        throw null;
    }

    @Override // defpackage.InterfaceC6647e
    /* renamed from: eؕؗؑ, reason: contains not printable characters */
    public C16169e mo327e() {
        return null;
    }

    @Override // defpackage.InterfaceC6647e
    /* renamed from: eؘؗؕ, reason: contains not printable characters */
    public boolean mo328e() {
        return false;
    }

    @Override // defpackage.InterfaceC6647e
    /* renamed from: eٌٗۙ, reason: contains not printable characters */
    public C16169e mo329e() {
        return null;
    }

    @Override // defpackage.InterfaceC6647e
    /* renamed from: e٘ۚۧ, reason: contains not printable characters */
    public final List mo330e() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        m326e(6);
        throw null;
    }

    @Override // defpackage.InterfaceC6647e
    public List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        m326e(8);
        throw null;
    }

    @Override // defpackage.InterfaceC6647e
    public AbstractC1186e inmobi() {
        AbstractC1186e ad = ad();
        if (ad != null) {
            return ad;
        }
        m326e(10);
        throw null;
    }
}
