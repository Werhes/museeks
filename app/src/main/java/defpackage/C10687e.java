package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۧۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10687e extends C7283e implements InterfaceC18168e {

    /* renamed from: eؘؑۦ, reason: contains not printable characters */
    public Boolean f21049e;

    /* renamed from: eؘِْ, reason: contains not printable characters */
    public Boolean f21050e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10687e(InterfaceC5052e interfaceC5052e, C10687e c10687e, InterfaceC2460e interfaceC2460e, boolean z, int i, InterfaceC3054e interfaceC3054e) {
        super(interfaceC5052e, c10687e, interfaceC2460e, z, i, interfaceC3054e);
        if (interfaceC5052e == null) {
            m2904e(0);
            throw null;
        }
        if (interfaceC2460e == null) {
            m2904e(1);
            throw null;
        }
        if (i == 0) {
            m2904e(2);
            throw null;
        }
        if (interfaceC3054e == null) {
            m2904e(3);
            throw null;
        }
        this.f21049e = null;
        this.f21050e = null;
    }

    /* renamed from: eّؑ۠, reason: contains not printable characters */
    public static C10687e m2903e(InterfaceC5052e interfaceC5052e, InterfaceC2460e interfaceC2460e, boolean z, C10253e c10253e) {
        if (interfaceC5052e != null) {
            return new C10687e(interfaceC5052e, null, interfaceC2460e, z, 1, c10253e);
        }
        m2904e(4);
        throw null;
    }

    /* renamed from: e٘ؖٞ, reason: contains not printable characters */
    public static /* synthetic */ void m2904e(int i) {
        String str = (i == 11 || i == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 11 || i == 18) ? 2 : 3];
        switch (i) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = "source";
                break;
            case 4:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i != 11 && i != 18) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // defpackage.C7283e, defpackage.AbstractC14957e
    /* renamed from: eّؑۛ */
    public final /* bridge */ /* synthetic */ AbstractC14957e mo361e(int i, InterfaceC2460e interfaceC2460e, InterfaceC15498e interfaceC15498e, InterfaceC16528e interfaceC16528e, C0520e c0520e, InterfaceC3054e interfaceC3054e) {
        return m2905e(interfaceC15498e, interfaceC16528e, i, interfaceC2460e, interfaceC3054e);
    }

    @Override // defpackage.InterfaceC18168e
    /* renamed from: eۣؒ */
    public final InterfaceC18168e mo403e(AbstractC1186e abstractC1186e, ArrayList arrayList, AbstractC1186e abstractC1186e2, C6571e c6571e) {
        if (abstractC1186e2 == null) {
            m2904e(17);
            throw null;
        }
        C10687e m2905e = m2905e(mo1351switch(), null, mo334e(), getAnnotations(), adcel());
        m2905e.mo470e(abstractC1186e != null ? AbstractC7518e.yandex(m2905e, abstractC1186e, C4590e.f9885e) : null, this.f29668e, C13664e.f27089e, getTypeParameters(), AbstractC16619e.vip(arrayList, mo330e(), m2905e), abstractC1186e2, mo1718extends(), advert());
        if (c6571e != null) {
            m2905e.m3895e((C15378e) c6571e.f13544e, c6571e.f13543e);
        }
        return m2905e;
    }

    @Override // defpackage.AbstractC14957e, defpackage.InterfaceC6647e
    /* renamed from: eؘؗؕ */
    public final boolean mo328e() {
        return this.f21050e.booleanValue();
    }

    @Override // defpackage.C7283e
    /* renamed from: eًؕ۟ */
    public final /* bridge */ /* synthetic */ C7283e mo361e(int i, InterfaceC2460e interfaceC2460e, InterfaceC15498e interfaceC15498e, InterfaceC16528e interfaceC16528e, C0520e c0520e, InterfaceC3054e interfaceC3054e) {
        return m2905e(interfaceC15498e, interfaceC16528e, i, interfaceC2460e, interfaceC3054e);
    }

    /* renamed from: eٍٜؓ, reason: contains not printable characters */
    public final C10687e m2905e(InterfaceC15498e interfaceC15498e, InterfaceC16528e interfaceC16528e, int i, InterfaceC2460e interfaceC2460e, InterfaceC3054e interfaceC3054e) {
        if (interfaceC15498e == null) {
            m2904e(7);
            throw null;
        }
        if (i == 0) {
            m2904e(8);
            throw null;
        }
        if (interfaceC2460e == null) {
            m2904e(9);
            throw null;
        }
        if (interfaceC3054e == null) {
            m2904e(10);
            throw null;
        }
        if (i != 1 && i != 4) {
            throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + interfaceC15498e + "\nkind: " + AbstractC10257e.premium(i));
        }
        InterfaceC5052e interfaceC5052e = (InterfaceC5052e) interfaceC15498e;
        C10687e c10687e = (C10687e) interfaceC16528e;
        if (i == 0) {
            m2904e(13);
            throw null;
        }
        C10687e c10687e2 = new C10687e(interfaceC5052e, c10687e, interfaceC2460e, this.f14891e, i, interfaceC3054e);
        Boolean bool = this.f21049e;
        bool.getClass();
        c10687e2.f21049e = bool;
        Boolean bool2 = this.f21050e;
        bool2.getClass();
        c10687e2.f21050e = bool2;
        return c10687e2;
    }

    @Override // defpackage.AbstractC14957e
    /* renamed from: eؚؚْ, reason: contains not printable characters */
    public final void mo2906e(boolean z) {
        this.f21049e = Boolean.valueOf(z);
    }

    @Override // defpackage.AbstractC14957e
    /* renamed from: eًٜ٘, reason: contains not printable characters */
    public final void mo2907e(boolean z) {
        this.f21050e = Boolean.valueOf(z);
    }
}
