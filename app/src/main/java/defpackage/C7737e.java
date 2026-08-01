package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Locale;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؗؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7737e extends C0887e {
    public static final C7936e billing;
    public AbstractC11095e appmetrica;
    public C7301e purchase;

    static {
        int i = AbstractC18186e.ad;
        int i2 = C1724e.ad;
        billing = new C7936e(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [eِٖۢ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [eۣٟ, java.lang.Object] */
    public static AbstractC9621e appmetrica(C12894e c12894e) {
        ?? obj = new Object();
        c12894e.ads(0L, 10L, obj);
        byte[] bArr = AbstractC11095e.f21993e;
        obj.admob(10L);
        int i = 0;
        while (true) {
            byte[] bArr2 = AbstractC11095e.f21993e;
            if (i >= 3) {
                byte readByte = obj.readByte();
                obj.readByte();
                byte readByte2 = obj.readByte();
                int ad = AbstractC8294e.ad(obj);
                ?? obj2 = new Object();
                obj2.ad = readByte;
                obj2.vip = readByte2;
                obj2.metrica = ad;
                return new C4842e(obj2);
            }
            if (obj.readByte() != bArr2[i]) {
                return C1444e.f4274e;
            }
            i++;
        }
    }

    @Override // defpackage.C0887e
    public final InterfaceC9354e ad() {
        return C12927e.metrica();
    }

    public final void billing() {
        File absoluteFile = this.ad.getAbsoluteFile();
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        C7936e c7936e = billing;
        c7936e.getClass();
        int i = C1724e.ad;
        if (!absoluteFile.exists()) {
            EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
            Locale.getDefault();
            throw new IOException(AbstractC5087e.m1746extends("Cannot make changes to file ", absoluteFile.getName(), " because the file cannot be found"));
        }
        C12927e.license();
        if (absoluteFile.length() <= 150) {
            EnumC1005e[] enumC1005eArr3 = EnumC1005e.f3456e;
            absoluteFile.getName();
            Locale.getDefault();
            throw new IOException(AbstractC5087e.m1746extends("Cannot make changes to file ", absoluteFile.getName(), " because too small to be an audio file"));
        }
        RandomAccessFile randomAccessFile = null;
        try {
            try {
                if (C12927e.license().advert) {
                    if (this.appmetrica == null) {
                        RandomAccessFile randomAccessFile2 = new RandomAccessFile(absoluteFile, "rw");
                        try {
                            new C13292e().isVip(randomAccessFile2);
                            new C10768e().isVip(randomAccessFile2);
                            new C15909e().isVip(randomAccessFile2);
                            c7936e.getClass();
                            randomAccessFile2.close();
                        } catch (FileNotFoundException e) {
                            e = e;
                            EnumC1005e[] enumC1005eArr4 = EnumC1005e.f3456e;
                            c7936e.getClass();
                            int i2 = C1724e.ad;
                            throw e;
                        } catch (IOException e2) {
                            e = e2;
                            EnumC1005e[] enumC1005eArr5 = EnumC1005e.f3456e;
                            c7936e.getClass();
                            int i3 = C1724e.ad;
                            throw e;
                        } catch (RuntimeException e3) {
                            e = e3;
                            EnumC1005e[] enumC1005eArr52 = EnumC1005e.f3456e;
                            c7936e.getClass();
                            int i32 = C1724e.ad;
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            randomAccessFile = randomAccessFile2;
                            if (randomAccessFile != null) {
                                randomAccessFile.close();
                            }
                            throw th;
                        }
                    } else {
                        c7936e.getClass();
                        C0818e c0818e = (C0818e) this.vip;
                        long j = c0818e.appmetrica;
                        long mo2918break = this.appmetrica.mo2918break(absoluteFile, j);
                        if (j != mo2918break) {
                            c7936e.getClass();
                            c0818e.appmetrica = mo2918break;
                        }
                    }
                }
                RandomAccessFile randomAccessFile3 = new RandomAccessFile(absoluteFile, "rw");
                C12927e.license();
                if (C12927e.license().appmetrica) {
                    c7936e.getClass();
                    if (this.purchase == null) {
                        c7936e.getClass();
                        new C7301e().signatures(randomAccessFile3);
                    } else {
                        c7936e.getClass();
                        this.purchase.ads(randomAccessFile3);
                    }
                }
                randomAccessFile3.close();
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (FileNotFoundException e4) {
            e = e4;
        } catch (IOException e5) {
            e = e5;
        } catch (RuntimeException e6) {
            e = e6;
        }
    }

    public final C0818e license(C12894e c12894e, long j, C0818e c0818e, String str) {
        FileInputStream fileInputStream;
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        AbstractC6069e.license(j);
        AbstractC6069e.license(c0818e.appmetrica);
        C7936e c7936e = billing;
        c7936e.getClass();
        int i = C1724e.ad;
        C0818e c0818e2 = new C0818e(c12894e, 0L, str);
        EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
        c7936e.getClass();
        long j2 = c0818e.appmetrica;
        long j3 = c0818e2.appmetrica;
        if (j2 == j3) {
            AbstractC6069e.license(j3);
            c7936e.getClass();
            return c0818e;
        }
        AbstractC6069e.license(j3);
        c7936e.getClass();
        long j4 = c0818e.yandex;
        long j5 = c0818e2.yandex;
        if (j4 == j5) {
            AbstractC6069e.license(c0818e2.appmetrica);
            c7936e.getClass();
            return c0818e2;
        }
        int i2 = (int) j;
        int i3 = (int) c0818e.appmetrica;
        AbstractC6069e.metrica(i2);
        AbstractC6069e.metrica(i3);
        c7936e.getClass();
        FileChannel fileChannel = null;
        try {
            fileInputStream = new FileInputStream(this.ad);
        } catch (Throwable th) {
            th = th;
            fileInputStream = null;
        }
        try {
            fileChannel = fileInputStream.getChannel();
            fileChannel.position(i2);
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i3 - i2);
            fileChannel.read(allocateDirect);
            while (allocateDirect.hasRemaining()) {
                if (allocateDirect.get() != 0) {
                    fileChannel.close();
                    fileInputStream.close();
                    C0818e c0818e3 = new C0818e(c12894e, c0818e2.appmetrica + c0818e2.ad.ad(), str);
                    long j6 = c0818e3.appmetrica;
                    long j7 = c0818e.appmetrica;
                    if (j6 == j7) {
                        EnumC1005e[] enumC1005eArr3 = EnumC1005e.f3456e;
                        AbstractC6069e.license(j7);
                        c7936e.getClass();
                        int i4 = C1724e.ad;
                        return c0818e;
                    }
                    if (c0818e3.yandex == j5) {
                        EnumC1005e[] enumC1005eArr4 = EnumC1005e.f3456e;
                        AbstractC6069e.license(c0818e2.appmetrica);
                        c7936e.getClass();
                        int i5 = C1724e.ad;
                        return c0818e2;
                    }
                    EnumC1005e[] enumC1005eArr5 = EnumC1005e.f3456e;
                    AbstractC6069e.license(j7);
                    c7936e.getClass();
                    int i6 = C1724e.ad;
                    return c0818e;
                }
            }
            fileChannel.close();
            fileInputStream.close();
            return c0818e;
        } catch (Throwable th2) {
            th = th2;
            if (fileChannel != null) {
                fileChannel.close();
            }
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            throw th;
        }
    }

    @Override // defpackage.C0887e
    public final InterfaceC1425e metrica(InterfaceC9354e interfaceC9354e) {
        this.metrica = (InterfaceC1425e) interfaceC9354e;
        if (interfaceC9354e instanceof C7301e) {
            EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
            billing.getClass();
            int i = C1724e.ad;
            this.purchase = (C7301e) interfaceC9354e;
        } else {
            this.appmetrica = (AbstractC11095e) interfaceC9354e;
        }
        return this.metrica;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [eًٖٕ, eؚٜٟ, eًٓۥ] */
    public final void purchase(C12894e c12894e, String str) {
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        C7936e c7936e = billing;
        c7936e.getClass();
        int i = C1724e.ad;
        try {
            ?? c7301e = new C7301e();
            c7301e.f16056e = (byte) 0;
            FileChannel fileChannel = (FileChannel) c12894e.f25752e;
            c7301e.f31887e = str;
            ByteBuffer allocate = ByteBuffer.allocate(128);
            fileChannel.position(fileChannel.size() - 128);
            fileChannel.read(allocate);
            allocate.flip();
            c7301e.read(allocate);
            this.purchase = c7301e;
        } catch (C12342e unused) {
            EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
            c7936e.getClass();
            int i2 = C1724e.ad;
        }
        try {
            if (this.purchase == null) {
                this.purchase = new C7301e(c12894e, str);
            }
        } catch (C12342e unused2) {
            EnumC1005e[] enumC1005eArr3 = EnumC1005e.f3456e;
            c7936e.getClass();
            int i3 = C1724e.ad;
        }
    }

    @Override // defpackage.C0887e
    public final void vip() {
        try {
            billing();
        } catch (AbstractC7384e e) {
            e = e;
            throw new Exception(e);
        } catch (C9774e e2) {
            throw new Exception(e2);
        } catch (IOException e3) {
            e = e3;
            throw new Exception(e);
        }
    }
}
