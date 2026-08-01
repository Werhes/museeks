package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓۙؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14200e extends AbstractC17555e {
    public static final C7936e vip;

    static {
        int i = AbstractC18186e.ad;
        int i2 = C1724e.ad;
        vip = new C7936e(2);
    }

    @Override // defpackage.AbstractC17555e
    public final C0521e ad(RandomAccessFile randomAccessFile) {
        throw new UnsupportedOperationException(BuildConfig.FLAVOR);
    }

    @Override // defpackage.AbstractC17555e
    public final C0887e metrica(File file, String str, boolean z) {
        C7936e c7936e = vip;
        try {
            C13197e c13197e = new C13197e(new C5476e(new FileInputStream(file), C1930e.license));
            try {
                C7051e c7051e = new C7051e(c13197e);
                EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
                c7936e.getClass();
                int i = C1724e.ad;
                C18529e c18529e = new C18529e(c13197e);
                while (true) {
                    EnumC14671e enumC14671e = EnumC14671e.UNKNOWN;
                    if ("moov".equals(c18529e.ad)) {
                        C11883e c11883e = new C11883e(c18529e, c13197e, c7051e, file.length(), z);
                        C0887e c0887e = new C0887e(file, str, (C14355e) c11883e.f23815e, (C15912e) c11883e.f23814e);
                        c13197e.close();
                        return c0887e;
                    }
                    EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
                    c7936e.getClass();
                    int i2 = C1724e.ad;
                    c13197e.skip(c18529e.ad());
                    c18529e = new C18529e(c13197e);
                }
            } finally {
            }
        } catch (FileNotFoundException e) {
            throw e;
        } catch (IOException e2) {
            throw new Exception("This file does not appear to be an Mp4 file", e2);
        }
    }

    @Override // defpackage.AbstractC17555e
    public final InterfaceC1425e vip(RandomAccessFile randomAccessFile) {
        throw new UnsupportedOperationException(BuildConfig.FLAVOR);
    }
}
