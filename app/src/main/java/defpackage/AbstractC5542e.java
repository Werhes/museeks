package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؘٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5542e {
    public static final C5389e ad = new C5389e(16, new C10659e(3));

    public static final void ad(InterfaceC5757e interfaceC5757e) {
        if ((interfaceC5757e instanceof C6929e ? (C6929e) interfaceC5757e : null) != null) {
            return;
        }
        throw new IllegalStateException(AbstractC1786e.subscription(AbstractC3820e.ad, interfaceC5757e.getClass(), new StringBuilder("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ")));
    }

    public static Object appmetrica(Object[] objArr) {
        Object obj = objArr[0];
        if (obj != null) {
            return obj;
        }
        throw new IllegalArgumentException();
    }

    public static InterfaceC12864e billing(C12692e c12692e, C15274e c15274e, Function1 function1, Function0 function0, int i) {
        if ((i & 2) != 0) {
            c15274e = null;
        }
        c12692e.getClass();
        return new C2064e(new C12122e(c12692e, c15274e, function1, function0, 1));
    }

    public static void license(Object obj, Object... objArr) {
        if (obj == null) {
            throw new IllegalArgumentException(String.format("%s cannot be null", objArr));
        }
    }

    public static void metrica(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException();
        }
    }

    public static Object purchase(Object[] objArr, Object... objArr2) {
        Object obj = objArr[0];
        if (obj != null) {
            return obj;
        }
        throw new IllegalArgumentException(String.format("At least one %s required", objArr2));
    }

    public static final InterfaceC1527e vip(InterfaceC11754e interfaceC11754e) {
        InterfaceC1527e interfaceC1527e = interfaceC11754e instanceof InterfaceC1527e ? (InterfaceC1527e) interfaceC11754e : null;
        if (interfaceC1527e != null) {
            return interfaceC1527e;
        }
        throw new IllegalStateException(AbstractC1786e.subscription(AbstractC3820e.ad, interfaceC11754e.getClass(), new StringBuilder("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ")));
    }

    public static boolean yandex(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }
}
