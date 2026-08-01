package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؗؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4902e {
    public static final C8208e ad;
    public static final C0909e metrica;
    public static final C8208e vip;

    static {
        InterfaceC13984e interfaceC13984e;
        InterfaceC7227e vip2 = AbstractC3820e.ad.vip(InterfaceC9982e.class);
        InterfaceC13984e interfaceC13984e2 = null;
        try {
            interfaceC13984e = AbstractC3820e.ad(InterfaceC9982e.class);
        } catch (Throwable unused) {
            interfaceC13984e = null;
        }
        ad = new C8208e("UploadProgressListenerAttributeKey", new C12025e(vip2, interfaceC13984e));
        InterfaceC7227e vip3 = AbstractC3820e.ad.vip(InterfaceC9982e.class);
        try {
            interfaceC13984e2 = AbstractC3820e.ad(InterfaceC9982e.class);
        } catch (Throwable unused2) {
        }
        vip = new C8208e("DownloadProgressListenerAttributeKey", new C12025e(vip3, interfaceC13984e2));
        metrica = new C0909e("BodyProgress", (Function0) new C0996e(0), (Function1) new C17014e(16));
    }
}
