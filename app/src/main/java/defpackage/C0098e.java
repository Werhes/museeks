package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ProtocolException;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑؖٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0098e implements InterfaceC13021e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C13355e f1257e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final C0098e f1258e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eؑؖٔ] */
    static {
        EnumC14727e enumC14727e = EnumC14727e.RECOMMENDATIONS;
        f1258e = new Object();
        f1257e = new C13355e(enumC14727e, C13664e.f27089e, 0L, C0193e.f1409e);
    }

    @Override // defpackage.InterfaceC13021e
    public final Object metrica(InputStream inputStream) {
        try {
            return (C13355e) C13355e.f26608e.license(inputStream);
        } catch (ProtocolException unused) {
            throw new IOException("Widget DataStore Proto was corrupted!", null);
        }
    }

    @Override // defpackage.InterfaceC13021e
    public final Unit purchase(OutputStream outputStream, Object obj) {
        C13355e.f26608e.yandex(outputStream, (C13355e) obj);
        return Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC13021e
    public final Object vip() {
        return f1257e;
    }
}
