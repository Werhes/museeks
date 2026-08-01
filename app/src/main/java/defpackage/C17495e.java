package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣ٘ؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17495e implements InterfaceC0619e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C8208e f34312e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final C17495e f34313e = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [eۣ٘ؒ, java.lang.Object] */
    static {
        InterfaceC13984e interfaceC13984e;
        InterfaceC7227e vip = AbstractC3820e.ad.vip(C4959e.class);
        try {
            interfaceC13984e = AbstractC3820e.ad(C4959e.class);
        } catch (Throwable unused) {
            interfaceC13984e = null;
        }
        f34312e = new C8208e("shutdown.url", new C12025e(vip, interfaceC13984e));
    }

    @Override // defpackage.InterfaceC0619e
    public final C8208e getKey() {
        return f34312e;
    }

    @Override // defpackage.InterfaceC0619e
    public final Object vip(AbstractC4125e abstractC4125e, Function1 function1) {
        C14647e c14647e = new C14647e();
        function1.invoke(c14647e);
        C4959e c4959e = new C4959e(c14647e.ad, c14647e.vip, C2659e.f6525e);
        ((C11223e) abstractC4125e).mopub(C11223e.f22480e, new C12358e(c4959e, false, null, 10));
        return c4959e;
    }
}
