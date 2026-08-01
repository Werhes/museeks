package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؖۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4389e {
    public final boolean ad;
    public final int appmetrica;
    public final int license;
    public final int metrica;
    public final boolean vip;
    public static final C16499e purchase = new C4389e(false, false, -1, 1);
    public static final byte[] billing = {13, 10};
    public static final C4389e yandex = new C4389e(true, false, -1, 1);

    /* JADX WARN: Type inference failed for: r0v0, types: [eُٖۛ, eؙؖۜ] */
    static {
        new C4389e(false, true, 76, 1);
        new C4389e(false, true, 64, 1);
    }

    public C4389e(boolean z, boolean z2, int i, int i2) {
        this.ad = z;
        this.vip = z2;
        this.metrica = i;
        this.license = i2;
        if (z && z2) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.appmetrica = i / 4;
    }

    public static byte[] ad(C4389e c4389e, CharSequence charSequence, int i, int i2) {
        byte[] bArr;
        int i3;
        int i4;
        int i5;
        int[] iArr;
        int i6;
        int i7 = 0;
        int i8 = (i2 & 2) != 0 ? 0 : i;
        int length = charSequence.length();
        c4389e.getClass();
        int i9 = c4389e.license;
        boolean z = c4389e.vip;
        if (charSequence instanceof String) {
            String str = (String) charSequence;
            AbstractC17140e.metrica(i8, length, str.length());
            bArr = str.substring(i8, length).getBytes(AbstractC5508e.license);
        } else {
            AbstractC17140e.metrica(i8, length, charSequence.length());
            byte[] bArr2 = new byte[length - i8];
            int i10 = 0;
            while (i8 < length) {
                char charAt = charSequence.charAt(i8);
                if (charAt <= 255) {
                    bArr2[i10] = (byte) charAt;
                    i10++;
                } else {
                    bArr2[i10] = 63;
                    i10++;
                }
                i8++;
            }
            bArr = bArr2;
        }
        int length2 = bArr.length;
        AbstractC17140e.metrica(0, length2, bArr.length);
        int i11 = -2;
        if (length2 == 0) {
            i4 = 1;
        } else {
            if (length2 == 1) {
                throw new IllegalArgumentException(AbstractC1786e.admob(length2, "Input should have at least 2 symbols for Base64 decoding, startIndex: 0, endIndex: "));
            }
            if (z) {
                i3 = length2;
                int i12 = 0;
                while (true) {
                    if (i12 >= length2) {
                        break;
                    }
                    int i13 = AbstractC6005e.vip[bArr[i12] & 255];
                    if (i13 < 0) {
                        if (i13 == -2) {
                            i3 -= length2 - i12;
                            break;
                        }
                        i3--;
                    }
                    i12++;
                }
            } else if (bArr[length2 - 1] == 61) {
                i3 = length2 - 1;
                if (bArr[length2 - 2] == 61) {
                    i3 = length2 - 2;
                }
            } else {
                i3 = length2;
            }
            i4 = 1;
            i7 = (int) ((i3 * 6) / 8);
        }
        byte[] bArr3 = new byte[i7];
        int[] iArr2 = c4389e.ad ? AbstractC6005e.license : AbstractC6005e.vip;
        int i14 = -8;
        int i15 = 8;
        int i16 = -8;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            if (i18 >= length2) {
                i5 = 0;
                break;
            }
            if (i16 != i14 || (i6 = i18 + 3) >= length2) {
                iArr = iArr2;
            } else {
                iArr = iArr2;
                int i20 = i18 + 4;
                int i21 = (iArr[bArr[i18 + 2] & 255] << 6) | (iArr2[bArr[i18 + 1] & 255] << 12) | (iArr2[bArr[i18] & 255] << 18) | iArr[bArr[i6] & 255];
                if (i21 >= 0) {
                    bArr3[i17] = (byte) (i21 >> 16);
                    int i22 = i17 + 2;
                    bArr3[i17 + 1] = (byte) (i21 >> 8);
                    i17 += 3;
                    bArr3[i22] = (byte) i21;
                    iArr2 = iArr;
                    i18 = i20;
                    i11 = -2;
                    i14 = -8;
                }
            }
            int i23 = bArr[i18] & 255;
            int i24 = iArr[i23];
            if (i24 >= 0) {
                i18++;
                i19 = (i19 << 6) | i24;
                int i25 = i16 + 6;
                if (i25 >= 0) {
                    bArr3[i17] = (byte) (i19 >>> i25);
                    i19 &= (i4 << i25) - 1;
                    i16 -= 2;
                    i17++;
                } else {
                    i16 = i25;
                }
                iArr2 = iArr;
                i11 = -2;
                i14 = -8;
                i15 = 8;
            } else if (i24 == -2) {
                if (i16 == -8) {
                    throw new IllegalArgumentException(AbstractC1786e.admob(i18, "Redundant pad character at index "));
                }
                if (i16 != -6) {
                    if (i16 != -4) {
                        if (i16 != -2) {
                            throw new IllegalStateException("Unreachable");
                        }
                    } else {
                        if (i9 == 2) {
                            throw new IllegalArgumentException(AbstractC1786e.admob(i18, "The padding option is set to ABSENT, but the input has a pad character at index "));
                        }
                        int i26 = i18 + 1;
                        if (z) {
                            while (i26 < length2) {
                                if (AbstractC6005e.vip[bArr[i26] & 255] != -1) {
                                    break;
                                }
                                i26++;
                            }
                        }
                        if (i26 == length2 || bArr[i26] != 61) {
                            throw new IllegalArgumentException(AbstractC1786e.admob(i26, "Missing one pad character at index "));
                        }
                        i18 = i26 + 1;
                        i5 = i4;
                        i11 = -2;
                    }
                } else if (i9 == 2) {
                    throw new IllegalArgumentException(AbstractC1786e.admob(i18, "The padding option is set to ABSENT, but the input has a pad character at index "));
                }
                i18++;
                i5 = i4;
                i11 = -2;
            } else {
                if (!z) {
                    StringBuilder sb = new StringBuilder("Invalid symbol '");
                    sb.append((char) i23);
                    sb.append("'(");
                    AbstractC15211e.ad(i15);
                    sb.append(Integer.toString(i23, i15));
                    sb.append(") at index ");
                    sb.append(i18);
                    throw new IllegalArgumentException(sb.toString());
                }
                i18++;
                iArr2 = iArr;
                i11 = -2;
                i14 = -8;
            }
        }
        if (i16 == i11) {
            throw new IllegalArgumentException("The last unit of input does not have enough bits");
        }
        if (i16 != -8 && i5 == 0 && i9 == i4) {
            throw new IllegalArgumentException("The padding option is set to PRESENT, but the input is not properly padded");
        }
        if (i19 != 0) {
            throw new IllegalArgumentException("The pad bits must be zeros");
        }
        if (z) {
            while (i18 < length2) {
                if (AbstractC6005e.vip[bArr[i18] & 255] != -1) {
                    break;
                }
                i18++;
            }
        }
        if (i18 >= length2) {
            if (i17 == i7) {
                return bArr3;
            }
            throw new IllegalStateException("Check failed.");
        }
        int i27 = bArr[i18] & 255;
        StringBuilder sb2 = new StringBuilder("Symbol '");
        sb2.append((char) i27);
        sb2.append("'(");
        AbstractC15211e.ad(8);
        sb2.append(Integer.toString(i27, 8));
        sb2.append(") at index ");
        throw new IllegalArgumentException(AbstractC17861e.smaato(i18 - 1, " is prohibited after the pad character", sb2));
    }

    public final int vip(int i) {
        int i2 = i / 3;
        int i3 = i % 3;
        int i4 = 4;
        int i5 = i2 * 4;
        if (i3 != 0) {
            int i6 = this.license;
            if (i6 != 1 && i6 != 3) {
                i4 = i3 + 1;
            }
            i5 += i4;
        }
        if (i5 < 0) {
            throw new IllegalArgumentException("Input is too big");
        }
        if (this.vip) {
            i5 = AbstractC5087e.m1751protected(i5 - 1, this.metrica, 2, i5);
        }
        if (i5 >= 0) {
            return i5;
        }
        throw new IllegalArgumentException("Input is too big");
    }
}
