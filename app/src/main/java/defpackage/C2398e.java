package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؔ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2398e extends C10162e implements InterfaceC18168e {

    /* renamed from: eًۛٝ, reason: contains not printable characters */
    public final C6571e f6136e;

    /* renamed from: eُٛۜ, reason: contains not printable characters */
    public final boolean f6137e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2398e(InterfaceC15498e interfaceC15498e, InterfaceC2460e interfaceC2460e, int i, C8268e c8268e, boolean z, C0520e c0520e, InterfaceC3054e interfaceC3054e, InterfaceC2188e interfaceC2188e, int i2, boolean z2, C6571e c6571e) {
        super(interfaceC15498e, interfaceC2188e, interfaceC2460e, i, c8268e, z, c0520e, i2, interfaceC3054e, false, false, false, false, false);
        if (interfaceC15498e == null) {
            m828e(0);
            throw null;
        }
        if (interfaceC2460e == null) {
            m828e(1);
            throw null;
        }
        if (i == 0) {
            m828e(2);
            throw null;
        }
        if (c8268e == null) {
            m828e(3);
            throw null;
        }
        if (c0520e == null) {
            m828e(4);
            throw null;
        }
        if (interfaceC3054e == null) {
            m828e(5);
            throw null;
        }
        if (i2 == 0) {
            m828e(6);
            throw null;
        }
        this.f6137e = z2;
        this.f6136e = c6571e;
    }

    /* renamed from: eؚؚْ, reason: contains not printable characters */
    public static C2398e m827e(InterfaceC15498e interfaceC15498e, C11168e c11168e, C8268e c8268e, boolean z, C0520e c0520e, C10253e c10253e, boolean z2) {
        if (interfaceC15498e == null) {
            m828e(7);
            throw null;
        }
        if (c0520e != null) {
            return new C2398e(interfaceC15498e, c11168e, 1, c8268e, z, c0520e, c10253e, null, 1, z2, null);
        }
        m828e(11);
        throw null;
    }

    /* renamed from: e٘ؖٞ, reason: contains not printable characters */
    public static /* synthetic */ void m828e(int i) {
        String str = i != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 21 ? 3 : 2];
        switch (i) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                objArr[0] = "source";
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                objArr[0] = "newName";
                break;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
        }
        if (i != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                objArr[2] = "createSubstitutedCopy";
                break;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i == 21) {
            throw new IllegalStateException(format);
        }
    }

    @Override // defpackage.C10162e
    /* renamed from: eّؑۛ, reason: contains not printable characters */
    public final C10162e mo829e(InterfaceC15498e interfaceC15498e, int i, C8268e c8268e, InterfaceC2188e interfaceC2188e, int i2, C0520e c0520e) {
        if (interfaceC15498e == null) {
            m828e(13);
            throw null;
        }
        if (i == 0) {
            m828e(14);
            throw null;
        }
        if (c8268e == null) {
            m828e(15);
            throw null;
        }
        if (i2 == 0) {
            m828e(16);
            throw null;
        }
        if (c0520e == null) {
            m828e(17);
            throw null;
        }
        return new C2398e(interfaceC15498e, getAnnotations(), i, c8268e, this.f20118e, c0520e, InterfaceC3054e.f7112e, interfaceC2188e, i2, this.f6137e, this.f6136e);
    }

    @Override // defpackage.C10162e, defpackage.InterfaceC6647e
    /* renamed from: eۣؑۡ, reason: contains not printable characters */
    public final Object mo830e(C15378e c15378e) {
        C6571e c6571e = this.f6136e;
        if (c6571e == null || !((C15378e) c6571e.f13544e).equals(c15378e)) {
            return null;
        }
        return c6571e.f13543e;
    }

    @Override // defpackage.InterfaceC18168e
    /* renamed from: eۣؒ */
    public final InterfaceC18168e mo403e(AbstractC1186e abstractC1186e, ArrayList arrayList, AbstractC1186e abstractC1186e2, C6571e c6571e) {
        C7901e c7901e;
        C2042e c2042e;
        if (abstractC1186e2 == null) {
            m828e(20);
            throw null;
        }
        InterfaceC2188e vip = vip() == this ? null : vip();
        C2398e c2398e = new C2398e(mo1351switch(), getAnnotations(), mo1718extends(), advert(), this.f20118e, getName(), adcel(), vip, mo334e(), this.f6137e, c6571e);
        C7901e c7901e2 = this.f20117e;
        if (c7901e2 != null) {
            C7901e c7901e3 = new C7901e(c2398e, c7901e2.getAnnotations(), c7901e2.mo1718extends(), c7901e2.advert(), c7901e2.f31289e, c7901e2.f31288e, c7901e2.f31284e, mo334e(), vip == null ? null : vip.metrica(), c7901e2.adcel());
            c7901e3.f31282e = c7901e2.f31282e;
            c7901e3.f15974e = abstractC1186e2;
            c7901e = c7901e3;
        } else {
            c7901e = null;
        }
        C2042e c2042e2 = this.f20112e;
        if (c2042e2 != null) {
            C2042e c2042e3 = c2042e2;
            c2042e = new C2042e(c2398e, c2042e2.getAnnotations(), c2042e3.mo1718extends(), c2042e3.advert(), c2042e3.f31289e, c2042e3.f31288e, c2042e3.f31284e, mo334e(), vip == null ? null : vip.appmetrica(), c2042e2.adcel());
            c2042e.f31282e = c2042e.f31282e;
            C13043e c13043e = (C13043e) c2042e2.mo330e().get(0);
            if (c13043e == null) {
                C2042e.m756e(6);
                throw null;
            }
            c2042e.f5322e = c13043e;
        } else {
            c2042e = null;
        }
        c2398e.m2780e(c7901e, c2042e, this.f20109e, this.f20110e);
        Function0 function0 = this.f20116e;
        if (function0 != null) {
            c2398e.m2779e(this.f20108e, function0);
        }
        c2398e.mo336e(mo337finally());
        c2398e.m2781e(abstractC1186e2, getTypeParameters(), this.f20102e, abstractC1186e != null ? AbstractC7518e.yandex(this, abstractC1186e, C4590e.f9885e) : null, C13664e.f27089e);
        return c2398e;
    }

    @Override // defpackage.AbstractC0338e, defpackage.InterfaceC6647e
    /* renamed from: eؘؗؕ */
    public final boolean mo328e() {
        return false;
    }

    @Override // defpackage.C10162e, defpackage.InterfaceC8185e
    /* renamed from: eًٓؓ, reason: contains not printable characters */
    public final boolean mo831e() {
        AbstractC1186e ad = ad();
        if (!this.f6137e) {
            return false;
        }
        if (((!AbstractC13270e.m3536class(ad) && !AbstractC8825e.ad(ad)) || AbstractC11957e.appmetrica(ad)) && !AbstractC13270e.m3538interface(ad)) {
            return false;
        }
        C4155e c4155e = AbstractC0836e.ad;
        return !C4590e.f9890e.m1642protected(ad, AbstractC15262e.Signature) || AbstractC13270e.m3538interface(ad);
    }

    @Override // defpackage.C10162e
    /* renamed from: eَٖؑ, reason: contains not printable characters */
    public final void mo832e(AbstractC1186e abstractC1186e) {
    }
}
