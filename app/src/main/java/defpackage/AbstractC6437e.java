package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٖۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6437e {
    public static final Object ad(InterfaceC5083e interfaceC5083e, InterfaceC6034e interfaceC6034e, Function3 function3, InterfaceC1108e[] interfaceC1108eArr) {
        C7958e c7958e = new C7958e((InterfaceC5083e) null, interfaceC6034e, function3, interfaceC1108eArr);
        C8423e c8423e = new C8423e(interfaceC5083e.admob(), interfaceC5083e, 0);
        Object amazon = AbstractC18491e.amazon(c8423e, true, c8423e, c7958e);
        return amazon == EnumC2821e.f6782e ? amazon : Unit.INSTANCE;
    }

    public static boolean license(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static final C10304e metrica(C13770e c13770e) {
        c13770e.m3676strictfp(1967007413);
        Object[] objArr = new Object[0];
        Object m3681throw = c13770e.m3681throw();
        if (m3681throw == C2987e.ad) {
            m3681throw = new C10673e(6);
            c13770e.m3682throws(m3681throw);
        }
        C10304e c10304e = (C10304e) AbstractC10510e.appmetrica(objArr, C10304e.f20352e, (Function0) m3681throw, c13770e, 384);
        c10304e.f20353e = (InterfaceC5039e) c13770e.adcel(AbstractC5991e.ad);
        c13770e.Signature(false);
        return c10304e;
    }

    public static final InterfaceC12864e vip(InterfaceC12864e interfaceC12864e, Function1 function1) {
        return interfaceC12864e.premium(new C15278e(function1));
    }
}
