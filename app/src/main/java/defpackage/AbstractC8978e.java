package defpackage;

import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۛۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8978e {
    public static final C8208e ad;
    public static final C0909e license;
    public static final C5363e metrica;
    public static final C8208e vip;

    static {
        InterfaceC13984e interfaceC13984e;
        InterfaceC7227e vip2 = AbstractC3820e.ad.vip(Unit.class);
        InterfaceC13984e interfaceC13984e2 = null;
        try {
            interfaceC13984e = AbstractC3820e.ad(Unit.class);
        } catch (Throwable unused) {
            interfaceC13984e = null;
        }
        ad = new C8208e("SkipSaveBody", new C12025e(vip2, interfaceC13984e));
        InterfaceC7227e vip3 = AbstractC3820e.ad.vip(Unit.class);
        try {
            interfaceC13984e2 = AbstractC3820e.ad(Unit.class);
        } catch (Throwable unused2) {
        }
        vip = new C8208e("ResponseBodySaved", new C12025e(vip3, interfaceC13984e2));
        metrica = new C5363e(new C0996e(13));
        license = new C0909e("SaveBody", (Function0) new C0996e(0), (Function1) new C2163e(8));
        int i = C2569e.f6421e;
        C12232e c12232e = AbstractC3820e.ad;
        c12232e.vip(C9589e.class);
        try {
            C5538e c5538e = C5538e.metrica;
            InterfaceC12635e amazon = c12232e.amazon(c12232e.vip(C0909e.class));
            c12232e.advert(amazon, Collections.singletonList(AbstractC3820e.ad(Object.class)));
            AbstractC3820e.vip(C9589e.class, AbstractC16704e.license(c12232e.smaato(amazon, Collections.EMPTY_LIST, false)));
        } catch (Throwable unused3) {
        }
        if (AbstractC5304e.m1866native("DoubleReceivePlugin")) {
            throw new IllegalArgumentException("Name can't be blank");
        }
    }

    public static final InterfaceC4911e ad() {
        return (InterfaceC4911e) metrica.getValue();
    }
}
