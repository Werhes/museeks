package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؖۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16012e {
    public static final int license = AbstractC3395e.vip + 24;
    public long ad;
    public long metrica;
    public long vip;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, eٖؖۢ] */
    public static C16012e ad(ByteBuffer byteBuffer) {
        String adcel = AbstractC1983e.adcel(byteBuffer);
        EnumC14466e[] enumC14466eArr = EnumC14466e.f28598e;
        if (!"DSD ".equals(adcel)) {
            return null;
        }
        ?? obj = new Object();
        obj.ad = byteBuffer.getLong();
        obj.vip = byteBuffer.getLong();
        obj.metrica = byteBuffer.getLong();
        return obj;
    }

    public final String toString() {
        return "ChunkSize:" + this.ad + ":fileLength:" + this.vip + ":metadata:" + this.metrica;
    }

    public final ByteBuffer vip() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(license);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        EnumC14466e[] enumC14466eArr = EnumC14466e.f28598e;
        allocateDirect.put("DSD ".getBytes(AbstractC4639e.ad));
        allocateDirect.putLong(this.ad);
        allocateDirect.putLong(this.vip);
        allocateDirect.putLong(this.metrica);
        allocateDirect.flip();
        return allocateDirect;
    }
}
