package defpackage;

import java.io.RandomAccessFile;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖ۟ٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16536e extends AbstractC1305e {
    @Override // defpackage.AbstractC1305e
    public final synchronized void ad(C0887e c0887e) {
        C7936e c7936e = C7737e.billing;
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        c7936e.getClass();
        int i = C1724e.ad;
        ((C7737e) c0887e).purchase = null;
        ((C7737e) c0887e).appmetrica = null;
        c0887e.vip();
    }

    @Override // defpackage.AbstractC1305e
    public final void appmetrica(InterfaceC1425e interfaceC1425e, RandomAccessFile randomAccessFile, RandomAccessFile randomAccessFile2) {
        throw new RuntimeException("MP3FileReaderwriteTag should not be called");
    }

    @Override // defpackage.AbstractC1305e
    public final void vip(RandomAccessFile randomAccessFile, RandomAccessFile randomAccessFile2) {
        throw new RuntimeException("MP3FileReader.getEncodingInfo should be called");
    }
}
