package defpackage;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۨؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C18529e {
    public static final C7936e appmetrica;
    public String ad;
    public ByteBuffer license;
    public long metrica;
    public int vip;

    static {
        int i = AbstractC18186e.ad;
        int i2 = C1724e.ad;
        appmetrica = new C7936e(2);
    }

    public C18529e(InterfaceC4895e interfaceC4895e) {
        this.vip = interfaceC4895e.readInt();
        String mo1683e = interfaceC4895e.mo1683e(4L, AbstractC4639e.vip);
        this.ad = mo1683e;
        if ("\u0000\u0000\u0000\u0000".equals(mo1683e)) {
            throw new RuntimeException(this.ad);
        }
    }

    public C18529e(String str) {
        if (str.length() != 4) {
            throw new C14803e(str, str.length());
        }
        ByteBuffer allocate = ByteBuffer.allocate(8);
        this.license = allocate;
        try {
            this.ad = str;
            allocate.put(4, str.getBytes("ISO-8859-1")[0]);
            this.license.put(5, str.getBytes("ISO-8859-1")[1]);
            this.license.put(6, str.getBytes("ISO-8859-1")[2]);
            this.license.put(7, str.getBytes("ISO-8859-1")[3]);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public C18529e(ByteBuffer byteBuffer) {
        purchase(byteBuffer);
    }

    public final int ad() {
        return this.vip - 8;
    }

    public final void appmetrica(int i) {
        byte[] appmetrica2 = AbstractC1983e.appmetrica(i);
        this.license.put(0, appmetrica2[0]);
        this.license.put(1, appmetrica2[1]);
        this.license.put(2, appmetrica2[2]);
        this.license.put(3, appmetrica2[3]);
        this.vip = i;
    }

    public final EnumC14671e license() {
        EnumC14671e enumC14671e = (EnumC14671e) EnumC14671e.f28909e.get(this.ad);
        return enumC14671e == null ? EnumC14671e.UNKNOWN : enumC14671e;
    }

    public final ByteBuffer metrica() {
        this.license.rewind();
        return this.license;
    }

    public final void purchase(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[8];
        byteBuffer.get(bArr);
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        this.license = wrap;
        wrap.order(ByteOrder.BIG_ENDIAN);
        this.vip = this.license.getInt();
        this.ad = AbstractC1983e.adcel(this.license);
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        appmetrica.getClass();
        int i = C1724e.ad;
        if (this.ad.equals("\u0000\u0000\u0000\u0000")) {
            throw new RuntimeException(this.ad);
        }
        if (this.vip < 8) {
            throw new C14803e(this.ad, this.vip);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        sb.append("Mp4BoxHeader{id='");
        sb.append(this.ad);
        sb.append("', length=");
        sb.append(this.vip);
        sb.append(", filePos=");
        sb.append(this.metrica);
        sb.append(", endsAt=");
        return AbstractC10257e.mopub(sb, this.metrica + this.vip, '}');
    }

    public final long vip() {
        return this.metrica + this.vip;
    }
}
