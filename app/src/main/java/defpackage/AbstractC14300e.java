package defpackage;

import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.navigation.model.Maneuver;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٓۡ */
/* loaded from: classes3.dex */
public abstract class AbstractC14300e {
    public static final /* synthetic */ int ad = 0;

    static {
        new C12816e("kotlin.jvm.JvmName");
    }

    public static boolean Signature(AbstractC1186e abstractC1186e, InterfaceC15498e interfaceC15498e) {
        if (abstractC1186e == null) {
            ad(32);
            throw null;
        }
        if (interfaceC15498e == null) {
            ad(33);
            throw null;
        }
        if (amazon(abstractC1186e, interfaceC15498e)) {
            return true;
        }
        Iterator it = abstractC1186e.loadAd().ad().iterator();
        while (it.hasNext()) {
            if (Signature((AbstractC1186e) it.next(), interfaceC15498e)) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ void ad(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
            case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
            case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 13:
            case 14:
            case 15:
            case 21:
            case 23:
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
            case Maneuver.TYPE_STRAIGHT /* 36 */:
            case 57:
            case 58:
            case 60:
            case 63:
            case 81:
            case 94:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
            case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                objArr[0] = "second";
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                objArr[0] = "declarationDescriptor";
                break;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                objArr[0] = "subClass";
                break;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                objArr[0] = "superClass";
                break;
            case 30:
            case 32:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
            case 66:
                objArr[0] = "type";
                break;
            case 31:
                objArr[0] = "other";
                break;
            case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                objArr[0] = "classKind";
                break;
            case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
            case Maneuver.TYPE_DESTINATION /* 39 */:
            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
            case 48:
            case 54:
            case 67:
            case 68:
            case 69:
            case 76:
            case 77:
                objArr[0] = "classDescriptor";
                break;
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                objArr[0] = "typeConstructor";
                break;
            case 55:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = "location";
                break;
            case 65:
                objArr[0] = "variable";
                break;
            case 70:
                objArr[0] = "f";
                break;
            case 72:
                objArr[0] = "current";
                break;
            case 73:
                objArr[0] = "result";
                break;
            case 74:
                objArr[0] = "memberDescriptor";
                break;
            case 78:
            case 79:
            case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                objArr[0] = "annotated";
                break;
            case 84:
            case 86:
            case 89:
            case 91:
                objArr[0] = "scope";
                break;
            case 87:
            case 90:
            case 92:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 12:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case 22:
                objArr[1] = "getContainingModule";
                break;
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                objArr[1] = "getSuperClassType";
                break;
            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
            case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
            case 51:
            case 52:
            case 53:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 59:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 61:
            case 62:
                objArr[1] = "unwrapSubstitutionOverride";
                break;
            case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 71:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 75:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 82:
            case 83:
                objArr[1] = "getContainingSourceFile";
                break;
            case 85:
                objArr[1] = "getAllDescriptors";
                break;
            case 88:
                objArr[1] = "getFunctionByName";
                break;
            case 93:
                objArr[1] = "getPropertyByName";
                break;
            case 95:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
            case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
                objArr[2] = "isExtension";
                break;
            case 14:
                objArr[2] = "isOverride";
                break;
            case 15:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                objArr[2] = "areInSameModule";
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case 23:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 21:
                objArr[2] = "getContainingModule";
                break;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                objArr[2] = "getContainingClass";
                break;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                objArr[2] = "isAncestor";
                break;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                objArr[2] = "isDirectSubclass";
                break;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                objArr[2] = "isSubclass";
                break;
            case 30:
            case 31:
                objArr[2] = "isSameClass";
                break;
            case 32:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                objArr[2] = "isSubtypeOfClass";
                break;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                objArr[2] = "isAnonymousObject";
                break;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                objArr[2] = "isAnonymousFunction";
                break;
            case Maneuver.TYPE_STRAIGHT /* 36 */:
                objArr[2] = "isEnumEntry";
                break;
            case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                objArr[2] = "isKindOf";
                break;
            case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                objArr[2] = "hasAbstractMembers";
                break;
            case Maneuver.TYPE_DESTINATION /* 39 */:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                objArr[2] = "getSuperClassType";
                break;
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                objArr[2] = "getClassDescriptorForType";
                break;
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 48:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case 58:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 60:
                objArr[2] = "unwrapSubstitutionOverride";
                break;
            case 63:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 65:
            case 66:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 67:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 68:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 69:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 70:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 72:
            case 73:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 74:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 76:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 77:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 78:
                objArr[2] = "getJvmName";
                break;
            case 79:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 81:
                objArr[2] = "getContainingSourceFile";
                break;
            case 84:
                objArr[2] = "getAllDescriptors";
                break;
            case 86:
            case 87:
                objArr[2] = "getFunctionByName";
                break;
            case 89:
            case 90:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 91:
            case 92:
                objArr[2] = "getPropertyByName";
                break;
            case 94:
                objArr[2] = "getDirectMember";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
            case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public static boolean adcel(InterfaceC15498e interfaceC15498e) {
        return advert(interfaceC15498e, 1) && interfaceC15498e.getName().equals(AbstractC13893e.ad);
    }

    public static boolean admob(InterfaceC15498e interfaceC15498e) {
        return interfaceC15498e != null && (interfaceC15498e.mo1351switch() instanceof InterfaceC9646e);
    }

    public static boolean advert(InterfaceC15498e interfaceC15498e, int i) {
        if (i != 0) {
            return (interfaceC15498e instanceof InterfaceC5052e) && ((InterfaceC5052e) interfaceC15498e).mo1724e() == i;
        }
        ad(37);
        throw null;
    }

    public static boolean amazon(AbstractC1186e abstractC1186e, InterfaceC15498e interfaceC15498e) {
        if (abstractC1186e == null) {
            ad(30);
            throw null;
        }
        if (interfaceC15498e == null) {
            ad(31);
            throw null;
        }
        InterfaceC4077e advert = abstractC1186e.loadAd().advert();
        if (advert == null) {
            return false;
        }
        InterfaceC15498e vip = advert.vip();
        return (vip instanceof InterfaceC4077e) && (interfaceC15498e instanceof InterfaceC4077e) && ((InterfaceC4077e) interfaceC15498e).mo1459goto().equals(((InterfaceC4077e) vip).mo1459goto());
    }

    public static C9616e appmetrica(InterfaceC15498e interfaceC15498e) {
        C9616e c9616e = C9616e.f19068e;
        if (interfaceC15498e == null) {
            ad(81);
            throw null;
        }
        if (interfaceC15498e instanceof C2042e) {
            interfaceC15498e = ((C2042e) interfaceC15498e).m4030e();
        }
        if (interfaceC15498e instanceof InterfaceC7573e) {
            ((InterfaceC7573e) interfaceC15498e).adcel().getClass();
        }
        return c9616e;
    }

    public static C12816e billing(InterfaceC15498e interfaceC15498e) {
        if (interfaceC15498e == null) {
            ad(5);
            throw null;
        }
        if ((interfaceC15498e instanceof InterfaceC5334e) || C18139e.appmetrica(interfaceC15498e)) {
            return C12816e.metrica;
        }
        if (interfaceC15498e instanceof InterfaceC11348e) {
            return ((C14887e) ((InterfaceC11348e) interfaceC15498e)).f29498e;
        }
        if (interfaceC15498e instanceof InterfaceC9646e) {
            return ((AbstractC14941e) ((InterfaceC9646e) interfaceC15498e)).f29618e;
        }
        return null;
    }

    public static InterfaceC5334e license(InterfaceC15498e interfaceC15498e) {
        if (interfaceC15498e == null) {
            ad(23);
            throw null;
        }
        while (interfaceC15498e != null) {
            if (interfaceC15498e instanceof InterfaceC5334e) {
                return (InterfaceC5334e) interfaceC15498e;
            }
            if (interfaceC15498e instanceof InterfaceC11348e) {
                return ((C14887e) ((InterfaceC11348e) interfaceC15498e)).f29500e;
            }
            interfaceC15498e = interfaceC15498e.mo1351switch();
        }
        return null;
    }

    public static boolean loadAd(InterfaceC15498e interfaceC15498e) {
        return (advert(interfaceC15498e, 1) || advert(interfaceC15498e, 2)) && ((InterfaceC5052e) interfaceC15498e).mo1718extends() == 2;
    }

    public static InterfaceC5334e metrica(InterfaceC15498e interfaceC15498e) {
        if (interfaceC15498e == null) {
            ad(21);
            throw null;
        }
        InterfaceC5334e license = license(interfaceC15498e);
        if (license != null) {
            return license;
        }
        ad(22);
        throw null;
    }

    public static boolean mopub(InterfaceC15498e interfaceC15498e) {
        return advert(interfaceC15498e, 6) && ((InterfaceC5052e) interfaceC15498e).mo1723e();
    }

    public static C13579e purchase(InterfaceC15498e interfaceC15498e) {
        if (interfaceC15498e != null) {
            C12816e billing = billing(interfaceC15498e);
            return billing != null ? billing.ad : purchase(interfaceC15498e.mo1351switch()).ad(interfaceC15498e.getName());
        }
        ad(2);
        throw null;
    }

    public static boolean smaato(InterfaceC15498e interfaceC15498e) {
        if (interfaceC15498e == null) {
            ad(1);
            throw null;
        }
        while (interfaceC15498e != null) {
            if (adcel(interfaceC15498e) || ((interfaceC15498e instanceof InterfaceC0091e) && ((InterfaceC0091e) interfaceC15498e).advert() == AbstractC6050e.purchase)) {
                return true;
            }
            interfaceC15498e = interfaceC15498e.mo1351switch();
        }
        return false;
    }

    public static InterfaceC5052e startapp(InterfaceC5052e interfaceC5052e) {
        if (interfaceC5052e == null) {
            ad(44);
            throw null;
        }
        for (AbstractC1186e abstractC1186e : interfaceC5052e.mo1459goto().ad()) {
            if (abstractC1186e == null) {
                ad(45);
                throw null;
            }
            InterfaceC5021e loadAd = abstractC1186e.loadAd();
            if (loadAd == null) {
                ad(46);
                throw null;
            }
            InterfaceC5052e interfaceC5052e2 = (InterfaceC5052e) loadAd.advert();
            if (interfaceC5052e2 == null) {
                ad(47);
                throw null;
            }
            if (interfaceC5052e2.mo1724e() != 2) {
                return interfaceC5052e2;
            }
        }
        return null;
    }

    public static InterfaceC0390e subscription(InterfaceC0390e interfaceC0390e) {
        if (interfaceC0390e == null) {
            ad(58);
            throw null;
        }
        while (interfaceC0390e.mo334e() == 2) {
            Collection mo337finally = interfaceC0390e.mo337finally();
            if (mo337finally.isEmpty()) {
                throw new IllegalStateException("Fake override should have at least one overridden descriptor: " + interfaceC0390e);
            }
            interfaceC0390e = (InterfaceC0390e) mo337finally.iterator().next();
        }
        return interfaceC0390e;
    }

    public static void vip(InterfaceC6647e interfaceC6647e, LinkedHashSet linkedHashSet) {
        if (interfaceC6647e == null) {
            ad(72);
            throw null;
        }
        if (linkedHashSet.contains(interfaceC6647e)) {
            return;
        }
        Iterator it = interfaceC6647e.vip().mo337finally().iterator();
        while (it.hasNext()) {
            InterfaceC6647e vip = ((InterfaceC6647e) it.next()).vip();
            vip(vip, linkedHashSet);
            linkedHashSet.add(vip);
        }
    }

    public static InterfaceC15498e yandex(InterfaceC15498e interfaceC15498e, Class cls, boolean z) {
        if (interfaceC15498e == null) {
            return null;
        }
        if (z) {
            interfaceC15498e = interfaceC15498e.mo1351switch();
        }
        while (interfaceC15498e != null) {
            if (cls.isInstance(interfaceC15498e)) {
                return interfaceC15498e;
            }
            interfaceC15498e = interfaceC15498e.mo1351switch();
        }
        return null;
    }
}
