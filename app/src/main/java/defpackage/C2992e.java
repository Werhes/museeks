package defpackage;

import ealvatag.tag.id3.framebody.AbstractID3v2FrameBody;
import ealvatag.tag.id3.framebody.FrameBodyDeprecated;
import ealvatag.tag.id3.framebody.ID3v24FrameBody;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔۦؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2992e extends AbstractC1550e {

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public static final C7936e f7030e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public int f7031e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public int f7032e;

    static {
        int i = AbstractC18186e.ad;
        int i2 = C1724e.ad;
        f7030e = new C7936e(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0113 A[Catch: RuntimeException -> 0x0041, TryCatch #0 {RuntimeException -> 0x0041, blocks: (B:3:0x0009, B:5:0x0013, B:9:0x0039, B:10:0x0045, B:12:0x004f, B:13:0x0057, B:17:0x0065, B:18:0x0074, B:37:0x010d, B:39:0x0113, B:56:0x0118, B:58:0x0120, B:59:0x0124, B:64:0x0125, B:65:0x0143, B:51:0x0079, B:53:0x007f, B:21:0x008b, B:25:0x009a, B:26:0x00b4, B:30:0x00c2, B:32:0x00d0, B:33:0x00f3, B:35:0x00f9, B:43:0x00d7, B:44:0x00de, B:46:0x00e6, B:47:0x00ed), top: B:2:0x0009, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v25, types: [eِٖۢ, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2992e(defpackage.C16151e r12, java.lang.String r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2992e.<init>(eِٖۢ, java.lang.String, boolean):void");
    }

    public C2992e(String str, ByteBuffer byteBuffer) {
        this.f4427e = str;
        read(byteBuffer);
    }

    /* renamed from: class, reason: not valid java name */
    public static boolean m1223class(String str) {
        char charAt;
        return str.length() >= 4 && (charAt = str.charAt(0)) >= 'A' && charAt <= 'Z' && AbstractC10510e.vip(str.charAt(1)) && AbstractC10510e.vip(str.charAt(2)) && AbstractC10510e.vip(str.charAt(3));
    }

    @Override // defpackage.InterfaceC3589e
    public final boolean Signature() {
        return C16582e.startapp().ad(this.f4425e);
    }

    @Override // defpackage.AbstractC1550e, defpackage.AbstractC14583e
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2992e)) {
            return false;
        }
        C2992e c2992e = (C2992e) obj;
        return AbstractC1376e.vip(this.f4426e, c2992e.f4426e) && AbstractC1376e.vip(this.f4424e, c2992e.f4424e) && super.equals(c2992e);
    }

    public final void firebase(C16151e c16151e) {
        long j;
        int Signature = ((c16151e.Signature(0L) & 255) << 21) + ((c16151e.Signature(1L) & 255) << 14) + ((c16151e.Signature(2L) & 255) << 7) + (c16151e.Signature(3L) & 255);
        this.f4423e = Signature;
        C7936e c7936e = f7030e;
        if (Signature < 0) {
            EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
            c7936e.getClass();
            int i = C1724e.ad;
            throw new Exception(AbstractC1786e.signatures(new StringBuilder(), this.f4425e, " is invalid frame"));
        }
        if (Signature == 0) {
            EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
            c7936e.getClass();
            int i2 = C1724e.ad;
            for (int i3 = 0; i3 < 6; i3++) {
                c16151e.readByte();
            }
            throw new Exception(AbstractC1786e.signatures(new StringBuilder(), this.f4425e, " is empty frame"));
        }
        long j2 = Signature;
        long j3 = c16151e.f31731e;
        if (j2 > j3 - 2) {
            EnumC1005e[] enumC1005eArr3 = EnumC1005e.f3456e;
            c7936e.getClass();
            int i4 = C1724e.ad;
            throw new Exception(AbstractC1786e.signatures(new StringBuilder(), this.f4425e, " is invalid frame"));
        }
        if (Signature > 127) {
            int Signature2 = ((c16151e.Signature(0L) & 255) << 24) | ((c16151e.Signature(1L) & 255) << 16) | ((c16151e.Signature(2L) & 255) << 8) | (c16151e.Signature(3L) & 255);
            int i5 = 0;
            while (true) {
                if (i5 >= 4) {
                    byte[] bArr = new byte[4];
                    j = 4;
                    long j4 = 4;
                    if (c16151e.f31731e - (6 + this.f4423e) >= j4) {
                        int i6 = 0;
                        for (int i7 = 4; i6 < i7; i7 = 4) {
                            bArr[i6] = c16151e.Signature(r13 + i6);
                            i6++;
                            j4 = j4;
                        }
                        long j5 = j4;
                        if (!m1223class(new String(bArr)) && !AbstractC8294e.purchase(bArr)) {
                            long j6 = Signature2;
                            long j7 = c16151e.f31731e;
                            long j8 = j7 + 4;
                            if (j6 <= j8) {
                                byte[] bArr2 = new byte[4];
                                if (j7 - (6 + Signature2) >= j5) {
                                    for (int i8 = 0; i8 < 4; i8++) {
                                        bArr2[i8] = c16151e.Signature(r13 + i8);
                                    }
                                    if (m1223class(new String(bArr2))) {
                                        this.f4423e = Signature2;
                                        EnumC1005e[] enumC1005eArr4 = EnumC1005e.f3456e;
                                        c7936e.getClass();
                                        int i9 = C1724e.ad;
                                    } else if (AbstractC8294e.purchase(bArr2)) {
                                        this.f4423e = Signature2;
                                        EnumC1005e[] enumC1005eArr5 = EnumC1005e.f3456e;
                                        c7936e.getClass();
                                        int i10 = C1724e.ad;
                                    }
                                } else if (j8 == 0) {
                                    this.f4423e = Signature2;
                                }
                            }
                        }
                    }
                } else if ((c16151e.Signature(i5) & 128) > 0) {
                    EnumC1005e[] enumC1005eArr6 = EnumC1005e.f3456e;
                    c7936e.getClass();
                    int i11 = C1724e.ad;
                    if (Signature2 > c16151e.f31731e + 4) {
                        throw new Exception(AbstractC1786e.signatures(new StringBuilder(), this.f4425e, " is invalid frame"));
                    }
                    this.f4423e = Signature2;
                } else {
                    i5++;
                }
            }
        }
        j = 4;
        if (c16151e.f31731e != j3) {
            throw new RuntimeException("LIBRARY MISCONFIGURATION checkIfFrameSizeThatIsNotSyncSafe moved the buffer pointer");
        }
        c16151e.skip(j);
    }

    @Override // defpackage.AbstractC11463e
    public final int getSize() {
        return this.f28795e.getSize() + 10;
    }

    @Override // defpackage.AbstractC11463e
    public final void read(ByteBuffer byteBuffer) {
        int i;
        int i2;
        int i3;
        boolean z;
        String crashlytics = crashlytics(byteBuffer);
        boolean m1223class = m1223class(crashlytics);
        C7936e c7936e = f7030e;
        if (!m1223class) {
            EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
            c7936e.getClass();
            int i4 = C1724e.ad;
            byteBuffer.position(byteBuffer.position() - 3);
            throw new Exception(AbstractC4653e.ads(new StringBuilder(), this.f4427e, ":", crashlytics, ":is not a valid ID3v2.30 frame"));
        }
        int vip = AbstractC8294e.vip(byteBuffer);
        this.f4423e = vip;
        if (vip < 0) {
            EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
            c7936e.getClass();
            int i5 = C1724e.ad;
            throw new Exception(AbstractC1786e.signatures(new StringBuilder(), this.f4425e, " is invalid frame"));
        }
        if (vip == 0) {
            EnumC1005e[] enumC1005eArr3 = EnumC1005e.f3456e;
            c7936e.getClass();
            int i6 = C1724e.ad;
            byteBuffer.get();
            byteBuffer.get();
            throw new Exception(AbstractC1786e.signatures(new StringBuilder(), this.f4425e, " is empty frame"));
        }
        if (vip > byteBuffer.remaining() - 2) {
            EnumC1005e[] enumC1005eArr4 = EnumC1005e.f3456e;
            c7936e.getClass();
            int i7 = C1724e.ad;
            throw new Exception(AbstractC1786e.signatures(new StringBuilder(), this.f4425e, " is invalid frame"));
        }
        if (this.f4423e > 127) {
            int position = byteBuffer.position();
            int i8 = position - 4;
            byteBuffer.position(i8);
            int i9 = byteBuffer.getInt();
            byteBuffer.position(i8);
            int position2 = byteBuffer.position();
            int i10 = 0;
            while (true) {
                if (i10 >= 4) {
                    z = false;
                    break;
                } else {
                    if ((byteBuffer.get(position2 + i10) & 128) > 0) {
                        z = true;
                        break;
                    }
                    i10++;
                }
            }
            byteBuffer.position(position);
            if (z) {
                EnumC1005e[] enumC1005eArr5 = EnumC1005e.f3456e;
                c7936e.getClass();
                int i11 = C1724e.ad;
                if (i9 > byteBuffer.remaining() + 2) {
                    throw new Exception(AbstractC1786e.signatures(new StringBuilder(), this.f4425e, " is invalid frame"));
                }
                this.f4423e = i9;
            } else {
                byte[] bArr = new byte[4];
                byteBuffer.position(this.f4423e + position + 2);
                if (byteBuffer.remaining() < 4) {
                    byteBuffer.position(position);
                } else {
                    byteBuffer.get(bArr, 0, 4);
                    byteBuffer.position(position);
                    if (!m1223class(new String(bArr)) && !AbstractC8294e.purchase(bArr)) {
                        if (i9 > byteBuffer.remaining() - 2) {
                            byteBuffer.position(position);
                        } else {
                            byte[] bArr2 = new byte[4];
                            byteBuffer.position(position + i9 + 2);
                            if (byteBuffer.remaining() >= 4) {
                                byteBuffer.get(bArr2, 0, 4);
                                String str = new String(bArr2);
                                byteBuffer.position(position);
                                if (m1223class(str)) {
                                    this.f4423e = i9;
                                    EnumC1005e[] enumC1005eArr6 = EnumC1005e.f3456e;
                                    c7936e.getClass();
                                    int i12 = C1724e.ad;
                                } else if (AbstractC8294e.purchase(bArr2)) {
                                    this.f4423e = i9;
                                    EnumC1005e[] enumC1005eArr7 = EnumC1005e.f3456e;
                                    c7936e.getClass();
                                    int i13 = C1724e.ad;
                                }
                            } else {
                                byteBuffer.position(position);
                                if (byteBuffer.remaining() == 0) {
                                    this.f4423e = i9;
                                }
                            }
                        }
                    }
                }
            }
        }
        this.f4426e = new C2026e(this, byteBuffer.get());
        C2437e c2437e = new C2437e(this, byteBuffer.get());
        this.f4424e = c2437e;
        if ((c2437e.ad & 64) > 0) {
            this.f7032e = byteBuffer.get();
            i = 1;
        } else {
            i = 0;
        }
        if (((C2437e) this.f4424e).vip()) {
            i++;
            this.f7031e = byteBuffer.get();
        }
        if ((((C2437e) this.f4424e).ad & 1) > 0) {
            i2 = AbstractC8294e.vip(byteBuffer);
            i += 4;
            EnumC1005e[] enumC1005eArr8 = EnumC1005e.f3456e;
            c7936e.getClass();
            int i14 = C1724e.ad;
        } else {
            i2 = -1;
        }
        int i15 = this.f4423e - i;
        ByteBuffer slice = byteBuffer.slice();
        slice.limit(i15);
        if ((((C2437e) this.f4424e).ad & 2) > 0) {
            slice = AbstractC13191e.ad(slice);
            i3 = slice.limit();
            EnumC1005e[] enumC1005eArr9 = EnumC1005e.f3456e;
            c7936e.getClass();
            int i16 = C1724e.ad;
        } else {
            i3 = i15;
        }
        try {
            AbstractC0424e abstractC0424e = this.f4424e;
            if ((((C2437e) abstractC0424e).ad & 8) > 0) {
                ByteBuffer ad = AbstractC0846e.ad(crashlytics, this.f4427e, byteBuffer, i2, i15);
                if (((C2437e) this.f4424e).vip()) {
                    this.f28795e = premium(crashlytics, ad, i2);
                } else {
                    this.f28795e = applovin(crashlytics, ad, i2);
                }
            } else if (((C2437e) abstractC0424e).vip()) {
                byteBuffer.slice().limit(i15);
                this.f28795e = premium(crashlytics, byteBuffer, this.f4423e);
            } else {
                this.f28795e = applovin(crashlytics, slice, i3);
            }
            if (!(this.f28795e instanceof ID3v24FrameBody)) {
                EnumC1005e[] enumC1005eArr10 = EnumC1005e.f3456e;
                c7936e.getClass();
                int i17 = C1724e.ad;
                this.f28795e = new FrameBodyDeprecated((AbstractID3v2FrameBody) this.f28795e);
            }
            byteBuffer.position(byteBuffer.position() + i15);
        } catch (Throwable th) {
            byteBuffer.position(byteBuffer.position() + i15);
            throw th;
        }
    }

    @Override // defpackage.AbstractC1550e
    public final int signatures() {
        return 10;
    }

    @Override // defpackage.AbstractC1550e
    public final int tapsense() {
        return 4;
    }

    @Override // defpackage.AbstractC1550e
    public final void write(ByteArrayOutputStream byteArrayOutputStream) {
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        C7936e c7936e = f7030e;
        c7936e.getClass();
        int i = C1724e.ad;
        ByteBuffer allocate = ByteBuffer.allocate(10);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        ((AbstractID3v2FrameBody) this.f28795e).write(byteArrayOutputStream2);
        byte[] byteArray = byteArrayOutputStream2.toByteArray();
        C12927e.license();
        if (this.f4425e.length() == 3) {
            this.f4425e = AbstractC4653e.applovin(new StringBuilder(), this.f4425e, ' ');
        }
        allocate.put(this.f4425e.getBytes(AbstractC4639e.vip), 0, 4);
        int length = byteArray.length;
        EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
        c7936e.getClass();
        allocate.put(AbstractC8294e.startapp(length));
        allocate.put(this.f4426e.vip);
        C2437e c2437e = (C2437e) this.f4424e;
        byte b = c2437e.ad;
        if ((b & 128) > 0 || (b & 32) > 0 || (b & 16) > 0) {
            EnumC1005e[] enumC1005eArr3 = EnumC1005e.f3456e;
            AbstractC6069e.vip(b);
            c7936e.getClass();
            c2437e.ad = (byte) (((byte) (((byte) (c2437e.ad & Byte.MAX_VALUE)) & (-33))) & (-17));
        }
        AbstractC0424e abstractC0424e = this.f4424e;
        C2437e c2437e2 = (C2437e) abstractC0424e;
        c2437e2.ad = (byte) (((byte) (((byte) (c2437e2.ad & (-3))) & (-9))) & (-2));
        allocate.put(abstractC0424e.ad());
        try {
            byteArrayOutputStream.write(allocate.array());
            if (((C2437e) this.f4424e).vip()) {
                byteArrayOutputStream.write(this.f7031e);
            }
            if ((((C2437e) this.f4424e).ad & 64) > 0) {
                byteArrayOutputStream.write(this.f7032e);
            }
            byteArrayOutputStream.write(byteArray);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
