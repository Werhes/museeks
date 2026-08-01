package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔٗ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14767e extends AbstractC3392e {

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final InterfaceC11542e f29206e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final ArrayList f29207e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public C2886e f29208e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public int f29209e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public ArrayList f29210e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public C8268e f29211e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final int f29212e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14767e(C11918e c11918e, C0520e c0520e, InterfaceC11542e interfaceC11542e) {
        super(interfaceC11542e, c11918e, c0520e, InterfaceC3054e.f7112e);
        if (c0520e == null) {
            billing(2);
            throw null;
        }
        if (interfaceC11542e == null) {
            billing(4);
            throw null;
        }
        this.f29207e = new ArrayList();
        this.f29206e = interfaceC11542e;
        this.f29212e = 2;
    }

    public static /* synthetic */ void billing(int i) {
        String str;
        int i2;
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                i2 = 2;
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 16:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case 15:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                objArr[1] = "getStaticScope";
                break;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 12:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case 16:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                throw new IllegalStateException(format);
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // defpackage.InterfaceC5052e, defpackage.InterfaceC17577e, defpackage.InterfaceC0091e
    public final C8268e advert() {
        C8268e c8268e = this.f29211e;
        if (c8268e != null) {
            return c8268e;
        }
        billing(10);
        throw null;
    }

    @Override // defpackage.InterfaceC5052e, defpackage.InterfaceC17577e
    /* renamed from: extends */
    public final int mo1718extends() {
        int i = this.f29209e;
        if (i != 0) {
            return i;
        }
        billing(7);
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
        int i = this.f29212e;
        if (i != 0) {
            return i;
        }
        billing(8);
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
        ArrayList arrayList = this.f29210e;
        if (arrayList != null) {
            return arrayList;
        }
        billing(15);
        throw null;
    }

    @Override // defpackage.InterfaceC15633e
    public final InterfaceC2460e getAnnotations() {
        return C4590e.f9885e;
    }

    @Override // defpackage.InterfaceC4077e
    /* renamed from: goto */
    public final InterfaceC5021e mo1459goto() {
        C2886e c2886e = this.f29208e;
        if (c2886e != null) {
            return c2886e;
        }
        billing(11);
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
        return C9494e.vip;
    }

    @Override // defpackage.InterfaceC5052e
    /* renamed from: throw */
    public final Collection mo1732throw() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        billing(13);
        throw null;
    }

    public final String toString() {
        return AbstractC2214e.m766e(this);
    }

    @Override // defpackage.InterfaceC5052e
    public final boolean yandex() {
        return false;
    }
}
