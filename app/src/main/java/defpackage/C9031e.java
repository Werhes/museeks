package defpackage;

import java.io.RandomAccessFile;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٜ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9031e extends AbstractC1305e {
    public C8490e metrica;

    @Override // defpackage.AbstractC1305e
    public final void appmetrica(InterfaceC1425e interfaceC1425e, RandomAccessFile randomAccessFile, RandomAccessFile randomAccessFile2) {
        this.metrica.appmetrica(interfaceC1425e, randomAccessFile, randomAccessFile2);
    }

    @Override // defpackage.AbstractC1305e
    public final void vip(RandomAccessFile randomAccessFile, RandomAccessFile randomAccessFile2) {
        C8490e c8490e = this.metrica;
        c8490e.getClass();
        try {
            c8490e.vip.metrica(randomAccessFile);
            C3095e pro = C3095e.pro();
            randomAccessFile.seek(0L);
            c8490e.appmetrica(pro, randomAccessFile, randomAccessFile2);
        } catch (C1110e unused) {
            c8490e.appmetrica(C3095e.pro(), randomAccessFile, randomAccessFile2);
        }
    }
}
