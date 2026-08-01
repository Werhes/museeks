package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؔؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2426e {
    public static final C12916e ad = new C12916e(12, (Object) null);

    public static int ad(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        throw new IllegalArgumentException(AbstractC1786e.admob(i, "type needs to be >= FIRST and <= LAST, type="));
    }

    public static final Object metrica(InterfaceC8850e interfaceC8850e, Object obj, Object obj2, Function2 function2, InterfaceC5083e interfaceC5083e) {
        Object invoke;
        Object purchase = AbstractC2745e.purchase(interfaceC8850e, obj2);
        try {
            C11618e c11618e = new C11618e(interfaceC5083e, interfaceC8850e);
            if (AbstractC0869e.premium(function2)) {
                AbstractC9476e.purchase(2, function2);
                invoke = function2.invoke(obj, c11618e);
            } else {
                invoke = AbstractC10558e.mopub(function2, obj, c11618e);
            }
            AbstractC2745e.appmetrica(interfaceC8850e, purchase);
            return invoke;
        } catch (Throwable th) {
            AbstractC2745e.appmetrica(interfaceC8850e, purchase);
            throw th;
        }
    }

    public static C13475e vip(InterfaceC0390e interfaceC0390e, Function0 function0) {
        if (function0 != null) {
            return new C13475e(interfaceC0390e, function0);
        }
        throw new IllegalArgumentException("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties.lazySoft must not be null");
    }
}
