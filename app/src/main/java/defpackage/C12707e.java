package defpackage;

import ealvatag.tag.id3.framebody.AbstractID3v2FrameBody;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۣۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12707e extends AbstractC1550e {

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final C7936e f25455e;

    static {
        int i = AbstractC18186e.ad;
        int i2 = C1724e.ad;
        f25455e = new C7936e(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v12, types: [eِٖۢ, java.lang.Object] */
    public C12707e(C16151e c16151e, String str, boolean z) {
        this.f4427e = str;
        C7936e c7936e = f25455e;
        try {
            String subs = subs(c16151e);
            if (!firebase(subs)) {
                EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
                c7936e.getClass();
                int i = C1724e.ad;
                throw new Exception(str + ":" + subs + ":is not a valid ID3v2.30 frame");
            }
            byte[] bArr = new byte[3];
            c16151e.admob(3);
            for (int i2 = 0; i2 < 3; i2++) {
                bArr[i2] = c16151e.readByte();
            }
            int intValue = new BigInteger(bArr).intValue();
            if (intValue < 0) {
                EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
                Integer.toBinaryString(intValue);
                c7936e.getClass();
                int i3 = C1724e.ad;
            }
            this.f4423e = intValue;
            if (intValue < 0) {
                throw new Exception(subs + " has invalid size of:" + this.f4423e);
            }
            if (intValue == 0) {
                EnumC1005e[] enumC1005eArr3 = EnumC1005e.f3456e;
                c7936e.getClass();
                int i4 = C1724e.ad;
                throw new Exception(subs.concat(" is empty frame"));
            }
            if (intValue > c16151e.f31731e) {
                EnumC1005e[] enumC1005eArr4 = EnumC1005e.f3456e;
                c7936e.getClass();
                int i5 = C1724e.ad;
                throw new Exception(subs.concat(" is invalid frame"));
            }
            EnumC1005e[] enumC1005eArr5 = EnumC1005e.f3456e;
            c7936e.getClass();
            int i6 = C1724e.ad;
            String vip = AbstractC2251e.vip(subs);
            if (vip == null) {
                vip = subs.length() < 3 ? null : AbstractC14953e.ad(subs.substring(0, 3));
                if (vip == null) {
                    if (!AbstractC2251e.advert(subs)) {
                        subs = "Unsupported";
                    }
                    c7936e.getClass();
                    if (!z && AbstractC1550e.isVip(subs)) {
                        c16151e.skip(this.f4423e);
                        this.f28795e = null;
                        return;
                    } else {
                        ?? obj = new Object();
                        c16151e.crashlytics(obj, this.f4423e);
                        this.f28795e = isPro(subs, obj, this.f4423e);
                    }
                }
            }
            subs = vip;
            c7936e.getClass();
            if (!z) {
            }
            ?? obj2 = new Object();
            c16151e.crashlytics(obj2, this.f4423e);
            this.f28795e = isPro(subs, obj2, this.f4423e);
        } catch (RuntimeException e) {
            EnumC1005e[] enumC1005eArr6 = EnumC1005e.f3456e;
            c7936e.getClass();
            int i7 = C1724e.ad;
            StringBuilder sb = new StringBuilder("Buffer:");
            sb.append(c16151e.f31731e);
            sb.append(" ");
            String str2 = this.f4425e;
            throw new Exception(AbstractC8647e.ads(sb, str2 == null ? BuildConfig.FLAVOR : str2, " not valid ID3v2.30 frame ", str), e);
        }
    }

    public C12707e(String str, ByteBuffer byteBuffer) {
        this.f4427e = str;
        read(byteBuffer);
    }

    public static boolean firebase(String str) {
        char charAt;
        return str.length() >= 3 && (charAt = str.charAt(0)) >= 'A' && charAt <= 'Z' && AbstractC10510e.vip(str.charAt(1)) && AbstractC10510e.vip(str.charAt(2));
    }

    @Override // defpackage.InterfaceC3589e
    public final boolean Signature() {
        return C16582e.yandex().ad(this.f4425e);
    }

    @Override // defpackage.AbstractC1550e, defpackage.AbstractC14583e
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12707e)) {
            return false;
        }
        C12707e c12707e = (C12707e) obj;
        return AbstractC13328e.metrica(this.f4426e, c12707e.f4426e) && AbstractC13328e.metrica(this.f4424e, c12707e.f4424e) && super.equals(c12707e);
    }

    @Override // defpackage.AbstractC11463e
    public final int getSize() {
        return this.f28795e.getSize() + 6;
    }

    @Override // defpackage.AbstractC1550e
    public final boolean inmobi(byte[] bArr) {
        return bArr[0] == 0 && bArr[1] == 0 && bArr[2] == 0;
    }

    @Override // defpackage.AbstractC11463e
    public final void read(ByteBuffer byteBuffer) {
        String crashlytics = crashlytics(byteBuffer);
        byte[] bArr = new byte[3];
        boolean firebase = firebase(crashlytics);
        C7936e c7936e = f25455e;
        if (!firebase) {
            EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
            c7936e.getClass();
            int i = C1724e.ad;
            byteBuffer.position(byteBuffer.position() - 2);
            throw new Exception(AbstractC4653e.ads(new StringBuilder(), this.f4427e, ":", crashlytics, ":is not a valid ID3v2.20 frame"));
        }
        byteBuffer.get(bArr, 0, 3);
        int intValue = new BigInteger(bArr).intValue();
        if (intValue < 0) {
            EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
            Integer.toBinaryString(intValue);
            c7936e.getClass();
            int i2 = C1724e.ad;
        }
        this.f4423e = intValue;
        if (intValue < 0) {
            StringBuilder isPro = AbstractC8703e.isPro(crashlytics, " has invalid size of:");
            isPro.append(this.f4423e);
            throw new Exception(isPro.toString());
        }
        if (intValue == 0) {
            EnumC1005e[] enumC1005eArr3 = EnumC1005e.f3456e;
            c7936e.getClass();
            int i3 = C1724e.ad;
            throw new Exception(crashlytics.concat(" is empty frame"));
        }
        if (intValue > byteBuffer.remaining()) {
            EnumC1005e[] enumC1005eArr4 = EnumC1005e.f3456e;
            c7936e.getClass();
            int i4 = C1724e.ad;
            throw new Exception(crashlytics.concat(" is invalid frame"));
        }
        EnumC1005e[] enumC1005eArr5 = EnumC1005e.f3456e;
        c7936e.getClass();
        int i5 = C1724e.ad;
        String vip = AbstractC2251e.vip(crashlytics);
        if (vip == null) {
            String ad = crashlytics.length() < 3 ? null : AbstractC14953e.ad(crashlytics.substring(0, 3));
            if (ad != null) {
                crashlytics = ad;
            } else if (!AbstractC2251e.advert(crashlytics)) {
                crashlytics = "Unsupported";
            }
        } else {
            crashlytics = vip;
        }
        c7936e.getClass();
        ByteBuffer slice = byteBuffer.slice();
        slice.limit(this.f4423e);
        try {
            this.f28795e = applovin(crashlytics, slice, this.f4423e);
        } finally {
            byteBuffer.position(byteBuffer.position() + this.f4423e);
        }
    }

    @Override // defpackage.AbstractC1550e
    public final int signatures() {
        return 6;
    }

    @Override // defpackage.AbstractC1550e
    public final int tapsense() {
        return 3;
    }

    @Override // defpackage.AbstractC1550e
    public final void write(ByteArrayOutputStream byteArrayOutputStream) {
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        C7936e c7936e = f25455e;
        c7936e.getClass();
        int i = C1724e.ad;
        ByteBuffer allocate = ByteBuffer.allocate(6);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        ((AbstractID3v2FrameBody) this.f28795e).write(byteArrayOutputStream2);
        allocate.put(this.f4425e.getBytes(AbstractC4639e.vip), 0, 3);
        int size = this.f28795e.getSize();
        allocate.put((byte) ((16711680 & size) >> 16));
        allocate.put((byte) ((65280 & size) >> 8));
        allocate.put((byte) (size & 255));
        c7936e.getClass();
        try {
            byteArrayOutputStream.write(allocate.array());
            byteArrayOutputStream.write(byteArrayOutputStream2.toByteArray());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
