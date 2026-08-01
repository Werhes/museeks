package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒؑۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0776e implements InterfaceC11207e {

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public static final char[] f3136e = "0123456789abcdef".toCharArray();

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final int f3137e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final ByteBuffer f3138e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f3139e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final float f3140e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f3141e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final int f3142e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final String f3143e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final int f3144e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final int f3145e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f3146e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final int f3147e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final int f3148e;

    public C0776e(C0381e c0381e, FileChannel fileChannel) {
        int i = c0381e.vip;
        ByteBuffer allocate = ByteBuffer.allocate(i);
        this.f3138e = allocate;
        allocate.order(ByteOrder.BIG_ENDIAN);
        int read = fileChannel.read(allocate);
        if (read < i) {
            throw new IOException(AbstractC1786e.Signature(read, i, "Unable to read required number of bytes, read:", ":required:"));
        }
        allocate.flip();
        short s = allocate.getShort();
        C7936e c7936e = AbstractC1983e.ad;
        this.f3146e = s & 65535;
        this.f3141e = allocate.getShort() & 65535;
        this.f3139e = ((allocate.get() & 255) << 16) + ((allocate.get() & 255) << 8) + (allocate.get() & 255);
        this.f3144e = ((allocate.get() & 255) << 16) + ((allocate.get() & 255) << 8) + (allocate.get() & 255);
        this.f3137e = ((allocate.get(10) & 255) << 12) + ((allocate.get(11) & 255) << 4) + ((allocate.get(12) & 240) >>> 4);
        this.f3142e = ((allocate.get(12) & 14) >>> 1) + 1;
        this.f3147e = ((allocate.get(12) & 1) << 4) + ((allocate.get(13) & 240) >>> 4) + 1;
        this.f3145e = (allocate.get(17) & 255) + ((allocate.get(16) & 255) << 8) + ((allocate.get(15) & 255) << 16) + ((allocate.get(14) & 255) << 24) + ((allocate.get(13) & 15) << 32);
        char[] cArr = new char[32];
        if (allocate.limit() >= 34) {
            for (int i2 = 0; i2 < 16; i2++) {
                byte b = allocate.get(i2 + 18);
                int i3 = i2 * 2;
                char[] cArr2 = f3136e;
                cArr[i3] = cArr2[(b & 255) >>> 4];
                cArr[i3 + 1] = cArr2[b & 15];
            }
        }
        this.f3143e = new String(cArr);
        double d = this.f3145e;
        int i4 = this.f3137e;
        this.f3140e = (float) (d / i4);
        this.f3148e = i4 / this.f3142e;
        this.f3138e.rewind();
    }

    public final String toString() {
        return "MinBlockSize:" + this.f3146e + "MaxBlockSize:" + this.f3141e + "MinFrameSize:" + this.f3139e + "MaxFrameSize:" + this.f3144e + "SampleRateTotal:" + this.f3137e + "SampleRatePerChannel:" + this.f3148e + ":Channel number:" + this.f3142e + ":Bits per sample: " + this.f3147e + ":TotalNumberOfSamples: " + this.f3145e + ":Length: " + this.f3140e;
    }

    @Override // defpackage.InterfaceC11207e
    public final ByteBuffer vip() {
        return this.f3138e;
    }
}
