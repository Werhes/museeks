package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕٔؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3360e implements InterfaceC9660e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final C3360e f7565e = new Object();

    @Override // defpackage.InterfaceC9660e
    public final Map advert() {
        return Collections.EMPTY_MAP;
    }

    @Override // defpackage.InterfaceC9660e
    public final void close() {
    }

    @Override // defpackage.InterfaceC9660e
    public final void license(InterfaceC4407e interfaceC4407e) {
    }

    @Override // defpackage.InterfaceC9660e
    public final Uri loadAd() {
        return null;
    }

    @Override // defpackage.InterfaceC9660e
    public final long metrica(C2435e c2435e) {
        throw new IOException("PlaceholderDataSource cannot be opened");
    }

    @Override // defpackage.InterfaceC15672e
    public final int read(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException();
    }
}
