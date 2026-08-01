package defpackage;

import java.io.File;
import java.io.RandomAccessFile;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ؖ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC17555e {
    public static final C7936e ad;

    static {
        int i = AbstractC18186e.ad;
        int i2 = C1724e.ad;
        ad = new C7936e(2);
    }

    public abstract C0521e ad(RandomAccessFile randomAccessFile);

    public C0887e metrica(File file, String str, boolean z) {
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        ad.getClass();
        int i = C1724e.ad;
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            randomAccessFile.seek(0L);
            C0521e ad2 = ad(randomAccessFile);
            randomAccessFile.seek(0L);
            C0887e c0887e = new C0887e(file, str, ad2, vip(randomAccessFile));
            randomAccessFile.close();
            return c0887e;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    randomAccessFile.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public abstract InterfaceC1425e vip(RandomAccessFile randomAccessFile);
}
