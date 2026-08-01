package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓؓؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C13726e extends AbstractC3392e {

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public C7283e f27192e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public InterfaceC8528e f27193e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final int f27194e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public Set f27195e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final C2886e f27196e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final int f27197e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13726e(InterfaceC15498e interfaceC15498e, C0520e c0520e, int i, int i2, List list, InterfaceC11542e interfaceC11542e) {
        super(interfaceC11542e, interfaceC15498e, c0520e, InterfaceC3054e.f7112e);
        if (interfaceC15498e == null) {
            billing(0);
            throw null;
        }
        if (c0520e == null) {
            billing(1);
            throw null;
        }
        if (i == 0) {
            billing(2);
            throw null;
        }
        if (i2 == 0) {
            billing(3);
            throw null;
        }
        if (list == null) {
            billing(4);
            throw null;
        }
        if (interfaceC11542e == null) {
            billing(6);
            throw null;
        }
        this.f27197e = i;
        this.f27194e = i2;
        this.f27196e = new C2886e(this, Collections.EMPTY_LIST, list, interfaceC11542e);
    }

    public static /* synthetic */ void billing(int i) {
        String str;
        int i2;
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
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
                objArr[0] = "name";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 12:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "getAnnotations";
                break;
            case 10:
                objArr[1] = "getTypeConstructor";
                break;
            case 11:
                objArr[1] = "getConstructors";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 14:
                objArr[1] = "getStaticScope";
                break;
            case 15:
                objArr[1] = "getKind";
                break;
            case 16:
                objArr[1] = "getModality";
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                objArr[1] = "getVisibility";
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i) {
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                break;
            case 12:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                throw new IllegalStateException(format);
            case 12:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // defpackage.InterfaceC5052e, defpackage.InterfaceC17577e, defpackage.InterfaceC0091e
    public final C8268e advert() {
        return AbstractC6050e.appmetrica;
    }

    @Override // defpackage.InterfaceC5052e, defpackage.InterfaceC17577e
    /* renamed from: extends */
    public final int mo1718extends() {
        int i = this.f27197e;
        if (i != 0) {
            return i;
        }
        billing(16);
        throw null;
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
        return this.f27192e;
    }

    @Override // defpackage.InterfaceC5052e
    /* renamed from: eؙۛ۠ */
    public final boolean mo1723e() {
        return false;
    }

    @Override // defpackage.InterfaceC5052e
    /* renamed from: eًؚؔ */
    public final int mo1724e() {
        int i = this.f27194e;
        if (i != 0) {
            return i;
        }
        billing(15);
        throw null;
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
        billing(18);
        throw null;
    }

    @Override // defpackage.InterfaceC15633e
    public final InterfaceC2460e getAnnotations() {
        return C4590e.f9885e;
    }

    @Override // defpackage.InterfaceC4077e
    /* renamed from: goto */
    public final InterfaceC5021e mo1459goto() {
        C2886e c2886e = this.f27196e;
        if (c2886e != null) {
            return c2886e;
        }
        billing(10);
        throw null;
    }

    @Override // defpackage.InterfaceC2978e
    /* renamed from: instanceof */
    public final boolean mo1222instanceof() {
        return false;
    }

    public final void mopub(InterfaceC8528e interfaceC8528e, Set set, C7283e c7283e) {
        this.f27193e = interfaceC8528e;
        this.f27195e = set;
        this.f27192e = c7283e;
    }

    @Override // defpackage.InterfaceC5052e
    /* renamed from: private */
    public final boolean mo1731private() {
        return false;
    }

    @Override // defpackage.AbstractC17645e
    public final InterfaceC8528e purchase(C13520e c13520e) {
        InterfaceC8528e interfaceC8528e = this.f27193e;
        if (interfaceC8528e != null) {
            return interfaceC8528e;
        }
        billing(13);
        throw null;
    }

    @Override // defpackage.InterfaceC5052e
    /* renamed from: throw */
    public final Collection mo1732throw() {
        Set set = this.f27195e;
        if (set != null) {
            return set;
        }
        billing(11);
        throw null;
    }

    public String toString() {
        return "class " + getName();
    }

    @Override // defpackage.InterfaceC5052e
    public final boolean yandex() {
        return false;
    }
}
