package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٍؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1689e extends AbstractC1798e {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ int f4619e;

    public /* synthetic */ C1689e(int i) {
        this.f4619e = i;
    }

    public static int loadAd(long j, byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            AbstractC1798e abstractC1798e = AbstractC18226e.ad;
            if (i > -12) {
                return -1;
            }
            return i;
        }
        if (i2 == 1) {
            return AbstractC18226e.metrica(i, AbstractC5314e.billing(j, bArr));
        }
        if (i2 == 2) {
            return AbstractC18226e.license(i, AbstractC5314e.billing(j, bArr), AbstractC5314e.billing(j + 1, bArr));
        }
        throw new AssertionError();
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:?, code lost:
    
        return r27 + r5;
     */
    @Override // defpackage.AbstractC1798e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int adcel(java.lang.String r25, byte[] r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1689e.adcel(java.lang.String, byte[], int, int):int");
    }

    @Override // defpackage.AbstractC1798e
    public final int advert(int i, int i2, byte[] bArr) {
        byte b;
        long j;
        int i3 = i;
        byte b2 = -96;
        byte b3 = -62;
        switch (this.f4619e) {
            case 0:
                while (i3 < i2 && bArr[i3] >= 0) {
                    i3++;
                }
                if (i3 < i2) {
                    while (i3 < i2) {
                        int i4 = i3 + 1;
                        byte b4 = bArr[i3];
                        if (b4 < 0) {
                            if (b4 < -32) {
                                if (i4 >= i2) {
                                    return b4;
                                }
                                if (b4 >= -62) {
                                    i3 += 2;
                                    if (bArr[i4] > -65) {
                                    }
                                }
                                return -1;
                            }
                            if (b4 >= -16) {
                                if (i4 >= i2 - 2) {
                                    return AbstractC18226e.ad(i4, i2, bArr);
                                }
                                int i5 = i3 + 2;
                                byte b5 = bArr[i4];
                                if (b5 <= -65 && (((b5 + 112) + (b4 << 28)) >> 30) == 0) {
                                    int i6 = i3 + 3;
                                    if (bArr[i5] <= -65) {
                                        i3 += 4;
                                        if (bArr[i6] > -65) {
                                        }
                                    }
                                }
                                return -1;
                            }
                            if (i4 >= i2 - 1) {
                                return AbstractC18226e.ad(i4, i2, bArr);
                            }
                            int i7 = i3 + 2;
                            byte b6 = bArr[i4];
                            if (b6 <= -65 && ((b4 != -32 || b6 >= -96) && (b4 != -19 || b6 < -96))) {
                                i3 += 3;
                                if (bArr[i7] > -65) {
                                }
                            }
                            return -1;
                        }
                        i3 = i4;
                    }
                }
                return 0;
            default:
                if ((i3 | i2 | (bArr.length - i2)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i3), Integer.valueOf(i2)));
                }
                int i8 = 0;
                long j2 = i3;
                int i9 = (int) (i2 - j2);
                if (i9 < 16) {
                    b = 0;
                    j = j2;
                } else {
                    int i10 = 8 - (((int) j2) & 7);
                    b = 0;
                    j = j2;
                    long j3 = j;
                    while (true) {
                        if (i8 < i10) {
                            long j4 = j3 + 1;
                            if (AbstractC5314e.billing(j3, bArr) >= 0) {
                                i8++;
                                j3 = j4;
                            }
                        } else {
                            while (true) {
                                int i11 = i8 + 8;
                                if (i11 <= i9 && (AbstractC5314e.metrica.yandex(AbstractC5314e.purchase + j3, bArr) & (-9187201950435737472L)) == 0) {
                                    j3 += 8;
                                    i8 = i11;
                                }
                            }
                            while (true) {
                                if (i8 < i9) {
                                    long j5 = j3 + 1;
                                    if (AbstractC5314e.billing(j3, bArr) >= 0) {
                                        i8++;
                                        j3 = j5;
                                    }
                                } else {
                                    i8 = i9;
                                }
                            }
                        }
                    }
                }
                int i12 = i9 - i8;
                long j6 = j + i8;
                while (true) {
                    byte b7 = b;
                    while (true) {
                        if (i12 > 0) {
                            long j7 = j6 + 1;
                            b7 = AbstractC5314e.billing(j6, bArr);
                            if (b7 >= 0) {
                                i12--;
                                j6 = j7;
                            } else {
                                j6 = j7;
                            }
                        }
                    }
                    if (i12 == 0) {
                        return b;
                    }
                    int i13 = i12 - 1;
                    if (b7 < -32) {
                        if (i13 == 0) {
                            return b7;
                        }
                        i12 -= 2;
                        if (b7 >= b3) {
                            long j8 = j6 + 1;
                            if (AbstractC5314e.billing(j6, bArr) <= -65) {
                                j6 = j8;
                                b2 = -96;
                                b3 = -62;
                            }
                        }
                    } else if (b7 < -16) {
                        if (i13 < 2) {
                            return loadAd(j6, bArr, b7, i13);
                        }
                        i12 -= 3;
                        long j9 = j6 + 1;
                        byte billing = AbstractC5314e.billing(j6, bArr);
                        if (billing <= -65 && ((b7 != -32 || billing >= b2) && (b7 != -19 || billing < b2))) {
                            j6 += 2;
                            if (AbstractC5314e.billing(j9, bArr) <= -65) {
                                b2 = -96;
                                b3 = -62;
                            }
                        }
                    } else {
                        if (i13 < 3) {
                            return loadAd(j6, bArr, b7, i13);
                        }
                        i12 -= 4;
                        long j10 = j6 + 1;
                        byte billing2 = AbstractC5314e.billing(j6, bArr);
                        if (billing2 <= -65 && (((billing2 + 112) + (b7 << 28)) >> 30) == 0) {
                            long j11 = j6 + 2;
                            if (AbstractC5314e.billing(j10, bArr) <= -65) {
                                j6 += 3;
                                if (AbstractC5314e.billing(j11, bArr) <= -65) {
                                    b2 = -96;
                                    b3 = -62;
                                }
                            }
                        }
                    }
                }
                return -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    @Override // defpackage.AbstractC1798e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String billing(int r11, int r12, byte[] r13) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1689e.billing(int, int, byte[]):java.lang.String");
    }
}
