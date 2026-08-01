package defpackage;

import java.nio.ByteBuffer;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۚۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9743e {
    public static final InterfaceC5083e[] ad = new InterfaceC5083e[0];
    public static final Object vip = new Object();

    public static final C14826e ad(InterfaceC8850e interfaceC8850e) {
        if (interfaceC8850e.mo397public(C4524e.f9798e) == null) {
            interfaceC8850e = interfaceC8850e.mo394const(AbstractC6629e.ad());
        }
        return new C14826e(interfaceC8850e);
    }

    public static final Object appmetrica(Function2 function2, InterfaceC5083e interfaceC5083e) {
        C1613e c1613e = new C1613e(interfaceC5083e, interfaceC5083e.admob());
        return AbstractC18491e.amazon(c1613e, true, c1613e, function2);
    }

    public static final void license(InterfaceC18435e interfaceC18435e, CancellationException cancellationException) {
        InterfaceC10500e interfaceC10500e = (InterfaceC10500e) interfaceC18435e.advert().mo397public(C4524e.f9798e);
        if (interfaceC10500e != null) {
            interfaceC10500e.Signature(cancellationException);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + interfaceC18435e).toString());
        }
    }

    public static final boolean metrica(C9160e c9160e, int i, C17204e c17204e) {
        boolean z;
        synchronized (vip) {
            int i2 = c9160e.license;
            if (i2 == i) {
                c9160e.metrica = c17204e;
                z = true;
                c9160e.license = i2 + 1;
            } else {
                z = false;
            }
        }
        return z;
    }

    public static final C11883e startapp(Function1 function1, Function2 function2) {
        C2920e c2920e = new C2920e(function2, 7, (byte) 0);
        AbstractC9476e.purchase(1, function1);
        return new C11883e(c2920e, function1, 15);
    }

    public static final C14826e vip() {
        C11380e ad2 = AbstractC5097e.ad();
        C15420e c15420e = AbstractC6731e.ad;
        return new C14826e(AbstractC5797e.vip(ad2, AbstractC1497e.ad));
    }

    public static final boolean yandex(InterfaceC18435e interfaceC18435e) {
        InterfaceC10500e interfaceC10500e = (InterfaceC10500e) interfaceC18435e.advert().mo397public(C4524e.f9798e);
        if (interfaceC10500e != null) {
            return interfaceC10500e.purchase();
        }
        return true;
    }

    public abstract int adcel();

    public abstract Object advert(int i);

    public abstract C17750e billing(C16890e c16890e, ByteBuffer byteBuffer);

    public abstract C9492e mopub(int i);

    public C17750e purchase(C16890e c16890e) {
        ByteBuffer byteBuffer = c16890e.f15296e;
        byteBuffer.getClass();
        AbstractC2301e.billing(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return billing(c16890e, byteBuffer);
    }

    public abstract Object smaato(C9492e c9492e);
}
