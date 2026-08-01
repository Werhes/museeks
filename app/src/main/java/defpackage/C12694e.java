package defpackage;

import java.io.IOException;
import java.net.ConnectException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّّۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12694e extends ConnectException {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final IOException f25434e;

    public C12694e(String str, IOException iOException) {
        super(str);
        this.f25434e = iOException;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f25434e;
    }
}
