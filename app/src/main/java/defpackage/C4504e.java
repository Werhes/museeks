package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۦٍ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4504e implements InterfaceC1312e {
    @Override // defpackage.InterfaceC1312e
    public final C10005e ad(Uri uri) {
        File Signature = AbstractC6100e.Signature(uri);
        return new C10005e(new FileInputStream(Signature), Signature);
    }

    @Override // defpackage.InterfaceC1312e
    public final void appmetrica(Uri uri) {
        File Signature = AbstractC6100e.Signature(uri);
        if (Signature.isDirectory()) {
            throw new FileNotFoundException(String.format("%s is a directory", uri));
        }
        if (Signature.delete()) {
            return;
        }
        if (!Signature.exists()) {
            throw new FileNotFoundException(String.format("%s does not exist", uri));
        }
        throw new IOException(String.format("%s could not be deleted", uri));
    }

    @Override // defpackage.InterfaceC1312e
    public final OutputStream license(Uri uri) {
        File Signature = AbstractC6100e.Signature(uri);
        AbstractC16425e.vip(Signature);
        return new C15387e(new FileOutputStream(Signature), Signature);
    }

    @Override // defpackage.InterfaceC1312e
    public final File metrica(Uri uri) {
        return AbstractC6100e.Signature(uri);
    }

    @Override // defpackage.InterfaceC1312e
    public final void purchase(Uri uri, Uri uri2) {
        File Signature = AbstractC6100e.Signature(uri);
        File Signature2 = AbstractC6100e.Signature(uri2);
        AbstractC16425e.vip(Signature2);
        if (!Signature.renameTo(Signature2)) {
            throw new IOException(String.format("%s could not be renamed to %s", uri, uri2));
        }
    }

    @Override // defpackage.InterfaceC1312e
    public final String startapp() {
        return "file";
    }

    @Override // defpackage.InterfaceC1312e
    public final boolean vip(Uri uri) {
        return AbstractC6100e.Signature(uri).exists();
    }
}
