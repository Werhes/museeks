package defpackage;

import ealvatag.tag.id3.framebody.AbstractFrameBodyTextInfo;
import ealvatag.tag.id3.framebody.FrameBodyTCON;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؔؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10768e extends AbstractC11095e {

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public static final int f21186e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public static final C7936e f21187e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public static final int f21188e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public static final int f21189e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public static final int f21190e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public int f21196e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public boolean f21192e = false;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public boolean f21191e = false;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public boolean f21193e = false;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public boolean f21195e = false;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public int f21194e = 0;

    static {
        int i = AbstractC18186e.ad;
        int i2 = C1724e.ad;
        f21187e = new C7936e(2);
        f21189e = 10;
        f21190e = 4;
        f21186e = 4;
        f21188e = 6;
    }

    public C10768e() {
        m2929super();
    }

    public C10768e(C16151e c16151e, C18457e c18457e, String str, boolean z) {
        this.f31887e = str;
        try {
            m2927private(c18457e.vip);
            int i = c18457e.metrica;
            C7936e c7936e = f21187e;
            EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
            c7936e.getClass();
            int i2 = C1724e.ad;
            if (this.f21193e) {
                m2925new(c16151e);
            }
            m2928strictfp(this.f21195e ? C1051e.ad(c16151e) : c16151e, i, z);
            this.f21995e.keySet().size();
            c7936e.getClass();
        } catch (IOException e) {
            throw new Exception("ID3v2.30 error reading tag", e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eؚؓؓ, eٌؙؖ] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, eؓۗؑ] */
    /* renamed from: final, reason: not valid java name */
    public static C6276e m2917final(String str) {
        ?? abstractC1550e = new AbstractC1550e(str);
        ?? obj = new Object();
        obj.ad = (byte) 0;
        obj.vip = (byte) 0;
        abstractC1550e.f4426e = obj;
        abstractC1550e.f4424e = new AbstractC0424e();
        return abstractC1550e;
    }

    @Override // defpackage.AbstractC11095e, defpackage.InterfaceC9354e
    public final InterfaceC3589e ad(EnumC8271e enumC8271e, String... strArr) {
        AbstractC5542e.metrica(enumC8271e);
        String str = (String) AbstractC5542e.appmetrica(strArr);
        if (enumC8271e == EnumC8271e.GENRE) {
            C6276e m2917final = m2917final((String) mo2919class(enumC8271e).f25750e);
            FrameBodyTCON frameBodyTCON = (FrameBodyTCON) m2917final.f28795e;
            frameBodyTCON.setV23Format();
            C12927e.license();
            frameBodyTCON.setText(FrameBodyTCON.convertGenericToID3v23Genre(str));
            return m2917final;
        }
        if (enumC8271e != EnumC8271e.YEAR) {
            return super.ad(enumC8271e, strArr);
        }
        if (str.length() == 1) {
            C6276e m2917final2 = m2917final("TYER");
            ((AbstractFrameBodyTextInfo) m2917final2.f28795e).setText("000".concat(str));
            return m2917final2;
        }
        if (str.length() == 2) {
            C6276e m2917final3 = m2917final("TYER");
            ((AbstractFrameBodyTextInfo) m2917final3.f28795e).setText("00".concat(str));
            return m2917final3;
        }
        if (str.length() == 3) {
            C6276e m2917final4 = m2917final("TYER");
            ((AbstractFrameBodyTextInfo) m2917final4.f28795e).setText("0".concat(str));
            return m2917final4;
        }
        if (str.length() == 4) {
            C6276e m2917final5 = m2917final("TYER");
            ((AbstractFrameBodyTextInfo) m2917final5.f28795e).setText(str);
            return m2917final5;
        }
        if (str.length() <= 4) {
            return null;
        }
        C6276e m2917final6 = m2917final("TYER");
        ((AbstractFrameBodyTextInfo) m2917final6.f28795e).setText(str.substring(0, 4));
        if (str.length() >= 10) {
            String substring = str.substring(5, 7);
            String substring2 = str.substring(8, 10);
            C6276e m2917final7 = m2917final("TDAT");
            ((AbstractFrameBodyTextInfo) m2917final7.f28795e).setText(substring2 + substring);
            C0617e c0617e = new C0617e();
            c0617e.ad(m2917final6);
            c0617e.ad(m2917final7);
            return c0617e;
        }
        if (str.length() < 7) {
            return m2917final6;
        }
        String substring3 = str.substring(5, 7);
        C6276e m2917final8 = m2917final("TDAT");
        ((AbstractFrameBodyTextInfo) m2917final8.f28795e).setText("01" + substring3);
        C0617e c0617e2 = new C0617e();
        c0617e2.ad(m2917final6);
        c0617e2.ad(m2917final8);
        return c0617e2;
    }

    @Override // defpackage.InterfaceC9354e
    public final AbstractC12614e amazon() {
        return C11673e.yandex().startapp().keySet();
    }

    @Override // defpackage.AbstractC11095e, defpackage.InterfaceC9354e
    public final AbstractC9621e appmetrica(EnumC8271e enumC8271e) {
        AbstractC5542e.license(enumC8271e, "genericKey");
        if (enumC8271e == EnumC8271e.YEAR) {
            C0617e c0617e = (C0617e) this.f21995e.get("TYERTDAT");
            return c0617e != null ? AbstractC9621e.license(c0617e.yandex()) : super.appmetrica(enumC8271e);
        }
        if (enumC8271e != EnumC8271e.GENRE) {
            return super.appmetrica(enumC8271e);
        }
        AbstractC17475e metrica = metrica(enumC8271e);
        return (metrica == null || metrica.size() <= 0) ? C1444e.f4274e : AbstractC9621e.license(FrameBodyTCON.convertID3v23GenreToGeneric(((FrameBodyTCON) ((AbstractC1550e) metrica.get(0)).f28795e).getValues().get(0)));
    }

    @Override // defpackage.AbstractC11095e
    /* renamed from: break, reason: not valid java name */
    public final long mo2918break(File file, long j) {
        this.f31887e = file.getName();
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        C7936e c7936e = f21187e;
        c7936e.getClass();
        int i = C1724e.ad;
        byte[] byteArray = m2992case().toByteArray();
        int length = byteArray.length;
        c7936e.getClass();
        C12927e.license();
        this.f21195e = false;
        int signatures = AbstractC11095e.signatures(byteArray.length + 10, (int) j);
        int length2 = signatures - (byteArray.length + 10);
        c7936e.getClass();
        c7936e.getClass();
        c7936e.getClass();
        m2994implements(file, m2926package(length2, byteArray.length), byteArray, length2, signatures, j);
        return signatures;
    }

    @Override // defpackage.AbstractC11095e
    /* renamed from: class, reason: not valid java name */
    public final C12894e mo2919class(EnumC8271e enumC8271e) {
        EnumC2372e enumC2372e = (EnumC2372e) C11673e.yandex().startapp().get(enumC8271e);
        if (enumC2372e == null) {
            throw new C14803e(enumC8271e.name(), 17, (byte) 0);
        }
        return new C12894e(2, enumC8271e, enumC2372e.f6089e, enumC2372e.f6088e);
    }

    @Override // defpackage.AbstractC11095e
    /* renamed from: default, reason: not valid java name */
    public final void mo2920default(WritableByteChannel writableByteChannel, int i) {
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        C7936e c7936e = f21187e;
        c7936e.getClass();
        int i2 = C1724e.ad;
        byte[] byteArray = m2992case().toByteArray();
        int length = byteArray.length;
        c7936e.getClass();
        C12927e.license();
        int i3 = 0;
        this.f21195e = false;
        if (i > 0) {
            i3 = AbstractC11095e.signatures(byteArray.length + 10, i) - (byteArray.length + 10);
            c7936e.getClass();
        }
        writableByteChannel.write(m2926package(i3, byteArray.length));
        writableByteChannel.write(ByteBuffer.wrap(byteArray));
        if (i3 > 0) {
            writableByteChannel.write(ByteBuffer.wrap(new byte[i3]));
        }
    }

    @Override // defpackage.AbstractC11095e, defpackage.AbstractC16225e
    public final boolean equals(Object obj) {
        if (!(obj instanceof C10768e)) {
            return false;
        }
        C10768e c10768e = (C10768e) obj;
        return this.f21196e == c10768e.f21196e && this.f21192e == c10768e.f21192e && this.f21191e == c10768e.f21191e && this.f21193e == c10768e.f21193e && this.f21194e == c10768e.f21194e && super.equals(obj);
    }

    @Override // defpackage.AbstractC11095e
    /* renamed from: extends, reason: not valid java name */
    public final void mo2921extends(HashMap hashMap, String str, AbstractC1550e abstractC1550e) {
        if (!str.equals("TYER") && !str.equals("TDAT")) {
            super.mo2921extends(hashMap, str, abstractC1550e);
            return;
        }
        if (str.equals("TDAT") && abstractC1550e.f28795e.getUserFriendlyValue().length() == 0) {
            EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
            f21187e.getClass();
            int i = C1724e.ad;
            return;
        }
        if (hashMap.containsKey(str) || hashMap.containsKey("TYERTDAT")) {
            if (this.f21998e.length() > 0) {
                this.f21998e = AbstractC1786e.signatures(new StringBuilder(), this.f21998e, ";");
            }
            this.f21998e = AbstractC1786e.signatures(new StringBuilder(), this.f21998e, str);
            abstractC1550e.getSize();
            return;
        }
        if (str.equals("TYER")) {
            if (!hashMap.containsKey("TDAT")) {
                hashMap.put("TYER", abstractC1550e);
                return;
            }
            C0617e c0617e = new C0617e();
            c0617e.ad(abstractC1550e);
            c0617e.ad((AbstractC1550e) hashMap.get("TDAT"));
            hashMap.remove("TDAT");
            hashMap.put("TYERTDAT", c0617e);
            return;
        }
        if (str.equals("TDAT")) {
            if (!hashMap.containsKey("TYER")) {
                hashMap.put("TDAT", abstractC1550e);
                return;
            }
            C0617e c0617e2 = new C0617e();
            c0617e2.ad((AbstractC1550e) hashMap.get("TYER"));
            c0617e2.ad(abstractC1550e);
            hashMap.remove("TYER");
            hashMap.put("TYERTDAT", c0617e2);
        }
    }

    @Override // defpackage.AbstractC11095e, defpackage.AbstractC11463e
    public final int getSize() {
        int i = 10;
        if (this.f21193e) {
            i = 10 + f21189e;
            if (this.f21192e) {
                i += f21190e;
            }
        }
        return i + super.getSize();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [eٍُؕ, java.lang.Object] */
    @Override // defpackage.AbstractC11095e
    /* renamed from: goto, reason: not valid java name */
    public final Comparator mo2922goto() {
        if (C9387e.f18646e == null) {
            C9387e.f18646e = new Object();
        }
        return C9387e.f18646e;
    }

    @Override // defpackage.AbstractC11095e
    /* renamed from: interface, reason: not valid java name */
    public final AbstractC8623e mo2923interface() {
        return C11673e.yandex();
    }

    @Override // defpackage.AbstractC11095e, defpackage.InterfaceC9354e
    public final AbstractC17475e metrica(EnumC8271e enumC8271e) {
        C0617e c0617e;
        AbstractC5542e.license(enumC8271e, "genericKey");
        if (enumC8271e == EnumC8271e.YEAR && (c0617e = (C0617e) this.f21995e.get("TYERTDAT")) != null) {
            return AbstractC17475e.ads(c0617e);
        }
        return super.metrica(enumC8271e);
    }

    @Override // defpackage.AbstractC11095e
    /* renamed from: native, reason: not valid java name */
    public final void mo2924native(String str, AbstractC1550e abstractC1550e) {
        AbstractC12444e abstractC12444e = abstractC1550e.f28795e;
        if (abstractC12444e instanceof FrameBodyTCON) {
            ((FrameBodyTCON) abstractC12444e).setV23Format();
        }
        super.mo2924native(str, abstractC1550e);
    }

    /* renamed from: new, reason: not valid java name */
    public final void m2925new(C16151e c16151e) {
        boolean z;
        try {
            int readInt = c16151e.readInt();
            int i = f21188e;
            C7936e c7936e = f21187e;
            if (readInt == i) {
                z = (c16151e.readByte() & 128) != 0;
                this.f21192e = z;
                if (z) {
                    EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
                    c7936e.getClass();
                    int i2 = C1724e.ad;
                }
                c16151e.readByte();
                int readInt2 = c16151e.readInt();
                this.f21194e = readInt2;
                if (readInt2 > 0) {
                    EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
                    c7936e.getClass();
                    int i3 = C1724e.ad;
                    return;
                }
                return;
            }
            if (readInt != i + f21190e) {
                EnumC1005e[] enumC1005eArr3 = EnumC1005e.f3456e;
                c7936e.getClass();
                int i4 = C1724e.ad;
                Locale.getDefault();
                throw new Exception(this.f31887e + " Invalid Extended Header Size of " + readInt + " assuming no extended header after all");
            }
            EnumC1005e[] enumC1005eArr4 = EnumC1005e.f3456e;
            c7936e.getClass();
            int i5 = C1724e.ad;
            z = (c16151e.readByte() & 128) != 0;
            this.f21192e = z;
            if (!z) {
                EnumC1005e[] enumC1005eArr5 = EnumC1005e.f3456e;
                c7936e.getClass();
            }
            c16151e.readByte();
            int readInt3 = c16151e.readInt();
            this.f21194e = readInt3;
            if (readInt3 > 0) {
                c7936e.getClass();
            }
            this.f21196e = c16151e.readInt();
            c7936e.getClass();
        } catch (EOFException e) {
            throw new Exception(e);
        }
    }

    /* renamed from: package, reason: not valid java name */
    public final ByteBuffer m2926package(int i, int i2) {
        this.f21193e = false;
        this.f21191e = false;
        this.f21192e = false;
        int i3 = f21189e;
        int i4 = f21190e;
        ByteBuffer allocate = ByteBuffer.allocate(i3 + 10 + i4);
        allocate.put(AbstractC11095e.f21993e);
        allocate.put((byte) 3);
        allocate.put((byte) 0);
        byte b = this.f21195e ? (byte) 128 : (byte) 0;
        if (this.f21193e) {
            b = (byte) (b | 64);
        }
        if (this.f21191e) {
            b = (byte) (b | 32);
        }
        allocate.put(b);
        if (!this.f21193e) {
            i3 = 0;
        } else if (this.f21192e) {
            i3 += i4;
        }
        allocate.put(AbstractC8294e.startapp(i2 + i + i3));
        if (this.f21193e) {
            boolean z = this.f21192e;
            int i5 = f21188e;
            if (z) {
                allocate.putInt(i5 + i4);
                allocate.put((byte) 128);
                allocate.put((byte) 0);
                allocate.putInt(this.f21194e);
                allocate.putInt(this.f21196e);
            } else {
                allocate.putInt(i5);
                allocate.put((byte) 0);
                allocate.put((byte) 0);
                allocate.putInt(i);
            }
        }
        allocate.flip();
        return allocate;
    }

    /* renamed from: private, reason: not valid java name */
    public final void m2927private(byte b) {
        this.f21195e = (b & 128) != 0;
        this.f21193e = (b & 64) != 0;
        this.f21191e = (b & 32) != 0;
        int i = b & 16;
        C7936e c7936e = f21187e;
        if (i != 0) {
            EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
            c7936e.getClass();
            int i2 = C1724e.ad;
        }
        if ((b & 8) != 0) {
            EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
            c7936e.getClass();
            int i3 = C1724e.ad;
        }
        if ((b & 4) != 0) {
            EnumC1005e[] enumC1005eArr3 = EnumC1005e.f3456e;
            c7936e.getClass();
            int i4 = C1724e.ad;
        }
        if ((b & 2) != 0) {
            EnumC1005e[] enumC1005eArr4 = EnumC1005e.f3456e;
            c7936e.getClass();
            int i5 = C1724e.ad;
        }
        if ((b & 1) != 0) {
            EnumC1005e[] enumC1005eArr5 = EnumC1005e.f3456e;
            c7936e.getClass();
            int i6 = C1724e.ad;
        }
        if (this.f21195e) {
            EnumC1005e[] enumC1005eArr6 = EnumC1005e.f3456e;
            c7936e.getClass();
            int i7 = C1724e.ad;
        }
        if (this.f21193e) {
            EnumC1005e[] enumC1005eArr7 = EnumC1005e.f3456e;
            c7936e.getClass();
            int i8 = C1724e.ad;
        }
        if (this.f21191e) {
            EnumC1005e[] enumC1005eArr8 = EnumC1005e.f3456e;
            c7936e.getClass();
            int i9 = C1724e.ad;
        }
    }

    @Override // defpackage.AbstractC16225e
    public final byte pro() {
        return (byte) 3;
    }

    @Override // defpackage.AbstractC11463e
    public final void read(ByteBuffer byteBuffer) {
        boolean z;
        if (!m2995protected(byteBuffer)) {
            throw new Exception("ID3v2.30 tag not found");
        }
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        C7936e c7936e = f21187e;
        c7936e.getClass();
        int i = C1724e.ad;
        m2927private(byteBuffer.get());
        int vip = AbstractC8294e.vip(byteBuffer);
        c7936e.getClass();
        if (this.f21193e) {
            int i2 = byteBuffer.getInt();
            int i3 = f21188e;
            if (i2 == i3) {
                z = (byteBuffer.get() & 128) != 0;
                this.f21192e = z;
                if (z) {
                    EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
                    c7936e.getClass();
                }
                byteBuffer.get();
                int i4 = byteBuffer.getInt();
                this.f21194e = i4;
                if (i4 > 0) {
                    c7936e.getClass();
                }
            } else if (i2 == i3 + f21190e) {
                c7936e.getClass();
                z = (byteBuffer.get() & 128) != 0;
                this.f21192e = z;
                if (!z) {
                    EnumC1005e[] enumC1005eArr3 = EnumC1005e.f3456e;
                }
                byteBuffer.get();
                this.f21194e = byteBuffer.getInt();
                this.f21196e = byteBuffer.getInt();
            } else {
                EnumC1005e[] enumC1005eArr4 = EnumC1005e.f3456e;
                c7936e.getClass();
                byteBuffer.position(byteBuffer.position() - f21186e);
            }
        }
        ByteBuffer slice = byteBuffer.slice();
        if (this.f21195e) {
            slice = AbstractC13191e.ad(slice);
        }
        m2929super();
        EnumC1005e[] enumC1005eArr5 = EnumC1005e.f3456e;
        slice.position();
        c7936e.getClass();
        while (slice.position() < vip) {
            try {
                slice.position();
                EnumC1005e[] enumC1005eArr6 = EnumC1005e.f3456e;
                c7936e.getClass();
                int i5 = C1724e.ad;
                C6276e c6276e = new C6276e(this.f31887e, slice);
                String str = c6276e.f4425e;
                c7936e.getClass();
                mo2924native(str, c6276e);
            } catch (C1775e e) {
                EnumC1005e[] enumC1005eArr7 = EnumC1005e.f3456e;
                e.getMessage();
                int i6 = C1724e.ad;
            } catch (C4775e unused) {
                EnumC1005e[] enumC1005eArr8 = EnumC1005e.f3456e;
                slice.position();
                int i7 = C1724e.ad;
            } catch (C0229e e2) {
                EnumC1005e[] enumC1005eArr9 = EnumC1005e.f3456e;
                e2.getMessage();
                int i8 = C1724e.ad;
            } catch (C10754e e3) {
                EnumC1005e[] enumC1005eArr10 = EnumC1005e.f3456e;
                e3.getMessage();
                int i9 = C1724e.ad;
            } catch (C14572e e4) {
                EnumC1005e[] enumC1005eArr11 = EnumC1005e.f3456e;
                e4.getMessage();
                int i10 = C1724e.ad;
            }
        }
        EnumC1005e[] enumC1005eArr12 = EnumC1005e.f3456e;
        this.f21995e.keySet().size();
        c7936e.getClass();
        int i11 = C1724e.ad;
    }

    /* renamed from: strictfp, reason: not valid java name */
    public final void m2928strictfp(C16151e c16151e, int i, boolean z) {
        m2929super();
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        C7936e c7936e = f21187e;
        c7936e.getClass();
        int i2 = C1724e.ad;
        while (c16151e.f31731e > 0) {
            try {
                C6276e c6276e = new C6276e(c16151e, this.f31887e, z);
                if (AbstractC1550e.isVip(c6276e.f4425e) && z) {
                    this.f31886e = true;
                } else {
                    mo2924native(c6276e.f4425e, c6276e);
                }
            } catch (C4775e unused) {
                EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
                c7936e.getClass();
                int i3 = C1724e.ad;
                return;
            } catch (C0229e unused2) {
                EnumC1005e[] enumC1005eArr3 = EnumC1005e.f3456e;
                c7936e.getClass();
                int i4 = C1724e.ad;
                return;
            } catch (C1775e unused3) {
                EnumC1005e[] enumC1005eArr4 = EnumC1005e.f3456e;
                c7936e.getClass();
                int i5 = C1724e.ad;
            } catch (C10754e unused4) {
                EnumC1005e[] enumC1005eArr5 = EnumC1005e.f3456e;
                c7936e.getClass();
                int i6 = C1724e.ad;
            } catch (C14572e unused5) {
                EnumC1005e[] enumC1005eArr6 = EnumC1005e.f3456e;
                c7936e.getClass();
                int i7 = C1724e.ad;
                return;
            } catch (C10144e unused6) {
                EnumC1005e[] enumC1005eArr7 = EnumC1005e.f3456e;
                c7936e.getClass();
                int i8 = C1724e.ad;
            } catch (IOException e) {
                EnumC1005e[] enumC1005eArr8 = EnumC1005e.f3456e;
                e.toString();
                c7936e.getClass();
                int i9 = C1724e.ad;
            }
        }
    }

    /* renamed from: super, reason: not valid java name */
    public final void m2929super() {
        if (this.f21995e == null) {
            this.f21995e = new LinkedHashMap();
        }
        if (this.f21999e == null) {
            this.f21999e = new LinkedHashMap();
        }
        this.f21995e.clear();
        this.f21999e.clear();
    }

    @Override // defpackage.AbstractC11095e
    public final /* bridge */ /* synthetic */ AbstractC1550e tapsense(String str) {
        return m2917final(str);
    }
}
