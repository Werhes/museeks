package defpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؙؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7691e extends AbstractC1305e {
    public static final C7936e metrica;

    static {
        int i = AbstractC18186e.ad;
        int i2 = C1724e.ad;
        metrica = new C7936e(2);
    }

    @Override // defpackage.AbstractC1305e
    public final void ad(C0887e c0887e) {
        File file = c0887e.ad;
        C12927e.license();
        if (file.length() <= 100) {
            throw new C9163e("Cannot write to file %s because too small to be an audio file", file);
        }
        try {
            FileChannel channel = new RandomAccessFile(file, "rw").getChannel();
            try {
                purchase(channel, file.getAbsolutePath());
                if (channel != null) {
                    channel.close();
                }
            } finally {
            }
        } catch (IOException e) {
            EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
            metrica.getClass();
            int i = C1724e.ad;
            throw new C9163e(e, "Cannot delete file %s because not writable", file);
        }
    }

    @Override // defpackage.AbstractC1305e
    public final void appmetrica(InterfaceC1425e interfaceC1425e, RandomAccessFile randomAccessFile, RandomAccessFile randomAccessFile2) {
        throw new UnsupportedOperationException("Old method not used in version 2");
    }

    public abstract void billing(InterfaceC1425e interfaceC1425e, FileChannel fileChannel, String str);

    @Override // defpackage.AbstractC1305e
    public final void license(C0887e c0887e) {
        C7936e c7936e = metrica;
        File file = c0887e.ad;
        C12927e.license();
        if (file.length() <= 100) {
            throw new C9163e("Cannot write to file %s because too small to be an audio file", file);
        }
        try {
            FileChannel channel = new RandomAccessFile(file, "rw").getChannel();
            try {
                billing(c0887e.metrica, channel, file.getAbsolutePath());
                if (channel != null) {
                    channel.close();
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }
        } catch (FileNotFoundException e) {
            if (file.exists()) {
                EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
                c7936e.getClass();
                int i = C1724e.ad;
                throw new C9163e(e, "Cannot modify %s because do not have permissions to modify file", file);
            }
            EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
            c7936e.getClass();
            int i2 = C1724e.ad;
            throw new C9163e(e, "Cannot make changes to file %s because the file cannot be found", file);
        } catch (IOException e2) {
            EnumC1005e[] enumC1005eArr3 = EnumC1005e.f3456e;
            c7936e.getClass();
            int i3 = C1724e.ad;
            throw new Exception(e2);
        }
    }

    public abstract void purchase(FileChannel fileChannel, String str);

    @Override // defpackage.AbstractC1305e
    public final void vip(RandomAccessFile randomAccessFile, RandomAccessFile randomAccessFile2) {
        throw new UnsupportedOperationException("Old method not used in version 2");
    }
}
