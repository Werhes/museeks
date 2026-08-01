package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؓۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2042e extends AbstractC15855e implements InterfaceC3833e {

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public C13043e f5322e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public final C2042e f5323e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2042e(InterfaceC2188e interfaceC2188e, InterfaceC2460e interfaceC2460e, int i, C8268e c8268e, boolean z, boolean z2, boolean z3, int i2, C2042e c2042e, InterfaceC3054e interfaceC3054e) {
        super(i, c8268e, interfaceC2188e, interfaceC2460e, C0520e.billing("<set-" + interfaceC2188e.getName() + ">"), z, z2, z3, i2, interfaceC3054e);
        if (interfaceC2460e == null) {
            m756e(1);
            throw null;
        }
        if (i == 0) {
            m756e(2);
            throw null;
        }
        if (c8268e == null) {
            m756e(3);
            throw null;
        }
        if (i2 == 0) {
            m756e(4);
            throw null;
        }
        if (interfaceC3054e == null) {
            m756e(5);
            throw null;
        }
        this.f5323e = c2042e != null ? c2042e : this;
    }

    /* renamed from: eّؑۛ, reason: contains not printable characters */
    public static C13043e m755e(C2042e c2042e, AbstractC1186e abstractC1186e, InterfaceC2460e interfaceC2460e) {
        if (abstractC1186e == null) {
            m756e(8);
            throw null;
        }
        if (interfaceC2460e != null) {
            return new C13043e(c2042e, null, 0, interfaceC2460e, AbstractC13893e.billing, abstractC1186e, false, false, false, null, InterfaceC3054e.f7112e);
        }
        m756e(9);
        throw null;
    }

    /* renamed from: e٘ؖٞ, reason: contains not printable characters */
    public static /* synthetic */ void m756e(int i) {
        String str;
        int i2;
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 9:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "parameter";
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // defpackage.AbstractC16946e, defpackage.AbstractC2214e, defpackage.InterfaceC15498e
    /* renamed from: eٖؗۘ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C2042e vip() {
        C2042e c2042e = this.f5323e;
        if (c2042e != null) {
            return c2042e;
        }
        m756e(13);
        throw null;
    }

    @Override // defpackage.InterfaceC15498e
    /* renamed from: eؘٟ٘, reason: contains not printable characters */
    public final Object mo758e(InterfaceC5369e interfaceC5369e, Object obj) {
        return interfaceC5369e.smaato(this, obj);
    }

    @Override // defpackage.InterfaceC6647e
    /* renamed from: e٘ۚۧ */
    public final List mo330e() {
        C13043e c13043e = this.f5322e;
        if (c13043e == null) {
            throw new IllegalStateException();
        }
        List singletonList = Collections.singletonList(c13043e);
        if (singletonList != null) {
            return singletonList;
        }
        m756e(11);
        throw null;
    }

    @Override // defpackage.InterfaceC0390e, defpackage.InterfaceC6647e
    /* renamed from: finally */
    public final Collection mo337finally() {
        return m4029e(false);
    }

    @Override // defpackage.InterfaceC6647e
    public final AbstractC1186e inmobi() {
        return AbstractC2876e.appmetrica(this).isVip();
    }
}
