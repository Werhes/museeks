package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُْٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16169e extends AbstractC2214e implements InterfaceC12132e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final InterfaceC15498e f31777e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ int f31778e = 0;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final InterfaceC13969e f31779e;

    public C16169e(InterfaceC5052e interfaceC5052e) {
        super(C4590e.f9885e, AbstractC13893e.license);
        this.f31777e = interfaceC5052e;
        this.f31779e = new C10300e(interfaceC5052e);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C16169e(InterfaceC15498e interfaceC15498e, Cpackage cpackage, InterfaceC2460e interfaceC2460e) {
        this(interfaceC15498e, cpackage, interfaceC2460e, AbstractC13893e.license);
        if (interfaceC15498e == null) {
            m4138e(0);
            throw null;
        }
        if (interfaceC2460e != null) {
        } else {
            m4138e(2);
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16169e(InterfaceC15498e interfaceC15498e, Cpackage cpackage, InterfaceC2460e interfaceC2460e, C0520e c0520e) {
        super(interfaceC2460e, c0520e);
        if (interfaceC15498e == null) {
            m4138e(3);
            throw null;
        }
        if (interfaceC2460e == null) {
            m4138e(5);
            throw null;
        }
        if (c0520e == null) {
            m4138e(6);
            throw null;
        }
        this.f31777e = interfaceC15498e;
        this.f31779e = cpackage;
    }

    /* renamed from: eٍٟٙ, reason: contains not printable characters */
    public static /* synthetic */ void m4138e(int i) {
        String str = (i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 7 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
            case 4:
                objArr[0] = "value";
                break;
            case 2:
            case 5:
                objArr[0] = "annotations";
                break;
            case 3:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 6:
                objArr[0] = "name";
                break;
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 9:
                objArr[0] = "newOwner";
                break;
            case 10:
                objArr[0] = "outType";
                break;
        }
        if (i == 7) {
            objArr[1] = "getValue";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        switch (i) {
            case 7:
            case 8:
                break;
            case 9:
                objArr[2] = "copy";
                break;
            case 10:
                objArr[2] = "setOutType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i != 7 && i != 8) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    /* renamed from: eَٔٞ, reason: contains not printable characters */
    public static /* synthetic */ void m4139e(int i) {
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
            case 11:
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
            case 11:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "substitutor";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 5:
                objArr[1] = "getTypeParameters";
                break;
            case 6:
                objArr[1] = "getType";
                break;
            case 7:
                objArr[1] = "getValueParameters";
                break;
            case 8:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 9:
                objArr[1] = "getVisibility";
                break;
            case 10:
                objArr[1] = "getOriginal";
                break;
            case 11:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i) {
            case 3:
                objArr[2] = "substitute";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
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
            case 11:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    /* renamed from: e٘ؖٞ, reason: contains not printable characters */
    public static /* synthetic */ void m4140e(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2) ? 2 : 3];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else if (i != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i == 1) {
            objArr[1] = "getValue";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i != 1 && i != 2) {
            if (i != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String format = String.format(str, objArr);
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // defpackage.Cpackage, defpackage.InterfaceC13969e, defpackage.InterfaceC1182e
    public final AbstractC1186e ad() {
        AbstractC1186e ad = m4142e().ad();
        if (ad != null) {
            return ad;
        }
        m4139e(6);
        throw null;
    }

    @Override // defpackage.InterfaceC7573e
    public final InterfaceC3054e adcel() {
        return InterfaceC3054e.f7112e;
    }

    @Override // defpackage.InterfaceC0091e
    public final C8268e advert() {
        return AbstractC6050e.purchase;
    }

    @Override // defpackage.InterfaceC6647e
    /* renamed from: eؕؗؑ */
    public final C16169e mo327e() {
        return null;
    }

    @Override // defpackage.InterfaceC6647e
    /* renamed from: eؘؗؕ */
    public final boolean mo328e() {
        return false;
    }

    @Override // defpackage.InterfaceC7681e
    /* renamed from: eٖٕٚ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C16169e remoteconfig(C4542e c4542e) {
        if (c4542e == null) {
            m4139e(3);
            throw null;
        }
        if (!c4542e.ad.appmetrica()) {
            AbstractC1186e startapp = mo1351switch() instanceof InterfaceC5052e ? c4542e.startapp(3, ad()) : c4542e.startapp(1, ad());
            if (startapp == null) {
                return null;
            }
            if (startapp != ad()) {
                return new C16169e(mo1351switch(), new Cpackage(startapp), getAnnotations());
            }
        }
        return this;
    }

    /* renamed from: eّٖٗ, reason: contains not printable characters */
    public final InterfaceC13969e m4142e() {
        switch (this.f31778e) {
            case 0:
                C10300e c10300e = (C10300e) this.f31779e;
                if (c10300e != null) {
                    return c10300e;
                }
                m4140e(1);
                throw null;
            default:
                Cpackage cpackage = (Cpackage) this.f31779e;
                if (cpackage != null) {
                    return cpackage;
                }
                m4138e(7);
                throw null;
        }
    }

    @Override // defpackage.InterfaceC6647e
    /* renamed from: eٌٗۙ */
    public final C16169e mo329e() {
        return null;
    }

    @Override // defpackage.InterfaceC15498e
    /* renamed from: eؘٟ٘ */
    public final Object mo758e(InterfaceC5369e interfaceC5369e, Object obj) {
        return interfaceC5369e.startapp(this, obj);
    }

    @Override // defpackage.InterfaceC6647e
    /* renamed from: e٘ۚۧ */
    public final List mo330e() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        m4139e(7);
        throw null;
    }

    @Override // defpackage.InterfaceC6647e
    /* renamed from: finally */
    public final Collection mo337finally() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        m4139e(8);
        throw null;
    }

    @Override // defpackage.InterfaceC6647e
    public final List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        m4139e(5);
        throw null;
    }

    @Override // defpackage.InterfaceC6647e
    public final AbstractC1186e inmobi() {
        return ad();
    }

    @Override // defpackage.InterfaceC15498e
    /* renamed from: switch */
    public final InterfaceC15498e mo1351switch() {
        switch (this.f31778e) {
            case 0:
                InterfaceC5052e interfaceC5052e = (InterfaceC5052e) this.f31777e;
                if (interfaceC5052e != null) {
                    return interfaceC5052e;
                }
                m4140e(2);
                throw null;
            default:
                InterfaceC15498e interfaceC15498e = this.f31777e;
                if (interfaceC15498e != null) {
                    return interfaceC15498e;
                }
                m4138e(8);
                throw null;
        }
    }

    @Override // defpackage.AbstractC2214e
    public String toString() {
        switch (this.f31778e) {
            case 0:
                return "class " + ((InterfaceC5052e) this.f31777e).getName() + "::this";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.AbstractC2214e, defpackage.InterfaceC15498e
    public final InterfaceC6647e vip() {
        return this;
    }

    @Override // defpackage.AbstractC2214e, defpackage.InterfaceC15498e
    public final InterfaceC15498e vip() {
        return this;
    }
}
