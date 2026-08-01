package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٜٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12632e implements InterfaceC13021e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C7596e f25346e;

    public C12632e(C7596e c7596e) {
        this.f25346e = c7596e;
    }

    @Override // defpackage.InterfaceC13021e
    public final Object metrica(InputStream inputStream) {
        try {
            C8028e c8028e = AbstractC0232e.license;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
            AbstractC13671e.license(inputStream, byteArrayOutputStream);
            String mopub = AbstractC6507e.mopub(byteArrayOutputStream.toByteArray());
            c8028e.getClass();
            return (C12893e) c8028e.appmetrica(C12893e.Companion.serializer(), mopub);
        } catch (Exception e) {
            throw new IOException("Cannot parse session data", e);
        }
    }

    @Override // defpackage.InterfaceC13021e
    public final Unit purchase(OutputStream outputStream, Object obj) {
        outputStream.write(AbstractC0232e.license.purchase(C12893e.Companion.serializer(), (C12893e) obj).getBytes(AbstractC5508e.ad));
        return Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC13021e
    public final Object vip() {
        return new C12893e(this.f25346e.ad(null), null, null);
    }
}
