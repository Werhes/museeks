package defpackage;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.concurrent.CancellationException;
import java.util.regex.Pattern;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗٛؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC17113e {
    public static final int ad = 9;
    public static final int appmetrica = 15;
    public static final int license = 5;
    public static final int metrica = 10;
    public static final int purchase = 48;
    public static final int vip = 6;

    public static final void ad(InterfaceC10441e interfaceC10441e, Throwable th) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            cancellationException = AbstractC7070e.ad("Channel was consumed, consumer had failed", th);
        }
        interfaceC10441e.Signature(cancellationException);
    }

    public static final Object appmetrica(InterfaceC15080e interfaceC15080e, Object obj) {
        Object amazon = interfaceC15080e.amazon(obj);
        if (!(amazon instanceof C8870e)) {
            return Unit.INSTANCE;
        }
        return ((C0183e) AbstractC5336e.yandex(C2693e.f6576e, new C14869e(interfaceC15080e, obj, (InterfaceC5083e) null, 21))).ad;
    }

    public static final InterfaceC12864e billing(InterfaceC12864e interfaceC12864e, int i) {
        return interfaceC12864e.premium(new C5451e(i));
    }

    public static final AbstractC10075e license(SocketAddress socketAddress) {
        if (socketAddress instanceof InetSocketAddress) {
            return new C16123e((InetSocketAddress) socketAddress);
        }
        if (socketAddress.getClass().getName().equals("java.net.UnixDomainSocketAddress")) {
            return new C0380e(socketAddress);
        }
        throw new IllegalStateException("Unknown socket address type");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final C15525e metrica(AbstractC2195e abstractC2195e, int i, boolean z) {
        int i2 = 0;
        if (abstractC2195e instanceof C10654e) {
            return new C15525e(Pattern.quote(((C10654e) abstractC2195e).ad), 0, 6);
        }
        if (abstractC2195e instanceof C0382e) {
            return new C15525e("\\d", 0, 6);
        }
        if (!(abstractC2195e instanceof InterfaceC15687e)) {
            if (abstractC2195e instanceof C14728e) {
                if (abstractC2195e instanceof C14728e) {
                    C15525e metrica2 = metrica(((C14728e) abstractC2195e).ad, i, true);
                    return new C15525e(AbstractC4653e.applovin(new StringBuilder(), metrica2.vip, '+'), metrica2.metrica, 4);
                }
                throw new IllegalStateException(("Unsupported simple grammar element: " + abstractC2195e).toString());
            }
            if (!(abstractC2195e instanceof C11664e)) {
                throw new IllegalStateException(("Unsupported grammar element: " + abstractC2195e).toString());
            }
            StringBuilder sb = new StringBuilder("[");
            C11664e c11664e = (C11664e) abstractC2195e;
            sb.append(c11664e.ad);
            sb.append('-');
            sb.append(c11664e.vip);
            sb.append(']');
            return new C15525e(sb.toString(), 0, 6);
        }
        StringBuilder sb2 = new StringBuilder();
        int i3 = z ? i + 1 : i;
        for (Object obj : ((InterfaceC15687e) abstractC2195e).ad()) {
            int i4 = i2 + 1;
            if (i2 < 0) {
                AbstractC6874e.Signature();
                throw null;
            }
            C15525e metrica3 = metrica((AbstractC2195e) obj, i3, true);
            if (i2 != 0 && (abstractC2195e instanceof C3946e)) {
                sb2.append("|");
            }
            sb2.append(metrica3.vip);
            i3 += metrica3.metrica;
            i2 = i4;
        }
        int i5 = i3 - i;
        if (z) {
            i5--;
        }
        return new C15525e(sb2.toString(), z, i5);
    }

    public static final void purchase(String str, StringBuilder sb) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [eّۤۧ, java.lang.Object] */
    public static final InterfaceC12864e vip(InterfaceC12864e interfaceC12864e) {
        return interfaceC12864e.premium(new Object());
    }
}
