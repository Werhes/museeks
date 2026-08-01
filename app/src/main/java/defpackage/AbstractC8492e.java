package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٌؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8492e implements InterfaceC3589e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C7936e f17291e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C18529e f17292e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public String f17293e;

    static {
        int i = AbstractC18186e.ad;
        int i2 = C1724e.ad;
        f17291e = new C7936e(2);
    }

    public AbstractC8492e(String str) {
        this.f17293e = str;
    }

    public AbstractC8492e(String str, ByteBuffer byteBuffer) {
        this(str);
        ad(byteBuffer);
    }

    @Override // defpackage.InterfaceC3589e
    public final boolean Signature() {
        return this.f17293e.equals(EnumC14687e.ARTIST.f29091e) || this.f17293e.equals(EnumC14687e.ALBUM.f29091e) || this.f17293e.equals(EnumC14687e.TITLE.f29091e) || this.f17293e.equals(EnumC14687e.TRACK.f29091e) || this.f17293e.equals(EnumC14687e.DAY.f29091e) || this.f17293e.equals(EnumC14687e.COMMENT.f29091e) || this.f17293e.equals(EnumC14687e.GENRE.f29091e);
    }

    public abstract void ad(ByteBuffer byteBuffer);

    @Override // defpackage.InterfaceC3589e
    public final String getId() {
        return this.f17293e;
    }

    public byte[] license() {
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        f17291e.getClass();
        int i = C1724e.ad;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] vip = vip();
            byteArrayOutputStream.write(AbstractC1983e.appmetrica(vip.length + 16));
            byteArrayOutputStream.write("data".getBytes(AbstractC4639e.vip));
            byteArrayOutputStream.write(new byte[]{0});
            byteArrayOutputStream.write(new byte[]{0, 0, (byte) metrica().f17569e});
            byteArrayOutputStream.write(new byte[]{0, 0, 0, 0});
            byteArrayOutputStream.write(vip);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public abstract EnumC8701e metrica();

    @Override // defpackage.InterfaceC3589e
    public byte[] purchase() {
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        f17291e.getClass();
        int i = C1724e.ad;
        try {
            byte[] license = license();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(AbstractC1983e.appmetrica(license.length + 8));
            byteArrayOutputStream.write(this.f17293e.getBytes(AbstractC4639e.vip));
            byteArrayOutputStream.write(license);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public abstract byte[] vip();
}
