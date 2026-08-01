package defpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒٔؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1056e extends AbstractC17555e {
    public static final C7936e vip;

    static {
        int i = AbstractC18186e.ad;
        int i2 = C1724e.ad;
        vip = new C7936e(2);
    }

    @Override // defpackage.AbstractC17555e
    public final C0521e ad(RandomAccessFile randomAccessFile) {
        throw new UnsupportedOperationException("Old method not used in version 2");
    }

    public abstract InterfaceC1425e appmetrica(FileChannel fileChannel, String str, boolean z);

    public abstract C0521e license(FileChannel fileChannel, String str);

    @Override // defpackage.AbstractC17555e
    public final C0887e metrica(File file, String str, boolean z) {
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        vip.getClass();
        int i = C1724e.ad;
        try {
            FileChannel channel = new RandomAccessFile(file, "r").getChannel();
            try {
                String absolutePath = file.getAbsolutePath();
                C0521e license = license(channel, absolutePath);
                channel.position(0L);
                C0887e c0887e = new C0887e(file, str, license, appmetrica(channel, absolutePath, z));
                channel.close();
                return c0887e;
            } finally {
            }
        } catch (FileNotFoundException e) {
            EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
            int i2 = C1724e.ad;
            throw e;
        }
    }

    @Override // defpackage.AbstractC17555e
    public final InterfaceC1425e vip(RandomAccessFile randomAccessFile) {
        throw new UnsupportedOperationException("Old method not used in version 2");
    }
}
