package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗٙؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4965e {
    public static final C7936e ad;

    static {
        int i = AbstractC18186e.ad;
        int i2 = C1724e.ad;
        ad = new C7936e(2);
    }

    public static void ad(FileChannel fileChannel, C0320e c0320e, String str) {
        int i = AbstractC3395e.appmetrica;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i);
        allocateDirect.order(ByteOrder.BIG_ENDIAN);
        int read = fileChannel.read(allocateDirect);
        allocateDirect.position(0);
        if (read < i) {
            throw new IOException(str + " AIFF:Unable to read required number of databytes read:" + read + ":required:" + i);
        }
        String adcel = AbstractC1983e.adcel(allocateDirect);
        if (!"FORM".equals(adcel)) {
            throw new Exception(AbstractC4653e.isPro(str, "Not an AIFF file: incorrect signature ", adcel));
        }
        allocateDirect.getInt();
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        ad.getClass();
        int i2 = C1724e.ad;
        String adcel2 = AbstractC1983e.adcel(allocateDirect);
        if ("AIFF".equals(adcel2)) {
            c0320e.amazon = EnumC12884e.f25731e;
        } else {
            if (!"AIFC".equals(adcel2)) {
                throw new Exception("Invalid AIFF file: Incorrect file type info ".concat(adcel2));
            }
            c0320e.amazon = EnumC12884e.f25730e;
        }
        C7936e c7936e = AbstractC3395e.ad;
    }
}
