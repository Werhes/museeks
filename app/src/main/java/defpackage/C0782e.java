package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒؒؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0782e extends C1117e implements InterfaceC18168e {

    /* renamed from: eؘؑۦ, reason: contains not printable characters */
    public final boolean f3156e;

    /* renamed from: eَۦۥ, reason: contains not printable characters */
    public int f3157e;

    /* renamed from: eؘِْ, reason: contains not printable characters */
    public static final C15378e f3155e = new Object();

    /* renamed from: eُِٔ, reason: contains not printable characters */
    public static final C15378e f3154e = new Object();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0782e(InterfaceC15498e interfaceC15498e, C1117e c1117e, InterfaceC2460e interfaceC2460e, C0520e c0520e, int i, InterfaceC3054e interfaceC3054e, boolean z) {
        super(interfaceC15498e, c1117e, interfaceC2460e, c0520e, i, interfaceC3054e);
        if (interfaceC15498e == null) {
            m402e(0);
            throw null;
        }
        if (interfaceC2460e == null) {
            m402e(1);
            throw null;
        }
        if (c0520e == null) {
            m402e(2);
            throw null;
        }
        if (i == 0) {
            m402e(3);
            throw null;
        }
        this.f3157e = 0;
        this.f3156e = z;
    }

    /* renamed from: eؚٔۦ, reason: contains not printable characters */
    public static C0782e m401e(InterfaceC15498e interfaceC15498e, C11168e c11168e, C0520e c0520e, C10253e c10253e, boolean z) {
        if (interfaceC15498e == null) {
            m402e(5);
            throw null;
        }
        if (c0520e != null) {
            return new C0782e(interfaceC15498e, null, c11168e, c0520e, 1, c10253e, z);
        }
        m402e(7);
        throw null;
    }

    /* renamed from: e٘ؖٞ, reason: contains not printable characters */
    public static /* synthetic */ void m402e(int i) {
        String str = (i == 13 || i == 18 || i == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 13 || i == 18 || i == 21) ? 2 : 3];
        switch (i) {
            case 1:
            case 6:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 15:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 13:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i == 13) {
            objArr[1] = "initialize";
        } else if (i == 18) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "initialize";
                break;
            case 13:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case 21:
                break;
            case 14:
            case 15:
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                objArr[2] = "createSubstitutedCopy";
                break;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i != 13 && i != 18 && i != 21) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // defpackage.C1117e, defpackage.AbstractC14957e
    /* renamed from: eّؑۛ */
    public final AbstractC14957e mo361e(int i, InterfaceC2460e interfaceC2460e, InterfaceC15498e interfaceC15498e, InterfaceC16528e interfaceC16528e, C0520e c0520e, InterfaceC3054e interfaceC3054e) {
        if (interfaceC15498e == null) {
            m402e(14);
            throw null;
        }
        if (i == 0) {
            m402e(15);
            throw null;
        }
        if (interfaceC2460e == null) {
            m402e(16);
            throw null;
        }
        C1117e c1117e = (C1117e) interfaceC16528e;
        if (c0520e == null) {
            c0520e = getName();
        }
        C0782e c0782e = new C0782e(interfaceC15498e, c1117e, interfaceC2460e, c0520e, i, interfaceC3054e, this.f3156e);
        int i2 = this.f3157e;
        boolean z = false;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw null;
                    }
                }
            }
            z = true;
        }
        c0782e.m404e(z, AbstractC0869e.smaato(i2));
        return c0782e;
    }

    @Override // defpackage.InterfaceC18168e
    /* renamed from: eۣؒ, reason: contains not printable characters */
    public final InterfaceC18168e mo403e(AbstractC1186e abstractC1186e, ArrayList arrayList, AbstractC1186e abstractC1186e2, C6571e c6571e) {
        if (abstractC1186e2 == null) {
            m402e(20);
            throw null;
        }
        ArrayList vip = AbstractC16619e.vip(arrayList, mo330e(), this);
        C16169e yandex = abstractC1186e == null ? null : AbstractC7518e.yandex(this, abstractC1186e, C4590e.f9885e);
        C15704e m3897e = m3897e(C4542e.vip);
        m3897e.f30945e = vip;
        m3897e.f30937e = abstractC1186e2;
        m3897e.f30942e = yandex;
        m3897e.f30935e = true;
        m3897e.f30934e = true;
        C0782e c0782e = (C0782e) m3897e.f30943e.mo2772e(m3897e);
        if (c6571e != null) {
            c0782e.m3895e((C15378e) c6571e.f13544e, c6571e.f13543e);
        }
        if (c0782e != null) {
            return c0782e;
        }
        m402e(21);
        throw null;
    }

    @Override // defpackage.AbstractC14957e, defpackage.InterfaceC6647e
    /* renamed from: eؘؗؕ */
    public final boolean mo328e() {
        return AbstractC0869e.smaato(this.f3157e);
    }

    /* renamed from: eّْؗ, reason: contains not printable characters */
    public final void m404e(boolean z, boolean z2) {
        this.f3157e = z ? z2 ? 4 : 2 : z2 ? 3 : 1;
    }

    @Override // defpackage.C1117e
    /* renamed from: eۡۘ, reason: contains not printable characters */
    public final C1117e mo405e(C16169e c16169e, C16169e c16169e2, List list, List list2, List list3, AbstractC1186e abstractC1186e, int i, C8268e c8268e, Map map) {
        AbstractC4857e abstractC4857e;
        if (list == null) {
            m402e(9);
            throw null;
        }
        if (list2 == null) {
            m402e(10);
            throw null;
        }
        if (list3 == null) {
            m402e(11);
            throw null;
        }
        if (c8268e == null) {
            m402e(12);
            throw null;
        }
        super.mo405e(c16169e, c16169e2, list, list2, list3, abstractC1186e, i, c8268e, map);
        for (C0968e c0968e : AbstractC16872e.vip) {
            C10445e c10445e = c0968e.vip;
            C0520e c0520e = c0968e.ad;
            if (c0520e == null || AbstractC7890e.billing(getName(), c0520e)) {
                if (c10445e == null || c10445e.license(getName().vip())) {
                    Collection collection = c0968e.metrica;
                    if (collection == null || collection.contains(getName())) {
                        InterfaceC16897e[] interfaceC16897eArr = c0968e.appmetrica;
                        int length = interfaceC16897eArr.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                abstractC4857e = ((String) c0968e.license.invoke(this)) != null ? new AbstractC4857e(false) : C16568e.metrica;
                            } else {
                                if (interfaceC16897eArr[i2].license(this) != null) {
                                    abstractC4857e = new AbstractC4857e(false);
                                    break;
                                }
                                i2++;
                            }
                        }
                        this.f29658e = abstractC4857e.ad;
                        return this;
                    }
                }
            }
        }
        abstractC4857e = C16568e.vip;
        this.f29658e = abstractC4857e.ad;
        return this;
    }
}
