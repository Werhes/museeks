package defpackage;

import java.util.concurrent.CancellationException;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕؑٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3063e extends CancellationException implements InterfaceC13853e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final transient InterfaceC10500e f7127e;

    public C3063e(String str, InterfaceC10500e interfaceC10500e) {
        super(str);
        this.f7127e = interfaceC10500e;
    }

    @Override // defpackage.InterfaceC13853e
    public final Throwable ad() {
        String message = getMessage();
        if (message == null) {
            message = BuildConfig.FLAVOR;
        }
        C3063e c3063e = new C3063e(message, this.f7127e);
        c3063e.initCause(this);
        return c3063e;
    }
}
