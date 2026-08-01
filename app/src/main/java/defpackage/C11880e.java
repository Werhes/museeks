package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؚٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11880e extends AbstractC8492e implements InterfaceC16681e {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final C7936e f23808e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public String f23809e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public String f23810e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public String f23811e;

    static {
        int i = AbstractC18186e.ad;
        int i2 = C1724e.ad;
        f23808e = new C7936e(2);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [eۨؕ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [eۨؕ, java.lang.Object] */
    @Override // defpackage.AbstractC8492e
    public final void ad(ByteBuffer byteBuffer) {
        C18529e c18529e = new C18529e(byteBuffer);
        if (!c18529e.ad.equals("mean")) {
            throw new RuntimeException("Unable to process data box because identifier is:" + c18529e.ad);
        }
        ByteBuffer slice = byteBuffer.slice();
        int ad = c18529e.ad() - 4;
        Charset charset = AbstractC4639e.metrica;
        this.f23810e = AbstractC1983e.billing(slice, 4, ad, charset);
        byteBuffer.position(c18529e.ad() + byteBuffer.position());
        ?? obj = new Object();
        obj.purchase(byteBuffer);
        if (!obj.ad.equals("name")) {
            throw new RuntimeException("Unable to process name box because identifier is:" + obj.ad);
        }
        this.f23809e = AbstractC1983e.billing(byteBuffer.slice(), 4, obj.ad() - 4, charset);
        byteBuffer.position(obj.ad() + byteBuffer.position());
        if (this.f17292e.ad() == c18529e.vip + obj.vip) {
            this.f17293e = "----:" + this.f23810e + ":" + this.f23809e;
            this.f23811e = BuildConfig.FLAVOR;
            EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
            f23808e.getClass();
            int i = C1724e.ad;
            return;
        }
        ?? obj2 = new Object();
        obj2.purchase(byteBuffer);
        this.f23811e = new C9890e(obj2, byteBuffer).f19504e;
        byteBuffer.position(obj2.ad() + byteBuffer.position());
        this.f17293e = "----:" + this.f23810e + ":" + this.f23809e;
    }

    @Override // defpackage.InterfaceC3589e
    public final boolean isEmpty() {
        return BuildConfig.FLAVOR.equals(this.f23811e.trim());
    }

    @Override // defpackage.AbstractC8492e
    public final byte[] license() {
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        f23808e.getClass();
        int i = C1724e.ad;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bytes = this.f23811e.getBytes(AbstractC4639e.metrica);
            byteArrayOutputStream.write(AbstractC1983e.appmetrica(bytes.length + 16));
            byteArrayOutputStream.write("data".getBytes(AbstractC4639e.vip));
            byteArrayOutputStream.write(new byte[]{0});
            EnumC8701e enumC8701e = EnumC8701e.IMPLICIT;
            byteArrayOutputStream.write(new byte[]{0, 0, (byte) 1});
            byteArrayOutputStream.write(new byte[]{0, 0, 0, 0});
            byteArrayOutputStream.write(bytes);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.AbstractC8492e
    public final EnumC8701e metrica() {
        return EnumC8701e.TEXT;
    }

    @Override // defpackage.AbstractC8492e, defpackage.InterfaceC3589e
    public final byte[] purchase() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            String str = this.f23810e;
            Charset charset = AbstractC4639e.metrica;
            byte[] bytes = str.getBytes(charset);
            byteArrayOutputStream.write(AbstractC1983e.appmetrica(bytes.length + 12));
            Charset charset2 = AbstractC4639e.vip;
            byteArrayOutputStream.write("mean".getBytes(charset2));
            byteArrayOutputStream.write(new byte[]{0, 0, 0, 0});
            byteArrayOutputStream.write(bytes);
            byte[] bytes2 = this.f23809e.getBytes(charset);
            byteArrayOutputStream.write(AbstractC1983e.appmetrica(bytes2.length + 12));
            byteArrayOutputStream.write("name".getBytes(charset2));
            byteArrayOutputStream.write(new byte[]{0, 0, 0, 0});
            byteArrayOutputStream.write(bytes2);
            if (this.f23811e.length() > 0) {
                byteArrayOutputStream.write(license());
            }
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            byteArrayOutputStream2.write(AbstractC1983e.appmetrica(byteArrayOutputStream.size() + 8));
            byteArrayOutputStream2.write("----".getBytes(charset2));
            byteArrayOutputStream2.write(byteArrayOutputStream.toByteArray());
            return byteArrayOutputStream2.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.InterfaceC3589e
    public final String toString() {
        return this.f23811e;
    }

    @Override // defpackage.AbstractC8492e
    public final byte[] vip() {
        return this.f23811e.getBytes(AbstractC4639e.metrica);
    }

    @Override // defpackage.InterfaceC16681e
    public final String yandex() {
        return this.f23811e;
    }
}
