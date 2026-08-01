package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.net.SocketAddress;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؗ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10075e {
    public static volatile ScheduledExecutorServiceC5380e ad;

    public static /* synthetic */ void ad(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case 21:
            case 23:
                objArr[0] = "neighbors";
                break;
            case 2:
            case 12:
            case 16:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case 13:
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                objArr[0] = "handler";
                break;
            case 4:
            case 7:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case 20:
            default:
                objArr[0] = "nodes";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case 14:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = "current";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (i) {
            case 7:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
            case 20:
            case 21:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case 23:
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static final long adcel(long j, long j2, EnumC15934e enumC15934e) {
        long j3 = j - j2;
        if (((j3 ^ j) & (~(j3 ^ j2))) >= 0) {
            return AbstractC0326e.admob(j3, enumC15934e);
        }
        EnumC15934e enumC15934e2 = EnumC15934e.MILLISECONDS;
        if (enumC15934e.compareTo(enumC15934e2) >= 0) {
            return C14157e.adcel(yandex(j3));
        }
        long convert = enumC15934e.f31392e.convert(1L, enumC15934e2.f31392e);
        long j4 = (j / convert) - (j2 / convert);
        long j5 = (j % convert) - (j2 % convert);
        C17647e c17647e = C14157e.f27993e;
        return C14157e.billing(AbstractC0326e.admob(j4, enumC15934e2), AbstractC0326e.admob(j5, enumC15934e));
    }

    public static void appmetrica(Object obj, InterfaceC11628e interfaceC11628e, C17974e c17974e, AbstractC14533e abstractC14533e) {
        if (obj == null) {
            ad(22);
            throw null;
        }
        if (((HashSet) c17974e.f35233e).add(obj) && abstractC14533e.vip(obj)) {
            Iterator it = interfaceC11628e.smaato(obj).iterator();
            while (it.hasNext()) {
                appmetrica(it.next(), interfaceC11628e, c17974e, abstractC14533e);
            }
            abstractC14533e.ad(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean[], java.io.Serializable] */
    public static Boolean billing(List list, InterfaceC11628e interfaceC11628e, Function1 function1) {
        if (list != null) {
            return (Boolean) license(list, interfaceC11628e, new C4423e(function1, new boolean[1], 0));
        }
        ad(7);
        throw null;
    }

    public static Object license(Collection collection, InterfaceC11628e interfaceC11628e, AbstractC14533e abstractC14533e) {
        if (collection == null) {
            ad(4);
            throw null;
        }
        C17974e c17974e = new C17974e(8);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            appmetrica(it.next(), interfaceC11628e, c17974e, abstractC14533e);
        }
        return abstractC14533e.advert();
    }

    public static final InterfaceC12864e metrica(InterfaceC12864e interfaceC12864e, boolean z) {
        return interfaceC12864e.premium(new C17446e(z));
    }

    public static final boolean startapp(int i, long j, int i2) {
        int adcel = C5602e.adcel(j);
        if (i > C5602e.yandex(j) || adcel > i) {
            return false;
        }
        return i2 <= C5602e.billing(j) && C5602e.startapp(j) <= i2;
    }

    public static final InterfaceC12864e vip(InterfaceC12864e interfaceC12864e, Function2 function2) {
        return interfaceC12864e.premium(new C2979e(function2));
    }

    public static final long yandex(long j) {
        if (j < 0) {
            C17647e c17647e = C14157e.f27993e;
            return C14157e.f27994e;
        }
        C17647e c17647e2 = C14157e.f27993e;
        return C14157e.f27992e;
    }

    public abstract SocketAddress purchase();
}
