package defpackage;

import ealvatag.tag.id3.framebody.AbstractID3v2FrameBody;
import ealvatag.tag.id3.framebody.FrameBodyDeprecated;
import ealvatag.tag.id3.framebody.ID3v23FrameBody;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؙؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6276e extends AbstractC1550e {

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public static final C7936e f13084e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public int f13085e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public int f13086e;

    static {
        int i = AbstractC18186e.ad;
        int i2 = C1724e.ad;
        f13084e = new C7936e(2);
    }

    public C6276e(C16151e c16151e, String str, boolean z) {
        int i;
        this.f4427e = str;
        C7936e c7936e = f13084e;
        try {
            String subs = subs(c16151e);
            if (!firebase(subs)) {
                EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
                c7936e.getClass();
                int i2 = C1724e.ad;
                throw new Exception(str + ":" + subs + ":is not a valid ID3v2.30 frame");
            }
            int readInt = c16151e.readInt();
            this.f4423e = readInt;
            if (readInt < 0) {
                EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
                c7936e.getClass();
                int i3 = C1724e.ad;
                throw new Exception(subs + " is invalid frame:" + this.f4423e);
            }
            if (readInt == 0) {
                EnumC1005e[] enumC1005eArr3 = EnumC1005e.f3456e;
                c7936e.getClass();
                int i4 = C1724e.ad;
                c16151e.readByte();
                c16151e.readByte();
                throw new Exception(subs.concat(" is empty frame"));
            }
            if (readInt > c16151e.f31731e) {
                EnumC1005e[] enumC1005eArr4 = EnumC1005e.f3456e;
                c7936e.getClass();
                int i5 = C1724e.ad;
                throw new Exception(subs + " is invalid frame:" + this.f4423e + " larger than size of" + c16151e.f31731e + " before mp3 audio:" + subs);
            }
            this.f4426e = new C2026e(this, c16151e.readByte());
            this.f4424e = new C0464e(this, c16151e.readByte());
            String metrica = AbstractC2251e.metrica(subs);
            int i6 = 4;
            if (metrica == null) {
                metrica = subs.length() >= 4 && C11673e.yandex().billing(subs.substring(0, 4)) ? subs : "Unsupported";
            }
            if (((C0464e) this.f4424e).vip()) {
                i = c16151e.readInt();
            } else {
                i = -1;
                i6 = 0;
            }
            if (((C0464e) this.f4424e).metrica()) {
                i6++;
                this.f13085e = c16151e.readByte();
            }
            if ((((C0464e) this.f4424e).ad & 32) > 0) {
                i6++;
                this.f13086e = c16151e.readByte();
            }
            if (((C0464e) this.f4424e).license()) {
                EnumC1005e[] enumC1005eArr5 = EnumC1005e.f3456e;
                AbstractC6069e.vip(this.f4424e.ad());
                c7936e.getClass();
                int i7 = C1724e.ad;
            }
            if (((C0464e) this.f4424e).vip() && i > this.f4423e * 100) {
                throw new Exception(subs + " is invalid frame, frame size " + this.f4423e + " cannot be:" + i + " when uncompressed");
            }
            int i8 = this.f4423e - i6;
            if (i8 <= 0) {
                throw new Exception(subs + " is invalid frame, realframeSize is:" + i8);
            }
            if (z && AbstractC1550e.isVip(metrica)) {
                c16151e.skip(i8);
                this.f28795e = null;
                return;
            }
            if (((C0464e) this.f4424e).vip()) {
                C16151e pro = AbstractC1550e.pro(c16151e, i8, i);
                if (((C0464e) this.f4424e).metrica()) {
                    this.f28795e = ads(metrica, pro, i);
                } else {
                    this.f28795e = isPro(metrica, pro, i);
                }
            } else if (((C0464e) this.f4424e).metrica()) {
                this.f28795e = ads(subs, c16151e, this.f4423e);
            } else {
                this.f28795e = isPro(metrica, c16151e, i8);
            }
            if (this.f28795e instanceof ID3v23FrameBody) {
                return;
            }
            EnumC1005e[] enumC1005eArr6 = EnumC1005e.f3456e;
            c7936e.getClass();
            int i9 = C1724e.ad;
            this.f28795e = new FrameBodyDeprecated((AbstractID3v2FrameBody) this.f28795e);
        } catch (RuntimeException e) {
            EnumC1005e[] enumC1005eArr7 = EnumC1005e.f3456e;
            c7936e.getClass();
            int i10 = C1724e.ad;
            StringBuilder sb = new StringBuilder("Buffer:");
            sb.append(c16151e.f31731e);
            sb.append(" ");
            String str2 = this.f4425e;
            throw new Exception(AbstractC8647e.ads(sb, str2 == null ? BuildConfig.FLAVOR : str2, " not valid ID3v2.30 frame ", str), e);
        }
    }

    public C6276e(String str, ByteBuffer byteBuffer) {
        this.f4427e = str;
        read(byteBuffer);
    }

    public static boolean firebase(String str) {
        char charAt;
        return str.length() >= 4 && (charAt = str.charAt(0)) >= 'A' && charAt <= 'Z' && AbstractC10510e.vip(str.charAt(1)) && AbstractC10510e.vip(str.charAt(2)) && AbstractC10510e.vip(str.charAt(3));
    }

    @Override // defpackage.InterfaceC3589e
    public final boolean Signature() {
        return C11673e.yandex().ad(this.f4425e);
    }

    @Override // defpackage.AbstractC1550e, defpackage.AbstractC14583e
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6276e)) {
            return false;
        }
        C6276e c6276e = (C6276e) obj;
        return AbstractC1376e.vip(this.f4426e, c6276e.f4426e) && AbstractC1376e.vip(this.f4424e, c6276e.f4424e) && super.equals(c6276e);
    }

    @Override // defpackage.AbstractC11463e
    public final int getSize() {
        return this.f28795e.getSize() + 10;
    }

    @Override // defpackage.AbstractC11463e
    public final void read(ByteBuffer byteBuffer) {
        int i;
        String crashlytics = crashlytics(byteBuffer);
        boolean firebase = firebase(crashlytics);
        C7936e c7936e = f13084e;
        if (!firebase) {
            EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
            c7936e.getClass();
            int i2 = C1724e.ad;
            byteBuffer.position(byteBuffer.position() - 3);
            throw new Exception(AbstractC4653e.ads(new StringBuilder(), this.f4427e, ":", crashlytics, ":is not a valid ID3v2.30 frame"));
        }
        int i3 = byteBuffer.getInt();
        this.f4423e = i3;
        if (i3 < 0) {
            EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
            c7936e.getClass();
            int i4 = C1724e.ad;
            StringBuilder isPro = AbstractC8703e.isPro(crashlytics, " is invalid frame:");
            isPro.append(this.f4423e);
            throw new Exception(isPro.toString());
        }
        if (i3 == 0) {
            EnumC1005e[] enumC1005eArr3 = EnumC1005e.f3456e;
            c7936e.getClass();
            int i5 = C1724e.ad;
            byteBuffer.get();
            byteBuffer.get();
            throw new Exception(crashlytics.concat(" is empty frame"));
        }
        if (i3 > byteBuffer.remaining()) {
            EnumC1005e[] enumC1005eArr4 = EnumC1005e.f3456e;
            byteBuffer.remaining();
            c7936e.getClass();
            int i6 = C1724e.ad;
            StringBuilder isPro2 = AbstractC8703e.isPro(crashlytics, " is invalid frame:");
            isPro2.append(this.f4423e);
            isPro2.append(" larger than size of");
            isPro2.append(byteBuffer.remaining());
            isPro2.append(" before mp3 audio:");
            isPro2.append(crashlytics);
            throw new Exception(isPro2.toString());
        }
        this.f4426e = new C2026e(this, byteBuffer.get());
        this.f4424e = new C0464e(this, byteBuffer.get());
        String metrica = AbstractC2251e.metrica(crashlytics);
        int i7 = 4;
        if (metrica == null) {
            metrica = (crashlytics.length() < 4 || !C11673e.yandex().billing(crashlytics.substring(0, 4))) ? "Unsupported" : crashlytics;
        }
        EnumC1005e[] enumC1005eArr5 = EnumC1005e.f3456e;
        c7936e.getClass();
        int i8 = C1724e.ad;
        if (((C0464e) this.f4424e).vip()) {
            i = byteBuffer.getInt();
            c7936e.getClass();
        } else {
            i = -1;
            i7 = 0;
        }
        if (((C0464e) this.f4424e).metrica()) {
            i7++;
            this.f13085e = byteBuffer.get();
        }
        if ((((C0464e) this.f4424e).ad & 32) > 0) {
            i7++;
            this.f13086e = byteBuffer.get();
        }
        if (((C0464e) this.f4424e).license()) {
            EnumC1005e[] enumC1005eArr6 = EnumC1005e.f3456e;
            AbstractC6069e.vip(this.f4424e.ad());
            c7936e.getClass();
        }
        if (((C0464e) this.f4424e).vip() && i > this.f4423e * 100) {
            StringBuilder isPro3 = AbstractC8703e.isPro(crashlytics, " is invalid frame, frame size ");
            isPro3.append(this.f4423e);
            isPro3.append(" cannot be:");
            isPro3.append(i);
            isPro3.append(" when uncompressed");
            throw new Exception(isPro3.toString());
        }
        int i9 = this.f4423e - i7;
        if (i9 <= 0) {
            throw new Exception(crashlytics + " is invalid frame, realframeSize is:" + i9);
        }
        try {
            if (((C0464e) this.f4424e).vip()) {
                ByteBuffer ad = AbstractC0846e.ad(crashlytics, this.f4427e, byteBuffer, i, i9);
                if (((C0464e) this.f4424e).metrica()) {
                    this.f28795e = premium(metrica, ad, i);
                } else {
                    this.f28795e = applovin(metrica, ad, i);
                }
            } else if (((C0464e) this.f4424e).metrica()) {
                ByteBuffer slice = byteBuffer.slice();
                slice.limit(this.f4423e);
                this.f28795e = premium(crashlytics, slice, this.f4423e);
            } else {
                ByteBuffer slice2 = byteBuffer.slice();
                slice2.limit(i9);
                this.f28795e = applovin(metrica, slice2, i9);
            }
            if (!(this.f28795e instanceof ID3v23FrameBody)) {
                EnumC1005e[] enumC1005eArr7 = EnumC1005e.f3456e;
                c7936e.getClass();
                this.f28795e = new FrameBodyDeprecated((AbstractID3v2FrameBody) this.f28795e);
            }
            byteBuffer.position(byteBuffer.position() + i9);
        } catch (Throwable th) {
            byteBuffer.position(byteBuffer.position() + i9);
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
        C7936e c7936e = f13084e;
        c7936e.getClass();
        int i = C1724e.ad;
        ByteBuffer allocate = ByteBuffer.allocate(10);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        ((AbstractID3v2FrameBody) this.f28795e).write(byteArrayOutputStream2);
        if (this.f4425e.length() == 3) {
            this.f4425e = AbstractC4653e.applovin(new StringBuilder(), this.f4425e, ' ');
        }
        allocate.put(this.f4425e.getBytes(AbstractC4639e.vip), 0, 4);
        this.f28795e.getSize();
        EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
        c7936e.getClass();
        allocate.putInt(this.f28795e.getSize());
        allocate.put(this.f4426e.vip);
        C0464e c0464e = (C0464e) this.f4424e;
        if (c0464e.license()) {
            EnumC1005e[] enumC1005eArr3 = EnumC1005e.f3456e;
            AbstractC6069e.vip(c0464e.ad);
            c7936e.getClass();
            c0464e.ad = (byte) (((byte) (((byte) (((byte) (((byte) (c0464e.ad & (-17))) & (-9))) & (-5))) & (-3))) & (-2));
        }
        AbstractC0424e abstractC0424e = this.f4424e;
        C0464e c0464e2 = (C0464e) abstractC0424e;
        c0464e2.ad = (byte) (c0464e2.ad & Byte.MAX_VALUE);
        allocate.put(abstractC0424e.ad());
        try {
            byteArrayOutputStream.write(allocate.array());
            if (((C0464e) this.f4424e).metrica()) {
                byteArrayOutputStream.write(this.f13085e);
            }
            if ((((C0464e) this.f4424e).ad & 32) > 0) {
                byteArrayOutputStream.write(this.f13086e);
            }
            byteArrayOutputStream.write(byteArrayOutputStream2.toByteArray());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
