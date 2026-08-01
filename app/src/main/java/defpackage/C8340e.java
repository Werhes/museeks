package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۥٜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8340e implements InterfaceC11207e, InterfaceC3589e {

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final C7936e f17065e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final int f17066e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final String f17067e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f17068e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final int f17069e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final int f17070e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final byte[] f17071e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f17072e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final int f17073e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final int f17074e;

    static {
        int i = AbstractC18186e.ad;
        int i2 = C1724e.ad;
        f17065e = new C7936e(2);
    }

    public C8340e(C0381e c0381e, FileChannel fileChannel) {
        this.f17068e = BuildConfig.FLAVOR;
        int i = c0381e.vip;
        ByteBuffer allocate = ByteBuffer.allocate(i);
        int read = fileChannel.read(allocate);
        if (read < i) {
            throw new IOException(AbstractC1786e.Signature(read, i, "Unable to read required number of databytes read:", ":required:"));
        }
        allocate.rewind();
        int i2 = allocate.getInt();
        this.f17072e = i2;
        if (i2 >= ((String[]) C2362e.m809const().f5914e).length) {
            StringBuilder sb = new StringBuilder("PictureType was:");
            sb.append(this.f17072e);
            sb.append("but the maximum allowed is ");
            sb.append(((String[]) C2362e.m809const().f5914e).length - 1);
            throw new Exception(sb.toString());
        }
        int i3 = allocate.getInt();
        String name = AbstractC4639e.vip.name();
        byte[] bArr = new byte[i3];
        allocate.get(bArr);
        this.f17068e = new String(bArr, name);
        int i4 = allocate.getInt();
        String name2 = AbstractC4639e.metrica.name();
        byte[] bArr2 = new byte[i4];
        allocate.get(bArr2);
        this.f17067e = new String(bArr2, name2);
        this.f17070e = allocate.getInt();
        this.f17066e = allocate.getInt();
        this.f17074e = allocate.getInt();
        this.f17073e = allocate.getInt();
        int i5 = allocate.getInt();
        this.f17069e = i5;
        byte[] bArr3 = new byte[i5];
        this.f17071e = bArr3;
        allocate.get(bArr3);
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        f17065e.getClass();
        int i6 = C1724e.ad;
    }

    public C8340e(byte[] bArr, int i, String str, int i2, int i3) {
        this.f17068e = BuildConfig.FLAVOR;
        this.f17072e = i;
        if (str != null) {
            this.f17068e = str;
        }
        this.f17067e = BuildConfig.FLAVOR;
        this.f17070e = i2;
        this.f17066e = i3;
        this.f17074e = 0;
        this.f17073e = 0;
        this.f17071e = bArr;
    }

    @Override // defpackage.InterfaceC3589e
    public final boolean Signature() {
        return true;
    }

    @Override // defpackage.InterfaceC3589e
    public final String getId() {
        return "COVER_ART";
    }

    @Override // defpackage.InterfaceC3589e
    public final boolean isEmpty() {
        return false;
    }

    @Override // defpackage.InterfaceC3589e
    public final byte[] purchase() {
        return vip().array();
    }

    @Override // defpackage.InterfaceC3589e
    public final String toString() {
        return C2362e.m809const().getValue(this.f17072e) + ":" + this.f17068e + ":" + this.f17067e + ":width:" + this.f17070e + ":height:" + this.f17066e + ":colourdepth:" + this.f17074e + ":indexedColourCount:" + this.f17073e + ":image size in bytes:" + this.f17069e + "/" + this.f17071e.length;
    }

    @Override // defpackage.InterfaceC11207e
    public final ByteBuffer vip() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(AbstractC1983e.appmetrica(this.f17072e));
            byteArrayOutputStream.write(AbstractC1983e.appmetrica(this.f17068e.length()));
            byteArrayOutputStream.write(this.f17068e.getBytes(AbstractC4639e.vip));
            byteArrayOutputStream.write(AbstractC1983e.appmetrica(this.f17067e.length()));
            byteArrayOutputStream.write(this.f17067e.getBytes(AbstractC4639e.metrica));
            byteArrayOutputStream.write(AbstractC1983e.appmetrica(this.f17070e));
            byteArrayOutputStream.write(AbstractC1983e.appmetrica(this.f17066e));
            byteArrayOutputStream.write(AbstractC1983e.appmetrica(this.f17074e));
            byteArrayOutputStream.write(AbstractC1983e.appmetrica(this.f17073e));
            byteArrayOutputStream.write(AbstractC1983e.appmetrica(this.f17071e.length));
            byteArrayOutputStream.write(this.f17071e);
            return ByteBuffer.wrap(byteArrayOutputStream.toByteArray());
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
