package defpackage;

import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۚؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC15698e {
    public static final C8208e ad;

    static {
        InterfaceC13984e interfaceC13984e;
        InterfaceC13984e interfaceC13984e2;
        InterfaceC13984e interfaceC13984e3;
        InterfaceC13984e interfaceC13984e4;
        InterfaceC13984e interfaceC13984e5;
        Class cls = Boolean.TYPE;
        Class cls2 = Integer.TYPE;
        AbstractC1213e.vip("io.ktor.client.plugins.HttpRequestRetry");
        int i = C4292e.f9382e;
        C12232e c12232e = AbstractC3820e.ad;
        c12232e.vip(C9589e.class);
        try {
            C5538e c5538e = C5538e.metrica;
            InterfaceC12635e amazon = c12232e.amazon(c12232e.vip(C0909e.class));
            c12232e.advert(amazon, Collections.singletonList(AbstractC3820e.ad(Object.class)));
            AbstractC3820e.vip(C9589e.class, AbstractC16704e.license(c12232e.smaato(amazon, Collections.EMPTY_LIST, false)));
        } catch (Throwable unused) {
        }
        if (AbstractC5304e.m1866native("RetryFeature")) {
            throw new IllegalArgumentException("Name can't be blank");
        }
        InterfaceC7227e vip = AbstractC3820e.ad.vip(Integer.class);
        try {
            interfaceC13984e = AbstractC3820e.ad(cls2);
        } catch (Throwable unused2) {
            interfaceC13984e = null;
        }
        ad = new C8208e("MaxRetriesPerRequestAttributeKey", new C12025e(vip, interfaceC13984e));
        InterfaceC7227e vip2 = AbstractC3820e.ad.vip(Function3.class);
        try {
            C5538e c5538e2 = C5538e.metrica;
            interfaceC13984e2 = AbstractC3820e.metrica(Function3.class, AbstractC16704e.license(AbstractC3820e.ad(AbstractC16829e.class)), AbstractC16704e.license(AbstractC3820e.ad(InterfaceC4393e.class)), AbstractC16704e.license(AbstractC3820e.ad(AbstractC16824e.class)), AbstractC16704e.license(AbstractC3820e.ad(cls)));
        } catch (Throwable unused3) {
            interfaceC13984e2 = null;
        }
        new C8208e("ShouldRetryPerRequestAttributeKey", new C12025e(vip2, interfaceC13984e2));
        InterfaceC7227e vip3 = AbstractC3820e.ad.vip(Function3.class);
        try {
            C5538e c5538e3 = C5538e.metrica;
            interfaceC13984e3 = AbstractC3820e.metrica(Function3.class, AbstractC16704e.license(AbstractC3820e.ad(AbstractC16829e.class)), AbstractC16704e.license(AbstractC3820e.ad(C10263e.class)), AbstractC16704e.license(AbstractC3820e.ad(Throwable.class)), AbstractC16704e.license(AbstractC3820e.ad(cls)));
        } catch (Throwable unused4) {
            interfaceC13984e3 = null;
        }
        new C8208e("ShouldRetryOnExceptionPerRequestAttributeKey", new C12025e(vip3, interfaceC13984e3));
        InterfaceC7227e vip4 = AbstractC3820e.ad.vip(Function2.class);
        try {
            C5538e c5538e4 = C5538e.metrica;
            interfaceC13984e4 = AbstractC3820e.metrica(Function2.class, AbstractC16704e.license(AbstractC3820e.ad(AbstractC11023e.class)), AbstractC16704e.license(AbstractC3820e.ad(C10263e.class)), AbstractC16704e.license(AbstractC3820e.ad(Unit.class)));
        } catch (Throwable unused5) {
            interfaceC13984e4 = null;
        }
        new C8208e("ModifyRequestPerRequestAttributeKey", new C12025e(vip4, interfaceC13984e4));
        InterfaceC7227e vip5 = AbstractC3820e.ad.vip(Function2.class);
        try {
            C5538e c5538e5 = C5538e.metrica;
            interfaceC13984e5 = AbstractC3820e.metrica(Function2.class, AbstractC16704e.license(AbstractC3820e.ad(AbstractC4565e.class)), AbstractC16704e.license(AbstractC3820e.ad(cls2)), AbstractC16704e.license(AbstractC3820e.ad(Long.TYPE)));
        } catch (Throwable unused6) {
            interfaceC13984e5 = null;
        }
        new C8208e("RetryDelayPerRequestAttributeKey", new C12025e(vip5, interfaceC13984e5));
    }
}
