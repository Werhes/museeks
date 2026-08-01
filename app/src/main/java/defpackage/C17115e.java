package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٗٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17115e {
    public static final ThreadLocal license = new ThreadLocal();
    public final int ad;
    public volatile int metrica = 0;
    public final C11980e vip;

    public C17115e(C11980e c11980e, int i) {
        this.vip = c11980e;
        this.ad = i;
    }

    public final int ad(int i) {
        C4751e vip = vip();
        int ad = vip.ad(16);
        if (ad == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) vip.f8352e;
        int i2 = ad + vip.f8353e;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        C4751e vip = vip();
        int ad = vip.ad(4);
        sb.append(Integer.toHexString(ad != 0 ? ((ByteBuffer) vip.f8352e).getInt(ad + vip.f8353e) : 0));
        sb.append(", codepoints:");
        C4751e vip2 = vip();
        int ad2 = vip2.ad(16);
        if (ad2 != 0) {
            int i2 = ad2 + vip2.f8353e;
            i = ((ByteBuffer) vip2.f8352e).getInt(((ByteBuffer) vip2.f8352e).getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(ad(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [eؕۦؚ, java.lang.Object] */
    public final C4751e vip() {
        ThreadLocal threadLocal = license;
        C4751e c4751e = (C4751e) threadLocal.get();
        C4751e c4751e2 = c4751e;
        if (c4751e == null) {
            ?? abstractC3757e = new AbstractC3757e();
            threadLocal.set(abstractC3757e);
            c4751e2 = abstractC3757e;
        }
        C6927e c6927e = (C6927e) this.vip.f23950e;
        int ad = c6927e.ad(6);
        if (ad != 0) {
            int i = ad + c6927e.f8353e;
            int i2 = (this.ad * 4) + ((ByteBuffer) c6927e.f8352e).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) c6927e.f8352e).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) c6927e.f8352e;
            c4751e2.f8352e = byteBuffer;
            if (byteBuffer != null) {
                c4751e2.f8353e = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                c4751e2.f8351e = i4;
                c4751e2.f8350e = ((ByteBuffer) c4751e2.f8352e).getShort(i4);
                return c4751e2;
            }
            c4751e2.f8353e = 0;
            c4751e2.f8351e = 0;
            c4751e2.f8350e = 0;
        }
        return c4751e2;
    }
}
