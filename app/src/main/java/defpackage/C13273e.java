package defpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٕۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13273e extends AbstractC17555e {
    @Override // defpackage.AbstractC17555e
    public final C0521e ad(RandomAccessFile randomAccessFile) {
        throw new RuntimeException("MP3FileReader.getEncodingInfo should be called");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [eِٖۢ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [eًؗؑ, java.lang.Object, eؘؒۥ] */
    @Override // defpackage.AbstractC17555e
    public final C0887e metrica(File file, String str, boolean z) {
        ?? obj = new Object();
        AbstractC5542e.metrica(file);
        if (str == null || AbstractC8433e.license(str)) {
            throw new IllegalArgumentException();
        }
        obj.ad = file;
        obj.license = str;
        obj.appmetrica = null;
        obj.purchase = null;
        FileChannel channel = new RandomAccessFile(file, "r").getChannel();
        try {
            long j = 0;
            if (channel.size() == 0) {
                throw new FileNotFoundException("Not found or 0 size " + file.getPath());
            }
            try {
                C12894e c12894e = new C12894e(channel);
                AbstractC9621e appmetrica = C7737e.appmetrica(c12894e);
                if (appmetrica.metrica()) {
                    long j2 = ((C18457e) appmetrica.vip()).metrica + 10;
                    C0818e c0818e = new C0818e(c12894e, j2, file.getPath());
                    if (j2 != c0818e.appmetrica) {
                        C7936e c7936e = C7737e.billing;
                        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
                        c7936e.getClass();
                        int i = C1724e.ad;
                        c0818e = obj.license(c12894e, j2, c0818e, file.getPath());
                        j2 = c0818e.appmetrica;
                    }
                    obj.vip = c0818e;
                    j = j2;
                } else {
                    obj.vip = new C0818e(c12894e, 0L, file.getPath());
                }
                if (appmetrica.metrica()) {
                    C18457e c18457e = (C18457e) appmetrica.vip();
                    ?? obj2 = new Object();
                    c12894e.ads(10L, j - 10, obj2);
                    byte b = c18457e.ad;
                    if (b == 2) {
                        obj.appmetrica = new C15909e(obj2, c18457e, file.getPath(), z);
                    } else if (b == 3) {
                        obj.appmetrica = new C10768e(obj2, c18457e, file.getPath(), z);
                    } else if (b == 4) {
                        obj.appmetrica = new C13292e(obj2, c18457e, file.getPath(), z);
                    }
                }
                obj.purchase(c12894e, file.getPath());
                AbstractC11095e abstractC11095e = obj.appmetrica;
                if (abstractC11095e != null) {
                    obj.metrica = abstractC11095e;
                } else {
                    C7301e c7301e = obj.purchase;
                    if (c7301e != null) {
                        obj.metrica = c7301e;
                    }
                }
                boolean z2 = true;
                AbstractC2301e.subscription(!AbstractC8433e.license(str));
                if (obj.vip == null) {
                    z2 = false;
                }
                AbstractC2301e.subscription(z2);
                channel.close();
                return obj;
            } finally {
            }
        } catch (IOException e) {
            throw new FileNotFoundException(file.getPath() + " " + e.getMessage());
        }
    }

    @Override // defpackage.AbstractC17555e
    public final InterfaceC1425e vip(RandomAccessFile randomAccessFile) {
        throw new RuntimeException("MP3FileReader.getEncodingInfo should be called");
    }
}
