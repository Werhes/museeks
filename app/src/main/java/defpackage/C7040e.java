package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؚٜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7040e extends AbstractC3392e {

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final InterfaceC2460e f14404e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final C17523e f14405e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final InterfaceC3374e f14406e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final C2886e f14407e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7040e(InterfaceC11542e interfaceC11542e, InterfaceC5052e interfaceC5052e, AbstractC10226e abstractC10226e, C0520e c0520e, InterfaceC3374e interfaceC3374e, InterfaceC2460e interfaceC2460e, InterfaceC3054e interfaceC3054e) {
        super(interfaceC11542e, interfaceC5052e, c0520e, interfaceC3054e);
        if (interfaceC11542e == null) {
            billing(6);
            throw null;
        }
        if (interfaceC5052e == null) {
            billing(7);
            throw null;
        }
        if (abstractC10226e == null) {
            billing(8);
            throw null;
        }
        if (c0520e == null) {
            billing(9);
            throw null;
        }
        if (interfaceC3374e == null) {
            billing(10);
            throw null;
        }
        this.f14404e = interfaceC2460e;
        this.f14407e = new C2886e(this, Collections.EMPTY_LIST, Collections.singleton(abstractC10226e), interfaceC11542e);
        this.f14405e = new C17523e(this, interfaceC11542e);
        this.f14406e = interfaceC3374e;
    }

    public static /* synthetic */ void billing(int i) {
        String str;
        int i2;
        switch (i) {
            case 14:
            case 15:
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
            case 20:
            case 21:
            case 22:
            case 23:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 14:
            case 15:
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
            case 20:
            case 21:
            case 22:
            case 23:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = "name";
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case 12:
                objArr[0] = "source";
                break;
            case 6:
            default:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case 15:
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
            case 20:
            case 21:
            case 22:
            case 23:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                objArr[1] = "getTypeConstructor";
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                objArr[1] = "getKind";
                break;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 23:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case 15:
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 14:
            case 15:
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
            case 20:
            case 21:
            case 22:
            case 23:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public static C7040e mopub(InterfaceC11542e interfaceC11542e, InterfaceC5052e interfaceC5052e, C0520e c0520e, C0394e c0394e, InterfaceC2460e interfaceC2460e, InterfaceC3054e interfaceC3054e) {
        if (interfaceC11542e == null) {
            billing(0);
            throw null;
        }
        if (interfaceC5052e == null) {
            billing(1);
            throw null;
        }
        if (c0520e == null) {
            billing(2);
            throw null;
        }
        if (c0394e != null) {
            return new C7040e(interfaceC11542e, interfaceC5052e, interfaceC5052e.mo1458e(), c0520e, c0394e, interfaceC2460e, interfaceC3054e);
        }
        billing(3);
        throw null;
    }

    @Override // defpackage.InterfaceC5052e, defpackage.InterfaceC17577e, defpackage.InterfaceC0091e
    public final C8268e advert() {
        return AbstractC6050e.appmetrica;
    }

    @Override // defpackage.InterfaceC5052e, defpackage.InterfaceC17577e
    /* renamed from: extends */
    public final int mo1718extends() {
        return 1;
    }

    @Override // defpackage.InterfaceC5052e
    /* renamed from: eؑ۠ۖ */
    public final InterfaceC8528e mo1719e() {
        return C9494e.vip;
    }

    @Override // defpackage.InterfaceC5052e
    /* renamed from: eؘؓؖ */
    public final boolean mo1720e() {
        return false;
    }

    @Override // defpackage.InterfaceC5052e
    /* renamed from: eؙؐ٘ */
    public final C7283e mo1722e() {
        return null;
    }

    @Override // defpackage.InterfaceC5052e
    /* renamed from: eؙۛ۠ */
    public final boolean mo1723e() {
        return false;
    }

    @Override // defpackage.InterfaceC5052e
    /* renamed from: eًؚؔ */
    public final int mo1724e() {
        return 4;
    }

    @Override // defpackage.InterfaceC17577e
    /* renamed from: eٌٕۗ */
    public final boolean mo1941e() {
        return false;
    }

    @Override // defpackage.InterfaceC17577e
    /* renamed from: eُِؕ */
    public final boolean mo1942e() {
        return false;
    }

    @Override // defpackage.InterfaceC5052e
    /* renamed from: eًٖٕ */
    public final AbstractC12421e mo1728e() {
        return null;
    }

    @Override // defpackage.InterfaceC5052e
    /* renamed from: eِٜ٘ */
    public final boolean mo1729e() {
        return false;
    }

    @Override // defpackage.InterfaceC5052e, defpackage.InterfaceC2978e
    /* renamed from: e۠۟ */
    public final List mo1221e() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        billing(22);
        throw null;
    }

    @Override // defpackage.InterfaceC15633e
    public final InterfaceC2460e getAnnotations() {
        InterfaceC2460e interfaceC2460e = this.f14404e;
        if (interfaceC2460e != null) {
            return interfaceC2460e;
        }
        billing(21);
        throw null;
    }

    @Override // defpackage.InterfaceC4077e
    /* renamed from: goto */
    public final InterfaceC5021e mo1459goto() {
        C2886e c2886e = this.f14407e;
        if (c2886e != null) {
            return c2886e;
        }
        billing(17);
        throw null;
    }

    @Override // defpackage.InterfaceC2978e
    /* renamed from: instanceof */
    public final boolean mo1222instanceof() {
        return false;
    }

    @Override // defpackage.InterfaceC5052e
    /* renamed from: private */
    public final boolean mo1731private() {
        return false;
    }

    @Override // defpackage.AbstractC17645e
    public final InterfaceC8528e purchase(C13520e c13520e) {
        C17523e c17523e = this.f14405e;
        if (c17523e != null) {
            return c17523e;
        }
        billing(14);
        throw null;
    }

    @Override // defpackage.InterfaceC5052e
    /* renamed from: throw */
    public final Collection mo1732throw() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        billing(16);
        throw null;
    }

    public final String toString() {
        return "enum entry " + getName();
    }

    @Override // defpackage.InterfaceC5052e
    public final boolean yandex() {
        return false;
    }
}
