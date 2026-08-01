package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣؕۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3621e extends AbstractC7691e {
    public static ByteBuffer yandex(AbstractC11095e abstractC11095e) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            long size = abstractC11095e.getSize();
            if (size > 0 && AbstractC1983e.yandex(size)) {
                size++;
            }
            abstractC11095e.m2991abstract((int) size, byteArrayOutputStream);
            if ((byteArrayOutputStream.toByteArray().length & 1) != 0) {
                int length = byteArrayOutputStream.toByteArray().length + 1;
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                abstractC11095e.m2991abstract(length, byteArrayOutputStream2);
                byteArrayOutputStream = byteArrayOutputStream2;
            }
            ByteBuffer wrap = ByteBuffer.wrap(byteArrayOutputStream.toByteArray());
            wrap.rewind();
            return wrap;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.AbstractC7691e
    public final void billing(InterfaceC1425e interfaceC1425e, FileChannel fileChannel, String str) {
        try {
            C16012e ad = C16012e.ad(AbstractC1983e.startapp(fileChannel, C16012e.license));
            if (ad != null) {
                long j = ad.metrica;
                if (j <= 0) {
                    fileChannel.position(fileChannel.size());
                    ad.metrica = fileChannel.size();
                    fileChannel.write(yandex((AbstractC11095e) interfaceC1425e));
                    ad.vip = fileChannel.size();
                    fileChannel.position(0L);
                    fileChannel.write(ad.vip());
                    return;
                }
                fileChannel.position(j);
                if (C13538e.ad(AbstractC1983e.startapp(fileChannel, (int) (fileChannel.size() - fileChannel.position()))) != null) {
                    fileChannel.position(ad.metrica);
                    fileChannel.write(yandex((AbstractC11095e) interfaceC1425e));
                } else {
                    throw new Exception(str + "Could not find existing ID3v2 Tag");
                }
            }
        } catch (IOException e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override // defpackage.AbstractC7691e
    public final void purchase(FileChannel fileChannel, String str) {
        try {
            C16012e ad = C16012e.ad(AbstractC1983e.startapp(fileChannel, C16012e.license));
            if (ad != null) {
                long j = ad.metrica;
                if (j > 0) {
                    fileChannel.position(j);
                    if (C13538e.ad(AbstractC1983e.startapp(fileChannel, (int) (fileChannel.size() - fileChannel.position()))) != null) {
                        fileChannel.truncate(ad.metrica);
                        ad.metrica = 0L;
                        ad.vip = fileChannel.size();
                        fileChannel.position(0L);
                        fileChannel.write(ad.vip());
                    }
                }
            }
        } catch (IOException e) {
            throw new Exception(AbstractC8703e.admob(e, AbstractC8703e.isPro(str, ":")));
        }
    }
}
