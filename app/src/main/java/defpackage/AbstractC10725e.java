package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؑٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC10725e {
    public static final C8208e metrica;
    public static final InterfaceC4911e ad = AbstractC1213e.vip("io.ktor.client.plugins.compression.ContentEncoding");
    public static final C0909e vip = new C0909e("HttpEncoding", (Function0) C1074e.f3605e, (Function1) new C2894e(20));

    static {
        InterfaceC13984e interfaceC13984e;
        InterfaceC7227e vip2 = AbstractC3820e.ad.vip(List.class);
        InterfaceC13984e interfaceC13984e2 = null;
        try {
            C5538e c5538e = C5538e.metrica;
            interfaceC13984e = AbstractC3820e.vip(List.class, AbstractC16704e.license(AbstractC3820e.ad(String.class)));
        } catch (Throwable unused) {
            interfaceC13984e = null;
        }
        new C8208e("CompressionListAttribute", new C12025e(vip2, interfaceC13984e));
        InterfaceC7227e vip3 = AbstractC3820e.ad.vip(List.class);
        try {
            C5538e c5538e2 = C5538e.metrica;
            interfaceC13984e2 = AbstractC3820e.vip(List.class, AbstractC16704e.license(AbstractC3820e.ad(String.class)));
        } catch (Throwable unused2) {
        }
        metrica = new C8208e("DecompressionListAttribute", new C12025e(vip3, interfaceC13984e2));
    }
}
