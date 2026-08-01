package defpackage;

import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٟٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12619e extends AbstractC1305e {
    public C18058e metrica;

    @Override // defpackage.AbstractC1305e
    public final void appmetrica(InterfaceC1425e interfaceC1425e, RandomAccessFile randomAccessFile, RandomAccessFile randomAccessFile2) {
        this.metrica.license(interfaceC1425e, randomAccessFile, randomAccessFile2);
    }

    @Override // defpackage.AbstractC1305e
    public final void vip(RandomAccessFile randomAccessFile, RandomAccessFile randomAccessFile2) {
        C18058e c18058e = this.metrica;
        c18058e.getClass();
        try {
            c18058e.license(new AbstractC14985e(), randomAccessFile, randomAccessFile2);
        } catch (C9163e e) {
            throw new IOException(e.getMessage());
        }
    }
}
