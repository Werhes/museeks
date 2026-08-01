package defpackage;

import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۥۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12878e implements InterfaceC6963e {
    public static final Logger purchase = Logger.getLogger(C6553e.class.getName());
    public final C12894e ad;
    public final InterfaceC1640e appmetrica;
    public final InterfaceC8685e license;
    public final C11833e metrica;
    public final Executor vip;

    public C12878e(Executor executor, C11833e c11833e, C12894e c12894e, InterfaceC8685e interfaceC8685e, InterfaceC1640e interfaceC1640e) {
        this.vip = executor;
        this.metrica = c11833e;
        this.ad = c12894e;
        this.license = interfaceC8685e;
        this.appmetrica = interfaceC1640e;
    }
}
