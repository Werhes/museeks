package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍَٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10168e implements InterfaceC5372e {
    public static final C10168e ad = new Object();
    public static final C3859e vip = new C3859e("kotlin.time.Instant", C13337e.smaato);

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        interfaceC5757e.remoteconfig(((C5471e) obj).toString());
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return vip;
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        int i;
        int i2;
        int i3;
        InterfaceC6174e yandex;
        int i4;
        int i5;
        long j;
        char charAt;
        char charAt2;
        C5471e c5471e = C5471e.f11744e;
        String pro = interfaceC11754e.pro();
        if (pro.length() == 0) {
            yandex = new C4625e("An empty string is not a valid Instant", pro);
        } else {
            int i6 = 0;
            char charAt3 = pro.charAt(0);
            if (charAt3 == '+' || charAt3 == '-') {
                i = 1;
            } else {
                i = 0;
                charAt3 = ' ';
            }
            int i7 = 0;
            int i8 = i;
            while (i8 < pro.length() && '0' <= (charAt2 = pro.charAt(i8)) && charAt2 < ':') {
                i7 = (i7 * 10) + (pro.charAt(i8) - '0');
                i8++;
            }
            int i9 = i8 - i;
            if (i9 > 10) {
                yandex = AbstractC12501e.yandex(pro, "Expected at most 10 digits for the year number, got " + i9 + " digits");
            } else if (i9 == 10 && AbstractC7890e.yandex(pro.charAt(i), 50) >= 0) {
                yandex = AbstractC12501e.yandex(pro, "Expected at most 9 digits for the year number or year 1000000000, got " + i9 + " digits");
            } else if (i9 < 4) {
                yandex = AbstractC12501e.yandex(pro, "The year number must be padded to 4 digits, got " + i9 + " digits");
            } else if (charAt3 == '+' && i9 == 4) {
                yandex = AbstractC12501e.yandex(pro, "The '+' sign at the start is only valid for year numbers longer than 4 digits");
            } else if (charAt3 != ' ' || i9 == 4) {
                if (charAt3 == '-') {
                    i7 = -i7;
                }
                int i10 = i8 + 16;
                if (pro.length() < i10) {
                    yandex = AbstractC12501e.yandex(pro, "The input string is too short");
                } else {
                    C4625e billing = AbstractC12501e.billing(pro, "'-'", i8, new C14407e(25));
                    if (billing == null && (billing = AbstractC12501e.billing(pro, "'-'", i8 + 3, new C14407e(26))) == null && (billing = AbstractC12501e.billing(pro, "'T' or 't'", i8 + 6, new C14407e(27))) == null && (billing = AbstractC12501e.billing(pro, "':'", i8 + 9, new C14407e(28))) == null && (billing = AbstractC12501e.billing(pro, "':'", i8 + 12, new C14407e(29))) == null) {
                        int i11 = 0;
                        while (true) {
                            if (i11 >= 10) {
                                int startapp = AbstractC12501e.startapp(i8 + 1, pro);
                                int startapp2 = AbstractC12501e.startapp(i8 + 4, pro);
                                int startapp3 = AbstractC12501e.startapp(i8 + 7, pro);
                                int startapp4 = AbstractC12501e.startapp(i8 + 10, pro);
                                int startapp5 = AbstractC12501e.startapp(i8 + 13, pro);
                                int i12 = i8 + 15;
                                if (pro.charAt(i12) == '.') {
                                    i12 = i10;
                                    int i13 = 0;
                                    while (i12 < pro.length() && '0' <= (charAt = pro.charAt(i12)) && charAt < ':') {
                                        i13 = (i13 * 10) + (pro.charAt(i12) - '0');
                                        i12++;
                                    }
                                    int i14 = i12 - i10;
                                    if (1 > i14 || i14 >= 10) {
                                        yandex = AbstractC12501e.yandex(pro, "1..9 digits are supported for the fraction of the second, got " + i14 + " digits");
                                    } else {
                                        i2 = i13 * AbstractC12501e.ad[9 - i14];
                                    }
                                } else {
                                    i2 = 0;
                                }
                                if (i12 >= pro.length()) {
                                    yandex = AbstractC12501e.yandex(pro, "The UTC offset at the end of the string is missing");
                                } else {
                                    char charAt4 = pro.charAt(i12);
                                    if (charAt4 == '+' || charAt4 == '-') {
                                        int length = pro.length() - i12;
                                        if (length > 9) {
                                            yandex = AbstractC12501e.yandex(pro, "The UTC offset string \"" + AbstractC12501e.smaato(16, pro.subSequence(i12, pro.length()).toString()) + "\" is too long");
                                        } else if (length % 3 != 0) {
                                            yandex = AbstractC12501e.yandex(pro, "Invalid UTC offset string \"" + pro.subSequence(i12, pro.length()).toString() + '\"');
                                        } else {
                                            int i15 = 0;
                                            for (int i16 = 2; i15 < i16; i16 = 2) {
                                                int i17 = i12 + AbstractC12501e.metrica[i15];
                                                if (i17 >= pro.length()) {
                                                    break;
                                                }
                                                if (pro.charAt(i17) != ':') {
                                                    StringBuilder premium = AbstractC4653e.premium("Expected ':' at index ", i17, ", got '");
                                                    premium.append(pro.charAt(i17));
                                                    premium.append('\'');
                                                    yandex = AbstractC12501e.yandex(pro, premium.toString());
                                                    break;
                                                }
                                                i15++;
                                            }
                                            int i18 = 0;
                                            while (i18 < 6 && (i4 = AbstractC12501e.license[i18] + i12) < pro.length()) {
                                                char charAt5 = pro.charAt(i4);
                                                int i19 = i18;
                                                if ('0' > charAt5 || charAt5 >= ':') {
                                                    StringBuilder premium2 = AbstractC4653e.premium("Expected an ASCII digit at index ", i4, ", got '");
                                                    premium2.append(pro.charAt(i4));
                                                    premium2.append('\'');
                                                    yandex = AbstractC12501e.yandex(pro, premium2.toString());
                                                    break;
                                                }
                                                i18 = i19 + 1;
                                            }
                                            int startapp6 = AbstractC12501e.startapp(i12 + 1, pro);
                                            int startapp7 = length > 3 ? AbstractC12501e.startapp(i12 + 4, pro) : 0;
                                            int startapp8 = length > 6 ? AbstractC12501e.startapp(i12 + 7, pro) : 0;
                                            if (startapp7 > 59) {
                                                yandex = AbstractC12501e.yandex(pro, "Expected offset-minute-of-hour in 0..59, got " + startapp7);
                                            } else if (startapp8 > 59) {
                                                yandex = AbstractC12501e.yandex(pro, "Expected offset-second-of-minute in 0..59, got " + startapp8);
                                            } else if (startapp6 <= 17 || (startapp6 == 18 && startapp7 == 0 && startapp8 == 0)) {
                                                i3 = ((startapp7 * 60) + (startapp6 * 3600) + startapp8) * (charAt4 == '-' ? -1 : 1);
                                                if (1 <= startapp || startapp >= 13) {
                                                    yandex = AbstractC12501e.yandex(pro, "Expected a month number in 1..12, got " + startapp);
                                                } else {
                                                    if (1 <= startapp2) {
                                                        int i20 = i7 & 3;
                                                        if (startapp2 <= (startapp != 2 ? (startapp == 4 || startapp == 6 || startapp == 9 || startapp == 11) ? 30 : 31 : i20 == 0 && (i7 % 100 != 0 || i7 % 400 == 0) ? 29 : 28)) {
                                                            if (startapp3 > 23) {
                                                                yandex = AbstractC12501e.yandex(pro, "Expected hour in 0..23, got " + startapp3);
                                                            } else if (startapp4 > 59) {
                                                                yandex = AbstractC12501e.yandex(pro, "Expected minute-of-hour in 0..59, got " + startapp4);
                                                            } else if (startapp5 > 59) {
                                                                yandex = AbstractC12501e.yandex(pro, "Expected second-of-minute in 0..59, got " + startapp5);
                                                            } else {
                                                                long j2 = i7;
                                                                long j3 = 365 * j2;
                                                                if (j2 >= 0) {
                                                                    i5 = i3;
                                                                    j = ((j2 + 399) / 400) + (((3 + j2) / 4) - ((99 + j2) / 100)) + j3;
                                                                } else {
                                                                    i5 = i3;
                                                                    j = j3 - ((j2 / (-400)) + ((j2 / (-4)) - (j2 / (-100))));
                                                                }
                                                                long j4 = j + (((startapp * 367) - 362) / 12) + (startapp2 - 1);
                                                                if (startapp > 2) {
                                                                    j4 = (i20 != 0 || (i7 % 100 == 0 && i7 % 400 != 0)) ? j4 - 2 : (-1) + j4;
                                                                }
                                                                yandex = new C9436e((((j4 - 719528) * 86400) + (((startapp4 * 60) + (startapp3 * 3600)) + startapp5)) - i5, i2);
                                                            }
                                                        }
                                                    }
                                                    StringBuilder pro2 = AbstractC17861e.pro(startapp, i7, "Expected a valid day-of-month for month ", " of year ", ", got ");
                                                    pro2.append(startapp2);
                                                    yandex = AbstractC12501e.yandex(pro, pro2.toString());
                                                }
                                            } else {
                                                yandex = AbstractC12501e.yandex(pro, "Expected an offset in -18:00..+18:00, got " + pro.subSequence(i12, pro.length()).toString());
                                            }
                                        }
                                    } else if (charAt4 == 'Z' || charAt4 == 'z') {
                                        int i21 = i12 + 1;
                                        if (pro.length() == i21) {
                                            i3 = 0;
                                            if (1 <= startapp) {
                                            }
                                            yandex = AbstractC12501e.yandex(pro, "Expected a month number in 1..12, got " + startapp);
                                        } else {
                                            yandex = AbstractC12501e.yandex(pro, "Extra text after the instant at position " + i21);
                                        }
                                    } else {
                                        yandex = AbstractC12501e.yandex(pro, "Expected the UTC offset at position " + i12 + ", got '" + charAt4 + '\'');
                                    }
                                }
                            } else {
                                yandex = AbstractC12501e.billing(pro, "an ASCII digit", AbstractC12501e.vip[i11] + i8, new C17187e(i6));
                                if (yandex != null) {
                                    break;
                                }
                                i11++;
                                i6 = 0;
                            }
                        }
                    } else {
                        yandex = billing;
                    }
                }
            } else {
                yandex = AbstractC12501e.yandex(pro, "A '+' or '-' sign is required for year numbers longer than 4 digits");
            }
        }
        return yandex.toInstant();
    }
}
