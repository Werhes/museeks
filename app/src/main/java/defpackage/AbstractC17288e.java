package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗ۟ٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC17288e extends AbstractC16946e implements InterfaceC16046e {

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final C0394e f33915e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final int f33916e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final C6272e f33917e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final C0394e f33918e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final boolean f33919e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final int f33920e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v1, types: [eٖؑٚ, eٖۥٌ] */
    /* JADX WARN: Type inference failed for: r4v3, types: [eٖؑٚ, eٖۥٌ] */
    public AbstractC17288e(InterfaceC11542e interfaceC11542e, InterfaceC15498e interfaceC15498e, InterfaceC2460e interfaceC2460e, C0520e c0520e, int i, boolean z, int i2, C5107e c5107e) {
        super(interfaceC15498e, interfaceC2460e, c0520e, InterfaceC3054e.f7112e);
        if (interfaceC11542e == null) {
            m4275e(0);
            throw null;
        }
        if (interfaceC15498e == null) {
            m4275e(1);
            throw null;
        }
        if (interfaceC2460e == null) {
            m4275e(2);
            throw null;
        }
        if (c0520e == null) {
            m4275e(3);
            throw null;
        }
        if (i == 0) {
            m4275e(4);
            throw null;
        }
        if (c5107e == null) {
            m4275e(6);
            throw null;
        }
        this.f33920e = i;
        this.f33919e = z;
        this.f33916e = i2;
        C7965e c7965e = new C7965e(this, interfaceC11542e, c5107e);
        C6272e c6272e = (C6272e) interfaceC11542e;
        this.f33918e = new C16622e(c6272e, c7965e);
        this.f33915e = new C16622e(c6272e, new C12056e(this, c0520e, false, 1));
        this.f33917e = c6272e;
    }

    /* renamed from: e٘ؖٞ, reason: contains not printable characters */
    public static /* synthetic */ void m4275e(int i) {
        String str;
        int i2;
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                i2 = 2;
                break;
            case 12:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
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
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                throw new IllegalStateException(format);
            case 12:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // defpackage.InterfaceC16046e
    /* renamed from: eؒؓٙ */
    public final int mo2738e() {
        int i = this.f33920e;
        if (i != 0) {
            return i;
        }
        m4275e(7);
        throw null;
    }

    @Override // defpackage.InterfaceC16046e
    /* renamed from: eؒٞ٘ */
    public final boolean mo2739e() {
        return this.f33919e;
    }

    @Override // defpackage.InterfaceC4077e
    /* renamed from: eٟؒؗ */
    public final AbstractC10226e mo1458e() {
        AbstractC10226e abstractC10226e = (AbstractC10226e) this.f33915e.invoke();
        if (abstractC10226e != null) {
            return abstractC10226e;
        }
        m4275e(10);
        throw null;
    }

    @Override // defpackage.InterfaceC16046e
    /* renamed from: eٌؚۛ */
    public final InterfaceC11542e mo2740e() {
        C6272e c6272e = this.f33917e;
        if (c6272e != null) {
            return c6272e;
        }
        m4275e(14);
        throw null;
    }

    @Override // defpackage.InterfaceC16046e
    /* renamed from: eٍؙۨ */
    public final boolean mo2741e() {
        return false;
    }

    @Override // defpackage.AbstractC16946e
    /* renamed from: eَٔٞ */
    public final InterfaceC7573e vip() {
        return this;
    }

    /* renamed from: eٖٕٚ */
    public abstract List mo609e();

    /* renamed from: eّٖٗ */
    public List mo2272e(List list) {
        return list;
    }

    @Override // defpackage.InterfaceC15498e
    /* renamed from: eؘٟ٘ */
    public final Object mo758e(InterfaceC5369e interfaceC5369e, Object obj) {
        return interfaceC5369e.billing(this, obj);
    }

    @Override // defpackage.InterfaceC16046e
    public final int getIndex() {
        return this.f33916e;
    }

    @Override // defpackage.InterfaceC16046e
    public final List getUpperBounds() {
        List ad = ((C11946e) mo1459goto()).ad();
        if (ad != null) {
            return ad;
        }
        m4275e(8);
        throw null;
    }

    @Override // defpackage.InterfaceC16046e, defpackage.InterfaceC4077e
    /* renamed from: goto */
    public final InterfaceC5021e mo1459goto() {
        InterfaceC5021e interfaceC5021e = (InterfaceC5021e) this.f33918e.invoke();
        if (interfaceC5021e != null) {
            return interfaceC5021e;
        }
        m4275e(9);
        throw null;
    }

    @Override // defpackage.AbstractC16946e, defpackage.AbstractC2214e, defpackage.InterfaceC15498e
    public final InterfaceC4077e vip() {
        return this;
    }

    @Override // defpackage.AbstractC16946e, defpackage.AbstractC2214e, defpackage.InterfaceC15498e
    public final InterfaceC15498e vip() {
        return this;
    }

    @Override // defpackage.AbstractC16946e, defpackage.AbstractC2214e, defpackage.InterfaceC15498e
    public final InterfaceC16046e vip() {
        return this;
    }
}
