package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْ۟٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13538e {
    public static final C7936e vip;
    public ByteBuffer ad;

    static {
        int i = AbstractC18186e.ad;
        int i2 = C1724e.ad;
        vip = new C7936e(2);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [eْ۟٘, java.lang.Object] */
    public static C13538e ad(ByteBuffer byteBuffer) {
        C7936e c7936e = AbstractC1983e.ad;
        byte[] bArr = new byte[3];
        byteBuffer.get(bArr);
        String str = new String(bArr, AbstractC4639e.vip);
        EnumC14466e[] enumC14466eArr = EnumC14466e.f28598e;
        if ("ID3".equals(str)) {
            ?? obj = new Object();
            obj.ad = byteBuffer;
            return obj;
        }
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        vip.getClass();
        int i = C1724e.ad;
        return null;
    }
}
