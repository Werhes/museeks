package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٟ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17917e extends AbstractC11130e {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C7936e f35168e;

    static {
        int i = AbstractC18186e.ad;
        int i2 = C1724e.ad;
        f35168e = new C7936e(2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17917e(C18529e c18529e, C13197e c13197e, C14355e c14355e, int i) {
        super(0, false);
        int i2;
        String str;
        int i3 = 0;
        EnumC14671e enumC14671e = EnumC14671e.UNKNOWN;
        AbstractC2301e.billing("esds".equals(c18529e.ad));
        this.f22047e = c18529e;
        int ad = c18529e.ad();
        c13197e.skip(4L);
        int i4 = ad - 4;
        if (c13197e.readByte() == 3) {
            int m4471e = (ad - 5) - m4471e(c13197e);
            c13197e.skip(3L);
            i4 = m4471e - 3;
        }
        EnumC7461e enumC7461e = EnumC7461e.UNKNOWN;
        if (c13197e.readByte() == 4) {
            int m4471e2 = (i4 - 1) - m4471e(c13197e);
            byte readByte = c13197e.readByte();
            int i5 = 0;
            while (true) {
                EnumC7461e[] enumC7461eArr = EnumC7461e.f15233e;
                if (i5 >= enumC7461eArr.length) {
                    enumC7461e = EnumC7461e.UNKNOWN;
                    break;
                }
                EnumC7461e enumC7461e2 = enumC7461eArr[i5];
                if (enumC7461e2.f15236e == readByte) {
                    enumC7461e = enumC7461e2;
                    break;
                }
                i5++;
            }
            c13197e.skip(4L);
            c13197e.readInt();
            i2 = c13197e.readInt();
            i4 = m4471e2 - 13;
        } else {
            i2 = 0;
        }
        EnumC5331e enumC5331e = EnumC5331e.f11433e;
        if (c13197e.readByte() == 5) {
            int m4471e3 = (i4 - 1) - m4471e(c13197e);
            int readByte2 = c13197e.readByte() >> 3;
            while (true) {
                EnumC5331e[] enumC5331eArr = EnumC5331e.f11434e;
                if (i3 >= enumC5331eArr.length) {
                    enumC5331e = EnumC5331e.f11433e;
                    break;
                }
                EnumC5331e enumC5331e2 = enumC5331eArr[i3];
                if (enumC5331e2.f11436e == readByte2) {
                    enumC5331e = enumC5331e2;
                    break;
                }
                i3++;
            }
            i4 = m4471e3 - 2;
            i3 = (c13197e.readByte() << 1) >> 4;
        }
        c14355e.license = i2 / 1000;
        c14355e.appmetrica = i3;
        c14355e.loadAd = enumC7461e;
        c14355e.Signature = enumC5331e;
        if (i == 1) {
            str = "AAC";
        } else if (i == 2) {
            str = "DRM AAC";
        } else {
            if (i != 3) {
                throw null;
            }
            str = "Apple Lossless";
        }
        c14355e.yandex = str;
        if (i4 != 0) {
            EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
            f35168e.getClass();
            int i6 = C1724e.ad;
            c13197e.skip(i4);
        }
    }

    /* renamed from: eِٜ٘, reason: contains not printable characters */
    public static int m4471e(C13197e c13197e) {
        int readByte = c13197e.readByte() & 255;
        if (readByte != 128 && readByte != 129 && readByte != 254) {
            C7936e c7936e = AbstractC1983e.ad;
            return 1;
        }
        c13197e.readByte();
        c13197e.readByte();
        c13197e.readByte();
        C7936e c7936e2 = AbstractC1983e.ad;
        return 4;
    }
}
