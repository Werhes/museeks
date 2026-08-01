package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ProtocolException;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٔؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14528e implements InterfaceC13021e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C10876e f28723e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final C14528e f28724e;

    /* JADX WARN: Type inference failed for: r0v0, types: [eٖٔؗ, java.lang.Object] */
    static {
        EnumC4169e enumC4169e = EnumC4169e.f9186e;
        EnumC5778e enumC5778e = EnumC5778e.f12225e;
        f28724e = new Object();
        f28723e = new C10876e(false, true, true, false, false, enumC5778e, EnumC11700e.DARK, enumC4169e, true, false, false, false, false, false, false, false, false, C0193e.f1409e);
    }

    @Override // defpackage.InterfaceC13021e
    public final Object metrica(InputStream inputStream) {
        try {
            return (C10876e) C10876e.f21531e.license(inputStream);
        } catch (ProtocolException e) {
            throw new IOException("Protobuf parsing error", e);
        }
    }

    @Override // defpackage.InterfaceC13021e
    public final Unit purchase(OutputStream outputStream, Object obj) {
        C10876e.f21531e.yandex(outputStream, (C10876e) obj);
        return Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC13021e
    public final Object vip() {
        return f28723e;
    }
}
