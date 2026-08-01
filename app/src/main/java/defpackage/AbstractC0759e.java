package defpackage;

import java.io.ByteArrayOutputStream;

/* renamed from: eٜؒؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0759e {
    public static final C7358e ad = new C7358e();

    public static byte[] ad(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((str.length() / 4) * 3);
        try {
            ad.ad(str, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new Cabstract(AbstractC1786e.remoteconfig(e, new StringBuilder("unable to decode base64 string: ")), e, 1);
        }
    }
}
