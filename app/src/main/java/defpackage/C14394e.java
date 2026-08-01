package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ProtocolException;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٓۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14394e implements InterfaceC13021e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final C14394e f28470e = new Object();

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C3487e f28469e = new C3487e(0, 2, 1, 1, 0, 2, false, false, false, false, C9139e.f18290e, 0, false, C0193e.f1409e);

    @Override // defpackage.InterfaceC13021e
    public final Object metrica(InputStream inputStream) {
        try {
            return (C3487e) C3487e.f7751e.license(inputStream);
        } catch (ProtocolException e) {
            throw new IOException("Protobuf parsing error", e);
        }
    }

    @Override // defpackage.InterfaceC13021e
    public final Unit purchase(OutputStream outputStream, Object obj) {
        C3487e.f7751e.yandex(outputStream, (C3487e) obj);
        return Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC13021e
    public final Object vip() {
        return f28469e;
    }
}
