package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔٔ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2587e extends AbstractC11130e {
    public C2587e(int i) {
        super(0, false);
        try {
            this.f22047e = new Object();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(AbstractC1983e.appmetrica(i + 8));
            EnumC14671e enumC14671e = EnumC14671e.UNKNOWN;
            byteArrayOutputStream.write("free".getBytes(AbstractC4639e.vip));
            ((C18529e) this.f22047e).purchase(ByteBuffer.wrap(byteArrayOutputStream.toByteArray()));
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            for (int i2 = 0; i2 < i; i2++) {
                byteArrayOutputStream2.write(0);
            }
            this.f22046e = ByteBuffer.wrap(byteArrayOutputStream2.toByteArray());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public C2587e(C18529e c18529e, C13197e c13197e, C14355e c14355e, boolean z) {
        super(0, false);
        EnumC14671e enumC14671e = EnumC14671e.UNKNOWN;
        AbstractC2301e.billing("alac".equals(c18529e.ad));
        int ad = c18529e.ad();
        c13197e.skip(4L);
        c13197e.readInt();
        c13197e.readByte();
        C7936e c7936e = AbstractC1983e.ad;
        int readByte = c13197e.readByte() & 255;
        c13197e.readByte();
        c13197e.readByte();
        c13197e.readByte();
        int readByte2 = c13197e.readByte() & 255;
        c13197e.readShort();
        c13197e.readInt();
        int readInt = c13197e.readInt();
        c13197e.readInt();
        int i = ad - 28;
        if (z) {
            c14355e.yandex = "Apple Lossless";
            c14355e.appmetrica = readByte2;
            c14355e.license = readInt / 1000;
            c14355e.billing = readByte;
            c13197e.skip(i);
            return;
        }
        C2587e c2587e = null;
        while (i >= 8 && c2587e == null) {
            C18529e c18529e2 = new C18529e(c13197e);
            if (c18529e2.license().ordinal() != 0) {
                c13197e.skip(c18529e2.ad());
            } else {
                c2587e = new C2587e(c18529e2, c13197e, c14355e, true);
            }
            i -= c18529e2.vip;
        }
        if (i > 0) {
            c13197e.skip(i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v27, types: [eِؚٞ, eؕۘۘ, java.lang.Object, eٌٌؖ] */
    /* JADX WARN: Type inference failed for: r14v6, types: [eؕۘۘ, eٌٌؖ, eۣۛ] */
    public C2587e(C18529e c18529e, C13197e c13197e, C15912e c15912e, boolean z) {
        super(0, false);
        int i;
        C16151e c16151e = c13197e.f26204e;
        int i2 = 0;
        EnumC14671e enumC14671e = EnumC14671e.UNKNOWN;
        AbstractC2301e.billing("meta".equals(c18529e.ad));
        this.f22047e = c18529e;
        int ad = c18529e.ad();
        c13197e.skip(4L);
        int i3 = ad - 4;
        Object obj = null;
        while (true) {
            int i4 = 8;
            if (i3 < 8 || obj != null) {
                break;
            }
            C18529e c18529e2 = new C18529e(c13197e);
            if (c18529e2.license().ordinal() != 48) {
                c13197e.skip(c18529e2.ad());
            } else {
                C7936e c7936e = C15586e.ad;
                obj = new Object();
                EnumC14671e enumC14671e2 = EnumC14671e.UNKNOWN;
                AbstractC2301e.billing("ilst".equals(c18529e2.ad));
                int ad2 = c18529e2.ad();
                while (ad2 >= i4) {
                    C18529e c18529e3 = new C18529e(c13197e);
                    int ad3 = c18529e3.ad();
                    if (ad3 > 0) {
                        if ("----".equals(c18529e3.ad)) {
                            ByteBuffer wrap = ByteBuffer.wrap(c13197e.license(ad3));
                            try {
                                ?? obj2 = new Object();
                                obj2.f17292e = c18529e3;
                                obj2.ad(wrap);
                                c15912e.purchase(obj2);
                            } catch (Exception unused) {
                                EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
                                c7936e.getClass();
                                int i5 = C1724e.ad;
                                c15912e.purchase(new C13206e(c18529e3, wrap));
                            }
                        } else {
                            Charset charset = AbstractC4639e.vip;
                            c13197e.admob(i4);
                            byte[] bArr = new byte[4];
                            for (int i6 = 4; i2 < i6; i6 = 4) {
                                byte[] bArr2 = bArr;
                                bArr2[i2] = c16151e.Signature(i6 + i2);
                                i2++;
                                i4 = i4;
                                bArr = bArr2;
                            }
                            i = i4;
                            boolean equals = "data".equals(new String(bArr, charset));
                            c13197e.admob(12);
                            EnumC8701e enumC8701e = (EnumC8701e) EnumC8701e.f17566e.get(Integer.valueOf(((c16151e.Signature(9) & 255) << 16) | ((c16151e.Signature(10) & 255) << 8) | (c16151e.Signature(11) & 255)));
                            if (!EnumC14687e.ARTWORK.f29091e.equals(c18529e3.ad) && !EnumC8701e.f17561e.contains(enumC8701e)) {
                                ByteBuffer wrap2 = ByteBuffer.wrap(c13197e.license(ad3));
                                String str = c18529e3.ad;
                                if (equals) {
                                    if (EnumC14687e.TRACK.f29091e.equals(str)) {
                                        c15912e.purchase(new AbstractC8492e(str, wrap2));
                                    } else if (EnumC14687e.DISCNUMBER.f29091e.equals(str)) {
                                        c15912e.purchase(new AbstractC8492e(str, wrap2));
                                    } else if (EnumC14687e.GENRE.f29091e.equals(str)) {
                                        c15912e.purchase(new AbstractC8492e(str, wrap2));
                                    } else if (enumC8701e == EnumC8701e.TEXT) {
                                        c15912e.purchase(new AbstractC8492e(str, wrap2));
                                    } else if (enumC8701e == EnumC8701e.IMPLICIT) {
                                        c15912e.purchase(new AbstractC8492e(str, wrap2));
                                    } else if (enumC8701e != EnumC8701e.INTEGER) {
                                        EnumC14687e[] values = EnumC14687e.values();
                                        int length = values.length;
                                        int i7 = 0;
                                        while (true) {
                                            if (i7 >= length) {
                                                EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
                                                c7936e.getClass();
                                                int i8 = C1724e.ad;
                                                c15912e.purchase(new AbstractC8492e(str, wrap2));
                                                break;
                                            }
                                            if (values[i7].f29091e.equals(str)) {
                                                EnumC1005e[] enumC1005eArr3 = EnumC1005e.f3456e;
                                                c7936e.getClass();
                                                int i9 = C1724e.ad;
                                                break;
                                            }
                                            i7++;
                                        }
                                    } else {
                                        c15912e.purchase(new AbstractC8492e(str, wrap2));
                                    }
                                } else if ("AApr".equals(str)) {
                                    c15912e.purchase(new C13206e(c18529e3, wrap2));
                                } else {
                                    c15912e.purchase(new C13206e(c18529e3, wrap2));
                                }
                            } else if (z) {
                                c15912e.f29700e = true;
                                c13197e.skip(ad3);
                            } else {
                                ByteBuffer wrap3 = ByteBuffer.wrap(c13197e.license(ad3));
                                int i10 = 0;
                                int i11 = 0;
                                while (i10 < c18529e3.ad()) {
                                    enumC8701e = i11 > 0 ? (EnumC8701e) EnumC8701e.f17566e.get(Integer.valueOf(AbstractC1983e.metrica(wrap3, i10 + 9, i10 + 11))) : enumC8701e;
                                    ?? abstractC8492e = new AbstractC8492e(EnumC14687e.ARTWORK.f29091e, wrap3);
                                    abstractC8492e.f36179e = enumC8701e;
                                    if (!EnumC8701e.f17561e.contains(enumC8701e)) {
                                        C7936e c7936e2 = C18461e.f36177e;
                                        EnumC1005e[] enumC1005eArr4 = EnumC1005e.f3456e;
                                        c7936e2.getClass();
                                        int i12 = C1724e.ad;
                                    }
                                    c15912e.purchase(abstractC8492e);
                                    i10 += abstractC8492e.f36178e;
                                    i11++;
                                }
                            }
                            ad2 -= c18529e3.vip;
                            i4 = i;
                            i2 = 0;
                        }
                    }
                    i = i4;
                    ad2 -= c18529e3.vip;
                    i4 = i;
                    i2 = 0;
                }
                if (ad2 > 0) {
                    EnumC1005e[] enumC1005eArr5 = EnumC1005e.f3456e;
                    c7936e.getClass();
                    int i13 = C1724e.ad;
                    c13197e.skip(ad2);
                }
            }
            i3 -= c18529e2.vip;
            i2 = 0;
        }
        c13197e.skip(i3);
    }
}
