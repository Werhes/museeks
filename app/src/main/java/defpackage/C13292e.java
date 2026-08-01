package defpackage;

import ealvatag.tag.id3.framebody.FrameBodyTCON;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Locale;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٖۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13292e extends AbstractC11095e {

    /* renamed from: eؘؑۦ, reason: contains not printable characters */
    public static final int f26344e;

    /* renamed from: eؘؖؑ, reason: contains not printable characters */
    public static final int f26345e;

    /* renamed from: eًۛٝ, reason: contains not printable characters */
    public static final int f26346e;

    /* renamed from: eٍٍٜ, reason: contains not printable characters */
    public static final int f26347e;

    /* renamed from: eٍٖۥ, reason: contains not printable characters */
    public static final int f26348e;

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public static final C7936e f26349e;

    /* renamed from: eَۦۥ, reason: contains not printable characters */
    public static final int f26350e;

    /* renamed from: eُٛۜ, reason: contains not printable characters */
    public static final int f26351e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public boolean f26352e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public boolean f26353e;

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public byte f26354e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public boolean f26355e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public boolean f26356e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public boolean f26357e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public boolean f26358e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public int f26359e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public byte f26360e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public boolean f26361e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public byte f26362e;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public byte f26363e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public byte f26364e;

    static {
        int i = AbstractC18186e.ad;
        int i2 = C1724e.ad;
        f26349e = new C7936e(2);
        f26347e = 6;
        f26348e = 1;
        f26351e = 6;
        f26346e = 2;
        f26345e = 5;
        f26350e = 1;
        f26344e = 1;
    }

    public C13292e() {
        this.f26353e = false;
        this.f26352e = false;
        this.f26355e = false;
        this.f26358e = false;
        this.f26359e = 0;
        this.f26357e = false;
        this.f26356e = false;
        this.f26361e = false;
        this.f26364e = (byte) 0;
        this.f26354e = (byte) 0;
        this.f26360e = (byte) 0;
        this.f26362e = (byte) 0;
        this.f26363e = (byte) 0;
        m3540final();
    }

    public C13292e(C16151e c16151e, C18457e c18457e, String str, boolean z) {
        C7936e c7936e;
        this.f26353e = false;
        this.f26352e = false;
        this.f26355e = false;
        this.f26358e = false;
        this.f26359e = 0;
        this.f26357e = false;
        this.f26356e = false;
        this.f26361e = false;
        this.f26364e = (byte) 0;
        this.f26354e = (byte) 0;
        this.f26360e = (byte) 0;
        this.f26362e = (byte) 0;
        this.f26363e = (byte) 0;
        m3540final();
        this.f31887e = str;
        m3542super(c18457e.vip);
        if (this.f26355e) {
            try {
                int readInt = c16151e.readInt();
                if (readInt <= f26347e) {
                    Locale.getDefault();
                    throw new Exception(this.f31887e + " Invalid Extended Header Size of " + readInt + " is too smal to be valid");
                }
                c16151e.readByte();
                byte readByte = c16151e.readByte();
                boolean z2 = (readByte & 64) != 0;
                this.f26356e = z2;
                this.f26353e = (readByte & 32) != 0;
                this.f26361e = (readByte & 16) != 0;
                if (z2) {
                    c16151e.readByte();
                }
                if (this.f26353e) {
                    c16151e.readByte();
                    this.f26359e = 0;
                    for (int i = 0; i < f26345e; i++) {
                        int i2 = this.f26359e << 8;
                        this.f26359e = i2;
                        this.f26359e = i2 + c16151e.readByte();
                    }
                }
                if (this.f26361e) {
                    c16151e.readByte();
                    byte readByte2 = c16151e.readByte();
                    this.f26360e = (byte) ((readByte2 & (-64)) >> 6);
                    this.f26362e = (byte) ((readByte2 & 32) >> 5);
                    this.f26363e = (byte) ((readByte2 & 24) >> 3);
                    this.f26364e = (byte) ((readByte2 & 4) >> 2);
                    this.f26354e = (byte) (readByte2 & 6);
                }
            } catch (EOFException e) {
                throw new Exception(e);
            }
        }
        m3540final();
        while (true) {
            long j = c16151e.f31731e;
            c7936e = f26349e;
            if (j <= 0) {
                break;
            }
            try {
                C2992e c2992e = new C2992e(c16151e, this.f31887e, z);
                if (z && AbstractC1550e.isVip(c2992e.f4425e)) {
                    this.f31886e = true;
                } else {
                    mo2924native(c2992e.f4425e, c2992e);
                }
            } catch (C0229e unused) {
                EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
                c7936e.getClass();
                int i3 = C1724e.ad;
            } catch (C1775e unused2) {
                EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
                c7936e.getClass();
                int i4 = C1724e.ad;
            } catch (C4775e unused3) {
                EnumC1005e[] enumC1005eArr3 = EnumC1005e.f3456e;
                c7936e.getClass();
                int i5 = C1724e.ad;
            } catch (C14572e unused4) {
                EnumC1005e[] enumC1005eArr4 = EnumC1005e.f3456e;
                c7936e.getClass();
                int i6 = C1724e.ad;
            } catch (C10144e unused5) {
                EnumC1005e[] enumC1005eArr5 = EnumC1005e.f3456e;
                c7936e.getClass();
                int i7 = C1724e.ad;
            } catch (IOException unused6) {
                EnumC1005e[] enumC1005eArr6 = EnumC1005e.f3456e;
                c7936e.getClass();
                int i8 = C1724e.ad;
            }
        }
        EnumC1005e[] enumC1005eArr7 = EnumC1005e.f3456e;
        this.f21995e.keySet().size();
        c7936e.getClass();
        int i9 = C1724e.ad;
    }

    public C13292e(ByteBuffer byteBuffer) {
        this.f26353e = false;
        this.f26352e = false;
        this.f26355e = false;
        this.f26358e = false;
        this.f26359e = 0;
        this.f26357e = false;
        this.f26356e = false;
        this.f26361e = false;
        this.f26364e = (byte) 0;
        this.f26354e = (byte) 0;
        this.f26360e = (byte) 0;
        this.f26362e = (byte) 0;
        this.f26363e = (byte) 0;
        m3540final();
        this.f31887e = BuildConfig.FLAVOR;
        read(byteBuffer);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [eؚؓؓ, eؕۘۘ, eؔۦؗ, eؚٔۦ] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, eؓۗؑ] */
    @Override // defpackage.AbstractC11095e, defpackage.InterfaceC9354e
    public final InterfaceC3589e ad(EnumC8271e enumC8271e, String... strArr) {
        AbstractC5542e.license(enumC8271e, "genericKey");
        if (enumC8271e != EnumC8271e.GENRE) {
            return super.ad(enumC8271e, strArr);
        }
        String str = (String) AbstractC5542e.purchase(strArr, "value");
        ?? abstractC1550e = new AbstractC1550e((String) mo2919class(enumC8271e).f25750e);
        abstractC1550e.f4426e = new Object();
        abstractC1550e.f4424e = new C2437e(abstractC1550e);
        FrameBodyTCON frameBodyTCON = (FrameBodyTCON) abstractC1550e.f28795e;
        C12927e.license();
        frameBodyTCON.setText(FrameBodyTCON.convertGenericToID3v24Genre(str));
        return abstractC1550e;
    }

    @Override // defpackage.InterfaceC9354e
    public final AbstractC12614e amazon() {
        return C16582e.startapp().mopub().keySet();
    }

    @Override // defpackage.AbstractC11095e, defpackage.InterfaceC9354e
    public final AbstractC9621e appmetrica(EnumC8271e enumC8271e) {
        AbstractC5542e.license(enumC8271e, "genericKey");
        if (enumC8271e != EnumC8271e.GENRE) {
            return super.appmetrica(enumC8271e);
        }
        AbstractC17475e metrica = metrica(enumC8271e);
        return (metrica == null || metrica.size() <= 0) ? C1444e.f4274e : AbstractC9621e.license(FrameBodyTCON.convertID3v24GenreToGeneric(((FrameBodyTCON) ((AbstractC1550e) metrica.get(0)).f28795e).getValues().get(0)));
    }

    @Override // defpackage.AbstractC11095e
    /* renamed from: break */
    public final long mo2918break(File file, long j) {
        this.f31887e = file.getName();
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        f26349e.getClass();
        int i = C1724e.ad;
        byte[] byteArray = m2992case().toByteArray();
        int signatures = AbstractC11095e.signatures(byteArray.length + 10, (int) j);
        int length = signatures - (byteArray.length + 10);
        m2994implements(file, m3541new(length, byteArray.length), byteArray, length, signatures, j);
        return signatures;
    }

    @Override // defpackage.AbstractC11095e
    /* renamed from: class */
    public final C12894e mo2919class(EnumC8271e enumC8271e) {
        EnumC5247e enumC5247e = (EnumC5247e) C16582e.startapp().mopub().get(enumC8271e);
        if (enumC5247e != null) {
            return new C12894e(2, enumC8271e, enumC5247e.f11316e, enumC5247e.f11315e);
        }
        throw new C14803e(enumC8271e.name(), 17, (byte) 0);
    }

    @Override // defpackage.AbstractC11095e
    /* renamed from: default */
    public final void mo2920default(WritableByteChannel writableByteChannel, int i) {
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        f26349e.getClass();
        int i2 = C1724e.ad;
        byte[] byteArray = m2992case().toByteArray();
        int signatures = i > 0 ? AbstractC11095e.signatures(byteArray.length + 10, i) - (byteArray.length + 10) : 0;
        writableByteChannel.write(m3541new(signatures, byteArray.length));
        writableByteChannel.write(ByteBuffer.wrap(byteArray));
        if (signatures > 0) {
            writableByteChannel.write(ByteBuffer.wrap(new byte[signatures]));
        }
    }

    @Override // defpackage.AbstractC11095e, defpackage.AbstractC16225e
    public final boolean equals(Object obj) {
        if (!(obj instanceof C13292e)) {
            return false;
        }
        C13292e c13292e = (C13292e) obj;
        return this.f26357e == c13292e.f26357e && this.f26364e == c13292e.f26364e && this.f26354e == c13292e.f26354e && this.f26361e == c13292e.f26361e && this.f26360e == c13292e.f26360e && this.f26362e == c13292e.f26362e && this.f26363e == c13292e.f26363e && this.f26356e == c13292e.f26356e && super.equals(obj);
    }

    /* renamed from: final, reason: not valid java name */
    public final void m3540final() {
        if (this.f21995e == null) {
            this.f21995e = new LinkedHashMap();
        }
        if (this.f21999e == null) {
            this.f21999e = new LinkedHashMap();
        }
        this.f21995e.clear();
        this.f21999e.clear();
    }

    @Override // defpackage.AbstractC11095e, defpackage.AbstractC11463e
    public final int getSize() {
        int i = 10;
        if (this.f26355e) {
            int i2 = f26347e + 10;
            if (this.f26356e) {
                i2 += f26348e;
            }
            if (this.f26353e) {
                i2 += f26351e;
            }
            i = i2;
            if (this.f26361e) {
                i += f26346e;
            }
        }
        int size = i + super.getSize();
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        f26349e.getClass();
        int i3 = C1724e.ad;
        return size;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [eًؘؖ, java.lang.Object] */
    @Override // defpackage.AbstractC11095e
    /* renamed from: goto */
    public final Comparator mo2922goto() {
        if (C3918e.f8751e == null) {
            C3918e.f8751e = new Object();
        }
        return C3918e.f8751e;
    }

    @Override // defpackage.AbstractC11095e
    /* renamed from: interface */
    public final AbstractC8623e mo2923interface() {
        return C16582e.startapp();
    }

    /* renamed from: new, reason: not valid java name */
    public final ByteBuffer m3541new(int i, int i2) {
        int i3;
        ByteBuffer byteBuffer;
        this.f26358e = false;
        this.f26355e = false;
        this.f26352e = false;
        this.f26357e = false;
        ByteBuffer allocate = ByteBuffer.allocate(10);
        allocate.put(AbstractC11095e.f21993e);
        allocate.put((byte) 4);
        allocate.put((byte) 0);
        byte b = this.f26358e ? (byte) 128 : (byte) 0;
        if (this.f26355e) {
            b = (byte) (b | 64);
        }
        if (this.f26352e) {
            b = (byte) (b | 32);
        }
        if (this.f26357e) {
            b = (byte) (b | 16);
        }
        allocate.put(b);
        boolean z = this.f26355e;
        int i4 = f26346e;
        int i5 = f26351e;
        int i6 = f26348e;
        int i7 = f26347e;
        if (z) {
            i3 = this.f26356e ? i7 + i6 : i7;
            if (this.f26353e) {
                i3 += i5;
            }
            if (this.f26361e) {
                i3 += i4;
            }
        } else {
            i3 = 0;
        }
        allocate.put(AbstractC8294e.startapp(i + i2 + i3));
        if (this.f26355e) {
            if (this.f26356e) {
                i7 += i6;
            }
            if (this.f26353e) {
                i7 += i5;
            }
            if (this.f26361e) {
                i7 += i4;
            }
            byteBuffer = ByteBuffer.allocate(i7);
            byteBuffer.putInt(i7);
            byteBuffer.put((byte) f26344e);
            byte b2 = this.f26356e ? (byte) 64 : (byte) 0;
            if (this.f26353e) {
                b2 = (byte) (b2 | 32);
            }
            if (this.f26361e) {
                b2 = (byte) (b2 | 16);
            }
            byteBuffer.put(b2);
            if (this.f26356e) {
                byteBuffer.put((byte) 0);
            }
            if (this.f26353e) {
                byteBuffer.put((byte) f26345e);
                byteBuffer.put((byte) 0);
                byteBuffer.putInt(this.f26359e);
            }
            if (this.f26361e) {
                byteBuffer.put((byte) f26350e);
                byteBuffer.put((byte) 0);
            }
        } else {
            byteBuffer = null;
        }
        if (byteBuffer != null) {
            byteBuffer.flip();
            allocate.put(byteBuffer);
        }
        allocate.flip();
        return allocate;
    }

    @Override // defpackage.AbstractC16225e
    public final byte pro() {
        return (byte) 4;
    }

    @Override // defpackage.AbstractC11463e
    public final void read(ByteBuffer byteBuffer) {
        if (!m2995protected(byteBuffer)) {
            throw new Exception(AbstractC1786e.signatures(new StringBuilder(), this.f31887e, ":ID3v2.40 tag not found"));
        }
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        C7936e c7936e = f26349e;
        c7936e.getClass();
        int i = C1724e.ad;
        m3542super(byteBuffer.get());
        int vip = AbstractC8294e.vip(byteBuffer);
        c7936e.getClass();
        if (this.f26355e) {
            int i2 = byteBuffer.getInt();
            if (i2 <= f26347e) {
                Locale.getDefault();
                throw new Exception(this.f31887e + " Invalid Extended Header Size of " + i2 + " is too smal to be valid");
            }
            byteBuffer.get();
            byte b = byteBuffer.get();
            boolean z = (b & 64) != 0;
            this.f26356e = z;
            this.f26353e = (b & 32) != 0;
            this.f26361e = (b & 16) != 0;
            if (z) {
                byteBuffer.get();
            }
            if (this.f26353e) {
                byteBuffer.get();
                int i3 = f26345e;
                byte[] bArr = new byte[i3];
                byteBuffer.get(bArr, 0, i3);
                this.f26359e = 0;
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = this.f26359e << 8;
                    this.f26359e = i5;
                    this.f26359e = i5 + bArr[i4];
                }
            }
            if (this.f26361e) {
                byteBuffer.get();
                byte[] bArr2 = new byte[1];
                byteBuffer.get(bArr2, 0, 1);
                byte b2 = bArr2[0];
                this.f26360e = (byte) ((b2 & (-64)) >> 6);
                this.f26362e = (byte) ((b2 & 32) >> 5);
                this.f26363e = (byte) ((b2 & 24) >> 3);
                this.f26364e = (byte) ((b2 & 4) >> 2);
                this.f26354e = (byte) (b2 & 6);
            }
        }
        EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
        byteBuffer.position();
        c7936e.getClass();
        int i6 = C1724e.ad;
        m3540final();
        byteBuffer.position();
        while (byteBuffer.position() <= vip) {
            try {
                EnumC1005e[] enumC1005eArr3 = EnumC1005e.f3456e;
                byteBuffer.position();
                c7936e.getClass();
                int i7 = C1724e.ad;
                C2992e c2992e = new C2992e(this.f31887e, byteBuffer);
                mo2924native(c2992e.f4425e, c2992e);
            } catch (C1775e unused) {
                EnumC1005e[] enumC1005eArr4 = EnumC1005e.f3456e;
                int i8 = C1724e.ad;
            } catch (C4775e unused2) {
                EnumC1005e[] enumC1005eArr5 = EnumC1005e.f3456e;
                byteBuffer.position();
                int i9 = C1724e.ad;
                return;
            } catch (C0229e unused3) {
                EnumC1005e[] enumC1005eArr6 = EnumC1005e.f3456e;
                int i10 = C1724e.ad;
                return;
            } catch (C10754e e) {
                EnumC1005e[] enumC1005eArr7 = EnumC1005e.f3456e;
                e.getMessage();
                int i11 = C1724e.ad;
            } catch (C14572e unused4) {
                EnumC1005e[] enumC1005eArr8 = EnumC1005e.f3456e;
                int i12 = C1724e.ad;
                return;
            }
        }
    }

    /* renamed from: super, reason: not valid java name */
    public final void m3542super(byte b) {
        this.f26358e = (b & 128) != 0;
        this.f26355e = (b & 64) != 0;
        this.f26352e = (b & 32) != 0;
        this.f26357e = (b & 16) != 0;
        int i = b & 8;
        C7936e c7936e = f26349e;
        if (i != 0) {
            EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
            c7936e.getClass();
            int i2 = C1724e.ad;
        }
        if ((b & 4) != 0) {
            EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
            c7936e.getClass();
            int i3 = C1724e.ad;
        }
        if ((b & 2) != 0) {
            EnumC1005e[] enumC1005eArr3 = EnumC1005e.f3456e;
            c7936e.getClass();
            int i4 = C1724e.ad;
        }
        if ((b & 1) != 0) {
            EnumC1005e[] enumC1005eArr4 = EnumC1005e.f3456e;
            c7936e.getClass();
            int i5 = C1724e.ad;
        }
        if (this.f26358e) {
            EnumC1005e[] enumC1005eArr5 = EnumC1005e.f3456e;
            c7936e.getClass();
            int i6 = C1724e.ad;
        }
        if (this.f26355e) {
            EnumC1005e[] enumC1005eArr6 = EnumC1005e.f3456e;
            c7936e.getClass();
            int i7 = C1724e.ad;
        }
        if (this.f26352e) {
            EnumC1005e[] enumC1005eArr7 = EnumC1005e.f3456e;
            c7936e.getClass();
            int i8 = C1724e.ad;
        }
        if (this.f26357e) {
            EnumC1005e[] enumC1005eArr8 = EnumC1005e.f3456e;
            c7936e.getClass();
            int i9 = C1724e.ad;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eؚؓؓ, eؔۦؗ] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, eؓۗؑ] */
    @Override // defpackage.AbstractC11095e
    public final AbstractC1550e tapsense(String str) {
        ?? abstractC1550e = new AbstractC1550e(str);
        abstractC1550e.f4426e = new Object();
        abstractC1550e.f4424e = new C2437e(abstractC1550e);
        return abstractC1550e;
    }
}
