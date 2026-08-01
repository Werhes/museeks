package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؒ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1117e extends AbstractC14957e implements InterfaceC16528e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1117e(InterfaceC15498e interfaceC15498e, C1117e c1117e, InterfaceC2460e interfaceC2460e, C0520e c0520e, int i, InterfaceC3054e interfaceC3054e) {
        super(i, interfaceC2460e, interfaceC15498e, c1117e, c0520e, interfaceC3054e);
        if (interfaceC15498e == null) {
            m468e(0);
            throw null;
        }
        if (interfaceC2460e == null) {
            m468e(1);
            throw null;
        }
        if (c0520e == null) {
            m468e(2);
            throw null;
        }
        if (i == 0) {
            m468e(3);
            throw null;
        }
        if (interfaceC3054e != null) {
        } else {
            m468e(4);
            throw null;
        }
    }

    /* renamed from: eًؕ۟, reason: contains not printable characters */
    public static C1117e m467e(AbstractC15349e abstractC15349e, C0520e c0520e, int i, InterfaceC3054e interfaceC3054e) {
        C11064e c11064e = C4590e.f9885e;
        if (abstractC15349e == null) {
            m468e(5);
            throw null;
        }
        if (c0520e == null) {
            m468e(7);
            throw null;
        }
        if (i == 0) {
            m468e(8);
            throw null;
        }
        if (interfaceC3054e != null) {
            return new C1117e(abstractC15349e, null, c11064e, c0520e, i, interfaceC3054e);
        }
        m468e(9);
        throw null;
    }

    /* renamed from: e٘ؖٞ, reason: contains not printable characters */
    public static /* synthetic */ void m468e(int i) {
        String str = (i == 13 || i == 18 || i == 23 || i == 24 || i == 29 || i == 30) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 13 || i == 18 || i == 23 || i == 24 || i == 29 || i == 30) ? 2 : 3];
        switch (i) {
            case 1:
            case 6:
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 8:
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 15:
            case 20:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 16:
            case 21:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case 22:
                objArr[0] = "visibility";
                break;
            case 13:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case 23:
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
            case 30:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 14:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                objArr[0] = "contextReceiverParameters";
                break;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                objArr[0] = "newOwner";
                break;
        }
        if (i == 13 || i == 18 || i == 23) {
            objArr[1] = "initialize";
        } else if (i == 24) {
            objArr[1] = "getOriginal";
        } else if (i == 29) {
            objArr[1] = "copy";
        } else if (i != 30) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
            case 20:
            case 21:
            case 22:
                objArr[2] = "initialize";
                break;
            case 13:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case 23:
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
            case 30:
                break;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i != 13 && i != 18 && i != 23 && i != 24 && i != 29 && i != 30) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // defpackage.AbstractC14957e
    /* renamed from: eّؑۛ */
    public AbstractC14957e mo361e(int i, InterfaceC2460e interfaceC2460e, InterfaceC15498e interfaceC15498e, InterfaceC16528e interfaceC16528e, C0520e c0520e, InterfaceC3054e interfaceC3054e) {
        if (interfaceC15498e == null) {
            m468e(25);
            throw null;
        }
        if (i == 0) {
            m468e(26);
            throw null;
        }
        if (interfaceC2460e == null) {
            m468e(27);
            throw null;
        }
        C1117e c1117e = (C1117e) interfaceC16528e;
        if (c0520e == null) {
            c0520e = getName();
        }
        return new C1117e(interfaceC15498e, c1117e, interfaceC2460e, c0520e, i, interfaceC3054e);
    }

    @Override // defpackage.AbstractC14957e, defpackage.AbstractC16946e, defpackage.AbstractC2214e, defpackage.InterfaceC15498e
    /* renamed from: eؘؙؕ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C1117e vip() {
        C1117e c1117e = (C1117e) super.vip();
        if (c1117e != null) {
            return c1117e;
        }
        m468e(24);
        throw null;
    }

    @Override // defpackage.AbstractC14957e, defpackage.InterfaceC16528e
    /* renamed from: eؚؒؖ, reason: contains not printable characters */
    public InterfaceC16733e mo471e() {
        return m3897e(C4542e.vip);
    }

    @Override // defpackage.AbstractC14957e
    /* renamed from: eٔۜۙ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C1117e mo470e(C16169e c16169e, C16169e c16169e2, List list, List list2, List list3, AbstractC1186e abstractC1186e, int i, C8268e c8268e) {
        if (list == null) {
            m468e(14);
            throw null;
        }
        if (list2 == null) {
            m468e(15);
            throw null;
        }
        if (list3 == null) {
            m468e(16);
            throw null;
        }
        if (c8268e != null) {
            return mo405e(c16169e, c16169e2, list, list2, list3, abstractC1186e, i, c8268e, null);
        }
        m468e(17);
        throw null;
    }

    /* renamed from: eۡۘ */
    public C1117e mo405e(C16169e c16169e, C16169e c16169e2, List list, List list2, List list3, AbstractC1186e abstractC1186e, int i, C8268e c8268e, Map map) {
        if (list == null) {
            m468e(19);
            throw null;
        }
        if (list2 == null) {
            m468e(20);
            throw null;
        }
        if (list3 == null) {
            m468e(21);
            throw null;
        }
        if (c8268e == null) {
            m468e(22);
            throw null;
        }
        super.mo470e(c16169e, c16169e2, list, list2, list3, abstractC1186e, i, c8268e);
        if (map != null && !map.isEmpty()) {
            this.f29660e = new LinkedHashMap(map);
        }
        return this;
    }
}
