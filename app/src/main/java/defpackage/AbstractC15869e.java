package defpackage;

import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۧۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC15869e {
    public static final C13540e license;
    public static final C13540e metrica;
    public static final C11139e ad = new C11139e(C5430e.f11643e, C5430e.f11639e);
    public static final C13540e vip = AbstractC12696e.purchase(0.0f, 400.0f, null, 5);

    static {
        long j = 1;
        long j2 = (j & 4294967295L) | (j << 32);
        metrica = AbstractC12696e.purchase(0.0f, 400.0f, new C11490e(j2), 1);
        license = AbstractC12696e.purchase(0.0f, 400.0f, new C12729e(j2), 1);
    }

    public static C18351e ad(InterfaceC6512e interfaceC6512e, C9577e c9577e, int i) {
        C9577e c9577e2 = C5438e.f11680e;
        if ((i & 1) != 0) {
            long j = 1;
            interfaceC6512e = AbstractC12696e.purchase(0.0f, 400.0f, new C12729e((j & 4294967295L) | (j << 32)), 1);
        }
        if ((i & 2) != 0) {
            c9577e = c9577e2;
        }
        return vip(AbstractC7890e.billing(c9577e, C5438e.f11672e) ? C5438e.f11666e : AbstractC7890e.billing(c9577e, c9577e2) ? C5438e.f11699e : C5438e.f11700e, interfaceC6512e, new C18314e(1, 1));
    }

    public static C2128e appmetrica(InterfaceC6512e interfaceC6512e, int i) {
        if ((i & 1) != 0) {
            interfaceC6512e = AbstractC12696e.purchase(0.0f, 400.0f, null, 5);
        }
        return new C2128e(new C5761e(new C15421e(interfaceC6512e), (C1223e) null, (C4980e) null, (C12395e) null, (LinkedHashMap) null, 126));
    }

    public static final C2128e billing(InterfaceC8079e interfaceC8079e, InterfaceC6512e interfaceC6512e, Function1 function1) {
        return new C2128e(new C5761e((C15421e) null, (C1223e) null, new C4980e(interfaceC8079e, interfaceC6512e, function1), (C12395e) null, (LinkedHashMap) null, 123));
    }

    public static C18351e license(InterfaceC6512e interfaceC6512e, int i) {
        if ((i & 1) != 0) {
            interfaceC6512e = AbstractC12696e.purchase(0.0f, 400.0f, null, 5);
        }
        return new C18351e(new C5761e(new C15421e(interfaceC6512e), (C1223e) null, (C4980e) null, (C12395e) null, (LinkedHashMap) null, 126));
    }

    public static C18351e metrica(C12870e c12870e, int i) {
        InterfaceC6512e interfaceC6512e = c12870e;
        if ((i & 1) != 0) {
            long j = 1;
            interfaceC6512e = AbstractC12696e.purchase(0.0f, 400.0f, new C12729e((j & 4294967295L) | (j << 32)), 1);
        }
        C14544e c14544e = C5438e.f11667e;
        return vip(c14544e.equals(C5438e.f11685e) ? C5438e.f11669e : c14544e.equals(c14544e) ? C5438e.f11695e : C5438e.f11700e, interfaceC6512e, new C18314e(1, 2));
    }

    public static C2128e purchase(InterfaceC6512e interfaceC6512e, C9577e c9577e, int i) {
        C9577e c9577e2 = C5438e.f11680e;
        if ((i & 1) != 0) {
            long j = 1;
            interfaceC6512e = AbstractC12696e.purchase(0.0f, 400.0f, new C12729e((j & 4294967295L) | (j << 32)), 1);
        }
        if ((i & 2) != 0) {
            c9577e = c9577e2;
        }
        return billing(AbstractC7890e.billing(c9577e, C5438e.f11672e) ? C5438e.f11666e : AbstractC7890e.billing(c9577e, c9577e2) ? C5438e.f11699e : C5438e.f11700e, interfaceC6512e, new C18314e(1, 3));
    }

    public static final C18351e vip(InterfaceC8079e interfaceC8079e, InterfaceC6512e interfaceC6512e, Function1 function1) {
        return new C18351e(new C5761e((C15421e) null, (C1223e) null, new C4980e(interfaceC8079e, interfaceC6512e, function1), (C12395e) null, (LinkedHashMap) null, 123));
    }

    public static C2128e yandex(C12870e c12870e, int i) {
        InterfaceC6512e interfaceC6512e = c12870e;
        if ((i & 1) != 0) {
            long j = 1;
            interfaceC6512e = AbstractC12696e.purchase(0.0f, 400.0f, new C12729e((j & 4294967295L) | (j << 32)), 1);
        }
        C14544e c14544e = C5438e.f11667e;
        return billing(c14544e.equals(C5438e.f11685e) ? C5438e.f11669e : c14544e.equals(c14544e) ? C5438e.f11695e : C5438e.f11700e, interfaceC6512e, new C18314e(1, 4));
    }
}
