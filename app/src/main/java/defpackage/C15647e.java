package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ProtocolException;
import kotlin.Unit;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۖؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15647e implements InterfaceC13021e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final C15647e f30854e = new Object();

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C3147e f30853e = new C3147e(true, true, true, true, C13664e.f27089e, BuildConfig.FLAVOR, 0, C0193e.f1409e);

    @Override // defpackage.InterfaceC13021e
    public final Object metrica(InputStream inputStream) {
        try {
            return (C3147e) C3147e.f7227e.license(inputStream);
        } catch (ProtocolException e) {
            throw new IOException("Protobuf parsing error", e);
        }
    }

    @Override // defpackage.InterfaceC13021e
    public final Unit purchase(OutputStream outputStream, Object obj) {
        C3147e.f7227e.yandex(outputStream, (C3147e) obj);
        return Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC13021e
    public final Object vip() {
        return f30853e;
    }
}
