package defpackage;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٓۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7930e extends C7301e {

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public static final C7936e f16055e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public byte f16056e;

    static {
        int i = AbstractC18186e.ad;
        int i2 = C1724e.ad;
        f16055e = new C7936e(2);
    }

    @Override // defpackage.C7301e
    public final void ads(RandomAccessFile randomAccessFile) {
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        C7936e c7936e = f16055e;
        c7936e.getClass();
        int i = C1724e.ad;
        byte[] bArr = new byte[128];
        signatures(randomAccessFile);
        randomAccessFile.seek(randomAccessFile.length());
        byte[] bArr2 = AbstractC16614e.f32566e;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        if (C12927e.license().adcel) {
            String admob = AbstractC2251e.admob(30, this.f14913e);
            for (int i2 = 0; i2 < admob.length(); i2++) {
                bArr[i2 + 3] = (byte) admob.charAt(i2);
            }
        }
        if (C12927e.license().billing) {
            String admob2 = AbstractC2251e.admob(30, this.f14914e);
            for (int i3 = 0; i3 < admob2.length(); i3++) {
                bArr[i3 + 33] = (byte) admob2.charAt(i3);
            }
        }
        if (C12927e.license().purchase) {
            String admob3 = AbstractC2251e.admob(30, this.f14912e);
            for (int i4 = 0; i4 < admob3.length(); i4++) {
                bArr[i4 + 63] = (byte) admob3.charAt(i4);
            }
        }
        if (C12927e.license().mopub) {
            String admob4 = AbstractC2251e.admob(4, this.f14910e);
            for (int i5 = 0; i5 < admob4.length(); i5++) {
                bArr[i5 + 93] = (byte) admob4.charAt(i5);
            }
        }
        if (C12927e.license().yandex) {
            String admob5 = AbstractC2251e.admob(28, this.f14911e);
            for (int i6 = 0; i6 < admob5.length(); i6++) {
                bArr[i6 + 97] = (byte) admob5.charAt(i6);
            }
        }
        bArr[126] = this.f16056e;
        if (C12927e.license().startapp) {
            bArr[127] = this.f14909e;
        }
        randomAccessFile.write(bArr);
        EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
        c7936e.getClass();
        int i7 = C1724e.ad;
    }

    @Override // defpackage.C7301e, defpackage.InterfaceC9354e
    public final AbstractC12614e amazon() {
        return C7301e.f14908e.keySet();
    }

    @Override // defpackage.C7301e
    public final void applovin(String str) {
        AbstractC5542e.metrica(str);
        this.f14911e = AbstractC2251e.admob(28, str);
    }

    @Override // defpackage.C7301e, defpackage.AbstractC16225e
    public final boolean equals(Object obj) {
        return (obj instanceof C7930e) && this.f16056e == ((C7930e) obj).f16056e && super.equals(obj);
    }

    @Override // defpackage.C7301e
    public final String inmobi() {
        return this.f14911e;
    }

    @Override // defpackage.C7301e, defpackage.InterfaceC9354e
    public final boolean isEmpty() {
        return this.f16056e <= 0 && super.isEmpty();
    }

    @Override // defpackage.C7301e
    public final boolean isPro(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[3];
        byteBuffer.get(bArr, 0, 3);
        if (Arrays.equals(bArr, AbstractC16614e.f32566e)) {
            byteBuffer.position(125);
            if (byteBuffer.get() == 0 && byteBuffer.get() != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.C7301e
    public final String isVip(EnumC8271e enumC8271e) {
        int ordinal = enumC8271e.ordinal();
        if (ordinal == 2) {
            return this.f14912e;
        }
        if (ordinal == 11) {
            return this.f14914e;
        }
        if (ordinal == 22) {
            return this.f14911e;
        }
        if (ordinal != 43) {
            return ordinal != 133 ? ordinal != 137 ? ordinal != 148 ? BuildConfig.FLAVOR : this.f14910e : String.valueOf(this.f16056e & 255) : this.f14913e;
        }
        return C18540e.m4564default().getValue(this.f14909e & 255);
    }

    @Override // defpackage.C7301e, defpackage.InterfaceC9354e
    public final int license() {
        return 7;
    }

    @Override // defpackage.C7301e, defpackage.InterfaceC9354e
    public final AbstractC17475e metrica(EnumC8271e enumC8271e) {
        C2171e c2171e = AbstractC17475e.f34223e;
        return C1410e.f4222e;
    }

    @Override // defpackage.C7301e, defpackage.AbstractC11463e
    public final void read(ByteBuffer byteBuffer) {
        if (!isPro(byteBuffer)) {
            throw new Exception("ID3v1 tag not found");
        }
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        f16055e.getClass();
        int i = C1724e.ad;
        byte[] bArr = new byte[128];
        byteBuffer.position(0);
        byteBuffer.get(bArr, 0, 128);
        Charset charset = AbstractC4639e.vip;
        String trim = new String(bArr, 3, 30, charset).trim();
        this.f14913e = trim;
        Pattern pattern = AbstractC16614e.f32567e;
        Matcher matcher = pattern.matcher(trim);
        if (matcher.find()) {
            this.f14913e = this.f14913e.substring(0, matcher.start());
        }
        String trim2 = new String(bArr, 33, 30, charset).trim();
        this.f14914e = trim2;
        Matcher matcher2 = pattern.matcher(trim2);
        if (matcher2.find()) {
            this.f14914e = this.f14914e.substring(0, matcher2.start());
        }
        String trim3 = new String(bArr, 63, 30, charset).trim();
        this.f14912e = trim3;
        Matcher matcher3 = pattern.matcher(trim3);
        if (matcher3.find()) {
            this.f14912e = this.f14912e.substring(0, matcher3.start());
        }
        String trim4 = new String(bArr, 93, 4, charset).trim();
        this.f14910e = trim4;
        Matcher matcher4 = pattern.matcher(trim4);
        if (matcher4.find()) {
            this.f14910e = this.f14910e.substring(0, matcher4.start());
        }
        String trim5 = new String(bArr, 97, 28, charset).trim();
        this.f14911e = trim5;
        Matcher matcher5 = pattern.matcher(trim5);
        if (matcher5.find()) {
            this.f14911e = this.f14911e.substring(0, matcher5.start());
        }
        this.f16056e = bArr[126];
        this.f14909e = bArr[127];
    }

    @Override // defpackage.C7301e, defpackage.InterfaceC1425e
    public final void smaato(InterfaceC3589e interfaceC3589e) {
        int i;
        if (EnumC8271e.valueOf(interfaceC3589e.getId()) != EnumC8271e.TRACK) {
            super.smaato(interfaceC3589e);
            return;
        }
        String interfaceC3589e2 = interfaceC3589e.toString();
        try {
            i = Integer.parseInt(interfaceC3589e2);
        } catch (NumberFormatException unused) {
            i = 0;
        }
        if (i > 255 || i < 1) {
            this.f16056e = (byte) 0;
        } else {
            this.f16056e = (byte) Integer.parseInt(interfaceC3589e2);
        }
    }

    @Override // defpackage.C7301e
    public final AbstractC8507e tapsense() {
        return C7301e.f14908e;
    }
}
