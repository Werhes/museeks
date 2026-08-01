package defpackage;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.Collections;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖ٘ۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4173e {
    public static final /* synthetic */ int ad = 0;

    static {
        AbstractC1213e.vip("io.ktor.client.plugins.HttpTimeout");
        int i = C0330e.f2356e;
        C12232e c12232e = AbstractC3820e.ad;
        c12232e.vip(C9589e.class);
        try {
            C5538e c5538e = C5538e.metrica;
            InterfaceC12635e amazon = c12232e.amazon(c12232e.vip(C0909e.class));
            c12232e.advert(amazon, Collections.singletonList(AbstractC3820e.ad(Object.class)));
            AbstractC3820e.vip(C9589e.class, AbstractC16704e.license(c12232e.smaato(amazon, Collections.EMPTY_LIST, false)));
        } catch (Throwable unused) {
        }
        if (AbstractC5304e.m1866native("HttpTimeout")) {
            throw new IllegalArgumentException("Name can't be blank");
        }
    }

    public static final SocketTimeoutException ad(C10017e c10017e, IOException iOException) {
        Object obj;
        StringBuilder sb = new StringBuilder("Socket timeout has expired [url=");
        sb.append((C6399e) c10017e.f19786e);
        sb.append(", socket_timeout=");
        C10794e c10794e = (C10794e) c10017e.vip();
        if (c10794e == null || (obj = c10794e.metrica) == null) {
            obj = "unknown";
        }
        sb.append(obj);
        sb.append("] ms");
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException(sb.toString());
        socketTimeoutException.initCause(iOException);
        return socketTimeoutException;
    }
}
